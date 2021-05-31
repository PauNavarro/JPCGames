package controlador;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class TresenRaya extends JFrame {
	public boolean enRaya = false;
	public boolean turno = false;
	public boolean ocupado = false;
	private JPanel contentPane;
	JButton DerechaAriba = new JButton("");
	JButton DerechaMedio = new JButton("");
	JButton DerechaBajo = new JButton("");
	JButton IzquierdaAriba = new JButton("");
	JButton IzquierdaMedio = new JButton("");
	JButton IzquierdaBajo = new JButton("");
	JButton MedioAriba = new JButton("");
	JButton MedioMedio = new JButton("");
	JButton MedioBajo = new JButton("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TresenRaya frame = new TresenRaya();
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

	public TresenRaya() {
		

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 443, 292);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		

		DerechaAriba.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DerechaAriba.setText("X");
				DerechaAriba.setEnabled(false);

				comprobarTresRayas(DerechaAriba, DerechaMedio, DerechaBajo, IzquierdaAriba, IzquierdaMedio,
						IzquierdaBajo, MedioAriba, MedioMedio, MedioBajo);
				EspacioOcupado();
				Random(DerechaAriba, DerechaMedio, DerechaBajo, IzquierdaAriba, IzquierdaMedio, IzquierdaBajo,
						MedioAriba, MedioMedio, MedioBajo);
				enRaya();

			}
		});

		DerechaMedio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DerechaMedio.setText("X");
				DerechaMedio.setEnabled(false);

				comprobarTresRayas(DerechaAriba, DerechaMedio, DerechaBajo, IzquierdaAriba, IzquierdaMedio,
						IzquierdaBajo, MedioAriba, MedioMedio, MedioBajo);
				enRaya();
				EspacioOcupado();
				Random(DerechaAriba, DerechaMedio, DerechaBajo, IzquierdaAriba, IzquierdaMedio, IzquierdaBajo,
						MedioAriba, MedioMedio, MedioBajo);

			}

		});

		DerechaBajo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DerechaBajo.setText("X");
				DerechaBajo.setEnabled(false);

				comprobarTresRayas(DerechaAriba, DerechaMedio, DerechaBajo, IzquierdaAriba, IzquierdaMedio,
						IzquierdaBajo, MedioAriba, MedioMedio, MedioBajo);
				enRaya();
				EspacioOcupado();
				Random(DerechaAriba, DerechaMedio, DerechaBajo, IzquierdaAriba, IzquierdaMedio, IzquierdaBajo,
						MedioAriba, MedioMedio, MedioBajo);

			}
		});

		IzquierdaAriba.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IzquierdaAriba.setText("X");
				IzquierdaAriba.setEnabled(false);

				comprobarTresRayas(DerechaAriba, DerechaMedio, DerechaBajo, IzquierdaAriba, IzquierdaMedio,
						IzquierdaBajo, MedioAriba, MedioMedio, MedioBajo);
				enRaya();
				EspacioOcupado();
				Random(DerechaAriba, DerechaMedio, DerechaBajo, IzquierdaAriba, IzquierdaMedio, IzquierdaBajo,
						MedioAriba, MedioMedio, MedioBajo);

			}
		});

		IzquierdaMedio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IzquierdaMedio.setText("X");
				IzquierdaMedio.setEnabled(false);

				comprobarTresRayas(DerechaAriba, DerechaMedio, DerechaBajo, IzquierdaAriba, IzquierdaMedio,
						IzquierdaBajo, MedioAriba, MedioMedio, MedioBajo);
				enRaya();
				EspacioOcupado();
				Random(DerechaAriba, DerechaMedio, DerechaBajo, IzquierdaAriba, IzquierdaMedio, IzquierdaBajo,
						MedioAriba, MedioMedio, MedioBajo);

			}
		});

		IzquierdaBajo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IzquierdaBajo.setText("X");
				IzquierdaBajo.setEnabled(false);

				comprobarTresRayas(DerechaAriba, DerechaMedio, DerechaBajo, IzquierdaAriba, IzquierdaMedio,
						IzquierdaBajo, MedioAriba, MedioMedio, MedioBajo);
				enRaya();
				EspacioOcupado();
				Random(DerechaAriba, DerechaMedio, DerechaBajo, IzquierdaAriba, IzquierdaMedio, IzquierdaBajo,
						MedioAriba, MedioMedio, MedioBajo);

			}
		});

		MedioAriba.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MedioAriba.setText("X");
				MedioAriba.setEnabled(false);

				comprobarTresRayas(DerechaAriba, DerechaMedio, DerechaBajo, IzquierdaAriba, IzquierdaMedio,
						IzquierdaBajo, MedioAriba, MedioMedio, MedioBajo);
				enRaya();
				EspacioOcupado();
				Random(DerechaAriba, DerechaMedio, DerechaBajo, IzquierdaAriba, IzquierdaMedio, IzquierdaBajo,
						MedioAriba, MedioMedio, MedioBajo);

			}
		});

		MedioMedio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MedioMedio.setText("X");
				MedioMedio.setEnabled(false);

				comprobarTresRayas(DerechaAriba, DerechaMedio, DerechaBajo, IzquierdaAriba, IzquierdaMedio,
						IzquierdaBajo, MedioAriba, MedioMedio, MedioBajo);
				enRaya();
				EspacioOcupado();
				Random(DerechaAriba, DerechaMedio, DerechaBajo, IzquierdaAriba, IzquierdaMedio, IzquierdaBajo,
						MedioAriba, MedioMedio, MedioBajo);
			}

		});

		MedioBajo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MedioBajo.setText("X");
				MedioBajo.setEnabled(false);

				comprobarTresRayas(DerechaAriba, DerechaMedio, DerechaBajo, IzquierdaAriba, IzquierdaMedio,
						IzquierdaBajo, MedioAriba, MedioMedio, MedioBajo);
				enRaya();
				EspacioOcupado();
				Random(DerechaAriba, DerechaMedio, DerechaBajo, IzquierdaAriba, IzquierdaMedio, IzquierdaBajo,
						MedioAriba, MedioMedio, MedioBajo);

			}
		});

		IzquierdaBajo.setBounds(0, 170, 143, 91);
		contentPane.add(IzquierdaBajo);

		MedioBajo.setBounds(141, 170, 154, 91);
		contentPane.add(MedioBajo);

		IzquierdaAriba.setBounds(0, 0, 143, 86);
		contentPane.add(IzquierdaAriba);

		IzquierdaMedio.setBounds(0, 78, 143, 95);
		contentPane.add(IzquierdaMedio);

		MedioAriba.setBounds(141, 0, 154, 86);
		contentPane.add(MedioAriba);

		MedioMedio.setBounds(141, 78, 154, 95);
		contentPane.add(MedioMedio);

		DerechaBajo.setBounds(291, 170, 143, 91);
		contentPane.add(DerechaBajo);

		DerechaAriba.setBounds(291, 0, 143, 86);
		contentPane.add(DerechaAriba);

		DerechaMedio.setBounds(291, 78, 143, 95);
		contentPane.add(DerechaMedio);

	}

	protected void EspacioOcupado() {
		System.out.println("entra 1");

		if (DerechaAriba.getText().equals("X")) {
			ocupado = true;
			turno = true;

		} else {
			ocupado = false;
			turno = false;

		}
		if (DerechaMedio.getText().equals("X")) {
			ocupado = true;
			turno = true;

		} else {
			ocupado = false;
			turno = false;

		}
		if (DerechaBajo.getText().equals("X")) {
			ocupado = true;
			turno = true;

		} else {
			ocupado = false;
			turno = false;

		}
		if (IzquierdaAriba.getText().equals("X")) {
			ocupado = true;
			turno = true;

		} else {
			ocupado = false;
			turno = false;

		}
		if (IzquierdaMedio.getText().equals("X")) {
			ocupado = true;
			turno = true;

		} else {
			ocupado = false;
			turno = false;

		}

		if (IzquierdaBajo.getText().equals("X")) {
			ocupado = true;
			turno = true;

		} else {
			ocupado = false;
			turno = false;

		}

		if (MedioAriba.getText().equals("X")) {
			ocupado = true;
			turno = true;

		} else {
			ocupado = false;
			turno = false;

		}
		if (MedioMedio.getText().equals("X")) {
			ocupado = true;
			turno = true;

		} else {
			ocupado = false;
			turno = false;

		}
		if (MedioBajo.getText().equals("X")) {
			ocupado = true;
			turno = true;

		} else {
			ocupado = false;
			turno = false;

		}

		// Ocupado para el O

		if (DerechaAriba.getText().equals("O")) {
			ocupado = true;
			turno = true;

		} else {
			ocupado = false;
			turno = false;

		}
		if (DerechaMedio.getText().equals("O")) {
			ocupado = true;
			turno = true;

		} else {
			ocupado = false;
			turno = false;

		}
		if (DerechaBajo.getText().equals("O")) {
			ocupado = true;
			turno = true;

		} else {
			ocupado = false;
			turno = false;

		}

		if (IzquierdaAriba.getText().equals("O")) {
			ocupado = true;
			turno = true;

		} else {
			ocupado = false;
			turno = false;

		}
		if (IzquierdaMedio.getText().equals("O")) {
			ocupado = true;
			turno = true;

		} else {
			ocupado = false;
			turno = false;

		}
		if (IzquierdaBajo.getText().equals("O")) {
			ocupado = true;
			turno = true;

		} else {
			ocupado = false;
			turno = false;

		}
		if (MedioAriba.getText().equals("O")) {
			ocupado = true;
			turno = true;

		} else {
			ocupado = false;
			turno = false;

		}
		if (MedioMedio.getText().equals("O")) {
			ocupado = true;
			turno = true;

		} else {
			ocupado = false;
			turno = false;

		}
		if (MedioBajo.getText().equals("O")) {
			ocupado = true;
			turno = true;

		} else {
			ocupado = false;
			turno = false;

		}
	}

	public void comprobarTresRayas(JButton DerechaAriba, JButton DerechaMedio, JButton DerechaBajo,
			JButton IzquierdaAriba, JButton IzquierdaMedio, JButton IzquierdaBajo, JButton MedioAriba,
			JButton MedioMedio, JButton MedioBajo) {
		System.out.println("entra 2");

		// Victoria para la X

		if (DerechaAriba.getText().equals("X") && DerechaMedio.getText().equals("X")
				&& DerechaBajo.getText().equals("X")) {
			enRaya = true;

		}
		if (IzquierdaAriba.getText().equals("X") && IzquierdaMedio.getText().equals("X")
				&& IzquierdaBajo.getText().equals("X")) {
			enRaya = true;

		}
		if (MedioAriba.getText().equals("X") && MedioMedio.getText().equals("X") && MedioBajo.getText().equals("X")) {
			enRaya = true;

		}
		if (DerechaAriba.getText().equals("X") && MedioMedio.getText().equals("X")
				&& IzquierdaBajo.getText().equals("X")) {
			enRaya = true;

		}
		if (IzquierdaAriba.getText().equals("X") && MedioMedio.getText().equals("X")
				&& DerechaBajo.getText().equals("X")) {
			enRaya = true;

		}
		if (IzquierdaAriba.getText().equals("X") && MedioAriba.getText().equals("X")
				&& DerechaAriba.getText().equals("X")) {
			enRaya = true;

		}
		if (IzquierdaMedio.getText().equals("X") && MedioMedio.getText().equals("X")
				&& DerechaMedio.getText().equals("X")) {
			enRaya = true;

			JOptionPane.showMessageDialog(this, "Tres en Raya");

		}
		if (IzquierdaBajo.getText().equals("X") && MedioBajo.getText().equals("X")
				&& DerechaBajo.getText().equals("X")) {
			enRaya = true;

		}

		// Victoria para el O

		if (DerechaAriba.getText().equals("O") && DerechaMedio.getText().equals("O")
				&& DerechaBajo.getText().equals("O")) {
			enRaya = true;

		}
		if (IzquierdaAriba.getText().equals("O") && IzquierdaMedio.getText().equals("O")
				&& IzquierdaBajo.getText().equals("O")) {
			enRaya = true;

		}
		if (MedioAriba.getText().equals("O") && MedioMedio.getText().equals("O") && MedioBajo.getText().equals("O")) {
			enRaya = true;

		}
		if (DerechaAriba.getText().equals("O") && MedioMedio.getText().equals("O")
				&& IzquierdaBajo.getText().equals("O")) {
			enRaya = true;

		}
		if (IzquierdaAriba.getText().equals("O") && MedioMedio.getText().equals("O")
				&& DerechaBajo.getText().equals("O")) {
			enRaya = true;

		}
		if (IzquierdaAriba.getText().equals("O") && MedioAriba.getText().equals("O")
				&& DerechaAriba.getText().equals("O")) {
			enRaya = true;

		}
		if (IzquierdaMedio.getText().equals("O") && MedioMedio.getText().equals("O")
				&& DerechaMedio.getText().equals("O")) {
			enRaya = true;

			JOptionPane.showMessageDialog(this, "Tres en Raya");

		}
		if (IzquierdaBajo.getText().equals("O") && MedioBajo.getText().equals("O")
				&& DerechaBajo.getText().equals("O")) {
			enRaya = true;

		}
	}

	public void enRaya() {

		if (enRaya == true)
			JOptionPane.showMessageDialog(this, "Tres en Raya");
	}

	public void turno() {
		for  (int i = 1; i <= 9 ; i++) {

			if (i % 2 == 0) {

				ocupado = false;
				while (ocupado == false) {




					Random(null, null, null, null, null, null, null, null, null);
				}

				turno = false;
			}

		}}

	protected void Random(JButton DerechaAriba, JButton DerechaMedio, JButton DerechaBajo, JButton IzquierdaAriba,
			JButton IzquierdaMedio, JButton IzquierdaBajo, JButton MedioAriba, JButton MedioMedio, JButton MedioBajo) {
		int random = (int) (Math.random() * 9);

		switch (random) {
		case 1:
			DerechaAriba.setText("O");
			DerechaAriba.setEnabled(false);

			EspacioOcupado();
			comprobarTresRayas(DerechaAriba, DerechaMedio, DerechaBajo, IzquierdaAriba, IzquierdaMedio,
					IzquierdaBajo, MedioAriba, MedioMedio, MedioBajo);
			enRaya();
			break;
		case 2:
			DerechaMedio.setText("O");
			DerechaMedio.setEnabled(false);
			EspacioOcupado();
			comprobarTresRayas(DerechaAriba, DerechaMedio, DerechaBajo, IzquierdaAriba, IzquierdaMedio,
					IzquierdaBajo, MedioAriba, MedioMedio, MedioBajo);
			enRaya();
			break;
		case 3:
			DerechaBajo.setText("O");
			DerechaBajo.setEnabled(false);
			EspacioOcupado();
			comprobarTresRayas(DerechaAriba, DerechaMedio, DerechaBajo, IzquierdaAriba, IzquierdaMedio,
					IzquierdaBajo, MedioAriba, MedioMedio, MedioBajo);
			enRaya();
			break;
		case 4:
			IzquierdaAriba.setText("O");
			IzquierdaAriba.setEnabled(false);
			EspacioOcupado();
			comprobarTresRayas(DerechaAriba, DerechaMedio, DerechaBajo, IzquierdaAriba, IzquierdaMedio,
					IzquierdaBajo, MedioAriba, MedioMedio, MedioBajo);
			enRaya();
			break;
		case 5:
			IzquierdaMedio.setText("O");
			IzquierdaMedio.setEnabled(false);
			EspacioOcupado();
			comprobarTresRayas(DerechaAriba, DerechaMedio, DerechaBajo, IzquierdaAriba, IzquierdaMedio,
					IzquierdaBajo, MedioAriba, MedioMedio, MedioBajo);
			enRaya();
			break;
		case 6:
			IzquierdaBajo.setText("O");
			IzquierdaBajo.setEnabled(false);
			EspacioOcupado();
			comprobarTresRayas(DerechaAriba, DerechaMedio, DerechaBajo, IzquierdaAriba, IzquierdaMedio,
					IzquierdaBajo, MedioAriba, MedioMedio, MedioBajo);
			enRaya();
			break;
		case 7:
			MedioAriba.setText("O");
			MedioAriba.setEnabled(false);
			EspacioOcupado();
			comprobarTresRayas(DerechaAriba, DerechaMedio, DerechaBajo, IzquierdaAriba, IzquierdaMedio,
					IzquierdaBajo, MedioAriba, MedioMedio, MedioBajo);
			enRaya();
			break;
		case 8:
			MedioMedio.setText("O");
			MedioMedio.setEnabled(false);
			EspacioOcupado();
			comprobarTresRayas(DerechaAriba, DerechaMedio, DerechaBajo, IzquierdaAriba, IzquierdaMedio,
					IzquierdaBajo, MedioAriba, MedioMedio, MedioBajo);
			enRaya();
			break;
		case 9:
			MedioBajo.setText("O");
			MedioBajo.setEnabled(false);
			EspacioOcupado();
			comprobarTresRayas(DerechaAriba, DerechaMedio, DerechaBajo, IzquierdaAriba, IzquierdaMedio,
					IzquierdaBajo, MedioAriba, MedioMedio, MedioBajo);
			enRaya();
			break;

		}

	}

}
