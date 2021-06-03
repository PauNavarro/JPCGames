package vista;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;

import controlador.TeRControlador;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TeR {

	private JFrame frame;
	public static String ficha;
	public static JButton btnArrIzq;
	public static JButton btnArrMed;
	public static JButton btnArrDer;
	public static JButton btnMedIzq;
	public static JButton btnMedMed;
	public static JButton btnMedDer;
	public static JButton btnAbjIzq;
	public static JButton btnAbjMed;
	public static JButton btnAbjDer;
	public static boolean[] arrJugadas = new boolean[9];

	/**
	 * Launch the application.
	 */
	public static void run(String ficha) {
		TeR.ficha = ficha;
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
	 * Create the application.
	 */
	public TeR() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
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
