package ev3.ejercicios.empresa;

public class Cliente extends Persona {
	
//	public Cliente() {
//		
//		super();
//	}
	
	public Cliente() {
		
		super("desconocido", "desconocido", 0);
	}
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		System.out.println(cliente.getApellidos().toUpperCase());
	}
}
