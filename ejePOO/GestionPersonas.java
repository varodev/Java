package poo;
import java.util.*;
public class GestionPersonas {
	Scanner scanner = new Scanner (System.in);
		Persona persona=new Persona();
	
	public void cargarDatos() {
		System.out.println("Dame nombre");
		String nombre = scanner.next();
		persona.setNombre(nombre);
		System.out.println("Dame apellido");
		String apellido = scanner.next();
		persona.setApellido(apellido);
		System.out.println("Dame calle");
		String calle = scanner.next();
		persona.setCalle(calle);
		System.out.println("Dame telefono");
		int telefono = scanner.nextInt();
		persona.setTelefono(telefono);
		System.out.println("Vamos a introducir las aficiones");
              String []aficiones=new String [3];
            for (int i=0; i<3;i++) {  
            	System.out.println("Dame aficion" + (i+1));
            	aficiones[i]=scanner.next();
		}
        persona.setAficiones(aficiones);    
	}
	
	public void mostrarDatos() {
		System.out.println(persona.getNombre());
		System.out.println(persona.getApellido());
		System.out.println(persona.getCalle());
		System.out.println(persona.getTelefono());
		
		String[]aficiones=persona.getAficiones(); //se repetiria en otro metodo si solo se quiisera imprimir esto
			for (int i=0; i<3;i++) {
			System.out.print(aficiones[i] + " ");
			}
	}
		
	public void cambiarDatos() {
			System.out.println("Vamos a cambiar las aficiones");
			String []aficiones=new String [3];
            for (int i=0; i<3;i++) {  
            	System.out.println("Dame aficion" + (i+1));
            	aficiones[i]=scanner.next();
            }
            persona.setAficiones(aficiones);
   }
}
