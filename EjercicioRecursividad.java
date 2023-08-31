package ev2.ejercicios;

public class EjercicioRecursividad {

	public static void main(String[] args) {

		System.out.println(sumaNumerosNaturales(5));
	}
	
	static int sumaNumerosNaturales(int n) {
		
		if (n == 1) {
			
			return 1;
			
		} else {
			
			return sumaNumerosNaturales(n - 1) + n;
		}
	}

}
