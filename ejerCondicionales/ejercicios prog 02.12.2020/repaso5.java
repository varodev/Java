package ejerciciosRepaso;
import java.util.*;
public class repaso5 {
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		System.out.println("introduce num1");
		int num1 = scanner.nextInt();
		System.out.println("introduce num2");
		int num2 = scanner.nextInt();
		
	 
	 if (num1>=num2) {
		System.out.println("es mayor e igual " + num1); 
	 }
	 else {
		System.out.println("no lo es");
	 }
scanner.close();
    }//main
}//repaso5