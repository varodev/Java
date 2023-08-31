package ev2.ejercicios;

import java.math.BigInteger;

public class EjercicioBucles {

	public static void main(String[] args) {

//		bucleFor();
//		bucleWhile();
//		bucleDoWhile();
		bucleForEach();
	}
	
	public static void bucleFor() {
		
		// APARTADO 1
		
//		for (int i = 1; i <= 100; i++) {
//			
//			System.out.println(i*5);
//		}
		
		
		// APARTADO 2
		
//		for (int i = 320; i >= 160; i -= 20) {
//			
//			System.out.println(i);
//		}
		
		
		// APARTADO 3
		
		BigInteger num1 = new BigInteger("0");
		BigInteger num2 = new BigInteger("1");
		BigInteger num3 = num1.add(num2);
		
		BigInteger[] array = new BigInteger[100];
		
		array[0] = num1;
		array[1] = num2;
		array[2] = num3;
		
		for (int i = 3; i < 100; i++) {
			
			num1 = num2;
			num2 = num3;
			num3 = num1.add(num2);
			
			array[i] = num3;
		}
		
		// Imprimir
		for (int i = 0; i < array.length; i++) {
			
			System.out.println(array[i]);
		}
	}
	
	public static void bucleWhile() {
		
		// APARTADO 1
		
//		int i = 1;
//		while (i <= 100) {
//			
//			System.out.println(i*5);
//			i++;
//		}
		
		
		// APARTADO 2
		
//		int i = 320;
//		
//		while (i >= 160) {
//			
//			System.out.println(i);
//			
//			i -= 20;
//		}
		
		
		// APARTADO 3
		
		double[] array = new double [100];
		array[0] = 0;
		array[1] = 1;
		
		int i = 2;
		while (i < 100) {
			
			array[i] = array[i-2] + array[i-1];
			i++;
		}
		
		// Imprimir
		i = 0;
		while (i < array.length) {
			
			System.out.println(array[i]);
			i++;
		}
	}
	
	public static void bucleDoWhile() {
		
		// APARTADO 1
		
//		int i = 0;
//		do {
//			
//			i++;
//			System.out.println(i*5);
//			
//		} while (i < 100);
		
		
		// APARTADO 2
		
//		int i = 320;
//		do {
//			
//			System.out.println(i);
//			
//			i -= 20;
//			
//		} while (i >= 160);
		
		
		// APARTADO 3
		
		double[] array = new double [100];
		array[0] = 0;
		array[1] = 1;
		
		int i = 2;
		do {
			
			array[i] = array[i-2] + array[i-1];
			i++;
			
		} while (i < 100);
		
		// Imprimir
		i = 0;
		do {
			
			System.out.println(array[i]);
			i++;
			
		} while (i < 100);
	}
	
	public static void bucleForEach() {
		
		// APARTADO 5
		
		String[] diasDeLaSemana = {"LUNES", "MARTES", "MIÉRCOLES", "JUEVES", "VIERNES", "SÁBADO", "DOMINGO"};
		
		for(String s : diasDeLaSemana) {
			
			System.out.println(s);
		}
	}

}
