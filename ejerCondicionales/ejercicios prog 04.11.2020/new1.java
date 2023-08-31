import java.util.*;
public class new1 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Primer parametro");
		  int num1 = sc.nextInt();
							 
		System.out.println("Segundo parametro");
		 int num2 = sc.nextInt();				 
	
		System.out.println("Tercer parametro");
		 int num3 = sc.nextInt();
		 
		 System.out.println("Cuarto parametro");
		 int num4 = sc.nextInt();
		
		String cM = calcularMedia(num1, num2, num3, num4);
		System.out.println("Tu nota media es " + cM);
		
		
		
	}
	public static String calcularMedia(int num1,int num2,int num3,int num4){
	double cM = (num1 + num2 + num3 + num4)/4;
	String frase = "Tu nota media es " + cM;
	return frase;	
		
	}
	
	
	
	
	
	
}