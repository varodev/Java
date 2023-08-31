package pooConstructores;

public class E2CuentaCorriente {
	private String cliente;
	private float cantidad;
	
	
	public E2CuentaCorriente() {
	}

	E2CuentaCorriente(String cliente){
		this.cliente=cliente;
		this.cantidad=0;
	}
	
	E2CuentaCorriente(String cliente,float cantidad){
		this.cliente=cliente;
		this.cantidad=cantidad;
	}

	public String retornarCliente(){
		return cliente;
	}

	public void extraer(float cantidad){
		this.cantidad=cantidad-cantidad;
	}
	
	public void ingresar(float cantidad){
		this.cantidad=cantidad+cantidad;
	}
	
	public float retornarCantidad(){
		return cantidad;
	}
}
