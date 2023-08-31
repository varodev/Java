import java.util.*;
import java.sql.*;

public class Insertar {

	public static void main(String[] args) {
		
		//Solicitud para la inserccion de datos :
		
		Scanner sc1 = new Scanner (System.in);
		
		String marca1 = null;
		String pvp1 = null;
		String unidades1 = null;
		String sql1=null;
		
		System.out.println("Marca y modelo del piano : ");
		marca1 = sc1.nextLine();
		System.out.println("PVP del piano : ");
		pvp1 = sc1.nextLine();
		System.out.println("Unidades disponibles del piano :");
		unidades1 = sc1.nextLine();
		
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
    	PreparedStatement pstmt1 = null;
    	
         try {
    		
    		//Definicion de la conexion e inicializacion de los objetos:
    		con1=DriverManager.getConnection(JDBC_URL,JDBC_USER,JDBC_PASSWORD);
    		
    		//Esstablecimiento de la conexion:
    		stmt1 = con1.createStatement();
    		
    		//Configuracion de la instruccion con parámetros (más segura)
    		
    		sql1 = "insert into articulos(nom,pvp,uni)values(?,?,?)";
    		pstmt1 = con1.prepareStatement(sql1);
    		
    		//Definicion de los parametros :
    		
    		pstmt1.setString(1, marca1);
    		pstmt1.setFloat(2, Float.parseFloat(pvp1));
    		pstmt1.setInt(3,Integer.parseInt(unidades1));
    		
    		//Ejecucion de la instruccion con parametros
    		
    		try {
    			
    			pstmt1.execute();
    			//Confirma los cambios como permanentes(opcional) :
    			//con1.commit();
    			System.out.println("Articulo registrado correctamente");
    		}catch(SQLException e) {
    			System.out.println("El articulo no se ha podido registrar");
    		}
    		
    		/*Alternativa: Configuracion de la instruccion sin parametros (menos segura) :
    		 * sql1 = "insert into articulos(nom,pvp,uni)values
    		 *(""+marca1 + "'," + pvp1 + "," + unidades + " ");
    		
    		try {
    			//Ejecucion de la consulta
    			stmt1.executeUpdate(sql1);
    			//Confirma los cambios como permanentes(opcional) :
    			//con1.commit();
    			System.out.println("Articulo resgitrado correctamente");
    			
    			
    		}catch(SQLException e) {
    			System.out.println("El articulo no se ha podido registrar");
    			
    		}*/
    		
    		//Cierre del pstmt1(stmt1) y con1
    		
    		pstmt1.close();
    		stmt1.close();
    		con1.close();
    		
    		//cierre scanner
    		
    		sc1.close();
    		
    		//Vaciado de pstmt1
    		
    		pstmt1 = null;
    		
		

	}catch(SQLException e){
		
   		//e.printStackTrace(System.out);
		
		System.out.println("SQLException : " + e.getMessage());
		System.out.println("SQLEstado : " + e.getSQLState());
		System.out.println("SQLCodigoError" + e.getErrorCode());
		
		
	}
		
	}

}
