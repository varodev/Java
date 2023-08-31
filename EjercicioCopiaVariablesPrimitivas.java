package ev1.ejercicios;

public class EjercicioCopiaVariablesPrimitivas {

	public static void main(String[] args) {

		int variableOrigen;
		int variableDestino;
		
		variableOrigen = 10;
		variableDestino = variableOrigen;
		
		System.out.println("variableDestino = " + variableDestino);
		System.out.println("variableOrigen = " + variableOrigen);
		System.out.println();
		
		variableOrigen = 20;
		
		System.out.println("variableDestino = " + variableDestino);
		System.out.println("variableOrigen = " + variableOrigen);
	}

}
