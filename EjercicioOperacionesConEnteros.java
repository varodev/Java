package ev1.ejercicios;

public class EjercicioOperacionesConEnteros {

	public static void main(String[] args) {

//		int a = 2;
//		int b = 3 * 3;
//		int c = 7 / 3;
//		System.out.println(c);
//		int d = a + b * c;
//		System.out.println(d);
		
		
		// PARTE 2
		
		byte varByte1 = 10;
		byte varByte2 = 5;
		byte varByte3 = (byte) (varByte1 + varByte2);
		
		short varShort1 = 1;
		short varShort2 = 2;
		short varShort3 = (short) (varShort1 - varShort2);
		
		int varInt1 = 2_000_000_000;
		int varInt2 = 1_000_000_000;
		int varInt3 = varInt1 + varInt2;
//		System.out.println(varInt3);
		
		long varLong1 = 2_000_000_000;
		long varLong2 = 2_000_000_000;
		long varLong3 = varLong1 + varLong2;
		System.out.println(varLong3);
		
		char varChar1 = 'H';
		char varChar2 = 98;
		char varChar3 = (char) (varChar1 + varChar2);
//		System.out.println(varChar3);
		
		
		// PARTE 3
//		int varInt = 5 / 0;
//		System.out.println(varInt);
	}

}
