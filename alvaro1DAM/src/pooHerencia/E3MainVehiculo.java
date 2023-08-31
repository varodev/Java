package pooHerencia;
import java.util.*;
public class E3MainVehiculo {

	public static void main(String[] args) {
		
	E3Vehiculo veh1 = new E3Vehiculo("111aaa","Seat", "Toledo", "Negro", 5 , 100);
	E3Vehiculo veh2 = new E3Vehiculo("222bbb", "Seat", "Toledo", "Gris", 5 , 900);
	E3Vehiculo veh3 = new E3Vehiculo("333ccc", "BMW", "Z4", "Rojo", 3, 200);
	E3Vehiculo veh4 = new E3Vehiculo("444ddd", "Citroen", "C4", "Blanco", 5, 100);
	
	System.out.println("visualizar todos los objetos vehiculos");
	System.out.println(veh1.toString());
	System.out.println(veh2.toString());
	System.out.println(veh3.toString());
	System.out.println(veh4.toString());
	
	//Almacenar datos en un arrayList
	ArrayList <E3Vehiculo> misVehiculos = new ArrayList<>();
	misVehiculos.add(veh1);
	misVehiculos.add(veh2);
	misVehiculos.add(veh3);
	misVehiculos.add(veh4);
	
	System.out.println("\nVamos a recorrer el ArrayList");
	System.out.println(misVehiculos.toString());
		
	System.out.println("\nvamos a visualizar los vehiculos de la marca Seat o BMW");
	System.out.println(misVehiculos.toString());
	
		for (E3Vehiculo e: misVehiculos) {
			if (e.getMarca().equalsIgnoreCase("Seat")||e.getMarca().equalsIgnoreCase("BMW")) {
				System.out.println(e.getMatricula() + " " + e.getMarca() + " " + e.getModelo() + " " + e.getColor() + " " + e.getNumPuertas() + " " + e.getPotencia());
			}
		}
	System.out.println("\nvamos a visualizar los vehiculos de color negro");	
	System.out.println(misVehiculos.toString());
	
		for(E3Vehiculo e: misVehiculos) {
			if(e.getColor().equalsIgnoreCase("Negro")) {
				System.out.println(e.getMatricula() + " " + e.getMarca() + " " + e.getModelo() + " " + e.getColor() + " " + e.getNumPuertas() + " " + e.getPotencia());
			}
		}
	System.out.println("\nvamos a almacenar los objetos en una lista");
	E3Vehiculo[] vehic = {veh1, veh2, veh3, veh4};
	
	for (int i=0; i<vehic.length;i++) {
		System.out.println(vehic[i].toString());
	}
	
}//main
	

}//mainvehiculo