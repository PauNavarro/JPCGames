package vista;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.*;

import javax.swing.*;

import controlador.*;

public class MainFrame {

	private JFrame frame;
	public static JTextField textUsuario;
	public static JPasswordField passwordField;

	/**
	 * Launch the application.
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
	 * Create the application.
	 */
	public MainFrame() {
		initialize();
	}

	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("JPCGames");
		frame.getContentPane().setForeground(Color.WHITE);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("J:\\JPCGames\\resources\\logo.png"));
		frame.setBounds(100, 100, 400, 400);
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

		logoJPC.setIcon(new ImageIcon("J:\\JPCGames\\resources\\50x50.png"));

		JButton btnPuntuaciones = new JButton("PUNTUACIONES");
		btnPuntuaciones.setForeground(Color.WHITE);
		btnPuntuaciones.setBackground(Color.GRAY);
		btnPuntuaciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPuntuaciones.setBounds(170, 10, 215, 50);
		frame.getContentPane().add(btnPuntuaciones);

		JButton btnPong = new JButton("Pong");
		btnPong.setForeground(Color.WHITE);
		btnPong.setBackground(Color.GRAY);
		btnPong.addActionListener(new ActionListener() {
		

			public void actionPerformed(ActionEvent e) {
				
				
				
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
			}
		});
		btnBuscaMinas.setBounds(10, 160, 140, 30);
		frame.getContentPane().add(btnBuscaMinas);

		JButton btnTeR = new JButton("Tres en Raya");
		btnTeR.setForeground(Color.WHITE);
		btnTeR.setBackground(Color.GRAY);
		btnTeR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
				
			}
		});
		btnLogin.setBounds(10, 325, 89, 23);
		frame.getContentPane().add(btnLogin);

	}
}
