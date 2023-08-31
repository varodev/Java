package ev3.ejercicios.modificadoresacceso;

public class Principal {

	public static void main(String[] args) {
		
		EjercicioModificadoresDeAcceso ema = new EjercicioModificadoresDeAcceso();
		ema.atributoPublic = 20;
		ema.atributoProtected = 20;
		ema.atributoDefault = 20;
//		ema.atributoPrivate = 20;
	}
}
