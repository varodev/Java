package pooClasesAbstractasPolim;

public class E1Rectangulo extends E1FiguraGeometrica {//daba error por no incluir el metodo area()
		private double base;
		private double altura;
		
/////////////////////////////////////////////////////////////////////////C		
		public E1Rectangulo(String nombre, double base, double altura) {
			super(nombre);
			this.base = base;
			this.altura = altura;
		}

		public E1Rectangulo(String nombre) {
			super(nombre);
		}

///////////////////////////////////GS
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
			return base*altura;
		}
	
		
}
