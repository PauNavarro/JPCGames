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
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class TodasPuntuaciones extends JFrame {

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
					TodasPuntuaciones frame = new TodasPuntuaciones();
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
	public TodasPuntuaciones() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(TodasPuntuaciones.class.getResource("/resources/logo.png")));
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

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(15, 11, 420, 442);
		contentPane.add(scrollPane);
		scrollPane.setViewportView(table);

		ActualizarPuntos();

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
