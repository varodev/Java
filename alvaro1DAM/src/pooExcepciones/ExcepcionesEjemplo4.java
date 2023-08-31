package pooExcepciones;

@SuppressWarnings("serial")
public class ExcepcionesEjemplo4 extends Exception {
	public ExcepcionesEjemplo4() {
		
	}
	public ExcepcionesEjemplo4(String cadena) {
		super(cadena);//Llama al constructor de Exception y le pasa el contenido de cadena
	}

}
