package vt5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConnectDB {
	private final String BBDD;
	private final String USER;
	private final String PASSWORD;
	
	public ConnectDB() {
		BBDD = "jdbc:mysql://localhost:3306";
		USER = "root";
		PASSWORD = "root";
	}

	public ConnectDB(String BBDD, String USER, String PASSWORD) {
		this.BBDD = BBDD;
		this.USER = USER;
		this.PASSWORD = PASSWORD;
	}
	
	public void connectToBD() throws SQLException  {
		Connection connect = DriverManager.getConnection(BBDD, USER, PASSWORD);
		Statement sentencia = connect.createStatement();
		
		String ifexists = "DROP SCHEMA IF EXISTS 2s2122_m06;";
		sentencia.executeUpdate(ifexists);
		
		String crearDB = "CREATE DATABASE 2s211_m06;";
		sentencia.executeUpdate(crearDB);
		
		String use = "use 2s211_m06;";
		sentencia.executeUpdate(use);
		
		String crearTabla = "CREATE TABLE Alumnos(id_alumno INT AUTO_INCREMENT PRIMARY KEY, nombre varchar(50) NOT NULL);";
		sentencia.executeUpdate(crearTabla);
		
		String insert = "INSERT INTO Alumnos(nombre) VALUES (\"Alvaro\"),(\"Pedro\"),(\"Maria\"),(\"Paula\");";  
		sentencia.executeUpdate(insert);
		
		ResultSet result = sentencia.executeQuery("Select * from Alumnos");
		List<Alumno> alumnoList = new ArrayList<>();
			while (result.next()) {
				Alumno alumno = new Alumno((long) result.getInt("id_alumno"), result.getString(2));
				alumnoList.add(alumno);
			}
			System.out.println(alumnoList);
			result.close();
			sentencia.close();
			connect.close();
		}
}
