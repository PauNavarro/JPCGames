package controlador;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import vista.*;

public class Registrar {

	public static void registrar() {

		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection conectar = DriverManager.getConnection("jdbc:mysql://54.237.166.122/jpcgames", "conecta",
					"12345678");
			Statement s = conectar.createStatement();
			String passwdUsu = new String(MainFrame.passwordField.getPassword());
			ResultSet chkUsu = s.executeQuery(

					"Select * " + "from usuario " + "where Nombre='" + MainFrame.textUsuario.getText() + "';"

			);

			if (!chkUsu.next()) {

				int insertarUsu = s.executeUpdate(

						"insert into usuario (Nombre,Contraseña) " + "values ('" + MainFrame.textUsuario.getText()
								+ "', '" + passwdUsu + "')");

				if (insertarUsu > 0) {
					MainFrame.lblconfirmacion.setForeground(Color.black);
					MainFrame.lblconfirmacion.setText("El usuario ha sido registrado");
					MainFrame.passwordField.setText("");
					MainFrame.textUsuario.setText("");

				}

				conectar.close();
			} else {

				MainFrame.lblconfirmacion.setForeground(Color.black);
				MainFrame.lblconfirmacion.setText("Ya existe un usuario con este nombre y contraseña.");
				MainFrame.passwordField.setText("");
				MainFrame.textUsuario.setText("");

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
