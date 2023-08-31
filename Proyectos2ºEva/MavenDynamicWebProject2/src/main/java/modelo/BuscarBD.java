package modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BuscarBD {

       public String buscarDatos1(String valor1) throws ClassNotFoundException{

            Connection con1 = null;
            Statement stmt1 = null;
            ResultSet rs1 = null;
            String consulta1 = null; 
            String datos1 = null;
    try {

                String cadenaUTC = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
                String baseDatos = "bd1";
                String url = "jdbc:mysql://localhost:3306/" + baseDatos + cadenaUTC;

                Class.forName("com.mysql.cj.jdbc.Driver");

                con1 = DriverManager.getConnection(url, "root", "");
                
                stmt1 = con1.createStatement();
                consulta1 = ("select * from ropa where nombre like '%" + valor1 + "%'");
    try {
                    rs1 = stmt1.executeQuery(consulta1);
                    while (rs1.next()) {
                        datos1 +="<div class='columna1'><div class='datos1'>"+rs1.getString(1)+"</div></div>";
                        datos1 +="<div class='columna1'><div class='datos1'>"+rs1.getString(2)+"</div></div>";
                    }
                } catch (SQLException e) {
                    datos1 = "No se ha podido realizar la busqueda";
                }

                rs1.close();
                stmt1.close();
                con1.close();
                stmt1 = null;

    } catch (SQLException ex) {
        System.out.println("SQLExcepcion: " + ex.getMessage());
        System.out.println("SQLEstado: " + ex.getSQLState());
        System.out.println("SQLCodigoError: " + ex.getErrorCode());
    }

    return datos1;
}



}
