package pooConstructores;
import java.util.*;
public class Taxi {
	private Coche taxi1;//declaración global del objeto taxi1 de la clase Coche
	private Coche taxi2; ;//declaración global del objeto taxi2 de la clase Coche

	      Scanner teclado=new Scanner(System.in);
	public static void main(String[] args) {
		Taxi obj=new Taxi();// para no declarar los metodos y variables globales static
	      obj.cargarDatos();
	      obj.muestraDatos();
	}
	
	private  void cargarDatos(){

	      System.out.print("\nIntroduce un ciudad: ");
	      String ciudad =teclado.next();
	      System.out.print("\nIntroduce los matricula: ");
	      String matricula=teclado.next();
	      System.out.print("\nIntroduce provincia");
	      String provincia=teclado.next();
	      System.out.print("\n Introduce tipo de motor");
	      int tipoMotor=teclado.nextInt();
	      taxi1=new Coche(ciudad,matricula,provincia, tipoMotor);
	      taxi2=new Coche(matricula,provincia, tipoMotor);
	}
	
	public void muestraDatos(){
	      System.out.print("Los datos de taxi 1 son : ");
	      System.out.println("\nla Ciudad : "+taxi1.getCiudad()+".");
	      System.out.println("la matricula :"+taxi1.getMatricula()+".");
	      System.out.println("la provincia : "+taxi1.getProvincia()+".");
	      System.out.println("El tipo de motor : "+taxi1.getTipoMotor()+".");
	      
	      System.out.print("Los datos de taxi 2 son : ");
	      System.out.println("\nla Ciudad : "+taxi2.getCiudad()+".");
	      System.out.println("la matricula :"+taxi2.getMatricula()+".");
	      System.out.println("la provincia : "+taxi2.getProvincia()+".");
	      System.out.println("El tipo de motor : "+taxi2.getTipoMotor()+".");
	}
	      

	}


