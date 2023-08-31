import java.util.*;
public class {
	public static void main(String args()){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Primer parametro");
		  int num1 = sc.next.Int();
						 
						 
						 
		System.out.println("Segundo parametro");
		 int num2 = sc.next.Int();				 
		
		System.out.println("Tercer parametro");
		 int num3 = sc.next.Int();
		 
		 System.out.println("Cuarto parametro");
		 int num4 = sc.next.Int();
		
		String X = calcularMedia(num1, num2, num3, num4);
		System.out.println("la media de la nota es" + X)
		
		
		
	}
	public static String calcularMedia(int num1,int num2,int num3,int num4){
		String cM = (num1 + num2 + num3 + num4)/4;
	return cM;	
		
	}
	
	
	
	
	
	
}