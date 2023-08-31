package poo;

public class poo5_main {
	int vectorA[] = new int[20];
	int vectorB[] = new int[20];
	int vectorC[] = new int[20];
	
	
	public void gestion() {
		poo5 obj = new poo5();
		obj.generaVector(vectorA);
		obj.generaVector(vectorB);
		obj.calcular(vectorA, vectorB, vectorC);
		obj.visualizar(vectorA, vectorB, vectorC);
	}

	public static void main(String[] args) {
		poo5_main N = new poo5_main();
		N.gestion();
	}
}
