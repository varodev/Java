package poo;
import java.util.*;
	public class Principal {
//////////////////////////////////////////////////////////////////////metodos que juegan los AL   
ArrayList<Estudiantes> arraylistAlumno = new ArrayList<Estudiantes>();
	public void aL(Estudiantes alumno) {
		 arraylistAlumno.add(alumno);
	}//arraylist
	
	public void visualizarAL() {
		for(Estudiantes i: arraylistAlumno ) {
			System.out.println(i.getNombre()+" "+i.getApellido()+" "+i.getCorreo()+i.getEdad());
		}
	}//visualizarArraylist
				
  public static void main(String[] args) {
	Principal obj=new Principal();
	    try (Scanner sc = new Scanner(System.in)) {
//////////////////////////////////////////////////////////////////////G&S	    	
	    	System.out.println("CONSTRUCCION OBJECTOS CON GET & SET");
	  
	    Estudiantes alumno1=new Estudiantes();
	  		System.out.println("dame el nombre alumno1:");
			String nombre=sc.next();
			System.out.println("dame el apellido");
			String apellido=sc.next();
			System.out.println("dame el correo");
			String email=sc.next();
			
		alumno1.setNombre(nombre);
		alumno1.setApellido(apellido);
		alumno1.setCorreo(email);
	  
	  Estudiantes alumno2=new Estudiantes();
	  		System.out.println("dame el nombre alumo2:");
			nombre=sc.next();
			System.out.println("dame el apellido");
			apellido=sc.next();
			System.out.println("dame el correo");
			email=sc.next();
			
		alumno2.setNombre(nombre);
		alumno2.setApellido(apellido);
		alumno2.setCorreo(email);
		
	System.out.println("vamos a visualizar el alumno1--get");
			System.out.println(alumno1.getNombre());
			System.out.println(alumno1.getApellido());
			System.out.println(alumno1.getCorreo());
	
	System.out.println("vamos a visualizar el alumno2--get");
			System.out.println(alumno2.getNombre());
			System.out.println(alumno2.getApellido());
			System.out.println(alumno2.getCorreo());
			
///////////////////////////////////////////////////////////////////////////////////////////////////C			
	System.out.println("CONSTRUCCION OBJECTOS CON CONSTRUCTORES");
		System.out.println("dame el nombre para todos los constructores:");
			nombre=sc.next();
			System.out.println("dame el apellido");
			apellido=sc.next();
			System.out.println("dame el correo");
			email=sc.next();
			System.out.println("dame la edad");
			int edad=sc.nextInt();
	
		Estudiantes alumno3=new Estudiantes(nombre,apellido,email);
		Estudiantes alumno4=new Estudiantes("pir","sancz",edad);
		Estudiantes alumno5=new Estudiantes("nerea");
		
		System.out.println("vamos a visualizar el alumno3--constructor");
			System.out.println(alumno3.getNombre());
			System.out.println(alumno3.getApellido());
			System.out.println(alumno3.getCorreo());
			System.out.println(alumno3.getEdad());
			
		System.out.println("vamos a visualizar el alumno4--constructor");	
			System.out.println(alumno4.getNombre());
			System.out.println(alumno4.getApellido());
			System.out.println(alumno4.getCorreo());
			System.out.println(alumno3.getEdad());
			
		System.out.println("vamos a visualizar el alumno5--constructor");	
			System.out.println(alumno5.getNombre());
			System.out.println(alumno5.getApellido());
			System.out.println(alumno5.getCorreo());
			System.out.println(alumno5.getEdad());	
			
			
//////////////////////////////////////////////////////////////////////////////////////////////AL			
	System.out.println("*************************");		
		System.out.println("vamos a insertarlo en un arralist");
			obj.aL(alumno1);
			obj.aL(alumno2);
			obj.aL(alumno3);
			obj.aL(alumno4);
			obj.aL(alumno5);
		}//cerrando scanner
		System.out.println("Visualizar el arraylist");
			obj.visualizarAL();
		
  }//main	
		}//Principal
	

