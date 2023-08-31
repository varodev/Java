package poo;
import java.util.*;
public class poo2_motos_main {
	
	public static void imprimirAtributosMotos(ArrayList<poo2_motos> listaMotos) {
		
		for(int x=0; x < listaMotos.size();x++) {
			System.out.println("Identificador = "+listaMotos.get(x).getIdentificador());
			System.out.println("Cilindrada = "+listaMotos.get(x).getCilindrada());
			System.out.println("Marca = "+listaMotos.get(x).getMarca());
			System.out.println("Modelo = "+listaMotos.get(x).getModelo());
			System.out.println("Matricula = "+listaMotos.get(x).getMatricula());
			System.out.println("------------");
		}
	}
	
	public static void main(String[] args) {
		ArrayList<poo2_motos> motos = new ArrayList<poo2_motos>();
		
		poo2_motos moto1 = new poo2_motos(100,"Yamaya",null,"200GTH");
		poo2_motos moto2 = new poo2_motos(500,"Kawasaki","G1","2001GTH");
		poo2_motos moto3 = new poo2_motos(2000,"Vespa","Piccola","M-2000-ZA");
		poo2_motos moto4 = new poo2_motos(1200,"Trump","HZ100","2433CLN");
				
		motos.add(moto1);
		motos.add(moto2);
		motos.add(moto3);
		motos.add(moto4);
		
		imprimirAtributosMotos(motos);
	}
}
