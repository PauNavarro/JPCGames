/**
 * 
 */
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

import vista.MainFrame;
import vista.TeR;

/**
 * @author JPCGames
 *
 */
public class TeRControlador implements Juegos {

	
	
	public TeRControlador() {
	}

	public static void anyadirFicha(String ficha, int posicion) {

		switch (posicion) {
		case 0:
			TeR.btnArrIzq.setText(ficha);

			if (chkTeRUsu(ficha)) {

				mostrarOptionPane();
				TeRControlador ter = new TeRControlador();
				ter.subirPuntos();

				System.exit(0);

				break;

			} else {

				JugadaPrograma(TeR.arrJugadas);
				if (chkTeRProg(ficha)) {
					mostrarOptionPaneProg();
					System.exit(0);
				}
			}
			break;
		case 1:
			TeR.btnArrMed.setText(ficha);

			if (chkTeRUsu(ficha)) {

				mostrarOptionPane();
				TeRControlador ter = new TeRControlador();
				ter.subirPuntos();

				System.exit(0);

				break;

			} else {

				JugadaPrograma(TeR.arrJugadas);
				if (chkTeRProg(ficha)) {
					mostrarOptionPaneProg();
					System.exit(0);
				}
			}
			break;
		case 2:
			TeR.btnArrDer.setText(ficha);

			if (chkTeRUsu(ficha)) {

				mostrarOptionPane();
				TeRControlador ter = new TeRControlador();
				ter.subirPuntos();

				System.exit(0);

				break;

			} else {

				JugadaPrograma(TeR.arrJugadas);
				if (chkTeRProg(ficha)) {
					mostrarOptionPaneProg();
					System.exit(0);
				}
			}
			break;
		case 3:
			TeR.btnMedIzq.setText(ficha);

			if (chkTeRUsu(ficha)) {

				mostrarOptionPane();
				TeRControlador ter = new TeRControlador();
				ter.subirPuntos();

				System.exit(0);

				break;

			} else {

				JugadaPrograma(TeR.arrJugadas);
				if (chkTeRProg(ficha)) {
					mostrarOptionPaneProg();
					System.exit(0);
				}
			}
			break;
		case 4:
			TeR.btnMedMed.setText(ficha);

			if (chkTeRUsu(ficha)) {

				mostrarOptionPane();
				TeRControlador ter = new TeRControlador();
				ter.subirPuntos();

				System.exit(0);

				break;

			} else {

				JugadaPrograma(TeR.arrJugadas);
				if (chkTeRProg(ficha)) {
					mostrarOptionPaneProg();
					System.exit(0);
				}
			}
			break;
		case 5:
			TeR.btnMedDer.setText(ficha);

			if (chkTeRUsu(ficha)) {

				mostrarOptionPane();
				TeRControlador ter = new TeRControlador();
				ter.subirPuntos();

				System.exit(0);

				break;

			} else {

				JugadaPrograma(TeR.arrJugadas);
				if (chkTeRProg(ficha)) {
					mostrarOptionPaneProg();
					System.exit(0);
				}
			}
			break;
		case 6:
			TeR.btnAbjIzq.setText(ficha);
			if (chkTeRUsu(ficha)) {

				mostrarOptionPane();
				TeRControlador ter = new TeRControlador();
				ter.subirPuntos();

				System.exit(0);

				break;

			} else {

				JugadaPrograma(TeR.arrJugadas);
				if (chkTeRProg(ficha)) {
					mostrarOptionPaneProg();
					System.exit(0);
				}
			}
			break;
		case 7:
			TeR.btnAbjMed.setText(ficha);
			if (chkTeRUsu(ficha)) {

				mostrarOptionPane();
				TeRControlador ter = new TeRControlador();
				ter.subirPuntos();

				System.exit(0);

				break;

			} else {

				JugadaPrograma(TeR.arrJugadas);
				if (chkTeRProg(ficha)) {
					mostrarOptionPaneProg();
					System.exit(0);
				}
			}
			break;
		case 8:
			TeR.btnAbjDer.setText(ficha);
			if (chkTeRUsu(ficha)) {

				mostrarOptionPane();
				TeRControlador ter = new TeRControlador();
				ter.subirPuntos();

				System.exit(0);

				break;

			} else {

				JugadaPrograma(TeR.arrJugadas);
				if (chkTeRProg(ficha)) {
					mostrarOptionPaneProg();
					System.exit(0);
				}
			}
			break;
		}

	}

