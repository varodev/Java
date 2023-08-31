package ejerciciosRepaso;
import java.util.*;
public class repaso10 {
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		System.out.println("introduce dia");
		int dia = scanner.nextInt();
		System.out.println("introduce mes");
		int mes = scanner.nextInt();
		System.out.println("introduce año");
		int anno = scanner.nextInt();
	
		if (mes > 0) {
		  if (mes == 1 && dia >= 1 && dia <= 31 && anno !=0) {
			  System.out.println("Fecha correcta");
			  System.out.println(dia + "." + mes + "." + anno);	
		  }
		  else if (mes == 2 && dia >= 1 && dia <= 28 && anno !=0) {
			  System.out.println("Fecha correcta");
			  System.out.println(dia + "." + mes + "." + anno);
		  }
		  else if (mes == 3 && dia >= 1 && dia <= 31 && anno !=0) {
			  System.out.println("Fecha correcta");
			  System.out.println(dia + "." + mes + "." + anno);
		  }
		  else if (mes == 4 && dia >= 1 && dia <= 30 && anno !=0) {
			  System.out.println("Fecha correcta");
		      System.out.println(dia + "." + mes + "." + anno);
		  }
		  else if (mes == 5 && dia >= 1 && dia <= 31 && anno !=0) {
			  System.out.println("Fecha correcta");
		      System.out.println(dia + "." + mes + "." + anno);
		  }
		  else if (mes == 6 && dia >= 1 && dia <= 30 && anno !=0) {
			  System.out.println("Fecha correcta");
			  System.out.println(dia + "." + mes + "." + anno);
		  }
		  else if (mes == 7 && dia >= 1 && dia <= 31 && anno !=0) {
			  System.out.println("Fecha correcta");
		      System.out.println(dia + "." + mes + "." + anno);
		  }
		  else if (mes == 8 && dia >= 1 && dia <= 31 && anno !=0) {
			  System.out.println("Fecha correcta");
			  System.out.println(dia + "." + mes + "." + anno);
		  }
		  else if (mes == 9 && dia >= 1 && dia <= 30 && anno !=0) {
			  System.out.println("Fecha correcta");
		      System.out.println(dia + "." + mes + "." + anno);
		  }
		  else if (mes == 10 && dia >= 1 && dia <= 31 && anno !=0) {
			  System.out.println("Fecha correcta");
		      System.out.println(dia + "." + mes + "." + anno);
		  }
		  else if (mes == 11 && dia >= 1 && dia <= 30 && anno !=0) {
			  System.out.println("Fecha correcta");
			  System.out.println(dia + "." + mes + "." + anno);
		  }
		  else if (mes == 12 && dia >= 1 && dia <= 31 && anno !=0) {
			  System.out.println("Fecha correcta");
		      System.out.println(dia + "." + mes + "." + anno);
		  }
		  else {
			System.out.println("Algo mal estas haciendo");
		  }
		}
		else {
			System.out.println("mes erroneo");
		}	
scanner.close();
    }//main
}//repaso10