package clases;

public class Pantalla_3 {
	
	//Método estático. No es necesario crear un objeto para poder acceder a él.
	static void imprimir1(String texto) {
		System.out.println(texto);
	}
	
	//Método público se tienen que llamar desde un objeto.
	public void imprimir2(String texto) {
		System.out.println(texto);
	}
	
	public static void main(String[] args) {
		imprimir1("Método estático.");
		
		// Creando un objeto.
		Pantalla_3  mipantalla = new Pantalla_3();
		mipantalla.imprimir2("Método público, asociado a un objeto");
		//imprimir2("Otra impresion"); //Esto no es posible
	}

	
	

}
