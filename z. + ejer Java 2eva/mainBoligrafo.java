package ejercicios;

public class mainBoligrafo {

	public static void main(String[] args) {
		
		Boligrafo boli1 = new Boligrafo();
		boli1.color="Azul";
		boli1.marca="Mont Blanc";
		boli1.imprimirColor();
		boli1.imprimirMarca();
		boli1.imprimirPunta();
		
		Boligrafo boli2 = new Boligrafo("Naranja","Edding",0.7);
		boli2.imprimirColor();
		boli2.imprimirMarca();
		boli2.imprimirPunta();

	}

}
