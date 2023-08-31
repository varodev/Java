package pooClasesAbstractasPolim;

public class E1Triangulo extends E1FiguraGeometrica {
	private double base;
	private double altura;
	
/////////////////////////////////////////////////////////////////C	
	public E1Triangulo(String nombre, double base, double altura) {
		super(nombre);
		this.base = base;
		this.altura = altura;
	}

	public E1Triangulo(String nombre) {
	super(nombre);
	}

///////////////////////////////GS/
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double area() {
		return base*altura/2;
	}

}
