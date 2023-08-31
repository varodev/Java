package condicionalesIFSwitch;
import java.util.*;
public class eje_swH {
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
	  int saldoInicial = 1000;
      System.out.println("Eliga la opcion deseada, siendo:\n");
      System.out.println("1.Ingresar dinero:\n");
      System.out.println("2.Retirar dinero:\n");
      System.out.println("3.Finalizar programa en Java:\n");
            
	  int numero = scanner.nextInt();
	   
	 switch(numero) {
	  case 1:
	  System.out.println("Cuanto dinero desea ingresar");	  
	  int ingreso = scanner.nextInt();
	  int sum = saldoInicial + ingreso;
	  System.out.println("Su saldo es " + sum + " euros");
      break;		  
	  case 2:
	  System.out.println("Cuanto dinero desea retirar");
	  int retirada  = scanner.nextInt();
	 if (retirada < saldoInicial) {
	  int res = saldoInicial - retirada;	  
	  System.out.println("Su saldo es " + res + " euros");  
	 }
	 else {
	  System.out.println("Se esa intentando sacar más dinero del que hay");
	 }
	  break;
	  case 3:
      System.out.println("Finalizacion");		  
	  System.exit(0);		  
	  break;
	  default:
	  System.err.println("Opción no disponible");
	 }//switch
scanner.close();
    }//main
}//eje_swH
