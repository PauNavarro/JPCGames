package controlador;

/**
 * @author JPCGames
 *
 */
import java.awt.*;
import java.awt.geom.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import vista.MainFrame;

import java.util.Timer;

@SuppressWarnings("serial")
public class Pong extends Canvas implements Juegos {
	
	/**
	 * La direccion donde va la pelota
	 */
	Point direccion;
	/**
	 * Para dibujar la pelota en 2D
	 */
	Ellipse2D.Double pelota;
	// Rectangle paddle1;
	/**
	 * Para dibujar la barra que golpea la pelota
	 */
	Rectangle raqueta;
	/**
	 * para poner la puntuacion que se lleva durante el juego
	 */
	static int puntuacion = 0;
	/**
	 * Para crear la ventana
	 */
	static JFrame win;
	/**
	 * Para saber el id del usuario que esta logeado
	 */
	private int iD;
	/**
	 * Para saber si hay un usuario logeado o no
	 */
	private boolean loggedIn;

	/**
	 * Para definir el tipo de letra
	 */
	Font splash = new Font("Times", Font.BOLD, 60);

	/**
	 * Para crear la ventana
	 */
	public static void principal() {
		win = new JFrame("Pong");
		win.setSize(1000, 740);
		win.getContentPane().setBackground(Color.BLACK);
		win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		win.add(new Pong(MainFrame.loggedIn));
		win.setVisible(true);
		win.setResizable(false);
		win.setIconImage(Toolkit.getDefaultToolkit().getImage(MainFrame.class.getResource("/resources/logo.png")));

	}

	/**
	 * Constructor con el usuario logeado actualmente
	 * @param loggedIn Para saber si hay un usuario logeado correctamente o no
	 */
	public Pong(boolean loggedIn) {
		enableEvents(java.awt.AWTEvent.KEY_EVENT_MASK);
		requestFocus();
		this.loggedIn = loggedIn;

		pelota = new Ellipse2D.Double(500, 350, 20, 20);
		direccion = new Point(-10, 10);
		raqueta = new Rectangle(940, 250, 20, 200);

		Timer t = new Timer(true);
		t.schedule(new java.util.TimerTask() {
			public void run() {
				hacerCosas();
				repaint();
			}
		}, 10, 10);
	}

	/**
	 * Metodo que actualiza la pantalla
	 */
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;

		g2.setColor(Color.white);
		g2.fill(pelota);

		g2.setColor(Color.white);
		g2.fill(raqueta);

		g.setFont(splash);
		g.drawString(Integer.toString(puntuacion), 500, 100);
	}

	/**
	 * Detectar cuando se realiza una pulsacion
	 */
	public void processKeyEvent(KeyEvent e) {
		if (e.getID() == KeyEvent.KEY_PRESSED) {

			if (e.getKeyCode() == KeyEvent.VK_UP) {
				raqueta.y -= 15;
			}
			if (e.getKeyCode() == KeyEvent.VK_DOWN) {
				raqueta.y += 15;
			}

		}
	}

	/**
	 * Metodo que calcula la posicion de la pelota 
	 */
	public void hacerCosas() {
		pelota.x += direccion.x;
		pelota.y += direccion.y;

		// Golpear una pared

		if (pelota.y < 0 || pelota.y + 20 > 700)
			direccion.y = -direccion.y;
		if (pelota.x < 0)
			direccion.x = -direccion.x;

		// Golpear la raqueta

		if (pelota.intersects(raqueta)) {

			direccion.x = -direccion.x;
		}

		// Puntuacion

		if (pelota.x < 10) {
			puntuacion++;
			direccion.x = -direccion.x;

		}

		if (pelota.x > 1000) {

			if (this.loggedIn) {
				subirPuntos();
			}

			int cont = continuar();

			if (cont == 0) {
				puntuacion = 0;
				pelota.x = 500;
				pelota.y = 350;
				direccion = new Point(-10, 10);
			} else if (cont == 1) {
				pelota.x = 500;
				pelota.y = 350;
				puntuacion = 0;
				direccion = new Point(0, 0);
				win.dispose();

			}

		}

	}

	/**
	 * Metodo para volver a poder jugar o salir del juego cuando pierdes
	 */
	private static int continuar() {

		ImageIcon icono = new ImageIcon("J:\\JPCGames\\resources\\50x50.png");

		return JOptionPane.showOptionDialog(win.getParent(), "Quieres volver a jugar?",
				"Has conseguido " + puntuacion + " puntos", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
				icono, new String[] { "Si", "No" }, null);
	}

	/**
	 * @return Devuelve si la ventana actual esta en primer plano
	 */
	public boolean isFocusable() {
		return true;
	}

	/**
	 * Para subir los puntos a la base de datos del usuario que este logeado en ese momento cada vez que se pierde
	 */
	@Override
	public void subirPuntos() {
		Statement stmt = null;
		String sqlUpdate = null;
		String sql = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conectar = DriverManager.getConnection("jdbc:mysql://54.237.166.122/jpcgames", "conecta",
					"12345678");
			Statement s = conectar.createStatement();
			String sqlID = "Select idUsuario from usuario where Nombre='" + MainFrame.usuarioActual + "';";
			ResultSet chkUsu = s.executeQuery(sqlID);

			chkUsu.next();

			int idUsu = chkUsu.getInt(1);
			iD = idUsu;

			ResultSet chkPts = s.executeQuery("Select idUsuario From puntuacion where idUsuario = " + iD + ";");

			if (chkPts.first()) {

				try {

					sqlUpdate = "Update puntuacion " + "SET Puntos = " + puntuacion + " + Puntos "
							+ "Where idUsuario = " + iD + ";";

					s.executeUpdate(sqlUpdate);

				} catch (Exception e) {
					System.out.println("Error en el update");
					System.out.println(sqlUpdate);
				}

			} else if (!chkPts.first()) {

				try {

					stmt = conectar.createStatement();
					sql = "INSERT INTO `puntuacion`(`idUsuario`, `Puntos`) VALUES (" + iD + ", " + puntuacion + ");";
					stmt.executeUpdate(sql);

				} catch (Exception e) {
					System.out.println("Error en el insert");
					System.out.println(sql);

				}
			} else {

			}

		} catch (Exception e) {

			e.printStackTrace();

		}
	}
}