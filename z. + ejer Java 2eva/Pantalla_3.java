package clases;

public class Pantalla_3 {
	
	//M�todo est�tico. No es necesario crear un objeto para poder acceder a �l.
	static void imprimir1(String texto) {
		System.out.println(texto);
	}
	
	//M�todo p�blico se tienen que llamar desde un objeto.
	public void imprimir2(String texto) {
		System.out.println(texto);
	}
	
	public static void main(String[] args) {
		imprimir1("M�todo est�tico.");
		
		// Creando un objeto.
		Pantalla_3  mipantalla = new Pantalla_3();
		mipantalla.imprimir2("M�todo p�blico, asociado a un objeto");
		//imprimir2("Otra impresion"); //Esto no es posible
	}

	
	

}
