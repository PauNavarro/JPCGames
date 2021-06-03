package controlador;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;

import vista.TeR;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ElegirFichaTeR {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void run() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ElegirFichaTeR window = new ElegirFichaTeR();
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
	public ElegirFichaTeR() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblConQueFicha = new JLabel("Con que Ficha quieres Jugar");
		lblConQueFicha.setBounds(0, 0, 484, 19);
		lblConQueFicha.setHorizontalAlignment(SwingConstants.CENTER);
		lblConQueFicha.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.getContentPane().add(lblConQueFicha);
		
		JButton btnO = new JButton("O");
		btnO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				TeR.run("O");
				
			}
		});
		btnO.setBounds(150, 30, 90, 25);
		frame.getContentPane().add(btnO);
		
		JButton btnX = new JButton("X");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				TeR.run("X");
				
			}
		});
		btnX.setBounds(250, 30, 90, 25);
		frame.getContentPane().add(btnX);
	}

}
