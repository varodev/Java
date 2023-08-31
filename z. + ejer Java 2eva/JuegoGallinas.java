
public class JuegoGallinas {

	public static void main(String[] args) {
		//Tenemos una granja que hay ovejas y gallinas. (80 cabezas en total y 280 patas)
		//¿Cuántas gallinas y cuántas ovejas?
		
		int cabezas = 80;
		int patas= 280;
		int gallina;
		int oveja;
		
		oveja=(patas-(cabezas*2))/2;
		gallina=cabezas-oveja;
		
		System.out.println("Hay "+gallina + " gallinas y "+ oveja+" ovejas.");

	}

}
