
public class EjercicioFibonacci {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 1;
		int num3 = num1+num2;
		System.out.println(num1);
		while(num2<1000) {
			System.out.println(num2);
			num1=num2;
			num2=num3;
			num3=num1+num2;
			
		}

		

	}

}
