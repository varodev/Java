package arrayLits;
import java.util.*;
public class EjeArrayList1 {
	int i=0;
	String comi[] = {"Lentejas", "Sopa","Pollo a la plancha", "Pollo asado"};
	
	public void imprimir() {
	    System.out.println("Asi queda");
	    for (i=0; i<comi.length;i++) {
	    System.out.print(comi[i] + " ");	
	    }
	}
		
	public void operar() {
		System.out.println();
		System.out.println("\nAñadimos Paella y Cocido Madrileño");
		ArrayList<String> comidas = new ArrayList<String>();
		comidas.add("Paella");
		comidas.add("Cocido Madrileño");
    		for(i = 0; i < comi.length; i++) {
    		comidas.add(comi[i]);
    		}
    	System.out.println(comidas);
    	
    	System.out.println();
		System.out.println("\nCambiar Pollo a la plancha por Pollo al ajillo.");
    	comidas.set(4, "Pollo al ajillo");
    	System.out.println(comidas);
    	
    	System.out.println();
		System.out.println("\nAñadimos Marmitako");
    	comidas.add("Marmitako");
    	
    	System.out.println();
		System.out.println("\nImprimir el último valoro.");
		System.out.println(comidas.get(comidas.size()-1));
    	
    	System.out.println();
		System.out.println("\nQuitar Cocido Madrileño.");
    	comidas.remove(1);
    	System.out.println(comidas);
    	
    	
		System.out.println();
		System.out.println("\nSi quiero ver los elementos del arrayList");
		System.out.println(comidas);
		System.out.println();
		System.out.println("\nSi quiero saber los elementos del arrayList");
		System.out.println(comidas.size());
    	System.out.println();
		System.out.println("\nSi quiero quitar todos los elementos");
    	System.out.println("Borrando...");
    	comidas.clear();
    	System.out.println(comidas);
    	System.out.println("\nFIN");
    }
	
	public static void main(String args[]) {
		EjeArrayList1 array = new EjeArrayList1();
		array.imprimir();
		array.operar();
	}
}
