package ev1.ejercicios;

public class EjercicioTamanoArray {

	public static void main(String[] args) {

		//POSICIONES:  0  1   2  3  4  5   6
		int[] array = {1, 2, 22, 4, 5, 6, 27};
		
		System.out.println(array.length);
		
//		array.length = 10; // ERROR
		
		array[5] = array[1];
		System.out.println("array[1] = " + array[1]);
		System.out.println("array[5] = " + array[5]);
		
		array[1] = 100;
		System.out.println();
		System.out.println("array[1] = " + array[1]);
		System.out.println("array[5] = " + array[5]);
	}

}
