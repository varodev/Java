import java.sql.*;
public class PrincipalEclipse {

	public static void main(String[] args) {
		//Estos son los objetos que vamos a crear y que vamos a usar:
		
				Connection con1 = null; 
				Statement stmt1 = null;
				ResultSet sr1 = null;
				
				try {
					
					//Definicion de los parametros de la conexion:
					
					String cadenaUTC =  "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
					
					String baseDatos ="bd1";
					
					//Definicion de la conexion inicializacion con1:
					//El puerto de acceso debemos comprobarlo con la direccion de acceso en el navegador.
					//3306 suele ser con Xamp en Windows y 8889 suele ser con Mamp en MacOs:
					
					con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + baseDatos + cadenaUTC, "nerea", "admin");
					
					//Establecimiento de la conexion con el objeto stmt1:
					
					stmt1= con1.createStatement();
					
					//Ejecucion de la consulta con el objeto sql1:
					
					String sql1= "select * from articulos";
					
					sr1 = stmt1.executeQuery(sql1); //aqui hace una copia local
					
					//Volcado de datos:
					
					while (sr1.next()) { //next siempre va a devolver verdadero siempre que haya datos que buscar, y esos datos los recorre el while
						
						System.out.print(sr1.getString(1)+ "|");
						System.out.print(sr1.getString(2)+ "|");
						System.out.print(sr1.getString(3)+ "|");
						System.out.print(sr1.getString(4)+ "|");
						
						System.out.println("");
						
						//El while va a girar tantas veces como registros tengamos	
					}
					
					//Cierre de rs1, stmt1 y con1. Es importante cerrar por seguridad. Los objetos los usamos en un orden y lo cerramos en el inverso
					
					sr1.close();
					stmt1.close();
					con1.close();
					
					//Vaciado de stmt1. Siempre es recomendable vaciar el stmt
					
					stmt1 = null;
					
					
				}catch(SQLException ex) {
					System.out.println("SQLExcepcion :" + ex.getMessage());
					System.out.println("SQLEstado :" + ex.getSQLState());
					System.out.println("SQLCodigoError :" + ex.getErrorCode());
					}}}


