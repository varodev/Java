package ev2.ejercicios;

public class EjercicioAmbitoVariables {

	int variableGlobal;
	
	void metodo1() {
		
		variableGlobal = 10;
		
		int variableLocal = 12;
		
		variableLocal = 30;
	}
	
	void metodo2() {
		
		variableGlobal = 20;
		
//		variableLocal = 22; // En esta parte del codigo no existe 'variableLocal'
		
		if(true) {
			
			int variableLocalIf = 20;
		}
		
//		variableLocalInt = 33; // En esta parte del codigo no existe 'variableLocalIf'
	}

}
