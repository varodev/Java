package ev1.ejercicios;

public class EjercicioCopiaArrays {

	public static void main(String[] args) {

		// PRIMERA PARTE
		
		int[] arrayOrigen = {10, 20, 30, 40};
		int[] arrayDestino = arrayOrigen;
		
		arrayOrigen[2] = 1000;
		
//		System.out.println(arrayDestino[2]);
		
		
		// SEGUNDA PARTE
		
		int[] arrayOrigen2 = {10, 20, 30, 40};
		
//		System.out.println("arrayOrigen2:");
//		System.out.println("arrayOrigen2[0] = " + arrayOrigen2[0]);
//		System.out.println("arrayOrigen2[1] = " + arrayOrigen2[1]);
//		System.out.println("arrayOrigen2[2] = " + arrayOrigen2[2]);
//		System.out.println("arrayOrigen2[3] = " + arrayOrigen2[3]);
		
		int[] arrayDestino2 = new int[5];
		
//		System.out.println("\narrayDestino2:");
//		System.out.println("arrayDestino2[0] = " + arrayDestino2[0]);
//		System.out.println("arrayDestino2[1] = " + arrayDestino2[1]);
//		System.out.println("arrayDestino2[2] = " + arrayDestino2[2]);
//		System.out.println("arrayDestino2[3] = " + arrayDestino2[3]);
//		System.out.println("arrayDestino2[4] = " + arrayDestino2[4]);
		
		System.arraycopy(arrayOrigen2, 1, arrayDestino2, 3, 2);
		
//		System.out.println("\nDespues del arraycopy:");
//		
//		System.out.println("\narrayDestino2:");
//		System.out.println("arrayDestino2[0] = " + arrayDestino2[0]);
//		System.out.println("arrayDestino2[1] = " + arrayDestino2[1]);
//		System.out.println("arrayDestino2[2] = " + arrayDestino2[2]);
//		System.out.println("arrayDestino2[3] = " + arrayDestino2[3]);
//		System.out.println("arrayDestino2[4] = " + arrayDestino2[4]);
		
		arrayOrigen2[2] = 1000;
//		System.out.println("\nModifico arrayOrigen2[2]:\n");
//		
//		System.out.println("arrayOrigen2[2] = " + arrayOrigen2[2]);
//		System.out.println("arrayDestino2[2] = " + arrayDestino2[2]);
		
		
		// TERCERA PARTE
		
		int[] array = {0, 1, 2, 3, 4};
		System.out.println("array:");
		System.out.println("array[0] = " + array[0]);
		System.out.println("array[1] = " + array[1]);
		System.out.println("array[2] = " + array[2]);
		System.out.println("array[3] = " + array[3]);
		System.out.println("array[4] = " + array[4]);
		
		int[] arrayLargo = new int [10];
		System.out.println("\narrayLargo:");
		System.out.println("arrayLargo[0] = " + arrayLargo[0]);
		System.out.println("arrayLargo[1] = " + arrayLargo[1]);
		System.out.println("arrayLargo[2] = " + arrayLargo[2]);
		System.out.println("arrayLargo[3] = " + arrayLargo[3]);
		System.out.println("arrayLargo[4] = " + arrayLargo[4]);
		System.out.println("arrayLargo[5] = " + arrayLargo[5]);
		System.out.println("arrayLargo[6] = " + arrayLargo[6]);
		System.out.println("arrayLargo[7] = " + arrayLargo[7]);
		System.out.println("arrayLargo[8] = " + arrayLargo[8]);
		System.out.println("arrayLargo[9] = " + arrayLargo[9]);
		
		
		System.arraycopy(array, 1, arrayLargo, 0, 2);
		System.out.println();
		System.out.println();
		System.out.println("Primera copia en el array:");
		System.out.println();
		System.out.println("arrayLargo:");
		System.out.println("arrayLargo[0] = " + arrayLargo[0]);
		System.out.println("arrayLargo[1] = " + arrayLargo[1]);
		System.out.println("arrayLargo[2] = " + arrayLargo[2]);
		System.out.println("arrayLargo[3] = " + arrayLargo[3]);
		System.out.println("arrayLargo[4] = " + arrayLargo[4]);
		System.out.println("arrayLargo[5] = " + arrayLargo[5]);
		System.out.println("arrayLargo[6] = " + arrayLargo[6]);
		System.out.println("arrayLargo[7] = " + arrayLargo[7]);
		System.out.println("arrayLargo[8] = " + arrayLargo[8]);
		System.out.println("arrayLargo[9] = " + arrayLargo[9]);
		
		
		System.arraycopy(array, 0, arrayLargo, 2, 5);
		System.out.println();
		System.out.println();
		System.out.println("Segunda copia en el array:");
		System.out.println();
		System.out.println("arrayLargo:");
		System.out.println("arrayLargo[0] = " + arrayLargo[0]);
		System.out.println("arrayLargo[1] = " + arrayLargo[1]);
		System.out.println("arrayLargo[2] = " + arrayLargo[2]);
		System.out.println("arrayLargo[3] = " + arrayLargo[3]);
		System.out.println("arrayLargo[4] = " + arrayLargo[4]);
		System.out.println("arrayLargo[5] = " + arrayLargo[5]);
		System.out.println("arrayLargo[6] = " + arrayLargo[6]);
		System.out.println("arrayLargo[7] = " + arrayLargo[7]);
		System.out.println("arrayLargo[8] = " + arrayLargo[8]);
		System.out.println("arrayLargo[9] = " + arrayLargo[9]);
		
		
		System.arraycopy(array, 2, arrayLargo, 7, 3);
		System.out.println();
		System.out.println();
		System.out.println("Tercera y �ltima copia en el array:");
		System.out.println();
		System.out.println("arrayLargo:");
		System.out.println("arrayLargo[0] = " + arrayLargo[0]);
		System.out.println("arrayLargo[1] = " + arrayLargo[1]);
		System.out.println("arrayLargo[2] = " + arrayLargo[2]);
		System.out.println("arrayLargo[3] = " + arrayLargo[3]);
		System.out.println("arrayLargo[4] = " + arrayLargo[4]);
		System.out.println("arrayLargo[5] = " + arrayLargo[5]);
		System.out.println("arrayLargo[6] = " + arrayLargo[6]);
		System.out.println("arrayLargo[7] = " + arrayLargo[7]);
		System.out.println("arrayLargo[8] = " + arrayLargo[8]);
		System.out.println("arrayLargo[9] = " + arrayLargo[9]);
	}

}
