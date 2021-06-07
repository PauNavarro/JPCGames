import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import controlador.TeRControlador;
import vista.TeR;

class Prueba {

	@Test
	
	void testTresenRayaUsuario() {
		
		TeR ter = new TeR();
		
		ter.btnArrIzq.setText("X");
		ter.btnArrMed.setText("X");
		ter.btnArrDer.setText("X");

		
		boolean res = TeRControlador.chkTeRUsu("X");
		
		assertTrue(res);
	
		ter.btnArrIzq.setText("O");
		ter.btnArrMed.setText("O");
		ter.btnArrDer.setText("O");

		
		res = TeRControlador.chkTeRUsu("O");
		
		assertTrue(res);
		
		
		ter.btnMedIzq.setText("X");
		ter.btnMedMed.setText("X");
		ter.btnMedDer.setText("X");

		
		res = TeRControlador.chkTeRUsu("X");
		
		assertTrue(res);
	
		
		ter.btnMedIzq.setText("O");
		ter.btnMedMed.setText("O");
		ter.btnMedDer.setText("O");

		
		res = TeRControlador.chkTeRUsu("O");
		
		assertTrue(res);
		
		ter.btnAbjIzq.setText("X");
		ter.btnAbjMed.setText("X");
		ter.btnAbjDer.setText("X");

		
		res = TeRControlador.chkTeRUsu("X");
		
		assertTrue(res);
	
		
		ter.btnAbjIzq.setText("O");
		ter.btnAbjMed.setText("O");
		ter.btnAbjDer.setText("O");

		
		res = TeRControlador.chkTeRUsu("O");
		
		assertTrue(res);
		
		
		
		ter.btnArrMed.setText("X");
		ter.btnMedMed.setText("X");
		ter.btnAbjMed.setText("X");

		
		res = TeRControlador.chkTeRUsu("X");
		
		assertTrue(res);
	
		
		
		ter.btnArrMed.setText("O");
		ter.btnMedMed.setText("O");
		ter.btnAbjMed.setText("O");

		
		res = TeRControlador.chkTeRUsu("O");
		
		assertTrue(res);
		
		
		ter.btnArrDer.setText("X");
		ter.btnMedMed.setText("X");
		ter.btnAbjIzq.setText("X");

		
		res = TeRControlador.chkTeRUsu("X");
		
		assertTrue(res);
		
		ter.btnArrDer.setText("O");
		ter.btnMedMed.setText("O");
		ter.btnAbjIzq.setText("O");

		
		res = TeRControlador.chkTeRUsu("O");
		
		assertTrue(res);
		
		
		ter.btnArrIzq.setText("X");
		ter.btnMedMed.setText("X");
		ter.btnAbjDer.setText("X");

		
		res = TeRControlador.chkTeRUsu("X");
		
		assertTrue(res);
		
		
		ter.btnArrIzq.setText("O");
		ter.btnMedMed.setText("O");
		ter.btnAbjDer.setText("O");

		
		res = TeRControlador.chkTeRUsu("O");
		
		assertTrue(res);
		

	
	}
	
	
	
