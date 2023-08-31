package ejercicios;

public class Boligrafo {

	public String color;
	public String marca;
	public Double punta; //en milimetros
	
	public Boligrafo() {
		color="negro";
		marca="Bic";
		punta=1.0;
	}
	
	public Boligrafo(String color1,String marca1,double punta1) {
		this.color=color1;
		this.marca=marca1;
		this.punta=punta1;
	}
	
	public void imprimirColor() {
		System.out.println("El color de este boligrafo es "+this.color);
	}
	
	public void imprimirMarca() {
		System.out.println("La marca de este boligrafo es "+this.marca);
	}

	public void imprimirPunta() {
		System.out.println("El grosor de la punta de este boligrafo es "+this.punta+" mm");
	}
	
}
