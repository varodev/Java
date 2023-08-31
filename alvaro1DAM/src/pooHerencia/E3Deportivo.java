 
package pooHerencia;

public class E3Deportivo extends E3Vehiculo {
	private boolean descapotable;

	/////////////C
	public E3Deportivo() {
		super();
		
	}

	public E3Deportivo(String matricula, String marca, String modelo, String color, int numPuertas, int potencia, boolean descapotable) {
		super(matricula, marca, modelo, color, numPuertas, potencia);
		this.descapotable= descapotable;
	}

    //////////GS	
	public boolean getDescapotable() {
		return descapotable;
	}

	public void setDescapotable(boolean descapotable) {
		this.descapotable = descapotable;
	}

	@Override
	public String toString() {
		return "Deportivo [descapotable=" + descapotable + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
