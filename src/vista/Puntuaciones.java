package puntuaciones;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class Puntuaciones extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Puntuaciones frame = new Puntuaciones();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Puntuaciones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 454, 493);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPuntuaciones = new JLabel("PUNTUACIONES");
		lblPuntuaciones.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPuntuaciones.setBounds(136, 11, 151, 28);
		contentPane.add(lblPuntuaciones);
		
		JLabel lblPosicion1 = new JLabel("New label");
		lblPosicion1.setBounds(32, 50, 46, 14);
		contentPane.add(lblPosicion1);
		
		JLabel lblUsuario1 = new JLabel("New label");
		lblUsuario1.setBounds(168, 50, 46, 14);
		contentPane.add(lblUsuario1);
		
		JLabel lblPuntos1 = new JLabel("New label");
		lblPuntos1.setBounds(291, 50, 46, 14);
		contentPane.add(lblPuntos1);
		
		JLabel lblPosicion2 = new JLabel("New label");
		lblPosicion2.setBounds(32, 90, 46, 14);
		contentPane.add(lblPosicion2);
		
		JLabel lblUsuario2 = new JLabel("New label");
		lblUsuario2.setBounds(168, 90, 46, 14);
		contentPane.add(lblUsuario2);
		
		JLabel lblPuntos2 = new JLabel("New label");
		lblPuntos2.setBounds(291, 90, 46, 14);
		contentPane.add(lblPuntos2);
		
		JLabel lblPosicion3 = new JLabel("New label");
		lblPosicion3.setBounds(32, 125, 46, 14);
		contentPane.add(lblPosicion3);
		
		JLabel lblUsuario3 = new JLabel("New label");
		lblUsuario3.setBounds(168, 125, 46, 14);
		contentPane.add(lblUsuario3);
		
		JLabel lblPuntos3 = new JLabel("New label");
		lblPuntos3.setBounds(291, 125, 46, 14);
		contentPane.add(lblPuntos3);
		
		JLabel lblPosicion4 = new JLabel("New label");
		lblPosicion4.setBounds(32, 162, 46, 14);
		contentPane.add(lblPosicion4);
		
		JLabel lblUsuario4 = new JLabel("New label");
		lblUsuario4.setBounds(168, 162, 46, 14);
		contentPane.add(lblUsuario4);
		
		JLabel lblPuntos4 = new JLabel("New label");
		lblPuntos4.setBounds(291, 162, 46, 14);
		contentPane.add(lblPuntos4);
		
		JLabel lblPosicion5 = new JLabel("New label");
		lblPosicion5.setBounds(32, 195, 46, 14);
		contentPane.add(lblPosicion5);
		
		JLabel lblUsuario5 = new JLabel("New label");
		lblUsuario5.setBounds(168, 195, 46, 14);
		contentPane.add(lblUsuario5);
		
		JLabel lblPuntos5 = new JLabel("New label");
		lblPuntos5.setBounds(291, 195, 46, 14);
		contentPane.add(lblPuntos5);
		
		JLabel lblPosicion6 = new JLabel("New label");
		lblPosicion6.setBounds(32, 231, 46, 14);
		contentPane.add(lblPosicion6);
		
		JLabel lblUsuario6 = new JLabel("New label");
		lblUsuario6.setBounds(168, 231, 46, 14);
		contentPane.add(lblUsuario6);
		
		JLabel lblPuntos6 = new JLabel("New label");
		lblPuntos6.setBounds(291, 231, 46, 14);
		contentPane.add(lblPuntos6);
		
		JLabel lblPosicion7 = new JLabel("New label");
		lblPosicion7.setBounds(32, 264, 46, 14);
		contentPane.add(lblPosicion7);
		
		JLabel lblUsuario7 = new JLabel("New label");
		lblUsuario7.setBounds(168, 264, 46, 14);
		contentPane.add(lblUsuario7);
		
		JLabel lblPuntos7 = new JLabel("New label");
		lblPuntos7.setBounds(291, 264, 46, 14);
		contentPane.add(lblPuntos7);
		
		JLabel lblPosicion8 = new JLabel("New label");
		lblPosicion8.setBounds(32, 306, 46, 14);
		contentPane.add(lblPosicion8);
		
		JLabel lblUsuario8 = new JLabel("New label");
		lblUsuario8.setBounds(168, 306, 46, 14);
		contentPane.add(lblUsuario8);
		
		JLabel lblPuntos8 = new JLabel("New label");
		lblPuntos8.setBounds(291, 306, 46, 14);
		contentPane.add(lblPuntos8);
		
		JLabel lblPosicion9 = new JLabel("New label");
		lblPosicion9.setBounds(32, 344, 46, 14);
		contentPane.add(lblPosicion9);
		
		JLabel lblUsuario9 = new JLabel("New label");
		lblUsuario9.setBounds(168, 344, 46, 14);
		contentPane.add(lblUsuario9);
		
		JLabel lblPuntos9 = new JLabel("New label");
		lblPuntos9.setBounds(291, 344, 46, 14);
		contentPane.add(lblPuntos9);
		
		JLabel lblPosicion10 = new JLabel("New label");
		lblPosicion10.setBounds(32, 377, 46, 14);
		contentPane.add(lblPosicion10);
		
		JLabel lblUsuario10 = new JLabel("New label");
		lblUsuario10.setBounds(168, 377, 46, 14);
		contentPane.add(lblUsuario10);
		
		JLabel lblPuntos10 = new JLabel("New label");
		lblPuntos10.setBounds(291, 377, 46, 14);
		contentPane.add(lblPuntos10);
		
		JLabel lblPosicion11 = new JLabel("New label");
		lblPosicion11.setBounds(32, 417, 46, 14);
		contentPane.add(lblPosicion11);
		
		JLabel lblUsuario11 = new JLabel("New label");
		lblUsuario11.setBounds(168, 417, 46, 14);
		contentPane.add(lblUsuario11);
		
		JLabel lblPuntos11 = new JLabel("New label");
		lblPuntos11.setBounds(291, 417, 46, 14);
		contentPane.add(lblPuntos11);
	}
}
