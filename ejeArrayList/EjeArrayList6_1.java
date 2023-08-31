package arrayLits;
import java.util.*;
public class EjeArrayList6_1 {
	Random rnd = new Random();
	int i;
	int resultadoSuma=0;
	double resultadoMedia=0;
	
	ArrayList <Integer> num = new ArrayList<Integer>();
	public void rellenar() {
		for(i = 0; i<num.size();i++) {
			num.add(rnd.nextInt(8)+1);
		}
	 	System.out.println("Los num son: ");
	 	System.out.println(num);
	}
	
	public void operar() {
		for(i = 0; i<num.size();i++) {
			resultadoSuma=resultadoSuma + num.get(i);	
		}
				
		for(i = 0; i<num.size();i++) {
			resultadoMedia=resultadoSuma/10;
		}
		System.out.println("El resultado de la media es: " + resultadoMedia);
	}
		
	 public static void main(String[] args) {
		EjeArrayList6_1 Obj =new EjeArrayList6_1();
		Obj.rellenar();	
		Obj.operar();
	}
}
