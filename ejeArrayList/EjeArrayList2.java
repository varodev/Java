package arrayLits;
import java.util.*;
public class EjeArrayList2 {
	int i=0;
	int resultadoSuma=0;
	int resultadoMulti=1;
	
	public void operar() {
		ArrayList<Integer> enteros = new ArrayList<Integer>();
		enteros.add(25);
		enteros.add(15);
		enteros.add(28);
		enteros.add(43);
		
		System.out.println("Los elementos son: ");
		System.out.println(enteros);
		System.out.println("Hay " + enteros.size() + " elementos");
				
		System.out.println("\nImprimir por pantalla la suma de ArrayList");
		
			for(i = 0; i<enteros.size();i++) {
			resultadoSuma=resultadoSuma + enteros.get(i);
			}
			System.out.println("La suma es "+ resultadoSuma);
		
		System.out.println("\nImprimir por pantalla la multiplicación de ArrayList");
		
			for(int i = 0; i<enteros.size();i++) {
			resultadoMulti=resultadoMulti * enteros.get(i);
			}
			System.out.println("La multiplicación es "+ resultadoMulti );
    }
	
	public static void main(String args[]) {
		EjeArrayList2 array = new EjeArrayList2();
		array.operar();
	}
}
