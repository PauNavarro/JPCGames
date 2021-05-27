package controlador;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Pong extends JPanel implements KeyListener, Juegos{

	JFrame frame = new JFrame("Pong");
	Pong pong = new Pong();
	
	private static final long serialVersionUID = 3219779922354618365L;

	/**
	 * @author PauNavarro
	 * 
	 *         Github: https://github.com/PauNavarro
	 *
	 */

	// Variables para la posicion de la pelota
	int x = 0;
	int y = 0;
	int xa = 1;
	int ya = 1;

	// Variables para la posicion del rectangulo inferior
	int xRectAb = 1;
	int xaRectAb = 0;
	int contAb = xRectAb;
	int[] posicionRectAb = new int[150];

	// Variables adicionales para detectar pulsaciones, colisiones, etc.

	int pulsacion;
	boolean colision = false;
	int parar = 0;
	int puntuacion = 0;

	// Metodo para el movimiento del rectangulo inferior

	public void movimientoRectAbajo() {

		// Hacer que pare de moverse en caso de que toque uno de los margenes

		if (xRectAb + xaRectAb >= getWidth() - 150) {
			xaRectAb = 0;
		}
		if (xRectAb + xaRectAb >= getWidth() - 799) {
			xaRectAb = 0;
		}

		// Detección de pulsaciones y controles.

		if (pulsacion == KeyEvent.VK_A) {

			if (xRectAb + xaRectAb < 0) {
				xaRectAb = 0;
			} else {
				xaRectAb = -2;
			}
		}

		if (pulsacion == KeyEvent.VK_D) {
			if (xRectAb + xaRectAb >= getWidth() - 150) {
				xaRectAb = 0;
			} else {
				xaRectAb = 2;
			}
		}

		// Movimiento del rectangulo

		xRectAb = xRectAb + xaRectAb;

		// Inizializar el vector utilizado para comprobar colision

		int a = 1;

		for (int i = 0; i < posicionRectAb.length; i++) {
			posicionRectAb[i] = xRectAb + a;
			a++;
		}

	}

	

	
	

	// Metodo para el movimiento de la pelota, puntuacion y colisiones.

	private int[] movimientoPelota(int resultado[]) {

		// Rebote de la pelota en caso de tocar los margenes derecho o izquierdo

		if (x + xa < 0)
			xa = 1;
		if (x + xa > getWidth() - 30)
			xa = -1;


		// Comprobar si hay colision con el rectangulo de abajo.

		if (y + ya > getHeight() - 80) {

			for (int i = 0; i < posicionRectAb.length; i++) {
				if (x == posicionRectAb[i]) {
					ya = -1;
					puntuacion++;

				}
				if (y + ya > getHeight() - 30) {
					parar = 1;
					ya = -1;
				}
			}
		}

		// En caso que un rectangulo haya tenido colision, se añadira 1 punto al
		// resultado, si ninguno ha tenido colision, la pelota avanzara hasta el margen
		// superior o inferior y el programa se detendra

		if (y + ya > getHeight())
			parar = 1;

		// Movimiento de la pelota

		x = (x + xa);
		y = (y + ya);

		// Inizializacion de los valores del vector de resultados para devolverlos al
		// MainVentana

		resultado[0] = puntuacion;
		resultado[1] = parar;

		return resultado;

	}

	// Metodo para dibujar la pelota y los dos rectangulos

	@Override
	public void paint(Graphics g) {

		// Borrar todo lo que haya en pantalla para que no se dibujen lineas alla por
		// donde pasan los rectangulos y la pelota

		super.paint(g);

		Graphics2D g2d = (Graphics2D) g;

		// Añadiendo Antialiasing para evitar los bordes de sierra de la pelota

		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		// Dibujando la pelota y los dos rectangulos.
		g.fillRoundRect(x, y, 30, 30, 30, 30); // Pelota
		g.fillRect(xRectAb, getHeight() - 60, 150, 30); // Rectangulo de abajo

	}

	public Pong(boolean start) throws InterruptedException {

		// Inicializar la ventana

		
		

		// Definiendo el tamaño de la ventana y haciendo que no se pueda cambiar de
		// tamaño.

		frame.setSize(800, 800);
		frame.setResizable(false);

		// Añadiendo un KeyListener para detectar pulsación de teclas

		frame.addKeyListener(pong);

		// Haciendo la ventana visible y añadiendo que se pueda cerrar.

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		int[] resultado = new int[2];

		// Bucle principal que se encarga de ejecutar los movimientos de la pelota y
		// ambos rectangulos

		do {

			pong.movimientoPelota(resultado); // Movimiento pelota
			pong.movimientoRectAbajo(); // Movimiento rectangulo de abajo
			pong.repaint(); // Hacer que dibuje los objetos en su posicion actual
			Thread.sleep(3); // Detener la ejecucion durante 3 milisegundos

		} while (resultado[1] == 0); // El bucle continuara hasta que la variable almacenada en el vector resultado
		// [1] (parar) sea diferente de 0

		// En caso de que se detenga el bucle se mostara por pantalla un mensaje con el
		// resultado obtenido

		JOptionPane.showMessageDialog(null, "Habeis conseguido " + resultado[0] + " puntos", "Has perdido",
				JOptionPane.ERROR_MESSAGE);

	}

	public Pong() {
	}






	// Metodos de el Keylistener.

	@Override
	public void keyPressed(KeyEvent evt) {
		pulsacion = evt.getKeyCode();
	}

	@Override
	public void keyReleased(KeyEvent evt) {
	}

	@Override
	public void keyTyped(KeyEvent evt) {
	}

	@Override
	public void subirPuntos() {

		
		
	}
}