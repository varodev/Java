package vectores;
import java.util.*;
public class ejeArray19 {
    Scanner scanner = new Scanner(System.in);
	String cadena;//scanner.nextLine();
	int counter=0;
	String []nombres;
	boolean inscri=false;
	
	public void name() {
		nombres=new String[15];
		
		while(counter<15) {
			inscri=false;
			for(int i=0;i<nombres.length;i++) {
			    System.out.println("introduce nombre " + (i+1));
			    cadena=scanner.nextLine();
			
			    if (cadena.equalsIgnoreCase(nombres[i])) {
				System.out.println("Usted ya fue inscrito");
					inscri=true;
				}
				else {
			    nombres[i]=cadena;	
				}
		    }
			if (inscri==false) {
			counter++;
			}
		}//while	
	}//name
		
	public void imprimir() {
		for(int i=0;i<nombres.length;i++) {
			System.out.println(nombres[i]);
		}
	}//imprimir
		
  public static void main(String[] args) {
	ejeArray19 nomb = new ejeArray19();
	nomb.name();
	nomb.imprimir();
  }//main
}//ejeArray19
