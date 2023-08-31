package condicionalesIFSwitch;
import java.util.*;
public class harcore_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);		
		System.out.println("¿que desea hacer?(1 al 4)");
		System.out.println("1.Introducir un boolean");
		System.out.println("2.Introducir dos números");
		System.out.println("3.Introducir tres palabras");
		System.out.println("4.Recordarme qué día es hoy");
		int opcion = scanner.nextInt();

switch (opcion) {
case 1:
	System.out.println("Introducir un boolean");
	boolean bo = scanner.nextBoolean();
	if (bo) {
	 System.out.println("El valor introducido es verdadero");	
	}
	else {
		System.out.println("El valor introducido es falso");
	}
	break;
case 2:
	System.out.println("Introduce el primer numero");
	int num1 = scanner.nextInt();
	System.out.println("Introduce el segundo numero");
	int num2 = scanner.nextInt();
	
	if (isBigger(num1, num2)) {
		System.out.println("El primer numero es mayor");
	}
	else {
		System.out.println("El primer numero es menor");
	}
	break;
case 3:
	System.out.println("Introduce la Primera palabra");
	String word = scanner.next();
	System.out.println("Introduce la Segunda palabra");
	String word1 = scanner.next();
	System.out.println("Introduce la Tercera palabra");
	String word2 = scanner.next();
		
	shoWords (word, word1, word2);
	compareWords(word, word1, word2);
	
	break;
case 4:
	System.out.println("introduce el dia que es hoy");
	String dia = scanner.next();
	System.err.println(dia);
}//switch   
System.out.println("La opcion elegida es " + opcion);
scanner.close();
	}//main

public static boolean isBigger(int num1, int num2) {
	if (num1 > num2) {
		return true;
	}
	else {
		return false;
		}
}//isBigger
public static void shoWords (String word, String word1, String word2) {
	System.out.println("Las tres palabras introducidas son las siguientes: "
			+ "1." + word + " , 2."+ word1 + " , 3." + word2 );
}//shoWords
public static void compareWords(String word, String word1, String word2) {
	if (word.equals(word1)) {
		showInitCap(word2);
	}
	else {
		System.out.println("La palabra " + word + " es distinta de " + word1);
	}
}//compareWords
public static void showInitCap(String word2) {
	char mes = word2.charAt(0);
	System.out.println(mes);
}//showInitCap
}//harcore_1
