
package pooHerencia;
import java.util.*;
public class E2MainPersona {

	public static void main(String[] args) {
		E2Persona p1 = new E2Persona("Luis", "Perez", 20);
		E2Persona p2 = new E2Persona("Luisa", "Pereza", 30);
		E2Persona p3 = new E2Persona("Matilde", "Mas", 40);
		E2Persona p4 = new E2Persona("Sandra", "Laso", 50);
		E2Empleado e1 = new E2Empleado("Sergio", "Ruiz", 60, 2000.0, 200);
		E2Empleado e2 = new E2Empleado("Hector", "deMar", 40, 1500.0, 150);
		E2Empleado e3 = new E2Empleado("Nacho", "Palo", 45, 1600.0, 300);
		E2Empleado e4 = new E2Empleado("Antonio", "Barca", 55, 1800.0, 85);
		E2Empleado e5 = new E2Empleado("Javier", "Costa", 43, 2500.0, 99);
		
		System.out.println("sueldo total:");
		System.out.println(e1.calculeTotalCobrado());
		System.out.println(e2.calculeTotalCobrado());
		System.out.println(e3.calculeTotalCobrado());
		System.out.println(e4.calculeTotalCobrado());
		System.out.println(e5.calculeTotalCobrado());
		
		ArrayList<E2Persona> mydatos = new ArrayList<>();
		mydatos.add(p1);
		mydatos.add(p2);
		mydatos.add(p3);
		mydatos.add(p4);
		
		ArrayList<E2Empleado> mydatos2 = new ArrayList<>();
		mydatos2.add(e1);
		mydatos2.add(e2);
		mydatos2.add(e3);
		mydatos2.add(e4);
		mydatos2.add(e5);
		
		System.out.println("\nVisualizar Personas:");
		for (int i=0; i<mydatos.size(); i++) {
			System.out.println(mydatos.get(i).getNombre() + " " + mydatos.get(i).getApellidos() + " " + mydatos.get(i).getEdad());
		}
		
		System.out.println("\nVisualizar Empleados:");
		for (int i=0; i<mydatos2.size(); i++) {
			System.out.println(mydatos2.get(i).getNombre() + " " + mydatos2.get(i).getApellidos() + " " + mydatos2.get(i).getEdad() + " " + mydatos2.get(i).getComision() + " " + mydatos2.get(i).getComision());
		}

		
	}

}
