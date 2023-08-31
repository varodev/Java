package condicionalesIFSwitch;
import java.util.*;
public class PracticaProg3 {
 public static void main(String[] args) {
Scanner scanner = new Scanner (System.in);
System.out.println("Bienvenido a la Calculator 1.0");
System.out.println("1.Introducir el primer numero");
System.out.println("2.Introducir el segundo numero");
System.out.println("3.Volver a introducir el primer numero");
System.out.println("4.Seleccionar operacion a realizar");
System.out.println("5.Permitir numero double");
System.out.println("6.Salir del calculator 1.0\n");

int numero1 = 0;
int numero2 = 0;

System.out.println("1.Introducir el primer numero:");
 numero1= scanner.nextInt();

System.out.println("2.Introducir el segundo numero:");
 numero2= scanner.nextInt();

System.out.println("3.Volver a introducir el primer numero:");
 numero1= scanner.nextInt();
 
System.out.println("\nSeleccionar Operacion a Realizar:");
 System.out.println("1.suma");
 System.out.println("2.resta");
 System.out.println("3.multiplicacion");
 System.out.println("4.division");
 System.out.println("5.potencia");
 System.out.println("6.raiz");
 System.out.println("7.Salir del Calculator 1.0\n"); 
int operacion = scanner.nextInt();

while (operacion !=7) {
 switch (operacion) {
  case 1:
System.out.println("\nHas elegido suma:");	
System.out.println(sumar(numero1, numero2));
System.out.println("\n5.Permitir numero double:");	
System.out.println((double)sumar(numero1, numero2));
System.out.println("\n6.Salir del Calculator 1.0");
System.exit(0);
  break;
  case 2:
System.out.println("\nHas elegido resta:");
System.out.println(restar(numero1, numero2));
System.out.println("\n5.Permitir numero double:");
System.out.println((double)restar(numero1, numero2));
System.out.println("\n6.Salir del Calculator 1.0");
System.exit(0);
  break;	 
  case 3:
System.out.println("\nHas elegido multiplicacion:");
System.out.println(multiplicacion(numero1, numero2));
System.out.println("\n5.Permitir numero double:");
System.out.println((double)multiplicacion(numero1, numero2));
System.out.println("\n6.Salir del Calculator 1.0");
System.exit(0);
  break;
  case 4:
System.out.println("\nHas elegido division:");
System.out.println(division(numero1, numero2));
System.out.println("\n5.Permitir numero double:");
System.out.println((double)division(numero1, numero2));
System.out.println("\n6.Salir del Calculator 1.0");
System.exit(0);
  break;
  case 5:
System.out.println("\nHas elegido potencia:");
System.out.println(potencias(numero1, numero2));
System.out.println("\n5.Permitir numero double:");
System.out.println((double)potencias(numero1, numero2));
System.out.println("\n6.Salir del Calculator 1.0");
System.exit(0);
  break;
  case 6:
System.out.println("\nHas elegido raiz");	
raiz(numero1, numero2);
System.out.println("\n6.Salir del Calculator 1.0");
System.exit(0);
  break;
  case 7:
System.out.println("Salir del Calculator 1.0");	  
}//switch
System.out.println("\nSeleccionar Operacion a Realizar:");
System.out.println("1.suma");
System.out.println("2.resta");
System.out.println("3.multiplicacion");
System.out.println("4.division");
System.out.println("5.potencia");
System.out.println("6.raiz");
System.out.println("7.Salir del Calculator 1.0\n");
operacion = scanner.nextInt();
}//while

scanner.close();
	}//main
public static int sumar (int numero1, int numero2) {
	return numero1 + numero2;
	}//sumar
public static int restar (int numero1, int numero2) {
	return numero1 - numero2;
    }//restar
public static int multiplicacion (int numero1, int numero2) {
	return numero1 * numero2;
    }//multiplicacion
public static int division (int numero1, int numero2) {
	return numero1 / numero2;
    }//division
public static int potencias (int numero1, int numero2) {
	return (int) Math.pow(numero1, numero2);
    }//potencias
public static void raiz (int numero1, int numero2) {
	int root = (int)Math.sqrt(numero1);
	System.out.println(root);
	int root1 = (int)Math.sqrt(numero2);
	System.out.println(root1);
	System.out.println("\n5.Permitir numero double:");
	double root2 = Math.sqrt(numero1);
	System.out.println(root2);
	double root3 = Math.sqrt(numero2);
	System.out.println(root3);	
    }//raiz
}//PracticaProg3
