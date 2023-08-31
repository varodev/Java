package controlador;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;



import modelo.BuscarBD;

@WebServlet("/Buscar")
public class Buscar extends HttpServlet {
   private static final long serialVersionUID = 1L;
public Buscar() {
       super();
   }


   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

       response.setContentType("text/plain");
       response.setCharacterEncoding("UTF-8"); 
       String valor1 = request.getParameter("valor1");
BuscarBD buscar1 = new BuscarBD();
       try {
           response.getWriter().write(buscar1.buscarDatos1(valor1));
       } catch (ClassNotFoundException e) {
           // TODO Auto-generated catch block
           e.printStackTrace();
       }

   }



   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       doGet(request, response);
   }
}
