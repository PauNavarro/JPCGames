package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import vista.MainFrame;

public class LogIn {

	@SuppressWarnings("deprecation")
	public static void login() {

		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection conectar = DriverManager.getConnection("jdbc:mysql://54.237.166.122/jpcgames", "root", "12345678");
			Statement s = conectar.createStatement();
			String passwdUsu = new String(MainFrame.passwordField.getPassword());
			ResultSet chkUsu = s.executeQuery(

					"Select * " + "from usuario " + "where Contraseña='" + passwdUsu + "' AND Nombre='"
							+ MainFrame.textUsuario.getText() + "';"

					);

			conectar.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
