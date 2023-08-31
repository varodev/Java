package pooExcepciones;

public class Excepciones2Television extends Excepciones2Electrodomesticos {
	private int resolucion;
	private boolean tdt;
	
//////////////////////////////////////C	
	public Excepciones2Television() {
		super();
	}

	public Excepciones2Television(int precioBase, int peso) {
		super(precioBase, peso);
		this.precioBase = 100;
		this.color = "blanco";
		this.consumoEnergetico="F";
		this.peso = 5;
		this.resolucion = 20;
		this.tdt = false;
	}

	public Excepciones2Television(int precioBase, String color, String consumoEnergetico, int peso, int resolucion, boolean tdt) {
		super(precioBase, color, consumoEnergetico, peso);
		this.resolucion = resolucion;
		this.tdt = tdt;
	}
////////////////////////////////M
	public int getResolucion() {
		return resolucion;
	}

	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}

	public boolean getTdt() {
		return tdt;
	}

	public void setTdt(boolean tdt) {
		this.tdt = tdt;
	}
	
	public double precioFinal() {
		double plus = super.precioFinal();
		
		if(resolucion>40) {
			plus+=precioBase*0.3;
		}
		
		if (tdt) {
			plus+=50;
		}
		
		return plus;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
