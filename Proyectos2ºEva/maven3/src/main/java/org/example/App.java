package org.example;

import java.util.*;
import java.sql.*;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) throws SQLException {
        //Solicitud de datos
        Scanner sc1 = new Scanner(System.in);
        String marca1 = null;
        String pvp1 = null;
        String unidades1 = null;
        String sql1 = null;


        System.out.print("Marca y modelo del piano");
        marca1 = sc1.nextLine();
        System.out.print("PVP del piano");
        pvp1 = sc1.nextLine();
        System.out.print("Unidades disponibles del piano: ");
        unidades1 = sc1.nextLine();

        //Puerto habitual:
        //Xampp: 3306

        final String JDBC_PORT = "3306";
        final String JDBC_SERVER = "localhost";
        final String JDBC_DATABASE = "bd1";
        final String JDBC_USER = "laura";
        final String JDBC_PASSWORD = "Madrid";

        final String JDBC_UTC = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatatimeCode=false&serverTimezone=UTC";
        final String JDBC_URL = "jdbc:mysql://" + JDBC_SERVER + ":" + JDBC_PORT + "/" + JDBC_DATABASE + JDBC_UTC;

        Connection con1 = null;
        java.sql.Statement stmt1 = null;
        PreparedStatement pstmt1 = null;

        try {
            //Definición de la conexión
            con1 = DriverManager.getConnection(JDBC_URL,JDBC_USER,JDBC_PASSWORD);

            //Establecimiento de la conexión
            stmt1 = con1.createStatement();

            //Configuración de la instrucción con parámetros (más segura)
            sql1 = "insert into articulos (nom, pvp, uni) values (?,?,?)";
            pstmt1 = con1.prepareStatement(sql1);

            //Definición de los parámetros
            pstmt1.setString(1,marca1);
            pstmt1.setFloat(2,Float.parseFloat(pvp1));
            pstmt1.setInt(3,Integer.parseInt(unidades1));

            // Ejecución de la instrucción con parámetros
            try {
                pstmt1.execute();
                // Confirma los cambios como permanentes (opcional)
                //con1.commit();
                System.out.println("Artículo registrado correctamente.");
            }
            catch (SQLException e) {
                System.out.println("El artículo no se ha podido registrar.");
            }

            /*
            // Alternativa: Configuración de la instrucción sin parámetros (menos segura)
            sqll=
            "'insert into articulos (nom, pvp, uni) values
            ('''+ marcal + "''." + pvp1 + "
            ." + unidades1 +
            ")";
            try
            {
            // Ejecución de la consulta
            stmt1.executeUpdate(sql1);
            // Confirma los cambios como permanentes (opcional)
            // con1.commit();
            System.out.println("Artículo registrado correctamente.");
            }
            catch (SQLException e)
            {
            System.out.println("El artículo no se ha podido registrar. ");
            }
            */

            //Cierre del pstmt1 (stmt1) y con1
            pstmt1.close();
            stmt1.close();
            con1.close();

            //Cierre de scanner
            sc1.close();

            //Vaciado del pstmt1
            pstmt1 = null;

        } catch (SQLException e) {
            //e.printStackTrace(System.out);
            System.out.println("SQlException:" + e.getMessage());
            System.out.println("SQlEstado:" + e.getSQLState());
            System.out.println("SQlCodigoError:" + e.getErrorCode());
        }

    }

}
