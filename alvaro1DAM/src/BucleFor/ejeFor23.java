package BucleFor;
public class ejeFor23 {
	public static void main(String[] args) {
    	
		int num1 = 0;
		int num2 = 1;
		int numero;
		System.out.println(num1);
		System.out.println(num2);		
		for (numero=num1+num2;numero<1000;numero=num1+num2) {
			System.out.println(numero);
			num1=num2;
			num2=numero;
		}//for
			
    }//main
}//ejeFor23
