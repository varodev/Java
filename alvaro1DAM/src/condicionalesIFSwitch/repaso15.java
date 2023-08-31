package condicionalesIFSwitch;
import java.util.*;
public class repaso15 {
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        System.out.println("introduce un número");
		int num = scanner.nextInt();
		
		double raiz = Math.sqrt(num);
		int resultado = (int)raiz;
		
		if (raiz * raiz == num) {
			System.out.println(num + " se puede expresar como " + resultado + " * " + resultado);
		}
		else {
			System.out.println("no se puede expresar como cuadrado de dos numeros");
		}
scanner.close();
    }//main
}//repaso15
