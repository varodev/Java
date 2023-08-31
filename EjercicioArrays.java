package ev1.ejercicios;

public class EjercicioArrays {

	public static void main(String[] args) {

		int[] arrayInt;
		double[] arrayDouble;
		char[] arrayChar;
		boolean[] arrayBoolean;
		String[] arrayString;
		
		arrayInt = new int[10];
		arrayDouble = new double [20];
		arrayChar = new char [30];
		arrayBoolean = new boolean [40];
		arrayString = new String [50];
		
		arrayInt[3] = 4;
		arrayDouble[19] = 20.5;
		arrayChar[10] = 'a';
		arrayBoolean[34] = true;
		arrayString[10] = "Hola";
		
		System.out.println(arrayInt[0]);
		System.out.println(arrayDouble[0]);
		System.out.println(arrayChar[0]);
		System.out.println(arrayBoolean[0]);
		System.out.println(arrayString[0]);
	}

}
