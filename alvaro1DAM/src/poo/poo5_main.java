package poo;

public class poo5_main {
	
	public void gestion() {
		int vectorA[] = new int[20];
		int vectorB[] = new int[20];
		int vectorC[] = new int[20];
	poo5 obj = new poo5();
	  System.out.println("Se rellena el vector A de manera aleatoria...");
		obj.generaVector(vectorA);//se genera aleatoriamente el vector A
	  System.out.println("Se rellena el vector B de manera aleatoria...");
		obj.generaVector(vectorB);//se genera aleatoriamente el vector B
		obj.calcular(vectorA, vectorB, vectorC);
		obj.visualizar(vectorA, vectorB, vectorC);
	}

	public static void main(String[] args) {
		poo5_main N = new poo5_main();
		N.gestion();
	}
}
