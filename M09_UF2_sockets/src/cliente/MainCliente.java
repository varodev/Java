package cliente;

import java.io.IOException;

public class MainCliente{

    public static void main(String[] args) throws IOException {

        //Creamos objeto de Cliente
        Cliente cli = new Cliente();
        System.out.println("Iniciando cliente Nº: " + Math.floor(Math.random()*100+1));

        //Iniciamos la conexión
        cli.iniciarCliente();
    }
}
