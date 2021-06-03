package controlador;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import vista.MainFrame;

public class BuscaMinas extends JFrame implements Juegos {

	private static final long serialVersionUID = 1L;
	private JPanel jPanel1 = new JPanel();
	private JButton jButton1 = new JButton();
	private int ancho = 19;
	private int alto = 12;
	public JButton Botones[][] = new JButton[ancho][alto];
	public String[][] array = new String[ancho][alto];
	ImageIcon imagen = new ImageIcon("C:\\Users\\DAM\\Desktop\\proyecto\\Juegos\\img\\bomba.jpg");
	private JButton Salir;
	private int iD;

	public BuscaMinas() {
		try {
			jbInit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void jbInit() throws Exception {
		this.getContentPane().setLayout(null);
		this.setSize(new Dimension(480, 380));
		this.setTitle("Busca Minas");
		jPanel1.setBounds(new Rectangle(0, 40, 477, 300));
		jPanel1.setBackground(Color.WHITE);
		jPanel1.setLayout(null);
		this.setResizable(false);
		jButton1.setText("Empezar");
		jButton1.setBounds(new Rectangle(0, 0, 240, 40));
		jButton1.setHorizontalTextPosition(SwingConstants.CENTER);
		jButton1.setAlignmentY((float) 0.0);
		jButton1.setMargin(new Insets(2, 14, 2, 12));
		jButton1.addActionListener(new ActionListener()

		{
			public void actionPerformed(ActionEvent e) {
				jButton1_actionPerformed(e);
			}
		});
		this.getContentPane().add(jButton1, null);
		this.getContentPane().add(jPanel1, null);

		Salir = new JButton();
		Salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		Salir.setText("Salir");
		Salir.setMargin(new Insets(2, 14, 2, 12));
		Salir.setHorizontalTextPosition(SwingConstants.CENTER);
		Salir.setBounds(new Rectangle(0, 0, 125, 40));
		Salir.setAlignmentY(0.0f);
		Salir.setBounds(240, 0, 240, 40);
		getContentPane().add(Salir);
		cargarTablero();
		colocarBomba(getAncho());
		comprueba();

		this.setVisible(true);
	}

	private void jButton1_actionPerformed(ActionEvent e) {
		for (int i = 0; i < ancho; i++) {
			for (int z = 0; z < alto; z++) {
				array[i][z] = " ";
				Botones[i][z].setEnabled(true);
				Botones[i][z].setText(" ");
			}
		}
		colocarBomba(getAncho());
		comprueba();
		this.setTitle("BuscaMinas");
		jButton1.setText("Empezar");
	}
	// —– Inicializa el tablero a 0

	public void cargarTablero() {
		for (int i = 0; i < ancho; i++) {
			for (int z = 0; z < alto; z++) {
				array[i][z] = " ";
				Botones[i][z] = new JButton();
				jPanel1.add(Botones[i][z]);
				Botones[i][z].setBounds(i * 25, z * 25, 25, 25);
				Botones[i][z].setMargin(new Insets(0, 0, 0, 0));

				// —– Agrego un ActionListener a cada boton del Array de Botones
				// —– Ahora puede escuchar eventos.

				Botones[i][z].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent ar) {
						for (int i = 0; i < ancho; i++) {
							for (int z = 0; z < alto; z++) {
								if (ar.getSource() == Botones[i][z]) {
									ponerNumero(i, z);
									// —– Cada Evento llama al método pulsarBoton.
								}
							}
						}
					}
				});

			}
		}
	}
	// —- Coloca el numero de bombas dependiendo el ancho.

	public void colocarBomba(int numeroBombas) {
		double i = 0;
		double z = 0;
		int condicion = 0;
		do {
			i = Math.random() * getAncho();
			z = Math.random() * getAlto();
			i = (int) i;
			z = (int) z;
			if (z != 0 && i != 0 && z != alto - 1 && i != ancho - 1) {
				array[(int) i][(int) z] = "B";
				condicion++;
			}
		} while (condicion <= ancho);
	}

	public void setAncho(int sAncho) {
		ancho = sAncho;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAlto(int sAlto) {
		alto = sAlto;
	}

	public int getAlto() {
		return alto;
	}

	// —- Asigna un número a cada boton dependiendo de las B que tenga al lado.
	// --- codigo Busca Minas
	public void comprueba() {
		for (int i = 0; i < ancho; i++) {
			for (int z = 0; z < alto; z++) {
				int numeroComprueba = 0; // el numero que voy a asignar al boton
				if (array[i][z] != ("B")) {
					if (z != 0 && i != 0 && z != alto - 1 && i != ancho - 1) {
						//System.out.println(i + " " + z + " " + ancho + " " + alto);

						if (array[i][z - 1] == "B") {
							numeroComprueba++;
						}
						if (array[i - 1][z - 1] == "B") {
							numeroComprueba++;
						}
						if (array[i + 1][z - 1] == "B") {
							numeroComprueba++;
						}
						if (array[i][z + 1] == "B") {
							numeroComprueba++;
						}
						if (array[i + 1][z + 1] == "B") {
							numeroComprueba++;
						}
						if (array[i - 1][z + 1] == "B") {
							numeroComprueba++;
						}
						if (array[i + 1][z] == "B") {
							numeroComprueba++;
						}
						if (array[i - 1][z] == "B") {
							numeroComprueba++;
						}
						if (numeroComprueba != 0) {
							array[i][z] = (String.valueOf(numeroComprueba));
						}
					}
				}
			}
		}
	}

	// —- Muestra el texto en todos los botones cuando hay bomba.

	public void textoBotones() {
		for (int i = 0; i < ancho; i++) {
			for (int z = 0; z < alto; z++) {
				Botones[i][z].setText(array[i][z]);
				Botones[i][z].setEnabled(false);

				// codigo para mostrar el texto encima del boton.
			}
		}

		JOptionPane.showMessageDialog(null, "Has perdido. Si quiere volver a empezar puelse el boton empezar");

	}
	// —- Muestra el Numero encima del boton.
	// —- Cambia las propiedades del boton mostrado.

	public void ponerNumero(int i, int z) {
		Botones[i][z].setText(array[i][z]);
		Botones[i][z].setEnabled(false);

		if (array[i][z] == " ") {
			Botones[i][z].setEnabled(false);
			numeroBomba(i, z);
		} else {
			Botones[i][z].setEnabled(false);

			if (Botones[i][z].getText() == "B") {
				textoBotones();
			}
		}
	}
	// —- Pone el numero en los botones cercanos.

	private void numeroBomba(int i, int z) {
		if (z != 0 && i != 0 && z != alto - 1 && i != ancho - 1) {
			Botones[i - 1][z].setEnabled(false);
			Botones[i - 1][z - 1].setEnabled(false);
			Botones[i - 1][z + 1].setEnabled(false);
			Botones[i][z - 1].setEnabled(false);
			Botones[i][z + 1].setEnabled(false);
			Botones[i + 1][z].setEnabled(false);
			Botones[i + 1][z + 1].setEnabled(false);
			Botones[i + 1][z - 1].setEnabled(false);

			Botones[i - 1][z].setText(array[i - 1][z]);
			Botones[i - 1][z - 1].setText(array[i - 1][z - 1]);
			Botones[i - 1][z + 1].setText(array[i - 1][z + 1]);
			Botones[i][z - 1].setText(array[i][z - 1]);
			Botones[i][z + 1].setText(array[i][z + 1]);
			Botones[i + 1][z].setText(array[i + 1][z]);
			Botones[i + 1][z + 1].setText(array[i + 1][z + 1]);
			Botones[i + 1][z - 1].setText(array[i + 1][z - 1]);
		}
	}

	// —- Este es el metodo que mostrara el final del game.
	public void finalJuego() {
		int contadorFinal = 0;
		for (int i = 1; i < ancho - 1; i++) {
			for (int z = 1; z < alto - 1; z++) {
				if (Botones[i][z].getText() == " " || Botones[i][z].getText() == "1" || Botones[i][z].getText() == "2"
						|| Botones[i][z].getText() == "3" || Botones[i][z].getText() == "5"
						|| Botones[i][z].getText() == "4") {
					contadorFinal++;
					if (contadorFinal == 171) {
						subirPuntos();
						JOptionPane.showMessageDialog(null, "Has Ganado");
					}
				}
			}
		}
	}

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
			ResultSet chkUsu = s.executeQuery(

					"Select idUsuario " + "from usuario " + "where Nombre='" + MainFrame.usuarioActual + "';"

			);

			if (chkUsu.next()) {
				int idUsu = chkUsu.getInt(1);
				iD = idUsu;	
			}
			

			try {

				sqlUpdate = "Update puntuacion " + "SET Puntos = 250 + Puntos " + "Where idUsuario = "
						+ iD + ";";

				s.executeUpdate(sqlUpdate);
		
			} catch (Exception e) {
				System.out.println("Error en el update");
				System.out.println(sqlUpdate);
			}

			try {

				stmt = conectar.createStatement();
				sql = "INSERT INTO `puntuacion`(`idUsuario`, `Puntos`) VALUES (" + iD + ", 250);";
				stmt.executeUpdate(sql);

			} catch (Exception e) {
				System.out.println("Error en el insert");
				System.out.println(sql);
				
			}

		} catch (Exception e) {

			e.printStackTrace();

		}
		
	}
}