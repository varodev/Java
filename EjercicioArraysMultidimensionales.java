package ev1.ejercicios;

public class EjercicioArraysMultidimensionales {

	public static void main(String[] args) {

		// ARRAY 1 DIMENSION
		
		int[] arrayInt1D = { 1, 2, 3, 4, 5 };
		
//		System.out.println(arrayInt1D.length);
		
		
		
		// ARRAY 2 DIMENSIONES
		
		int[][] arrayInt2D = { {1, 2, 3} , {1, 2} , {1, 2, 3, 4} , {1}, {1, 2} };
//		System.out.println(arrayInt2D[0].length);
//		System.out.println(arrayInt2D.length);
		
//		System.out.println(arrayInt[1].length);
		
		byte[][] arrayByte2D = new byte[3][2];
		
//		System.out.println(arrayByte2D[0].length);
//		System.out.println(arrayByte2D.length);
		
		arrayByte2D[0][0] = 1;
		arrayByte2D[0][1] = 2;
		arrayByte2D[1][0] = 10;
		arrayByte2D[1][1] = 20;
		arrayByte2D[2][0] = 50;
		arrayByte2D[2][1] = 60;
		
		byte[][] arrayByte2DIdem = { {1, 2}, {10, 20}, {50, 60} };
		
//		System.out.println(arrayByte[0][0]);
//		System.out.println(arrayByte[0][1]);
//		System.out.println(arrayByte[1][0]);
//		System.out.println(arrayByte[1][1]);
//		System.out.println(arrayByte[2][0]);
//		System.out.println(arrayByte[2][1]);
		
		
		
		// ARRAY 3 DIMENSIONES
		
		int[][][] arrayInt3D = { { {10, 20}, {30, 40}, {50, 60} }, { {11, 21},
			{31, 41}, {51, 61} }, { {12, 22}, {32, 42}, {52, 62} }, { {13, 23}, {33, 43}, {53, 63} } };
//		System.out.println(arrayInt3D[3][0][1]);
//		System.out.println(arrayInt3D[0][0].length);
//		System.out.println(arrayInt3D[0].length);
//		System.out.println(arrayInt3D.length);
		
		
		
		
		// ARRAY 4 DIMENSIONES
		
		int[][][][] arrayInt4D = { { { {1, 2, 3} , {1, 2} , {1, 2, 3, 4} , {1} } ,
			{ {1, 2, 3} , {1, 2} , {1, 2, 3, 4} , {1} }, { {1, 2, 3} , {1, 2} , {1, 2, 3, 4} , {1} } },
				{ { {1, 2, 3} , {1, 2} , {1, 2, 3, 4} , {1} } , { {1, 2, 3} , {1, 2} , {1, 2, 3, 4} , {1} },
				{ {1, 2, 3} , {1, 2} , {1, 2, 3, 4} , {1} } }, { { {1, 2, 3} , {1, 2} , {1, 2, 3, 4} , {1} }
				, { {1, 2, 3} , {1, 2} , {1, 2, 3, 4} , {1} }, { {1, 2, 3} , {1, 2} , {1, 2, 3, 4} , {1} } },
				{ { {1, 2, 3} , {1, 2} , {1, 2, 3, 4} , {1} } , { {1, 2, 3} , {1, 2} , {1, 2, 3, 4} , {1} },
					{ {1, 2, 3} , {1, 2} , {1, 2, 3, 4} , {1} } } };
		
//		System.out.println(arrayInt4D.length);
		
		int[][][][] arrayByte4D = new int [2][3][4][3];
		arrayByte4D[0][0][0][0] = 10;
		arrayByte4D[0][0][0][1] = 4;
		arrayByte4D[0][0][0][2] = 50;
		arrayByte4D[0][0][1][0] = 10;
		arrayByte4D[0][0][1][1] = 4;
		arrayByte4D[0][0][1][2] = 50;
		arrayByte4D[0][0][2][0] = 10;
		arrayByte4D[0][0][2][1] = 4;
		arrayByte4D[0][0][2][2] = 50;
		arrayByte4D[0][0][3][0] = 10;
		arrayByte4D[0][0][3][1] = 4;
		arrayByte4D[0][0][3][2] = 50;
		arrayByte4D[0][1][0][0] = 10;
		arrayByte4D[0][1][0][1] = 4;
		arrayByte4D[0][1][0][2] = 50;
		arrayByte4D[0][1][1][0] = 10;
		arrayByte4D[0][1][1][1] = 4;
		arrayByte4D[0][1][1][2] = 50;
		arrayByte4D[0][1][2][0] = 10;
		arrayByte4D[0][1][2][1] = 4;
		arrayByte4D[0][1][2][2] = 50;
		arrayByte4D[0][1][3][0] = 10;
		arrayByte4D[0][1][3][1] = 4;
		arrayByte4D[0][1][3][2] = 50;
		arrayByte4D[0][2][0][0] = 10;
		arrayByte4D[0][2][0][1] = 4;
		arrayByte4D[0][2][0][2] = 50;
		arrayByte4D[0][2][1][0] = 10;
		arrayByte4D[0][2][1][1] = 4;
		arrayByte4D[0][2][1][2] = 50;
		arrayByte4D[0][2][2][0] = 10;
		arrayByte4D[0][2][2][1] = 4;
		arrayByte4D[0][2][2][2] = 50;
		arrayByte4D[0][2][3][0] = 10;
		arrayByte4D[0][2][3][1] = 4;
		arrayByte4D[0][2][3][2] = 50;
		
	}

}
