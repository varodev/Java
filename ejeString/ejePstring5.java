package string;
import java.util.*;
public class ejePstring5 {
	
	String cadena;
	
	public ejePstring5() {
		try(Scanner scanner = new Scanner (System.in)){
			System.out.println("Introduce la cadena de texto que guste: ");	
        	cadena = scanner.nextLine();
		}//try	
        	
	}//ejePstring5()
	
	public void setMitad() {
//a) Imprimir la primera mitad de los caracteres de la cadena. 
	System.out.println(cadena.substring(0, cadena.length()/2) + "\n");
	}
	
	public void setLast() {	
//b) Imprimir el último carácter. 	
	System.out.println("la ultima letra es " + cadena.charAt(cadena.length()-1));
	}
	
	public void setInverst() {
//c) Imprimirlo en forma inversa.
	System.out.println("\n");
	for (int i = cadena.length()-1; i >=0; i--) {
	 System.out.print(cadena.charAt(i));
	}
	}
	
	public void Setguion() {	
//d) Imprimir cada carácter del String separado con un guión.
	 System.out.println("\n"); 
	for (int i =0; i<cadena.length();i++) {
	 System.out.print(cadena.charAt(i) + "-");
	}
	}
	
	public void SetVocals() {
//e) Imprimir la cantidad de vocales almacenadas. 
	int countA=0;
	int countE=0;
	int countI=0;
	int countO=0;
	int countU=0;
	
	for(int i=0; i<cadena.length();i++) {
		if(cadena.charAt(i)=='a') {
			countA++;
		}
		if(cadena.charAt(i)=='e') {
			countE++;
		}
		if(cadena.charAt(i)=='i') {
			countI++;
		}
		if(cadena.charAt(i)=='o') {
			countO++;
		}
		if(cadena.charAt(i)=='u') {
			countU++;
		}
	}//for
	System.out.println("\n");
	System.out.println("\nHay en la frase: " + cadena + ", la cantidad de a igual a: " + countA);
	System.out.println("Hay en la frase: " + cadena + ", la cantidad de e igual a: " + countE);
	System.out.println("Hay en la frase: " + cadena + ", la cantidad de i igual a: " + countI);
	System.out.println("Hay en la frase: " + cadena + ", la cantidad de o igual a: " + countO);
	System.out.println("Hay en la frase: " + cadena + ", la cantidad de u igual a: " + countU);
	}//setVocals
	
/*f) Implementar un método que verifique si la cadena se lee igual de izquierda a derecha tanto 
	como de derecha a izquierda (ej. neuquen se lee igual en las dos direcciones)*/ 
    

	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		ejePstring5 medley = new ejePstring5();
			medley.setMitad();
			medley.setLast();
			medley.setInverst();
			medley.Setguion();
			medley.SetVocals();
		
   }//main
}//ejePstring5
