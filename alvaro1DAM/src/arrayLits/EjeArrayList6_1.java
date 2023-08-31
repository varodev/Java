package arrayLits;
import java.util.*;
public class EjeArrayList6_1 {
	Random rnd = new Random();
	int i;
	int resultadoSuma=0;
	double resultadoMedia=0;
	
	ArrayList <Integer> num = new ArrayList<Integer>();
	int[]Vnum = new int[10];
	
	public void rellenar() {
		System.out.println("rellenamos el vector...");
		for(i=0; i<10;i++) {
			Vnum[i]=rnd.nextInt(8)+1;
		}
		System.out.println("el vector queda asi");
		for(i=0; i<10;i++) {
		System.out.print(Vnum[i] + " ");
		}
		
		System.out.println("\npasamos el vector al arrayList...");
		for(i=0; i<10;i++) {
			num.add(Vnum[i]);
		}
		
		System.out.println("El arrayList queda asi");
		for (Integer e: num) {
			System.out.print(e + " ");
		}
	}
	
	public void operar() {
		for(i = 0; i<num.size();i++) {
			resultadoSuma=resultadoSuma + num.get(i);	
		}
				
		for(i = 0; i<num.size();i++) {
			resultadoMedia=resultadoSuma/10;
		}
		System.out.println("\nEl resultado de la media es: " + resultadoMedia);
	}
		
	 public static void main(String[] args) {
		EjeArrayList6_1 Obj =new EjeArrayList6_1();
		Obj.rellenar();	
		Obj.operar();
	}
}