	private static void mostrarOptionPaneProg() {
		JOptionPane.showMessageDialog(null, "Has perdido \n El programa se va a cerrar", "Has perdido",
				JOptionPane.INFORMATION_MESSAGE);
	}

	private static void mostrarOptionPane() {
		JOptionPane.showMessageDialog(null, "Has conseguido 100 puntos \n El programa se va a cerrar", "Has ganado",
				JOptionPane.INFORMATION_MESSAGE);
	}

	private static boolean chkTeRUsu(String ficha) {

		boolean tresEnRaya = false;

		if (TeR.btnArrIzq.getText().equals(ficha) && TeR.btnArrMed.getText().equals(ficha)
				&& TeR.btnArrDer.getText().equals(ficha)) {
			tresEnRaya = true;
		}

		if (TeR.btnMedIzq.getText().equals(ficha) && TeR.btnMedMed.getText().equals(ficha)
				&& TeR.btnMedDer.getText().equals(ficha)) {
			tresEnRaya = true;
		}

		if (TeR.btnAbjIzq.getText().equals(ficha) && TeR.btnAbjMed.getText().equals(ficha)
				&& TeR.btnAbjDer.getText().equals(ficha)) {
			tresEnRaya = true;
		}

		if (TeR.btnArrIzq.getText().equals(ficha) && TeR.btnMedIzq.getText().equals(ficha)
				&& TeR.btnAbjIzq.getText().equals(ficha)) {
			tresEnRaya = true;
		}
		if (TeR.btnArrMed.getText().equals(ficha) && TeR.btnMedMed.getText().equals(ficha)
				&& TeR.btnAbjMed.getText().equals(ficha)) {
			tresEnRaya = true;
		}
		if (TeR.btnArrDer.getText().equals(ficha) && TeR.btnMedDer.getText().equals(ficha)
				&& TeR.btnAbjDer.getText().equals(ficha)) {
			tresEnRaya = true;
		}
		if (TeR.btnArrIzq.getText().equals(ficha) && TeR.btnMedMed.getText().equals(ficha)
				&& TeR.btnAbjDer.getText().equals(ficha)) {
			tresEnRaya = true;
		}
		if (TeR.btnAbjIzq.getText().equals(ficha) && TeR.btnMedMed.getText().equals(ficha)
				&& TeR.btnArrDer.getText().equals(ficha)) {
			tresEnRaya = true;
		}

		return tresEnRaya;
	}

	private static boolean chkTeRProg(String ficha) {

		boolean tresEnRaya = false;

		String fichaContraria;

		if (ficha.equals("O")) {
			fichaContraria = "X";
		} else {
			fichaContraria = "O";
		}

		if (TeR.btnArrIzq.getText().equals(fichaContraria) && TeR.btnArrMed.getText().equals(fichaContraria)
				&& TeR.btnArrDer.getText().equals(fichaContraria)) {
			tresEnRaya = true;
		}

		if (TeR.btnMedIzq.getText().equals(fichaContraria) && TeR.btnMedMed.getText().equals(fichaContraria)
				&& TeR.btnMedDer.getText().equals(fichaContraria)) {
			tresEnRaya = true;
		}

		if (TeR.btnAbjIzq.getText().equals(fichaContraria) && TeR.btnAbjMed.getText().equals(fichaContraria)
				&& TeR.btnAbjDer.getText().equals(fichaContraria)) {
			tresEnRaya = true;
		}

		if (TeR.btnArrIzq.getText().equals(fichaContraria) && TeR.btnMedIzq.getText().equals(fichaContraria)
				&& TeR.btnAbjIzq.getText().equals(fichaContraria)) {
			tresEnRaya = true;
		}
		if (TeR.btnArrMed.getText().equals(fichaContraria) && TeR.btnMedMed.getText().equals(fichaContraria)
				&& TeR.btnAbjMed.getText().equals(fichaContraria)) {
			tresEnRaya = true;
		}
		if (TeR.btnArrDer.getText().equals(fichaContraria) && TeR.btnMedDer.getText().equals(fichaContraria)
				&& TeR.btnAbjDer.getText().equals(fichaContraria)) {
			tresEnRaya = true;
		}
		if (TeR.btnArrIzq.getText().equals(fichaContraria) && TeR.btnMedMed.getText().equals(fichaContraria)
				&& TeR.btnAbjDer.getText().equals(fichaContraria)) {
			tresEnRaya = true;
		}
		if (TeR.btnAbjIzq.getText().equals(fichaContraria) && TeR.btnMedMed.getText().equals(fichaContraria)
				&& TeR.btnArrDer.getText().equals(fichaContraria)) {
			tresEnRaya = true;
		}

		return tresEnRaya;
	}

