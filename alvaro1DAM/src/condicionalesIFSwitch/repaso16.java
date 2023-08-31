package condicionalesIFSwitch;
import java.util.*;
public class repaso16 {
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        System.out.println("introduce el mes");
		int mes = scanner.nextInt();
		System.out.println("introduce el año");
		int anno = scanner.nextInt();
		
		switch (mes){
		case 1:
		case 3:	
		case 5:
		case 7:	
		case 8:	
		case 10:
		case 12:	
			System.out.println("el numero de dias es 31");
		break;	
		case 2:
			if ((anno %4 ==0) && ((anno % 10 == 0 || (anno % 400) == 0))){
				System.out.println("el numero de dias es 29");
			}
			else {
				System.out.println("el numero de dias es 28");
			}
		break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("el numero de dias es 30");
			break;
			default:
				System.out.println("algo estas haciendo mal");
		}//switch
scanner.close();
    }//main
}//repaso15
