package clases;



public class mainBoli {

			public static void main(String[] args) {
				
			ejercicios.Boligrafo boli1 = new ejercicios.Boligrafo()	;
				boli1.color="Azul";
				boli1.marca="Mont Blanc";
				boli1.imprimirColor();
				boli1.imprimirMarca();
				boli1.imprimirPunta();
				
				ejercicios.Boligrafo boli2 = new ejercicios.Boligrafo("Naranja","Edding",0.7);
				boli2.imprimirColor();
				boli2.imprimirMarca();
				boli2.imprimirPunta();

			}



}
