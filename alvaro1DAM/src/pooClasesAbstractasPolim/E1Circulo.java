package pooClasesAbstractasPolim;

public class E1Circulo extends E1FiguraGeometrica {
	private int radio;

///////////////////////////////////////////////C	
	public E1Circulo(String nombre, int radio) {
		super(nombre);
		this.radio = radio;
	}

	public E1Circulo(String nombre) {
		super(nombre);
	}

////////////////////////////GS	
	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}
	
	public double area() {
		return Math.PI*Math.pow(radio, 2);
	}

}
