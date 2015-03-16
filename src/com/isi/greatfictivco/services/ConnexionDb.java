package com.isi.greatfictivco.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnexionDb {

	static String db = "tp";
	static String pwd = "123456";
	static String user = "root";
	static String url = "jdbc:mysql://localhost:3306/";
	static Connection connect;

	public static boolean ouvrirConnection() {

		boolean siConnectionReussi = false;

		try {

			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection(url + db, user, pwd);
			siConnectionReussi = true;

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Erreur de connection" + e);
		}
		return siConnectionReussi;
	}

	public static void fermerConnection() {

		try {
			connect.close();

		} catch (SQLException e) {
			System.out.println("La connection a la bd n'a pas été fermer");
		}
	}

	public static PreparedStatement getDeclaration(String query) {
		PreparedStatement ps = null;

		ouvrirConnection();
		try {
			ps = connect.prepareStatement(query);
		} catch (SQLException e) {
			System.out.println("La déclaration n'a pu etre initialiser");
		}
		return ps;
	}
}