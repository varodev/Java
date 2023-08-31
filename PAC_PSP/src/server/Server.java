package server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {
	private final int PUERTO = 9876; //Puerto: 9876
    private ServerSocket serverSocket;//Socket correspondiente al servidor
    private Socket socket;

	//Constructor
    public Server() throws IOException {
        serverSocket = new ServerSocket(PUERTO);//Definir conexi�n
        socket = new Socket();//Iniciar cliente
    }
    
    //M�todo para iniciar la conexi�n servidor
    public void startServer() throws IOException {
    		System.out.println("Esperando 1r cliente");
    		//Cliente se conecta(Aceptar la conexi�n y guardar)
			socket = serverSocket.accept();
			System.out.println("Nombre cliente");
    	DataInputStream in = new DataInputStream(socket.getInputStream());
		//Ojo:Servidor recibe nombre de cliente
		String nameCustomer = in.readUTF();
		DataOutputStream out = new DataOutputStream(socket.getOutputStream());
    		//Imprime nombre del cliente por consola
    		System.out.println("Encantado de verte, " + nameCustomer);
    		//pregunta n� de tareas a realizar
    		System.out.println("�Cuantas tareas a realizar?");
		int numberTask = in.readInt();
    		//Imprime respuesta cliente por consola
    		System.out.println("Las tareas a realizar son: " + numberTask);
    	
    	//Sacamos un arraylist con el numero de las tareas***
    	ArrayList<Tarea> tasklist = new ArrayList<Tarea>();
    	//Bucle
		for(int i = 0; i< numberTask; i++) {
			//Mensajes al cliente
			// Servidor env�a al cliente n� de la tarea
			//Servidor solicita la descripci�n de la tarea
			//Servidor solicita el estado de la tarea
    		out.writeUTF("Introducci�n de la tarea: " + (i+1));
			out.writeUTF("Introduce la descripci�n");
    		String descripcion = (in.readUTF());
    		out.writeUTF("Introduce el estado");
    		String estado = in.readUTF();
    		tasklist.add(new Tarea(descripcion, estado));
    		}//Fin bucle
    		/*Servidor env�a mensaje al cliente informando de que va enviar las tareas
    		  Servidor env�a todas las tareas */
    		System.out.println("El listado de tareas: " + tasklist);
    	out.writeUTF("Tareas: " + tasklist);
    	socket.close();
    	in.close();
        out.close();
    }
    //M�todo para finalizar servidor
    	public void endServer() throws IOException {
            serverSocket.close();
            	System.out.println("Finalizaci�n del programa, hasta pronto");
        }
}