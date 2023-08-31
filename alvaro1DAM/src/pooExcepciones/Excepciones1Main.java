package pooExcepciones;
import java.util.*;
public class Excepciones1Main {

public static void main(String[] args) {
try (Scanner sc = new Scanner(System.in)) {
	int numerador,denominador,division;
		try {
			System.out.println("dame el numerador");
			numerador=sc.nextInt();
			System.out.println("dame el denominador");
			denominador=sc.nextInt();
			rango(numerador,denominador);
			division=numerador/denominador;
			System.out.println(division);
	    }catch (InputMismatchException e) {
	    	System.out.println("Se ha introducido caracteres no númericos");
	    }catch (ArithmeticException e) {
	    	System.out.println( "Division entre cero");
	    }catch (Excepciones1 e) {
	    	System.out.println(e.getMessage());
	    }
}
}//main

static void rango(int numerador,int denominador)throws Excepciones1{
	if ((numerador>100)||(denominador<-5)){
		throw new Excepciones1("Numeros fuera de rango");
	}
}
}//Excepciones1Main