	@Test
	void testTresenRayaFalse() {
		
		TeR ter = new TeR();

		ter.btnArrIzq.setText("O");
		ter.btnArrMed.setText("X");
		ter.btnArrDer.setText("X");

		
	  boolean res = TeRControlador.chkTeRUsu("X");
		
	 	assertFalse(res);
		
	 	
		
		ter.btnArrIzq.setText("X");
		ter.btnArrMed.setText("O");
		ter.btnArrDer.setText("O");

		
		res = TeRControlador.chkTeRUsu("O");
		
		assertFalse(res);
		
		
		ter.btnMedIzq.setText("O");
		ter.btnMedMed.setText("X");
		ter.btnMedDer.setText("X");

		
		res = TeRControlador.chkTeRUsu("X");
		
		assertFalse(res);
	
		
		ter.btnMedIzq.setText("X");
		ter.btnMedMed.setText("O");
		ter.btnMedDer.setText("O");

		
		res = TeRControlador.chkTeRUsu("O");
		
		assertFalse(res);
		
		ter.btnAbjIzq.setText("O");
		ter.btnAbjMed.setText("X");
		ter.btnAbjDer.setText("X");

		
		res = TeRControlador.chkTeRUsu("X");
		
		assertFalse(res);
	
		TeR ter1 = new TeR();
		
		ter1.btnAbjDer.setText("X");
		ter1.btnAbjMed.setText("O");
		ter1.btnAbjIzq.setText("O");

		
		boolean res1 = TeRControlador.chkTeRUsu("O");
		
		assertFalse(res1);
		
		
		TeR ter2 = new TeR();
		ter2.btnArrMed.setText("O");
		ter2.btnMedMed.setText("X");
		ter2.btnAbjMed.setText("X");

		
		boolean res2 = TeRControlador.chkTeRUsu("X");
		
		assertFalse(res2);
	
		
		TeR ter3 = new TeR();
		ter3.btnArrMed.setText("X");
		ter3.btnMedMed.setText("O");
		ter3.btnAbjMed.setText("O");

		
		boolean res3 = TeRControlador.chkTeRUsu("O");
		
		assertFalse(res3);
		
		TeR ter4 = new TeR();
		ter4.btnArrDer.setText("O");
		ter4.btnMedMed.setText("X");
		ter4.btnAbjIzq.setText("X");

		
		boolean res4 = TeRControlador.chkTeRUsu("X");
		
		assertFalse(res4);
		
		ter.btnArrDer.setText("X");
		ter.btnMedMed.setText("O");
		ter.btnAbjIzq.setText("O");

		
		res = TeRControlador.chkTeRUsu("O");
		
		assertFalse(res);
		
		
		ter.btnArrIzq.setText("O");
		ter.btnMedMed.setText("X");
		ter.btnAbjDer.setText("X");

		
		res = TeRControlador.chkTeRUsu("X");
		
		assertFalse(res);
		
		TeR ter5 = new TeR();
		ter5.btnArrIzq.setText("X");
		ter5.btnMedMed.setText("O");
		ter5.btnAbjDer.setText("O");

		
		boolean res5 = TeRControlador.chkTeRUsu("O");
		
		assertFalse(res5);
	
	}
	
	
	@Test
	void testTresenRayaMaquinaTrue() {
		

		TeR ter = new TeR();
		
		ter.btnArrIzq.setText("X");
		ter.btnArrMed.setText("X");
		ter.btnArrDer.setText("X");

		
		boolean res = TeRControlador.chkTeRProg("O");
		
		assertTrue(res);
	
		ter.btnArrIzq.setText("O");
		ter.btnArrMed.setText("O");
		ter.btnArrDer.setText("O");

		
		res = TeRControlador.chkTeRProg("X");
		
		assertTrue(res);
		
		
		ter.btnMedIzq.setText("X");
		ter.btnMedMed.setText("X");
		ter.btnMedDer.setText("X");

		
		res = TeRControlador.chkTeRProg("O");
		
		assertTrue(res);
	
		
		ter.btnMedIzq.setText("O");
		ter.btnMedMed.setText("O");
		ter.btnMedDer.setText("O");

		
		res = TeRControlador.chkTeRProg("X");
		
		assertTrue(res);
		
		ter.btnAbjIzq.setText("X");
		ter.btnAbjMed.setText("X");
		ter.btnAbjDer.setText("X");

		
		res = TeRControlador.chkTeRProg("O");
		
		assertTrue(res);
	
		
		ter.btnAbjIzq.setText("O");
		ter.btnAbjMed.setText("O");
		ter.btnAbjDer.setText("O");

		
		res = TeRControlador.chkTeRProg("X");
		
		assertTrue(res);
		
		
		
		ter.btnArrMed.setText("X");
		ter.btnMedMed.setText("X");
		ter.btnAbjMed.setText("X");

		
		res = TeRControlador.chkTeRProg("O");
		
		assertTrue(res);
	
		
		
		ter.btnArrMed.setText("O");
		ter.btnMedMed.setText("O");
		ter.btnAbjMed.setText("O");

		
		res = TeRControlador.chkTeRProg("X");
		
		assertTrue(res);
		
		
		ter.btnArrDer.setText("X");
		ter.btnMedMed.setText("X");
		ter.btnAbjIzq.setText("X");

		
		res = TeRControlador.chkTeRProg("O");
		
		assertTrue(res);
		
		ter.btnArrDer.setText("O");
		ter.btnMedMed.setText("O");
		ter.btnAbjIzq.setText("O");

		
		res = TeRControlador.chkTeRProg("X");
		
		assertTrue(res);
		
		
		ter.btnArrIzq.setText("X");
		ter.btnMedMed.setText("X");
		ter.btnAbjDer.setText("X");

		
		res = TeRControlador.chkTeRProg("O");
		
		assertTrue(res);
		
		
		ter.btnArrIzq.setText("O");
		ter.btnMedMed.setText("O");
		ter.btnAbjDer.setText("O");

		
		res = TeRControlador.chkTeRProg("X");
		
		assertTrue(res);
		

	}
	
