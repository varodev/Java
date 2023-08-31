package condicionalesIFSwitch;
import java.util.*;
public class TestingSw7 {
	public static void main(String[] args) {
System.out.print("Cual es la correcta?\n");
 System.out.println("\na.int 1x=10");
 System.out.print("\nb.int x=10");
 System.out.println("\nc.float x=10.0f");
 System.out.println("\nd.string x=''10''\n");
 System.out.println("\nintroduce la opcion correcta");
					
Scanner scanner = new Scanner(System.in);
String respuesta = scanner.nextLine();

char res = respuesta.charAt(0);

      switch (res) {
			case 'a':
				System.out.println("Respuesta incorrecta");
			break;
			case 'b':
				System.out.println("Respuesta correcta");	
			break;
			case 'c':
				System.out.println("Respuesta incorrecta");
			break;
			case 'd':
				System.out.println("Respuesta incorrecta");
			break;
			default:
				System.out.println("no se, no respondo");
		}//switch
scanner.close();
    }//main
}//TestingSw7
