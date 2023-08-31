package com.company.ConectarBBDDMaven;

//ESTA ES LA CLASE PRINCIPAL

import java.sql.*;

public class App {
    public static void main( String[] args ){
    	
    	//Estas son las constantes que vamos a crear (port,server, database, user...)
    	
    	//Recordar que podemos poner el usuario como root y la contraseña solo con "" simples y tambien funcionara
    	
    	//JDBC es como el prefijo que vamos a usar para identifcarlo y explicitarlo
    	
    	//Puerto habituales para  Xampp(Windows):3306 y para Mamp (MacOs):8889
    	
    	final String JDBC_PORT ="3306";
    	
    	final String JDBC_SERVER ="localhost";
    	
    	final String JDBC_DATABASE ="bd1";
    	
    	final String JDBC_USER ="nerea";
    	
    	final String JDBC_PASSWORD ="admin";
    	
    	//Cadena de conexion (ambas cadenas ya estaran disponibles para todos los proyectoss que queramos usar en el futuro) :
    	
    	final String JDBC_UTC ="?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegazyDatetimeCode=false&serverTimezone=UTC";
    	
    	//Conjunto de la cadena de conexion (URL):
    	
    	final String JDBC_URL = "jdbc:mysql://" + JDBC_SERVER + ":" +JDBC_PORT + "/" + JDBC_DATABASE + JDBC_UTC;
    	
    	//Objetos que en inicio estamos declarando como nulos y en el try los inicializaremos :
    	
    	Connection con1=null;
    	java.sql.Statement stmt1 = null;
    	ResultSet rs1 =null;
    	
    	//Siempre es recomendable hacerlo con try-cacth:
    	
    	try {
    		
    		//Definicion de la conexion e inicializacion de los objetos:
    		con1=DriverManager.getConnection(JDBC_URL,JDBC_USER,JDBC_PASSWORD);
    		
    		//Esstablecimiento de la conexion:
    		stmt1 = con1.createStatement();
    		
    		//Ejecucion de la consulta:
    		String sql1="select * from obr";
    		rs1 = stmt1.executeQuery(sql1);
    		
    		//Volcado de datos
    		
    		while(rs1.next()) {
    			
    		//	System.out.print(rs1.getString("id_nom")+"|");
    			
    			System.out.print(rs1.getString(1)+"|");
    			System.out.print(rs1.getString(2)+"|");
    			System.out.print(rs1.getString(3)+"|");
    			
    			System.out.print(rs1.getString(4)+"|");
    			System.out.print(rs1.getString(5)+"|");
    			System.out.print(rs1.getString(6));
    			System.out.println("");
    			
    		}
    		
    		
    		//Cierre de rs1, stmt1 y con1:
			
			rs1.close();
			stmt1.close();
			con1.close();
			
			//Vaciado de stmt1:
			
			stmt1 = null;
    		
    	}catch(SQLException e) {
    		
    		//e.printStackTrace(System.out);
    		
    		System.out.println("SQLException : " + e.getMessage());
    		System.out.println("SQLEstado : " + e.getSQLState());
    		System.out.println("SQLCodigoError" + e.getErrorCode());
    		
    	}
    	
    
        
    }
}
