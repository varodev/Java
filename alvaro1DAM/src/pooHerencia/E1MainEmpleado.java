package pooHerencia;
import java.util.*;


public class E1MainEmpleado {

	public static void main(String[] args) {
		E1Comercial comercial1=new E1Comercial("Avaro", "Moreno",30, 1000, 200);
		E1Empleado comercial2= new E1Comercial("Luis", "Sanchez", 33, 1500, 100);
		E1Repartidor repartidor1=new E1Repartidor("Maria", "Perez", 55, 1800, "Centro");
	
	comercial1.plus(100);
	comercial2.plus(100);
	repartidor1.plus(100);
	System.out.println(comercial1.toString());
	System.out.println(comercial2.toString());
	System.out.println(repartidor1.toString());
	
	System.out.println("\nahora vamos a visualizar con los get");//poner todos los get
	System.out.println("el nombre del primer comercial " + comercial1.getNombre() + " " + comercial1.getSalario());
	System.out.println("el nombre del segundo comercial " + comercial2.getNombre() + " " + comercial2.getSalario());
	System.out.println("el nombre del repartidor " + repartidor1.getNombre() + " " + repartidor1.getSalario());
	
	////////////////////////////////////////////////////////////////////vector
	System.out.println("\nahora vamos a visualizarlo en un array");
	E1Empleado[] empleado = {comercial1, comercial2, repartidor1};
	
	System.out.println("vamos a recorrer el vector");
		for (int i=0; i<empleado.length;i++) {
			System.out.println(empleado[i].toString());
			
	///////////////////////////////////////////////////////////////////arraylist
	System.out.println("\nahora vamos a visualizarlo en un arrayList");
	
	ArrayList <E1Empleado> arrayEmpleado = new ArrayList <>(); 	
	arrayEmpleado.add(comercial1);
	arrayEmpleado.add(comercial2);
	arrayEmpleado.add(repartidor1);
	
	System.out.println("vamos a recorrer el arraylist");
	for (i = 0 ; i<arrayEmpleado.size();i++) {
		System.out.println(arrayEmpleado.get(i).toString());
	}
	
	System.out.println("vamos a cambiar el salario de un empleado");
	@SuppressWarnings("resource")
	Scanner scanner = new Scanner (System.in);
	System.out.println(arrayEmpleado);
	System.out.println("dame el nombre que queremos modificar su salario");
	String nombre = scanner.next();
	
	for (E1Empleado e: arrayEmpleado) {
		 if(e.getNombre().equalsIgnoreCase(nombre)) {
			 System.out.println("dame un nuevo salario");
			 double salario = scanner.nextDouble();
			 e.setSalario(salario);
		 }
	}
	System.out.println(arrayEmpleado.toString());
	
	
	
	
	
		}
	}
}
