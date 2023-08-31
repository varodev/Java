package client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	Scanner sc = new Scanner(System.in);
	private final String HOST = "localhost";//Direcci�n: localhost
    private final int PUERTO = 9876;//Puerto: 9876
    private Socket socket;//Socket correspondiente al cliente

	//Constructor
	public Client() throws IOException {
        socket = new Socket(HOST, PUERTO);
    }

	//M�todo para iniciar conexi�n
    public void startCustomer() throws IOException {//Cliente se conecta
    	DataInputStream in = new DataInputStream(socket.getInputStream());//Cliente a Servidor
    		System.out.println(in);
    	DataOutputStream out = new DataOutputStream(socket.getOutputStream());//Servidor a cliente
    		System.out.println("Bienvenido, �Como te llamas?");
		//Pregunta nombre del cliente
    	String nameCustomer = sc.next();
    		System.out.println("Hola " + nameCustomer + "!");
		out.writeUTF(nameCustomer);
    		System.out.println("�Cuantas tareas has de realizar?");
    		//Cliente recibe n� de tarea
    		int numberTask = sc.nextInt();
    	out.writeInt(numberTask);
			//Bucle
    		for (int i = 0; i< numberTask; i++) {
				//Ojo:Cliente solicita al usuario la descripci�n de la tarea y se la env�a al servidor
    			System.out.println(in.readUTF());//Mensajes por pantalla
 				System.out.println(in.readUTF());
    			String descripcion = sc.next();
    		out.writeUTF(descripcion);
    			System.out.println(in.readUTF());
    		String estado = sc.next();
    		out.writeUTF(estado);
    		}//Fin bucle
			//Cliente recibe la informaci�n de las tareas.
			System.out.println(in.readUTF());
    	out.close();
    	in.close();
    	socket.close();
    }
}
