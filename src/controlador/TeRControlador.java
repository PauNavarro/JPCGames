/**
 * 
 */
package controlador;

import vista.TeR;

/**
 * @author JPCGames
 *
 */
public class TeRControlador implements Juegos {

	public static void anyadirFicha(String ficha, int posicion) {

		switch (posicion) {
		case 0:
			TeR.btnArrIzq.setText(ficha);
			JugadaPrograma(TeR.arrJugadas);
			break;
		case 1:
			TeR.btnArrMed.setText(ficha);
			JugadaPrograma(TeR.arrJugadas);

			break;
		case 2:
			TeR.btnArrDer.setText(ficha);

			JugadaPrograma(TeR.arrJugadas);

			break;
		case 3:
			TeR.btnMedIzq.setText(ficha);

			JugadaPrograma(TeR.arrJugadas);

			break;
		case 4:
			TeR.btnMedMed.setText(ficha);

			JugadaPrograma(TeR.arrJugadas);

			break;
		case 5:
			TeR.btnMedDer.setText(ficha);

			JugadaPrograma(TeR.arrJugadas);

			break;
		case 6:
			TeR.btnAbjIzq.setText(ficha);
			JugadaPrograma(TeR.arrJugadas);

			break;
		case 7:
			TeR.btnAbjMed.setText(ficha);
			JugadaPrograma(TeR.arrJugadas);

			break;
		case 8:
			TeR.btnAbjDer.setText(ficha);
			JugadaPrograma(TeR.arrJugadas);

			break;
		}

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

	@Override
	public void subirPuntos() {

	}

}
