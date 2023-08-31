package BucleWhile_doWhile;
import java.util.*;
public class ejeWhile12 {
 public static void main(String[] args) {
Scanner scanner = new Scanner (System.in);

int num = 0;
int intentos;
int secreto=0;
boolean acertado = false;

System.out.println("introduce el numero inferior");
int inferior = scanner.nextInt();
System.out.println("introduce el numero superior ");
int superior = scanner.nextInt();
System.out.println("introduce el numero de intentos ");
int totalIntentos = scanner.nextInt();

if (inferior > superior) {
	System.out.println("el numero inferior debe ser menor");
}else if (totalIntentos <=0){
	System.out.println("el numero de intentos debe ser mayor que 0");
}else {
Random random = new Random();
secreto = inferior + (Math.abs(random.nextInt()) % (superior-inferior+1));
intentos = 0;

while (!acertado && intentos < totalIntentos) {
	System.out.println("introduce un numero : ");
	num = scanner.nextInt();
	
	if (num > secreto) {
		System.out.println("el numero secreto es menor");
	}else if (num < secreto) {
		System.out.println("el numero secreto es mayor");
	}else {
		acertado = true; 
		intentos++;
	}
	if (acertado) {
		System.out.println("\n Has ganado");
	}else {
		System.out.println("\n Has perdido");
	}
}//while
}
scanner.close();
	}//main
}//ejeWhile12
