package Practica_Programacion1EVA;
import java.util.*;
public class PracticaProg2 {
	public static void main(String[] args) {
Scanner scanner = new Scanner (System.in);		
	System.out.println("Introduce el numero de día de la semana, donde 1 es lunes y 7 domingo");
	int diaSemana = scanner.nextInt();
	System.out.println("Compramos?");
	boolean voyAComprar = scanner.nextBoolean();

	comprobarDia(diaSemana,voyAComprar);
    
scanner.close();
	}//main
    public static void comprobarDia (int diaSemana, boolean voyAComprar) {
	
		 switch (diaSemana) {
		 case 1:
		 System.out.println("Hoy es lunes");
		 break;
	     case 2:
		 System.out.println("Hoy es martes");
	     break;
	     case 3:
		 System.out.println("Hoy es miercoles");
	     break;
	     case 4:
		 System.out.println("Hoy es jueves");
	     break;
	     case 5:
		 System.out.println("Hoy es viernes");
	     break;
	     case 6:
	     System.out.println("Hoy es sabado");
	     break;
	     case 7:
	     System.out.println("Hoy es domingo");
	     break;
	     default:
		 System.err.println("algo mal estas haciendo"); 	
		 }//switch
		
		 if (diaSemana == 1 || diaSemana == 2 || diaSemana == 3 || diaSemana == 4|| diaSemana == 5 && voyAComprar == false) {
	     System.out.println("no vamos a comprar");	 
		  }//if 1 al 5 
		 
		 else  {
		  if (diaSemana == 6) {
		  System.out.println("Compraremos por la mañana. que es sabado y cierran pronto");
	      }
		  else {
	      System.err.println("EL supermercado cierra hoy");	
		  }
	     }//else
     }//comprobarDia
}//PracticaProg2
