package ev3.ejercicios;

public class EjercicioSobrecargaMetodos {

	public static void main(String[] args) {

		System.out.println(sumar(50, 35));
		System.out.println(sumar(2.5, 3.5));
		System.out.println(sumar((short)30, (short)20));
	}

	static int sumar(int sumando1, int sumando2) {
		
		return sumando1 + sumando2;
	}
	
	static double sumar(double sumando1, double sumando2) {
		
		return sumando1 + sumando2;
	}
	
	static short sumar(short sumando1, short sumando2) {
		
		return (short) (sumando1 + sumando2);
	}
}
