package controlador;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import vista.MainFrame;

public class LogIn {

	public static boolean loginCorrecto = false;
	
	public static void login() {

		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection conectar = DriverManager.getConnection("jdbc:mysql://54.237.166.122/jpcgames", "conecta", "12345678");
			Statement s = conectar.createStatement();
			String passwdUsu = new String(MainFrame.passwordField.getPassword());
			ResultSet chkUsu = s.executeQuery(

					"Select * " + "from usuario " + "where Contraseña='" + passwdUsu + "' AND Nombre='"
							+ MainFrame.textUsuario.getText() + "';"

					);
			
			if (chkUsu.next()) {
				
				MainFrame.lblconfirmacion.setForeground(Color.black);
				MainFrame.lblconfirmacion.setText("Login correcto");
				loginCorrecto = true;
				
				MainFrame.usuarioActual = MainFrame.textUsuario.getText();
				
				MainFrame.passwordField.setText("");
				MainFrame.textUsuario.setText("");
			
			} else {
		
				MainFrame.lblconfirmacion.setForeground(Color.red);
				MainFrame.lblconfirmacion.setText("Login incorrecto");
				MainFrame.passwordField.setText("");
				MainFrame.textUsuario.setText("");
				
			}
			
			
			
			conectar.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	

}