	public static void JugadaPrograma(boolean[] jugadas) {

		boolean jugadaValida = false;

		while (!jugadaValida) {

			int jugada = (int) (Math.random() * (9));
			System.out.println(jugada);

			for (int i = 0; i < jugadas.length; i++) {
				System.out.println(String.valueOf(jugadas[i]));
				if (comprobarArray(jugadas)) {
					jugadaValida = true;
					break;
				}
			}

			if (!jugadas[jugada]) {

				jugadaValida = true;

				if (TeR.ficha == "O") {

					anyadirFichaMaquina("X", jugada);
					TeR.arrJugadas[jugada] = true;

				} else if (TeR.ficha == "X") {

					TeR.arrJugadas[jugada] = true;
					anyadirFichaMaquina("O", jugada);

				}

			} else {

			}
		}
	}

	private static void anyadirFichaMaquina(String ficha, int jugada) {

		switch (jugada) {
		case 0:
			TeR.btnArrIzq.setText(ficha);
			break;
		case 1:
			TeR.btnArrMed.setText(ficha);

			break;
		case 2:
			TeR.btnArrDer.setText(ficha);

			break;
		case 3:
			TeR.btnMedIzq.setText(ficha);

			break;
		case 4:
			TeR.btnMedMed.setText(ficha);

			break;
		case 5:
			TeR.btnMedDer.setText(ficha);

			break;
		case 6:
			TeR.btnAbjIzq.setText(ficha);

			break;
		case 7:
			TeR.btnAbjMed.setText(ficha);

			break;
		case 8:
			TeR.btnAbjDer.setText(ficha);

			break;
		}

	}

	public static boolean comprobarArray(boolean[] arrJugadas) {
		for (boolean b : arrJugadas)
			if (!b)
				return false;
		return true;
	}

	public void subirPuntos() {
		
		Statement stmt = null;
		String sqlUpdate = null;
		String sql = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conectar = DriverManager.getConnection("jdbc:mysql://54.237.166.122/jpcgames", "conecta",
					"12345678");
			Statement s = conectar.createStatement();
			String sqlID = "Select idUsuario from usuario where Nombre='" + MainFrame.usuarioActual + "';";
			ResultSet chkUsu = s.executeQuery(sqlID);

			chkUsu.next();

			int idUsu = chkUsu.getInt(1);
			int iD = idUsu;

			ResultSet chkPts = s.executeQuery("Select idUsuario From puntuacion where idUsuario = " + iD + ";");

			if (chkPts.first()) {

				try {

					sqlUpdate = "Update puntuacion " + "SET Puntos = 100 + Puntos "
							+ "Where idUsuario = " + iD + ";";

					s.executeUpdate(sqlUpdate);

				} catch (Exception e) {
					System.out.println("Error en el update");
					System.out.println(sqlUpdate);
				}

			} else if (!chkPts.first()) {

				try {

					stmt = conectar.createStatement();
					sql = "INSERT INTO `puntuacion`(`idUsuario`, `Puntos`) VALUES (" + iD + ", 100);";
					stmt.executeUpdate(sql);

				} catch (Exception e) {
					System.out.println("Error en el insert");
					System.out.println(sql);

				}
			} else {

			}

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
