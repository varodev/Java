package vt5;

import java.sql.SQLException;

public class Main {
	public static void main(String[] args) {
		ConnectDB connect = new ConnectDB();
		try {
			connect.connectToBD();
		} catch (SQLException e) {
			System.err.println("No se ha podido conectar al servidor SQL");
			e.printStackTrace();
		}
	}
}
