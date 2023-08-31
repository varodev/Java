package poo;
import java.util.*;
public class poo3 {
	Scanner scanner=new Scanner(System.in);
	
	private int n1;
	private int n2;
	
	public void menu() {
		System.out.println("Introduce opcion");
		System.out.println("1.Sumar");
		System.out.println("2.Restar");
		System.out.println("3.Multiplicar");
		System.out.println("4.Dividir");
		System.out.println("5.Salir");
		System.out.println("introduce la opcion de menu");
		int opcion = scanner.nextInt();
		
		n1=pedirNumero();
		n2=pedirNumero();
				
		switch(opcion) {
		
		case 1:
			System.out.println("El resultado de la suma es " + sumar(n1,n2));
			break;
		case 2:
			System.out.println("El resultado de la resta es " + restar(n1,n2));
			break;
		case 3:
			System.out.println("El resultado de la multiplicacion es " + multiplicar(n1,n2) );
			break;
		case 4:
			System.out.println("El resultado de la division es " + dividir(n1,n2) );
			break;
		case 5:salir();
		break;
		}
	}//menu
	
	public int pedirNumero() {
	System.out.println("Dame numero");
	int n=scanner.nextInt();
	return n;
	}
	
	public int sumar(int n1, int n2) {
	return n1 + n2 ;	
	}//sumar
	
	public int restar(int n1, int n2) {
    return n1 - n2 ;
	}//restar
	
	public double multiplicar(int n1, int n2) {
	return (double)(n1 * n2);
	}//multiplicar
	
	public double dividir(int n1, int n2) {
	return (double)(n1 / n2);
	
	}//dividir
	public void salir()	{	
	System.out.println("Hasta Pronto");
	System.exit(0);
	}
}
