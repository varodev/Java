package com.nerea.psp;

import javax.xml.transform.Result;
import java.sql.*;

public class Principal {
    public static void main(String[] args) {

        Connection con1 = null;
        Statement stmt1 = null;
        ResultSet rs1 = null;


        try{
            //Definicion de los parametros de la conexion
            String cadenaUTC = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            String baseDatos = "bd1";

            /*Definicion de la conexion
            El puerto de acceso debemos comprobarlo con la direccion de acceso en el navegador 3306 suele ser con Xampp en Windows | 8889 sueler ser
            con Mamp en Mac Os*/
            con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+baseDatos+cadenaUTC,"nerea","admin");

            //Establecimiento de la conexion:
            stmt1=con1.createStatement();

            //Ejecucion de la consulta:
            //Guardamos la consulta:
            String sql1 = "select * from articulos";
            //La usamos dentro de la executeQuery
            rs1=stmt1.executeQuery(sql1);

            //Volcado de datos:

            while(rs1.next()){

                //System.out.println(rs1.getString("ide")+"|"); Tambien se puede hacer asi

                System.out.println(rs1.getString(1)+"|");
                System.out.println(rs1.getString(2)+"|");
                System.out.println(rs1.getString(3)+"|");
                System.out.println(rs1.getString(4));
                System.out.println("");

                //Este es otro ejemplo de acceso a datos para la consulta fichero de acceso Datos1

               /* while(rs1.next()){
                    for(int i =1; i<rs1.getMetaData().getColumnCount();i++){
                        System.out.println(rs1.getString(i)+"|");
                    }
                    System.out.println("");
                }*/

            }
            //Cierre acceso a datos para consulta : Cierre de rs1,stmt1 y con1. Se debe ir abriendo en un orden y cerrando en el inverso

            rs1.close();
            stmt1.close();
            con1.close();

            //Vaciado de stmt1

            stmt1=null;


            //En el catch pondremos una serie de excepciones para poder localizar donde estasn los errores generados:

        } catch (SQLException ex) {
            System.out.println("SQLExcepcion :" + ex.getMessage());
            System.out.println("SQLEstado :" + ex.getSQLState());
            System.out.println("SQLCodigoError :" + ex.getErrorCode());

        }


    }
}
