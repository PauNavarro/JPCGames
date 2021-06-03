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
	 * @author JPCGames
	 * Clase Puntuaciones
	 */
	
	/**
	 * Atributo JPanel para poder meter la tabla con sus puntuaciones
	 */
	private JPanel contentPane;
	/**
	 * Para crear una tabla
	 */
	private JTable table;
	/**
	 * Para crear las columnas que van a ir en la tabla
	 */
	static DefaultTableModel columnas;

	/**
	 * Lanzar la ventana.
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
	 * Para poder crear el JFrame
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
		table.setShowVerticalLines(false);
		table.setShowHorizontalLines(false);
		table.setShowGrid(false);

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
				
				vista.TodasPuntuaciones puntComp = new TodasPuntuaciones();
				puntComp.run();
				

				

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

	/**
	 * Muestra las 25 primeras puntuaciones ordenadas con el usuario mayor de puntos hasta el que menos
	 */
	private static void ActualizarPuntos() {

		String sql = null;

		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection conectar = DriverManager.getConnection("jdbc:mysql://54.237.166.122/jpcgames", "conecta",
					"12345678");
			Statement s = conectar.createStatement();
			sql = "Select u.idUsuario, u.Nombre, p.Puntos FROM usuario u Inner JOIN puntuacion p ON u.idUsuario = p.idUsuario ORDER BY p.Puntos  DESC limit 25;";
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
