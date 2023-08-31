package pooClasesAbstractasPolim;

public class E1MainFG {

	public static void main(String[] args) {
		E1Rectangulo rec = new E1Rectangulo ("Rectangulo" , 10, 2);
		E1Triangulo tri = new E1Triangulo ("Triangulo", 10 ,3);
		E1Circulo cir = new E1Circulo("Circulo", 10);
		
		System.out.println(rec.toString());
		System.out.println(tri.toString());
		System.out.println(cir.toString());
		
		E1FiguraGeometrica arr[] = {rec, tri, cir};
			double promedio = E1FiguraGeometrica.areaPromedio(arr);
				System.out.println("El promedio de las 3 formas geometricas es:" + promedio);
			

	}

}
