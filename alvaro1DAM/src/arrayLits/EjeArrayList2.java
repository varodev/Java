package arrayLits;
import java.util.*;
public class EjeArrayList2 {
	Scanner scanner = new Scanner(System.in);
	Random rnd = new Random();
	int i=0;
	int resultadoSuma=0;
	int resultadoMulti=1;
	ArrayList<Integer> enteros = new ArrayList<Integer>();
	int[]matrix = new int[4];
		
	public void operar() {
		System.out.println("introdice 4 valores al vector");
		for (int i=0; i<matrix.length;i++) {
			System.out.println("Dame " + (i+1) + " valor");
			matrix[i]=rnd.nextInt(8)+1;
		}
				
		System.out.println("Pasamos el valor del vector al array");
		for (int i=0;i<matrix.length;i++) {
			enteros.add(matrix[i]);
		}
		System.out.println("añadimos un numero 100 a arrayList");
		enteros.add(100);
				
		System.out.println("Los elementos del arrayList son: ");
		System.out.println(enteros);
		System.out.println("Hay " + enteros.size() + " elementos en el arrayList");
				
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
