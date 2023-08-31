package server;

import java.io.IOException;

public class Main {//Copiado de la vt8
    public static void main(String[] args) throws IOException {
        //Creación de servidor
        Server servitor = new Server();
            System.out.println("Iniciando servidor...");
        //Inicia servidor
        servitor.startServer();
        //Finaliza servidor
        servitor.endServer();
    }
}
