package pooExcepciones;

@SuppressWarnings("serial")
public class Excepciones1 extends Exception {
	public Excepciones1() {
		
	}
	public Excepciones1(String text) {
		super(text);//Llama al constructor de Exception y le pasa el contenido de cadena
	}

}
