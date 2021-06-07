package vista;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;

import controlador.TeRControlador;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TeR {

	/**
	 * @author JPCGames
	 */
	
	/**
	 * Crea la ventana
	 */
	private JFrame frame;
	/**
	 * Define la ficha del usuario
	 */
	public static String ficha;
	/**
	 * Crea el boton de Arriba a la izquierda
	 */
	public static JButton btnArrIzq;
	/**
	 * Crea el boton de Arriba a la izquierda
	 */
	public static JButton btnArrMed;
	/**
	 * Crea el boton de Arriba en el medio
	 */
	public static JButton btnArrDer;
	/**
	 * Crea el boton del Medio a la izquierda
	 */
	public static JButton btnMedIzq;
	/**
	 * Crea el boton del Medio en el centro
	 */
	public static JButton btnMedMed;
	/**
	 * Crea el boton del Medio a la derecha
	 */
	public static JButton btnMedDer;
	/**
	 * Crea el boton de Abajo a la izquierda
	 */
	public static JButton btnAbjIzq;
	/**
	 * Crea el boton de Abajo a la izquierda
	 */
	public static JButton btnAbjMed;
	/**
	 * Crea el boton de Abajo a la izquierda
	 */
	public static JButton btnAbjDer;
	/**
	 * Crea un array de booleans que representa las casillas donde se ha realizado una jugada
	 */
	public static boolean[] arrJugadas = new boolean[9];

	/**
	 * Lanzar la aplicaion
	 * @param ficha - Guarda la ficha elegida por el usuario en la ventana anterior
	 */
	public static void run(String ficha) {
		TeR.ficha = ficha;
		
		for (int i = 0; i < arrJugadas.length; i++) {
			arrJugadas[i] = false;
		}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeR window = new TeR();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Crear la aplicacion
	 */
	public TeR() {
		initialize();
	}

	/**
	 * Iniciar el Jframe
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 315, 340);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(MainFrame.class.getResource("/resources/logo.png")));
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		btnArrIzq = new JButton();
		btnArrIzq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (!arrJugadas[0]) {
					arrJugadas[0] = true;
					TeRControlador.anyadirFicha(ficha, 0);
				}
			}
		});
		btnArrIzq.setBounds(0, 0, 100, 100);
		frame.getContentPane().add(btnArrIzq);

		btnArrMed = new JButton();
		btnArrMed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!arrJugadas[1]) {
					arrJugadas[1] = true;
					TeRControlador.anyadirFicha(ficha, 1);
				}
			}
		});
		btnArrMed.setBounds(100, 0, 100, 100);
		frame.getContentPane().add(btnArrMed);

		btnArrDer = new JButton();
		btnArrDer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!arrJugadas[2]) {
					arrJugadas[2] = true;
					TeRControlador.anyadirFicha(ficha, 2);
				}
			}
		});
		btnArrDer.setBounds(200, 0, 100, 100);
		frame.getContentPane().add(btnArrDer);

		btnMedIzq = new JButton();
		btnMedIzq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!arrJugadas[3]) {
					arrJugadas[3] = true;
					TeRControlador.anyadirFicha(ficha, 3);
				}
			}
		});
		btnMedIzq.setBounds(0, 100, 100, 100);
		frame.getContentPane().add(btnMedIzq);

		btnMedMed = new JButton();
		btnMedMed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!arrJugadas[4]) {
					arrJugadas[4] = true;
					TeRControlador.anyadirFicha(ficha, 4);
				}
			}
		});
		btnMedMed.setBounds(100, 100, 100, 100);
		frame.getContentPane().add(btnMedMed);

		btnMedDer = new JButton();
		btnMedDer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!arrJugadas[5]) {
					arrJugadas[5] = true;
					TeRControlador.anyadirFicha(ficha, 5);
				}
			}
		});
		btnMedDer.setBounds(200, 100, 100, 100);
		frame.getContentPane().add(btnMedDer);

		btnAbjIzq = new JButton();
		btnAbjIzq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!arrJugadas[6]) {
					arrJugadas[6] = true;
					TeRControlador.anyadirFicha(ficha, 6);
				}
			}
		});
		btnAbjIzq.setBounds(0, 200, 100, 100);
		frame.getContentPane().add(btnAbjIzq);

		btnAbjMed = new JButton();
		btnAbjMed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!arrJugadas[7]) {
					arrJugadas[7] = true;
					TeRControlador.anyadirFicha(ficha, 7);
				}
			}
		});
		btnAbjMed.setBounds(100, 200, 100, 100);
		frame.getContentPane().add(btnAbjMed);

		btnAbjDer = new JButton();
		btnAbjDer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!arrJugadas[8]) {
					arrJugadas[8] = true;
					TeRControlador.anyadirFicha(ficha, 8);
				}
			}
		});
		btnAbjDer.setBounds(200, 200, 100, 100);
		frame.getContentPane().add(btnAbjDer);
	}
}
