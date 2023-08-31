package pooClasesAbstractasPolim;

public abstract class E1FiguraGeometrica {
	protected String nombre;

//////////////////////////////////////////////C
	public E1FiguraGeometrica(String nombre) {
		super();
		this.nombre = nombre;
	}

	public E1FiguraGeometrica() {
		super();
	}
////////////////////////////////GS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract double area(); //metodo abstracto no usa llaves
	
	public String toString() {//para visualizar
		return nombre + " area =" + area();
	}
	
	public static double areaPromedio(E1FiguraGeometrica arr[]) {//colección de objetos en un vector, recorrerlo y 
		double sum=0;
		for (int i=0; i<arr.length;i++) {
			sum=sum+arr[i].area();
		}
		return sum/arr.length;//se divide la suma de las areas entre la cantidad de figuras
	}
}
