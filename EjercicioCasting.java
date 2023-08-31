package ev1.ejercicios;

public class EjercicioCasting {

	public static void main(String[] args) {

		short variableShort = 77;
//		byte variableByte = variableShort;
		
		int variableInt = variableShort;
		
//		char variableChar = (char) variableShort;
//		System.out.println(variableChar);
		
		char variableChar = 'M';
		variableShort = (short) variableChar;
//		System.out.println(variableShort);
		
		
		
		// Codificacion de los numeros enteros
		
		byte variableC = (byte) 130;
		System.out.println(variableC);
		
	}

}
