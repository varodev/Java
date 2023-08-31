package ev1.ejercicios;

public class EjercicioTiposPrimitivos {

	public static void main(String[] args) {

		// TIPOS ENTEROS
		int variableInt;
		byte variableByte;
		short variableShort;
		long variableLong;
		
		// TIPOS FLOTANTES
		float variableFloat;
		double variableDouble;
		
		// TIPOS NO NUMERICOS
		char variableChar;
		boolean variableBoolean;
		
		variableInt = 10;
		variableByte = 20;
		variableShort = 30;
		variableLong = 40;
		
		variableFloat = 10.5F;
		variableDouble = 50.5;
		
		variableChar = '@';
		variableBoolean = true;
		
		System.out.println("Numeros enteros:");
		System.out.println(variableInt);
		System.out.println(variableByte);
		System.out.println(variableShort);
		System.out.println(variableLong);
		
		System.out.println();
		
		System.out.println("Numeros flotantes:");
		System.out.println(variableFloat);
		System.out.println(variableDouble);
		
		System.out.println();
		
		System.out.println("Variables NO numericas:");
		System.out.println(variableChar);
		System.out.println(variableBoolean);
		
	}

}
