import java.util.*;
public class Eje_DistanciaEu{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("introduce la primera coordenada X");
		int X1 = sc.nextInt();
		
		System.out.println("introduce la segunda coordenada X");
		int X2 = sc.nextInt();


		System.out.println("introduce la primera coordenada Y");
		int Y1 = sc.nextInt();


		System.out.println("introduce la segunda coordenada Y");
		int Y2 = sc.nextInt();
	
			double resultadoEU = DistaEu(X1,X2,Y1,Y2);
			System.out.println("el valor de las coordenadas es " + resultadoEU);
		
	
	}
	public static double DistaEu(int X1, int X2, int Y1, int Y2){
		double DiEu = Math.sqrt(Math.pow((X2-X1),2) - Math.pow((Y2-Y1),2));
		return DiEu;
	}
	
}