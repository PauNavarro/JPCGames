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
/**
 * @author JPCGames Juego Tres en Raya
 */
@SuppressWarnings("serial")
public class TresenRaya extends JFrame {
	/**
	 * aquie estan las variables que se van a utilizar enRaya se utiliza para hacer
	 * el tres en raya
	 */
	public boolean enRaya = false;
	/** empate es para el empate */
	public boolean empate = false;
	/** turno es para cambiar el turno */
	public boolean turno;
	/** ocupado es para si la posicion esta ocupada o no */
	public boolean ocupado;
	private JPanel contentPane;
	/** aqui se declara la variable de los botones */
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
	 * Inicia la aplicación.
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
	 * Crear el tablero.
	 */

	public TresenRaya() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 443, 292);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		/**
		 * Aqui se les da la funcinalidad al los botones para que cuando pulses pongan x
		 * aparte de llamar a los metodos con sus respetivas funciones
		 */

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

		/** aqui se ha puestos los tamaños para los botones.*/

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

	/**
	 * Este metodo te comprueba si los requisitos para el tres en raya se han
	 * realizado si ese es el caso habra tres en raya para el determinado ganador.
	 * 
	 * @param DerechaAriba se llama al boton para comprobar si se produce tres en
	 * raya en su posicion.
	 * 
	 * @param DerechaMedio se llama al boton para comprobar si se produce tres en
	 * raya en su posicion.
	 * 
	 * @param DerechaBajo se llama al boton para comprobar si se produce tres en
	 * raya en su posicion.
	 * 
	 * @param IzquierdaAriba se llama al boton para comprobar si se produce tres en
	 * raya en su posicion.
	 * 
	 * @param IzquierdaMedio se llama al boton para comprobar si se produce tres en
	 * raya en su posicion.
	 * 
	 * @param IzquierdaBajo se llama al boton para comprobar si se produce tres en
	 * raya en su posicion.
	 * 
	 * @param MedioAriba se llama al boton para comprobar si se produce tres en raya
	 * en su posicion.
	 * 
	 * @param MedioMedio se llama al boton para comprobar si se produce tres en raya
	 * en su posicion.
	 * 
	 * @param MedioBajo se llama al boton para comprobar si se produce tres en raya
	 * en su posicion.
	 */
	public void comprobarTresRayas(JButton DerechaAriba, JButton DerechaMedio, JButton DerechaBajo,
			JButton IzquierdaAriba, JButton IzquierdaMedio, JButton IzquierdaBajo, JButton MedioAriba,
			JButton MedioMedio, JButton MedioBajo) {
		/* System.out.println("entra 2");*/

		/** Tres en Raya para la X*/

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

		/** Tres en Raya para la O*/

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

	/**
	 * Aqui apartir del metodo comprovar tres en raya se ejecutara el tres en raya
	 * para dar la victoria o no
	 */

	public void enRaya() {

		if (enRaya == true) {
			JOptionPane.showMessageDialog(this, "Tres en Raya X");

		} else if (enRaya == false) {
			JOptionPane.showMessageDialog(this, "Tres en Raya O");

		} else {
			JOptionPane.showMessageDialog(this, "Empate");

		}

	}

	/**Aqui se realiza cuando la maquina pone un O*/

	public void turno() {
		int cont = 0;

		while (cont < 1) {

			if (cont > 10) {
				enRaya();
			} else {

				int random = (int) (Math.random() * 9);

				/* System.out.println("" + random);*/

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

	/**
	 * @Deprecated Random este metodo antes se utilizaba para dividir la mitad del
	 * metodo turno y llamar a ramdom.
	 * 
	 * protected void Random(JButton DerechaAriba, JButton DerechaMedio, JButton
	 * DerechaBajo, JButton IzquierdaAriba, JButton IzquierdaMedio, JButton
	 * IzquierdaBajo, JButton MedioAriba, JButton MedioMedio, JButton MedioBajo) { }
	 */

	/**
	 * @param turno indica el turno que le toca despues del usuario
	 * 
	 * @param ocupado inica si el espacio esta ocupado o no Este metodo comprueba si
	 * X o O esta ocupando un espacio en una determinada posicion
	 * 
	 * 
	 */

	protected void EspacioOcupado(boolean turno, boolean ocupado) {
		// System.out.println("entra 1");

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