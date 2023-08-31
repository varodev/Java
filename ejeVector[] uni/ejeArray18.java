package vectores;
import java.util.*;
public class ejeArray18 {
    Scanner scanner = new Scanner(System.in);
	String cadena;
	String numero[];
	int count=0;
	
	public void capicua () {
		System.out.println("Inserta la cadena");
		cadena = scanner.nextLine();
		numero= new String [1];
			for (int i=0; i<cadena.length()/2;i++) {
				if(cadena.charAt(i)==cadena.charAt(cadena.length()-1-i)) {
				count++;
				}//if
			}//for
	}//capicua
		
	public void imprimir() {
			if (count==cadena.length()/2) {
			System.out.println("es capicua");
			}
			else {
			System.out.println("no es capicua");
			}	
	}//imprimir
	
  public static void main(String[] args) {
     ejeArray18 num1= new ejeArray18();
		num1.capicua();
		num1.imprimir();
  }//main
}//ejeArray18
