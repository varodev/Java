package vectores;
import java.util.*;
public class ejeArray34 {
    Scanner scanner = new Scanner(System.in);
    Random rnd = new Random();
	int  num;//scanner.nextInt();
	int i;
	int suma_primer=0;
	int suma_segun=0;
	int suma_terce=0;
	double media_alumno;
	int []PrimerT;
	int []SegundoT;
	int []TercerT;
		
	public void rellenar() {
		
	PrimerT =new int[5];
	SegundoT =new int[5];
	TercerT =new int[5];

	System.out.println("Se autorrelena las notas del 1er Trimreste");
	for(int i=0;i<PrimerT.length;i++) {
		PrimerT[i]=rnd.nextInt(8)+1;
	}
	System.out.println("Se autorrelena las notas del 2er Trimreste");
	for(int i=0;i<SegundoT.length;i++) {
		SegundoT[i]=rnd.nextInt(8)+1;
	}
	System.out.println("Se autorrelena las notas del 3er Trimreste");
	for(int i=0;i<TercerT.length;i++) {
		TercerT[i]=rnd.nextInt(8)+1;
	}
	
	System.out.println("\nLa notas del 1er son: ");
	for(int i=0;i<PrimerT.length;i++) {
		System.out.print(PrimerT[i] + " ");
	}
	System.out.println("\nLa notas del 2er son: ");
	for(int i=0;i<SegundoT.length;i++) {
		System.out.print(SegundoT[i] + " ");
	}
	System.out.println("\nLa notas del 1er son: ");
	for(int i=0;i<TercerT.length;i++) {
		System.out.print(TercerT[i] + " ");
	}
	}//rellenar
	
	//las medias	
	public void mostrar() {
	for (int i=0; i<5;i++) {
		suma_primer=suma_primer+PrimerT[i];
		suma_segun=suma_segun+SegundoT[i];
		suma_terce=suma_terce+TercerT[i];
	}
	System.out.println("\n");
	System.out.println("la media de la 1er eva es " + suma_primer/5);
	System.out.println("la media de la 2er eva es " + suma_segun/5);	
	System.out.println("la media de la 3er eva es " + suma_terce/5);
	
	//Leemos la posicion del alumno que nos interesa
	System.out.println("\nIntroduzca la posicion del alumno (de 0 a 9)");
	num=scanner.nextInt();
	
	//La media del alumno es la suma de sus notas entre 3
	media_alumno=(double)(PrimerT[num]+SegundoT[num]+TercerT[num])/3;
	System.out.println("La media del alumno es: " + media_alumno);
	}//comprobar
					
  public static void main(String[] args) {
	ejeArray34 nomb = new ejeArray34();
		nomb.rellenar();
		nomb.mostrar();
  }//main
}//ejeArray34
