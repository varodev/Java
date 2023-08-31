package ev1.ejercicios;

public class EjercicioRangosTiposPrimitivos {

	public static void main(String[] args) {

//		byte varByte1 = -129; // ERROR
		byte varByte2 = -128; // OK
		byte varByte3 = 127; // OK
//		byte varByte4 = 128; // ERROR
		
//		short varShort1 = -32_769; // ERROR
		short varShort2 = -32_768; // OK
		short varShort3 = 32_767; // OK
//		short varShort4 = 32_768; // ERROR
		
//		int varInt1 = -2_147_483_649; // ERROR
		int varInt2 = -2_147_483_648; // OK
		int varInt3 = 2_147_483_647; // OK
//		int varInt4 = 2_147_483_648; // ERROR
		
//		long varLong1 = -9_223_372_036_854_775_809L; // ERROR
		long varLong2 = -9_223_372_036_854_775_808L; // OK
		long varLong3 = 9_223_372_036_854_775_807L; // OK
//		long varLong4 = 9_223_372_036_854_775_808L; // ERROR
		
		
//		float varFloat1 = -3.402824e38F; // ERROR
		float varFloat2 = -3.402823e38F; // OK
		float varFloat3 = 3.402823e38F; // OK
//		float varFloat4 = 3.402824e38F; // ERROR
		
//		double varDouble1 = -1.7976931348623159e308; // ERROR
		double varDouble2 = -1.7976931348623158e308; // OK
		double varDouble3 = 1.7976931348623158e308; // OK
//		double varDouble4 = 1.7976931348623159e308; // ERROR
		
		char varChar1 = '\u0000'; // OK
		char varChar2 = '\uffff'; // OK
//		char varChar3 = '\u10000'; // ERROR
	}

}
