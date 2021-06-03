package controlador;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class TresenRaya extends JFrame {
	public boolean enRaya = false;
	public boolean empate = false;
	public boolean turno;
	public boolean ocupado;
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
					frame.setLocationRelativeTo(null);
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
		setBounds(100, 100, 440, 290);
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
				EspacioOcupado(turno, ocupado);
				turno();

			}
		});

		DerechaMedio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DerechaMedio.setText("X");
				DerechaMedio.setEnabled(false);

				comprobarTresRayas(DerechaAriba, DerechaMedio, DerechaBajo, IzquierdaAriba, IzquierdaMedio,
						IzquierdaBajo, MedioAriba, MedioMedio, MedioBajo);
				EspacioOcupado(turno, ocupado);
				turno();

			}

		});

		DerechaBajo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DerechaBajo.setText("X");
				DerechaBajo.setEnabled(false);

				comprobarTresRayas(DerechaAriba, DerechaMedio, DerechaBajo, IzquierdaAriba, IzquierdaMedio,
						IzquierdaBajo, MedioAriba, MedioMedio, MedioBajo);
				EspacioOcupado(turno, ocupado);
				turno();

			}
		});

		IzquierdaAriba.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IzquierdaAriba.setText("X");
				IzquierdaAriba.setEnabled(false);

				comprobarTresRayas(DerechaAriba, DerechaMedio, DerechaBajo, IzquierdaAriba, IzquierdaMedio,
						IzquierdaBajo, MedioAriba, MedioMedio, MedioBajo);
				EspacioOcupado(turno, ocupado);
				turno();

			}
		});

		IzquierdaMedio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IzquierdaMedio.setText("X");
				IzquierdaMedio.setEnabled(false);

				comprobarTresRayas(DerechaAriba, DerechaMedio, DerechaBajo, IzquierdaAriba, IzquierdaMedio,
						IzquierdaBajo, MedioAriba, MedioMedio, MedioBajo);
				EspacioOcupado(turno, ocupado);
				turno();

			}
		});

		IzquierdaBajo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IzquierdaBajo.setText("X");
				IzquierdaBajo.setEnabled(false);

				comprobarTresRayas(DerechaAriba, DerechaMedio, DerechaBajo, IzquierdaAriba, IzquierdaMedio,
						IzquierdaBajo, MedioAriba, MedioMedio, MedioBajo);
				EspacioOcupado(turno, ocupado);
				turno();

			}
		});

		MedioAriba.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MedioAriba.setText("X");
				MedioAriba.setEnabled(false);

				comprobarTresRayas(DerechaAriba, DerechaMedio, DerechaBajo, IzquierdaAriba, IzquierdaMedio,
						IzquierdaBajo, MedioAriba, MedioMedio, MedioBajo);
				EspacioOcupado(turno, ocupado);
				turno();

			}
		});

		MedioMedio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MedioMedio.setText("X");
				MedioMedio.setEnabled(false);

				comprobarTresRayas(DerechaAriba, DerechaMedio, DerechaBajo, IzquierdaAriba, IzquierdaMedio,
						IzquierdaBajo, MedioAriba, MedioMedio, MedioBajo);
				EspacioOcupado(turno, ocupado);
				turno();

			}

		});

		MedioBajo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MedioBajo.setText("X");
				MedioBajo.setEnabled(false);

				comprobarTresRayas(DerechaAriba, DerechaMedio, DerechaBajo, IzquierdaAriba, IzquierdaMedio,
						IzquierdaBajo, MedioAriba, MedioMedio, MedioBajo);
				EspacioOcupado(turno, ocupado);
				turno();

			}
		});

		IzquierdaBajo.setBounds(0, 170, 140, 90);
		contentPane.add(IzquierdaBajo);

		MedioBajo.setBounds(140, 170, 150, 90);
		contentPane.add(MedioBajo);

		IzquierdaAriba.setBounds(0, 0, 140, 90);
		contentPane.add(IzquierdaAriba);

		IzquierdaMedio.setBounds(0, 80, 140, 90);
		contentPane.add(IzquierdaMedio);

		MedioAriba.setBounds(140, 0, 140, 90);
		contentPane.add(MedioAriba);

		MedioMedio.setBounds(140, 80, 140, 90);
		contentPane.add(MedioMedio);

		DerechaBajo.setBounds(290, 170, 140, 90);
		contentPane.add(DerechaBajo);

		DerechaAriba.setBounds(290, 0, 140, 90);
		contentPane.add(DerechaAriba);

		DerechaMedio.setBounds(290, 80, 140, 90);
		contentPane.add(DerechaMedio);

	}

	public void comprobarTresRayas(JButton DerechaAriba, JButton DerechaMedio, JButton DerechaBajo,
			JButton IzquierdaAriba, JButton IzquierdaMedio, JButton IzquierdaBajo, JButton MedioAriba,
			JButton MedioMedio, JButton MedioBajo) {
		System.out.println("entra 2");

		// Victoria para la X

		if (DerechaAriba.getText().equals("X") && DerechaMedio.getText().equals("X")
				&& DerechaBajo.getText().equals("X")) {
			enRaya = true;
			enRaya();
		}

		if (IzquierdaAriba.getText().equals("X") && IzquierdaMedio.getText().equals("X")
				&& IzquierdaBajo.getText().equals("X")) {
			enRaya = true;
			enRaya();
		}

		if (MedioAriba.getText().equals("X") && MedioMedio.getText().equals("X") && MedioBajo.getText().equals("X")) {
			enRaya = true;
			enRaya();
		}

		if (DerechaAriba.getText().equals("X") && MedioMedio.getText().equals("X")
				&& IzquierdaBajo.getText().equals("X")) {
			enRaya = true;
			enRaya();
		}

		if (IzquierdaAriba.getText().equals("X") && MedioMedio.getText().equals("X")
				&& DerechaBajo.getText().equals("X")) {
			enRaya = true;
			enRaya();
		}

		if (IzquierdaAriba.getText().equals("X") && MedioAriba.getText().equals("X")
				&& DerechaAriba.getText().equals("X")) {
			enRaya = true;
			enRaya();
		}

		if (IzquierdaMedio.getText().equals("X") && MedioMedio.getText().equals("X")
				&& DerechaMedio.getText().equals("X")) {
			enRaya = true;
			enRaya();
		}

		if (IzquierdaBajo.getText().equals("X") && MedioBajo.getText().equals("X")
				&& DerechaBajo.getText().equals("X")) {
			enRaya = true;
			enRaya();
		}

		// Victoria para el O

		if (DerechaAriba.getText().equals("O") && DerechaMedio.getText().equals("O")
				&& DerechaBajo.getText().equals("O")) {
			enRaya = false;
			enRaya();

		}

		if (IzquierdaAriba.getText().equals("O") && IzquierdaMedio.getText().equals("O")
				&& IzquierdaBajo.getText().equals("O")) {
			enRaya = false;
			enRaya();

		}

		if (MedioAriba.getText().equals("O") && MedioMedio.getText().equals("O") && MedioBajo.getText().equals("O")) {
			enRaya = false;
			enRaya();

		}

		if (DerechaAriba.getText().equals("O") && MedioMedio.getText().equals("O")
				&& IzquierdaBajo.getText().equals("O")) {
			enRaya = false;
			enRaya();

		}

		if (IzquierdaAriba.getText().equals("O") && MedioMedio.getText().equals("O")
				&& DerechaBajo.getText().equals("O")) {
			enRaya = false;
			enRaya();

		}

		if (IzquierdaAriba.getText().equals("O") && MedioAriba.getText().equals("O")
				&& DerechaAriba.getText().equals("O")) {
			enRaya = false;
			enRaya();

		}

		if (IzquierdaMedio.getText().equals("O") && MedioMedio.getText().equals("O")
				&& DerechaMedio.getText().equals("O")) {
			enRaya = false;
			enRaya();

		}

		if (IzquierdaBajo.getText().equals("O") && MedioBajo.getText().equals("O")
				&& DerechaBajo.getText().equals("O")) {
			enRaya = false;
			enRaya();
		}

	}

	public void enRaya() {

		if (enRaya == true) {
			JOptionPane.showMessageDialog(this, "Tres en Raya X");

		} else if (enRaya == false) {
			JOptionPane.showMessageDialog(this, "Tres en Raya O");

		} else {
			JOptionPane.showMessageDialog(this, "Empate");

		}

	}

	public void turno() {
		int cont = 0;
		while (cont < 1) {

			if (cont > 10) {
				enRaya();
			} else {

				int random = (int) (Math.random() * 9);

				System.out.println("" + random);

				switch (random) {
				case 1:
					EspacioOcupado(turno, ocupado);
					if (DerechaAriba.getText().equals("X") || DerechaAriba.getText().equals("O")) {
						EspacioOcupado(turno, ocupado);
						cont = 0;
					} else {
						EspacioOcupado(turno, ocupado);
						DerechaAriba.setText("O");
						DerechaAriba.setEnabled(false);
						cont += 1;
					}
					comprobarTresRayas(DerechaAriba, DerechaMedio, DerechaBajo, IzquierdaAriba, IzquierdaMedio,
							IzquierdaBajo, MedioAriba, MedioMedio, MedioBajo);
					break;
				case 2:
					EspacioOcupado(turno, ocupado);
					if (DerechaMedio.getText().equals("X") || DerechaMedio.getText().equals("O")) {
						EspacioOcupado(turno, ocupado);
						cont = 0;

					} else {
						DerechaMedio.setText("O");
						EspacioOcupado(turno, ocupado);
						DerechaMedio.setEnabled(false);
						cont += 1;
					}

					comprobarTresRayas(DerechaAriba, DerechaMedio, DerechaBajo, IzquierdaAriba, IzquierdaMedio,
							IzquierdaBajo, MedioAriba, MedioMedio, MedioBajo);
					break;
				case 3:
					EspacioOcupado(turno, ocupado);
					if (DerechaBajo.getText().equals("X") || DerechaBajo.getText().equals("O")) {
						EspacioOcupado(turno, ocupado);
						cont = 0;

					} else {
						DerechaBajo.setText("O");
						EspacioOcupado(turno, ocupado);
						DerechaBajo.setEnabled(false);
						cont += 1;

					}
					comprobarTresRayas(DerechaAriba, DerechaMedio, DerechaBajo, IzquierdaAriba, IzquierdaMedio,
							IzquierdaBajo, MedioAriba, MedioMedio, MedioBajo);
					break;
				case 4:
					EspacioOcupado(turno, ocupado);
					if (IzquierdaAriba.getText().equals("X") || IzquierdaAriba.getText().equals("O")) {
						EspacioOcupado(turno, ocupado);
						cont = 0;

					} else {
						IzquierdaAriba.setText("O");
						EspacioOcupado(turno, ocupado);
						IzquierdaAriba.setEnabled(false);
						cont += 1;
					}

					comprobarTresRayas(DerechaAriba, DerechaMedio, DerechaBajo, IzquierdaAriba, IzquierdaMedio,
							IzquierdaBajo, MedioAriba, MedioMedio, MedioBajo);
					break;
				case 5:
					EspacioOcupado(turno, ocupado);
					if (IzquierdaMedio.getText().equals("X") || IzquierdaMedio.getText().equals("O")) {
						EspacioOcupado(turno, ocupado);
						cont = 0;

					} else {
						IzquierdaMedio.setText("O");
						EspacioOcupado(turno, ocupado);
						IzquierdaMedio.setEnabled(false);
						cont += 1;

					}
					comprobarTresRayas(DerechaAriba, DerechaMedio, DerechaBajo, IzquierdaAriba, IzquierdaMedio,
							IzquierdaBajo, MedioAriba, MedioMedio, MedioBajo);
					break;
				case 6:
					EspacioOcupado(turno, ocupado);
					if (IzquierdaBajo.getText().equals("X") || IzquierdaBajo.getText().equals("O")) {
						EspacioOcupado(turno, ocupado);
						cont = 0;

					} else {
						IzquierdaBajo.setText("O");
						EspacioOcupado(turno, ocupado);
						IzquierdaBajo.setEnabled(false);
						cont += 1;
					}
					comprobarTresRayas(DerechaAriba, DerechaMedio, DerechaBajo, IzquierdaAriba, IzquierdaMedio,
							IzquierdaBajo, MedioAriba, MedioMedio, MedioBajo);
					break;
				case 7:
					EspacioOcupado(turno, ocupado);
					if (MedioAriba.getText().equals("X") || MedioAriba.getText().equals("O")) {
						EspacioOcupado(turno, ocupado);
						cont = 0;
					} else {
						MedioAriba.setText("O");
						EspacioOcupado(turno, ocupado);
						MedioAriba.setEnabled(false);
						cont += 1;

					}
					comprobarTresRayas(DerechaAriba, DerechaMedio, DerechaBajo, IzquierdaAriba, IzquierdaMedio,
							IzquierdaBajo, MedioAriba, MedioMedio, MedioBajo);
					break;
				case 8:
					EspacioOcupado(turno, ocupado);
					if (MedioMedio.getText().equals("X") || MedioMedio.getText().equals("O")) {
						EspacioOcupado(turno, ocupado);
						cont = 0;

					} else {
						MedioMedio.setText("O");
						EspacioOcupado(turno, ocupado);
						MedioMedio.setEnabled(false);
						cont += 1;
					}
					comprobarTresRayas(DerechaAriba, DerechaMedio, DerechaBajo, IzquierdaAriba, IzquierdaMedio,
							IzquierdaBajo, MedioAriba, MedioMedio, MedioBajo);
					turno = true;

					break;
				case 9:
					EspacioOcupado(enRaya, enRaya);
					if (MedioBajo.getText().equals("X") || MedioBajo.getText().equals("O")) {
						EspacioOcupado(turno, ocupado);
						cont = 0;

					} else {
						MedioBajo.setText("O");
						EspacioOcupado(turno, ocupado);
						MedioBajo.setEnabled(false);
						cont += 1;
					}

					comprobarTresRayas(DerechaAriba, DerechaMedio, DerechaBajo, IzquierdaAriba, IzquierdaMedio,
							IzquierdaBajo, MedioAriba, MedioMedio, MedioBajo);
					break;
				default:
					cont += 1;
					break;

				}
				comprobarTresRayas(DerechaAriba, DerechaMedio, DerechaBajo, IzquierdaAriba, IzquierdaMedio,
						IzquierdaBajo, MedioAriba, MedioMedio, MedioBajo);
				EspacioOcupado(turno, ocupado);

			}
		}
	}

	protected void Random(JButton DerechaAriba, JButton DerechaMedio, JButton DerechaBajo, JButton IzquierdaAriba,
			JButton IzquierdaMedio, JButton IzquierdaBajo, JButton MedioAriba, JButton MedioMedio, JButton MedioBajo) {

	}

	protected void EspacioOcupado(boolean turno, boolean ocupado) {
		System.out.println("entra 1");

		if (DerechaAriba.getText().equals("X") || DerechaAriba.getText().equals("O")) {
			ocupado = true;
			turno = true;

		} else {
			ocupado = false;
			turno = false;

		}
		if (DerechaMedio.getText().equals("X") || DerechaMedio.getText().equals("O")) {
			ocupado = true;
			turno = true;

		} else {
			ocupado = false;
			turno = false;

		}
		if (DerechaBajo.getText().equals("X") || DerechaBajo.getText().equals("O")) {
			ocupado = true;
			turno = true;

		} else {
			ocupado = false;
			turno = false;

		}
		if (IzquierdaAriba.getText().equals("X") || IzquierdaAriba.getText().equals("O")) {
			ocupado = true;
			turno = true;

		} else {
			ocupado = false;
			turno = false;

		}
		if (IzquierdaMedio.getText().equals("X") || IzquierdaMedio.getText().equals("O")) {
			ocupado = true;
			turno = true;

		} else {
			ocupado = false;
			turno = false;

		}

		if (IzquierdaBajo.getText().equals("X") || IzquierdaBajo.getText().equals("O")) {
			ocupado = true;
			turno = true;

		} else {
			ocupado = false;
			turno = false;

		}

		if (MedioAriba.getText().equals("X") || MedioAriba.getText().equals("O")) {
			ocupado = true;
			turno = true;

		} else {
			ocupado = false;
			turno = false;

		}
		if (MedioMedio.getText().equals("X") || MedioMedio.getText().equals("O")) {
			ocupado = true;
			turno = true;

		} else {
			ocupado = false;
			turno = false;

		}
		if (MedioBajo.getText().equals("X") || MedioBajo.getText().equals("O")) {
			ocupado = true;
			turno = true;

		} else {
			ocupado = false;
			turno = false;

		}
	}
}