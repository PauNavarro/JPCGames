package vista;

import java.awt.*;
import java.awt.event.*;
import java.net.*;

import javax.swing.*;

import controlador.*;

public class MainFrame {

	/**
	 * @author JPCGames
	 * Clase MainFrame
	 */
	
	/**
	 * Para poder crear la interfaz gráfica
	 */
	private JFrame frame;
	/**
	 * Para que el usuario pueda escribir el nombre de usuario que quiere
	 */
	public static JTextField textUsuario;
	/**
	 * Para que el usuario pueda poner la contraseña con *
	 */
	public static JPasswordField passwordField;
	/**
	 * Para crear una etiqueta donde te dice si te has logeado o registrado correctamente
	 */
	public static JLabel lblconfirmacion;
	/**
	 * Para guardar el usuario que esta logeado
	 */
	public static String usuarioActual;
	/**
	 * Para saber si hay un usuario logeado o no
	 */
	public static boolean loggedIn = false;


	/**
	 * Lanzar la ventana.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Para crear la aplicacion.
	 */
	public MainFrame() {
		initialize();
	}

	

	/**
	 * Para inicializar el contenido de la aplicacion
	 */
	private void initialize() {
		frame = new JFrame("JPCGames");
		frame.getContentPane().setForeground(Color.WHITE);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(MainFrame.class.getResource("/resources/logo.png")));
		frame.setBounds(100, 100, 400, 420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);

		JButton logoJPC = new JButton("");
		logoJPC.setBackground(Color.WHITE);
		logoJPC.setFocusPainted(false);
		logoJPC.setFocusTraversalKeysEnabled(false);
		logoJPC.setFocusable(false);
		logoJPC.setOpaque(false);
		logoJPC.setBorderPainted(false);
		logoJPC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		logoJPC.setBounds(10, 10, 150, 50);
		frame.getContentPane().add(logoJPC);

		logoJPC.setIcon(new ImageIcon(MainFrame.class.getResource("/resources/50x50.png")));

		JButton btnPuntuaciones = new JButton("PUNTUACIONES");
		btnPuntuaciones.setForeground(Color.WHITE);
		btnPuntuaciones.setBackground(Color.GRAY);
		btnPuntuaciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Puntuaciones puntuaciones = new Puntuaciones();
				puntuaciones.run();
				
			}
		});
		btnPuntuaciones.setBounds(170, 10, 215, 50);
		frame.getContentPane().add(btnPuntuaciones);

		JButton btnPong = new JButton("Pong");
		btnPong.setForeground(Color.WHITE);
		btnPong.setBackground(Color.GRAY);
		btnPong.addActionListener(new ActionListener() {
		

			public void actionPerformed(ActionEvent e) {
				
				Pong.principal();
				
			}
		});
		btnPong.setBounds(10, 90, 140, 30);
		frame.getContentPane().add(btnPong);

		JButton btnSnake = new JButton("Snake");
		btnSnake.setForeground(Color.WHITE);
		btnSnake.setBackground(Color.GRAY);
		btnSnake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSnake.setBounds(10, 125, 140, 30);
		frame.getContentPane().add(btnSnake);

		JButton btnBuscaMinas = new JButton("BuscaMinas");
		btnBuscaMinas.setForeground(Color.WHITE);
		btnBuscaMinas.setBackground(Color.GRAY);
		btnBuscaMinas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			new BuscaMinas();
				
			}
		});
		btnBuscaMinas.setBounds(10, 160, 140, 30);
		frame.getContentPane().add(btnBuscaMinas);

		JButton btnTeR = new JButton("Tres en Raya");
		btnTeR.setForeground(Color.WHITE);
		btnTeR.setBackground(Color.GRAY);
		btnTeR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ElegirFichaTeR.run();
			}
		});
		btnTeR.setBounds(10, 195, 140, 30);
		frame.getContentPane().add(btnTeR);

		textUsuario = new JTextField();
		TextPrompt placeholderUsu = new TextPrompt("Usuario", textUsuario);
		placeholderUsu.changeAlpha(0.75f);
		placeholderUsu.changeStyle(Font.ITALIC);
		textUsuario.setBounds(10, 260, 140, 30);
		frame.getContentPane().add(textUsuario);
		textUsuario.setColumns(10);

		passwordField = new JPasswordField();
		TextPrompt placeholderPasswd = new TextPrompt("Contraseña", passwordField);
		placeholderPasswd.changeAlpha(0.75f);
		placeholderPasswd.changeStyle(Font.ITALIC);
		passwordField.setBounds(10, 290, 140, 30);
		frame.getContentPane().add(passwordField);
		
		JButton btnChat = new JButton("Chat online");
		btnChat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{
					URI uri = new URI("http://54.237.166.122/");
					Desktop.getDesktop().browse(uri);
				} catch (Exception except) {
					except.printStackTrace();
				}
				
			}
		});
		btnChat.setForeground(Color.WHITE);
		btnChat.setBackground(Color.GRAY);
		btnChat.setBounds(170, 260, 215, 50);
		frame.getContentPane().add(btnChat);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
					controlador.LogIn.login();
					loggedIn = LogIn.loginCorrecto;
				
			}
		});
		btnLogin.setBounds(10, 325, 140, 25);
		frame.getContentPane().add(btnLogin);
		
		lblconfirmacion = new JLabel("");
		lblconfirmacion.setBounds(10, 230, 215, 23);
		frame.getContentPane().add(lblconfirmacion);
		
		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Registrar.registrar();
				
			}
		});
		btnRegistrarse.setBounds(10, 350, 140, 25);
		frame.getContentPane().add(btnRegistrarse);

	}
}