	@Test
	void testTresenRayaMaquinaFalse() {
		
		TeR ter = new TeR();
		
		ter.btnArrIzq.setText("O");
		ter.btnArrMed.setText("X");
		ter.btnArrDer.setText("X");

		
		boolean res = TeRControlador.chkTeRProg("O");
		
		assertFalse(res);
	
		TeR ter1 = new TeR();
		
		ter1.btnArrIzq.setText("X");
		ter1.btnArrMed.setText("O");
		ter1.btnArrDer.setText("O");

		
		boolean res1 = TeRControlador.chkTeRProg("X");
		
		assertFalse(res1);
		
		
		
		TeR ter2 = new TeR();
		
		
		ter2.btnMedIzq.setText("O");
		ter2.btnMedMed.setText("X");
		ter2.btnMedDer.setText("X");

		
		boolean res2 = TeRControlador.chkTeRProg("O");
		
		assertFalse(res2);
	
		
		TeR ter3 = new TeR();
		
		ter3.btnMedIzq.setText("X");
		ter3.btnMedMed.setText("O");
		ter3.btnMedDer.setText("O");

		
		boolean res3 = TeRControlador.chkTeRProg("X");
		
		assertFalse(res3);
		
		
		TeR ter4 = new TeR();
		ter4.btnAbjIzq.setText("O");
		ter4.btnAbjMed.setText("X");
		ter4.btnAbjDer.setText("X");

		
		boolean res4 = TeRControlador.chkTeRProg("O");
		
		assertFalse(res4);
	
		
		TeR ter5 = new TeR();
		ter5.btnAbjIzq.setText("X");
		ter5.btnAbjMed.setText("O");
		ter5.btnAbjDer.setText("O");

		
		boolean res5 = TeRControlador.chkTeRProg("X");
		
		assertFalse(res5);
		
		
		TeR ter6 = new TeR();
		ter6.btnArrMed.setText("O");
		ter6.btnMedMed.setText("X");
		ter6.btnAbjMed.setText("X");

		
		boolean res6 = TeRControlador.chkTeRProg("O");
		
		assertFalse(res6);
	
		
		TeR ter7 = new TeR();
		ter7.btnArrMed.setText("X");
		ter7.btnMedMed.setText("O");
		ter7.btnAbjMed.setText("O");

		
		boolean res7 = TeRControlador.chkTeRProg("X");
		
		assertFalse(res7);
		
		TeR ter8 = new TeR();
		ter8.btnArrDer.setText("O");
		ter8.btnMedMed.setText("X");
		ter8.btnAbjIzq.setText("X");

		
		boolean res8 = TeRControlador.chkTeRProg("O");
		
		assertFalse(res8);
		
		TeR ter9 = new TeR();
		ter9.btnArrDer.setText("X");
		ter9.btnMedMed.setText("O");
		ter9.btnAbjIzq.setText("O");

		
		boolean res9 = TeRControlador.chkTeRProg("X");
		
		assertFalse(res9);
		
		TeR ter10 = new TeR();
		ter10.btnArrIzq.setText("O");
		ter10.btnMedMed.setText("X");
		ter10.btnAbjDer.setText("X");

		
		boolean res10 = TeRControlador.chkTeRProg("O");
		
		assertFalse(res10);
		
		TeR ter11 = new TeR();
		ter11.btnArrIzq.setText("X");
		ter11.btnMedMed.setText("O");
		ter11.btnAbjDer.setText("O");

		
		boolean res11 = TeRControlador.chkTeRProg("X");
		
		assertFalse(res11);
	}
	
	@Test
	void testComprobarHueco() {
		
		boolean[] b = new boolean[9];
		
		b[0] = true;
		b[1] = true;
		b[2] = true;
		
		boolean res = TeRControlador.comprobarArray(b);
		
		assertFalse(res);
		
		
		boolean[] b1 = new boolean[9];
		
		b1[3] = true;
		b1[4] = true;
		b1[5] = true;
		
		boolean res1 = TeRControlador.comprobarArray(b1);
		
		assertFalse(res1);
		
		
		boolean[] b2 = new boolean[9];
		
		b2[6] = true;
		b2[7] = true;
		b2[8] = true;
		
		boolean res2 = TeRControlador.comprobarArray(b2);
		
		assertFalse(res2);
		
		
		boolean[] b3 = new boolean[9];
		
		b3[3] = true;
		b3[4] = true;
		b3[5] = true;
		b3[6] = true;
		b3[7] = true;
		b3[8] = true;
		
		boolean res3 = TeRControlador.comprobarArray(b3);
		
		assertFalse(res3);
		
		
		boolean[] b4 = new boolean[9];
		
		b4[0] = true;
		b4[1] = true;
		b4[2] = true;
		b4[3] = true;
		b4[4] = true;
		b4[5] = true;
		
		boolean res4 = TeRControlador.comprobarArray(b4);
		
		assertFalse(res4);
		
		
		
		boolean[] b5 = new boolean[9];
		
		b5[0] = true;
		b5[1] = true;
		b5[2] = true;
		b5[6] = true;
		b5[7] = true;
		b5[8] = true;
		
		boolean res5 = TeRControlador.comprobarArray(b5);
		
		assertFalse(res5);
		
		
		
		boolean[] b6 = new boolean[9];
		
		b6[0] = true;
		b6[1] = true;
		b6[2] = true;
		b6[3] = true;
		b6[4] = true;
		b6[5] = true;
		b6[6] = true;
		b6[7] = true;
		b6[8] = true;
		
		boolean res6 = TeRControlador.comprobarArray(b6);
		
		assertTrue(res6);
	}
	
	
	

}
