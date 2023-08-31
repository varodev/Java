package condicionalesIFSwitch;
import java.util.*;
public class repaso4 {
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		System.out.println("introduce num1");
		int num1 = scanner.nextInt();
		System.out.println("introduce num2");
		int num2 = scanner.nextInt();
	 
	 if (num1%num2==0) {
		System.out.println("son multiplos"); 
	 }
	 else {
		System.out.println("no lo son");
	 }
scanner.close();
    }//main
}//repaso4
