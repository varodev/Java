package clases;

public class main_Telefonos {

	public static void main(String[] args) {
		Telefonos telefono1 = new Telefonos("Nokia","E24",653223108);
		Telefonos telefono2 = new Telefonos("Xioami","Redmin 5",643112508);		
		
		System.out.println(telefono1.modelo+" de marca "+ telefono1.marca + " y n�mero "+telefono1.numero);
		System.out.println(telefono2.modelo+" de marca "+ telefono2.marca + " y n�mero "+telefono2.numero);
		telefono1.imprimirNumero();
		

	}

}
