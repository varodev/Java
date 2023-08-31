package pooExcepciones;
import java.util.*;
public class Excepciones2Main {

	public static void main(String[] args) {
		Excepciones2Electrodomesticos elec = new Excepciones2Electrodomesticos(140, "negro", "B", 45);
		Excepciones2Electrodomesticos elec2 = new Excepciones2Electrodomesticos(150, "gris", "E", 40);
		Excepciones2Lavadora lav = new Excepciones2Lavadora(268, "rojo", "C", 37, 31);
		Excepciones2Lavadora lav2 = new Excepciones2Lavadora(300, "negro", "A", 80, 16);
		Excepciones2Television tele = new Excepciones2Television(500, "rojo", "B", 44, 44, true);
		Excepciones2Television tele2 = new Excepciones2Television(500, "rojo", "B", 44, 44, false);
		
		try {
		
		ArrayList<Excepciones2Electrodomesticos>allElectro = new ArrayList<>();
		allElectro.add(elec);
		allElectro.add(elec2);
		allElectro.add(tele);
		allElectro.add(tele2);
		allElectro.add(lav);
		allElectro.add(lav2);
				
		for(int i=0; i<allElectro.size();i++) {
			System.out.println(allElectro.get(i).precioFinal());
		}
		
		ArrayList<Excepciones2Electrodomesticos>Electro = new ArrayList<>();
		Electro.add(elec);
		Electro.add(elec2);
		
		double sumaelectro=0;
		
		for (int i = 0; i<Electro.size(); i++) {
			sumaelectro+=Electro.get(i).precioFinal();
		}
		
		ArrayList<Excepciones2Television>TV = new ArrayList<>();
		TV.add(tele);
		TV.add(tele2);
		
		double sumaTV=0;
		
		for (int i = 0; i<TV.size(); i++) {
			sumaTV+=TV.get(i).precioFinal();
		}
		
		ArrayList<Excepciones2Lavadora>Lava = new ArrayList<>();
		Lava.add(lav);
		Lava.add(lav2);
		
		double sumaLava=0;
		
		for (int i = 0; i<Lava.size(); i++) {
			sumaLava+=Lava.get(i).precioFinal();
		}
			
		System.out.println("el precio total de la clase electrodomestico es: " + sumaelectro);
		System.out.println("el precio total de la clase Television es: " + sumaTV);
		System.out.println("el precio total de la clase Lavadora es:  " + sumaLava);
		}catch(IndexOutOfBoundsException e) {
			System.out.println("Desbordamiento de buffer");
		}catch(InputMismatchException e) {
			System.out.println("La cifra debe ser n nuevo entero " + e.toString());
		}catch(Exception e) {
			System.out.println("Fallo inesperado " + e.toString() );
		}
		
		
	}

}
