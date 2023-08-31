package exam2eva;
import java.util.*;
public class EmpleadoMain {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		Empleado usu1 = new Empleado ("111M", "Alvaro", 2000, 6, 10);
		Empleado usu2 = new Empleado ("222M", "Pepi", 7);
		Empleado usu3 = new Empleado ("333M", "Luis", 600);
		
		Empleado usu4 = new Empleado();
			System.out.println("dame dni empleado usu4");
			usu4.setDNI(scanner.next());
			System.out.println("dame nombre empleado usu4");
			usu4.setNombre(scanner.next());
			System.out.println("dame sueldo base empleado usu4");
			usu4.setSueldoBase(scanner.nextDouble());
			System.out.println("dame cantidad horas extras");
			usu4.setCantidadHorasExtras(scanner.nextInt());
			System.out.println("dame importe de horas extras");
			usu4.setImporteHorasExtras(scanner.nextDouble());
		
		Empleado usu5 = new Empleado();
		System.out.println("dame dni empleado usu5");
		usu5.setDNI(scanner.next());
		System.out.println("dame nombre empleado usu5");
		usu5.setNombre(scanner.next());
		System.out.println("dame sueldo base empleado usu5");
		usu5.setSueldoBase(scanner.nextDouble());
		System.out.println("dame cantidad horas extras");
		usu5.setCantidadHorasExtras(scanner.nextInt());
		System.out.println("dame importe de horas extras");
		usu5.setImporteHorasExtras(scanner.nextDouble());
		
		Empleado[] empleado = {usu1, usu2, usu3, usu4, usu5};
		mostrar(empleado);
		mostrarMayor(empleado);
		mostrarMenor(empleado);
		
		
	
	}
	public static void mostrar(Empleado[] empleado) {
		for (int i=0; i<empleado.length; i++) {
			System.out.println(empleado[i].getDNI() + " " + empleado[i].getNombre() + " " + empleado[i].getSueldoBase() + " " + empleado[i].getCantidadHorasExtras() + " " + empleado[i].getImporteHorasExtras());
		}
	}
	
	public static void mostrarMayor(Empleado[] empleado) {
		double salarioMayor=Integer.MIN_VALUE;
		int posicionMayor=0;
		 for (int i=0; i<empleado.length;i++) {
			if(empleado[i].sueldo()>salarioMayor) {
				salarioMayor=empleado[i].sueldo();
				posicionMayor=i;
			}
		 }	
		 System.out.println("El mayor salario es " + salarioMayor + " el empleado con mayor salario es " + empleado[posicionMayor].getNombre());
		
		
	}
	
	public static void mostrarMenor(Empleado[] empleado) {
		double salarioMenor=Integer.MAX_VALUE;
		int posicionMenor=0;
	     for (int i=0; i<empleado.length; i++) {
	    	 if(empleado[i].sueldo()<salarioMenor) {
	    		 salarioMenor=empleado[i].sueldo();
	    		 posicionMenor=i;
	    	 }
	     }
	     System.out.println("El menor salario es " + salarioMenor + " el empleado con menor sueldo es " + empleado[posicionMenor].getNombre());
	}

}
