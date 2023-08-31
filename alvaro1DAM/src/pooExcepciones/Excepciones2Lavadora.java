package pooExcepciones;
public class Excepciones2Lavadora extends Excepciones2Electrodomesticos {
	private int carga;
	
	
/////////////////////////////////////C
	public Excepciones2Lavadora() {
		super();
	}

	public Excepciones2Lavadora(int precioBase, int peso) {
		super(precioBase, peso);
		this.precioBase = 100;
		this.color = "blanco";
		this.consumoEnergetico="F";
		this.peso = 5;
		this.carga= 5;
	}

	public Excepciones2Lavadora(int precioBase, String color, String consumoEnergetico, int peso, int carga) {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga = carga;
	}
/////////////////////////////M
	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}
	
	public double precioFinal() {
		double plus = super.precioFinal();
		if(carga>30) {
			plus+=50;
		}
		
		return plus;
	}
	
	
	
	
	
	
	
	
	
	

}
