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
        serverSocket = new ServerSocket(PUERTO);//Definir conexión
        socket = new Socket();//Iniciar cliente
    }
    
    //Método para iniciar la conexión servidor
    public void startServer() throws IOException {
    		System.out.println("Esperando 1r cliente");
    		//Cliente se conecta(Aceptar la conexión y guardar)
			socket = serverSocket.accept();
			System.out.println("Nombre cliente");
    	DataInputStream in = new DataInputStream(socket.getInputStream());
		//Ojo:Servidor recibe nombre de cliente
		String nameCustomer = in.readUTF();
		DataOutputStream out = new DataOutputStream(socket.getOutputStream());
    		//Imprime nombre del cliente por consola
    		System.out.println("Encantado de verte, " + nameCustomer);
    		//pregunta nº de tareas a realizar
    		System.out.println("¿Cuantas tareas a realizar?");
		int numberTask = in.readInt();
    		//Imprime respuesta cliente por consola
    		System.out.println("Las tareas a realizar son: " + numberTask);
    	
    	//Sacamos un arraylist con el numero de las tareas***
    	ArrayList<Tarea> tasklist = new ArrayList<Tarea>();
    	//Bucle
		for(int i = 0; i< numberTask; i++) {
			//Mensajes al cliente
			// Servidor envía al cliente nº de la tarea
			//Servidor solicita la descripción de la tarea
			//Servidor solicita el estado de la tarea
    		out.writeUTF("Introducción de la tarea: " + (i+1));
			out.writeUTF("Introduce la descripción");
    		String descripcion = (in.readUTF());
    		out.writeUTF("Introduce el estado");
    		String estado = in.readUTF();
    		tasklist.add(new Tarea(descripcion, estado));
    		}//Fin bucle
    		/*Servidor envía mensaje al cliente informando de que va enviar las tareas
    		  Servidor envía todas las tareas */
    		System.out.println("El listado de tareas: " + tasklist);
    	out.writeUTF("Tareas: " + tasklist);
    	socket.close();
    	in.close();
        out.close();
    }
    //Método para finalizar servidor
    	public void endServer() throws IOException {
            serverSocket.close();
            	System.out.println("Finalización del programa, hasta pronto");
        }
}