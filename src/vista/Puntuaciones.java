package vista;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.sun.media.sound.ModelOscillator;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.Toolkit;
import javax.swing.JTable;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Puntuaciones extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	static DefaultTableModel columnas;

	/**
	 * Launch the application.
	 */
	public void run() {
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
		setIconImage(Toolkit.getDefaultToolkit().getImage(Puntuaciones.class.getResource("/resources/logo.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 454, 493);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		columnas = new DefaultTableModel();
		table = new JTable(columnas);

		columnas.addColumn("Posicion");
		columnas.addColumn("Nombre");
		columnas.addColumn("Puntos");

		table.setBounds(15, 20, 420, 400);
		table.setDefaultEditor(Object.class, null);
		contentPane.add(table);

		ActualizarPuntos();

		JButton btnNewButton = new JButton("Todas las puntuaciones");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ImageIcon icono = new ImageIcon("/resources/50x50.png");

				JOptionPane.showOptionDialog(getParent(), "Quieres desbloquear la tabla de puntuaciones completa por solo 99.99€?",
						"Desbloquear Puntuaciones",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icono, new String[] { "Si", "No" },
						null);

			}
		});
		btnNewButton.setBounds(15, 420, 420, 30);
		contentPane.add(btnNewButton);

		JLabel lblPosicion = new JLabel("Posicion");
		lblPosicion.setHorizontalAlignment(SwingConstants.CENTER);
		lblPosicion.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPosicion.setBounds(15, 0, 140, 20);
		contentPane.add(lblPosicion);

		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblUsuario.setBounds(155, 0, 140, 20);
		contentPane.add(lblUsuario);

		JLabel lblPosicion_1_1 = new JLabel("Puntos");
		lblPosicion_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPosicion_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPosicion_1_1.setBounds(295, 0, 140, 20);
		contentPane.add(lblPosicion_1_1);

	}

	private static void ActualizarPuntos() {

		String sql = null;

		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection conectar = DriverManager.getConnection("jdbc:mysql://54.237.166.122/jpcgames", "conecta",
					"12345678");
			Statement s = conectar.createStatement();
			sql = "Select u.idUsuario, u.Nombre, p.Puntos FROM usuario u Inner JOIN puntuacion p ON u.idUsuario = p.idUsuario ORDER BY p.Puntos  DESC;";
			ResultSet rs = s.executeQuery(sql);

			Object[] fila = new Object[3];

			int i = 0;

			while (rs.next()) {

				i++;

				fila[0] = i;
				fila[1] = rs.getString("u.Nombre");
				fila[2] = rs.getInt("p.Puntos");

				columnas.addRow(fila);

			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(sql);
		}

	}
}
