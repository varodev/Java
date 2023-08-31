package pooConstructores;

public class CuentaCorriente {
	private String cliente;
	private float cantidad;
	
	
	CuentaCorriente(String cliente){
		this.cliente=cliente;
		this.cantidad=0;
	}
	
	CuentaCorriente(String cliente,float cantidad){
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
