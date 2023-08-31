package arrayLits;
import java.util.*;
public class EjeArrayList3 {
	
	public static void imprimir(ArrayList<String> lista) {
		for(int i = 0; i<lista.size();i++) {
			System.out.println(lista.get(i)+";");
		}
	}

	public static void imprimirDouble(ArrayList<Double> lista) {
		for(int i = 0; i<lista.size();i++) {
			System.out.println(lista.get(i)+";");
		}
	}
	
	public static void main(String[] args) {
		ArrayList<String> textos = new ArrayList<String>();
		textos.add("Azul");
		textos.add("Adios");
		textos.add("Manolo");
		System.out.println("Cadena texto");
		System.out.println(textos);
		System.out.println();
		
		ArrayList<Double> numeros = new ArrayList<Double>();
		numeros.add(15.3);
		numeros.add(4.7);
		numeros.add(3.022);
		System.out.println("Cadena numeros");
		System.out.println(numeros);
		System.out.println();
					    		
		System.out.println("\nCambiar 4,7 por 5.3");
		numeros.set(1, 5.3);
		imprimirDouble(numeros);
		
		System.out.println("\nHacer una funcion que imprima los items de un ArrayList, pasandole como parámetro el nombre del ArrayList");
		System.out.println("Ordenar alfabéticamente");		
		Collections.sort(textos);
		imprimir(textos);
		
		System.out.println("\nHacer una funcion que imprima los items de un ArrayList, pasandole como parámetro el nombre del ArrayList");
		System.out.println("Ordenar de menor a mayor");
		Collections.sort(numeros);
		imprimirDouble(numeros);
	}
}
