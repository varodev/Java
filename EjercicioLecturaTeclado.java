package ev2.ejercicios;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioLecturaTeclado {

	static final double TIPO_CAMBIO_EUROS_PESETAS = 166.386;

	public static void main(String[] args) {

		//		apartado1();
		apartado2();
		//		apartado3();
		//		apartado4();
	}

	static void apartado1() {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduzca un número entero: ");
		int a = scanner.nextInt();

		System.out.print("Introduzca otro número entero: ");
		int b = scanner.nextInt();

		System.out.println(a + " x " + b + " = " + (a*b));

		scanner.close();
	}

	static void apartado2() {

		Scanner scanner = new Scanner(System.in);
		int opcion = 0;

		do {

			try {

				System.out.println("¿Qué operación quiere realizar?");
				System.out.println("1 - Convertir pesetas a euros");
				System.out.println("2 - Convertir euros a pesetas");
				System.out.println("9 - Detener el programa");
				System.out.print("Opción: ");

				opcion = scanner.nextInt();

				long pesetas;
				double euros;

				switch(opcion) {

				case 1:
					System.out.print("Introduzca una cantidad de pesetas: ");
					pesetas = scanner.nextLong();
					euros = conversorPesetasEuros(pesetas);

					//					System.out.println("Son " + euros + " euros");
					System.out.printf("Son %1$.2f euros", euros);
					break;

				case 2:
					System.out.print("Introduzca una cantidad de euros: ");
					euros = scanner.nextDouble();
					pesetas = conversorEurosPesetas(euros);

					System.out.println("Son " + pesetas + " pesetas");
					break;

				case 9:
					System.out.println("¡Muchas gracias por utilizar el programa!");
					break;

				default:
					System.out.println("Opción no contemplada...");
				}

			} catch (InputMismatchException e) {

//				e.printStackTrace();
				System.out.println("Por favor, introduzca un número...");
				scanner.nextLine();
			}

		} while (opcion != 9);

		scanner.close();



	}

	static void apartado3() {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduzca una palabra: ");
		String palabra1 = scanner.nextLine();

		System.out.print("Introduzca otra palabra: ");
		String palabra2 = scanner.nextLine();

		if (palabra1.equals(palabra2)) {

			System.out.println("Las palabras son iguales");

		} else {

			System.out.println("Las palabras son distintas");
		}

		scanner.close();
	}

	static void apartado4() {

		Scanner scannerNumeros = new Scanner(System.in);

		int operando1 = 0;
		int operando2 = 0;
		String operador = "";

		do {

			System.out.print("Introduzca un operando: ");
			operando1 = scannerNumeros.nextInt();
			scannerNumeros.nextLine();

			System.out.print("Introduzca un operador: ");
			operador = scannerNumeros.nextLine();

			System.out.print("Introduzca otro operando: ");
			operando2 = scannerNumeros.nextInt();
			scannerNumeros.nextLine();

			int resultado = 0;

			if(operador.equals("+")) {

				resultado = operando1 + operando2;

			} else if(operador.equals("-")) {

				resultado = operando1 - operando2;

			} else if(operador.equals("*")) {

				resultado = operando1 * operando2;

			} else if(operador.equals("/")) {

				resultado = operando1 / operando2;
			}

			System.out.println("El resultado de la operación es: " + resultado );

		} while (!operador.equals("exit"));

		scannerNumeros.close();
	}

	static long conversorEurosPesetas(double euros) {

		return Math.round(euros * TIPO_CAMBIO_EUROS_PESETAS);
	}

	static double conversorPesetasEuros(long pesetas) {

		return pesetas / TIPO_CAMBIO_EUROS_PESETAS;
	}
}
