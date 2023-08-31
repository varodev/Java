package org.example;

import java.sql.*;

public class App
{
    public static void main( String[] args )
    {
        //Puerto habitual: 3306
        final String JDBC_PORT = "3306";
        final String JDBC_SERVER = "localhost";
        final String JDBC_DATABASE = "bd1";
        final String JDBC_USER = "laura";
        final String JDBC_PASSWORD = "Madrid";

        final String JDBC_UTC = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatatimeCode=false&serverTimezone=UTC";
        final String JDBC_URL = "jdbc:mysql://" + JDBC_SERVER + ":" + JDBC_PORT + "/" + JDBC_DATABASE + JDBC_UTC;
        Connection con1 = null;
        java.sql.Statement stmt1 = null;
        ResultSet rs1 = null;

        try {
            //Definición de la conexión
            con1 = DriverManager.getConnection(JDBC_URL,JDBC_USER,JDBC_PASSWORD);

            //Establecimiento de la conexión
            stmt1 = con1.createStatement();

            //Ejecución de la consulta
            String sql1 = "select * from obr";
            rs1 = stmt1.executeQuery(sql1);

            //Volcado de los datos
            while (rs1.next()){
                //System.out.print(rs1.getString("ide_obr") + "|");
                System.out.print(rs1.getString(1) + "|");
                System.out.print(rs1.getString(2) + "|");
                System.out.print(rs1.getString(3) + "|");
                System.out.print(rs1.getString(4) + "|");
                System.out.print(rs1.getString(5) + "|");
                System.out.print(rs1.getString(6));
                System.out.println("");
            }

            //Cierre de rs1,stmt1 y con1
            rs1.close();
            stmt1.close();
            con1.close();

            //Vaciado del stmt1
            stmt1 = null;

        } catch (SQLException e) {
            //e.printStackTrace(System.out);
            System.out.println("SQlException:" + e.getMessage());
            System.out.println("SQlEstado:" + e.getSQLState());
            System.out.println("SQlCodigoError:" + e.getErrorCode());
        }
    }
}
