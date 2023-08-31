
public class Ejemplo2 {

	public static void main(String[] args) {
		int x;
		x=5;
		int y = 8;
		int resultado = y + x;
		int myNum = 5;
		float myFloatNum = 5.99f;
		double otroNumero= 5.99;
		char myLetter = 'D'; // Siempre con comillas simples.
		char otraLetra= 69;
		boolean myBool = true;
		String myText = "Hello";
		float f1 =35e3f; //Notación científica = 35000.0
		double d1 = 12E4d; //Notación científica = 120000.0
		double d2 = 5E-2d; //Notación científica = 0.05
		boolean isJavaFun = true;
		boolean isFishTasty = false;
		System.out.println(isJavaFun);
		System.out.println(isFishTasty);
		System.out.println(d2);
		System.out.println(f1);
		System.out.println(d1);
		System.out.println("La suma es "+ resultado);
		System.out.println("La multiplicación es "+ (x*y));
		System.out.println(myFloatNum);
		System.out.println(myFloatNum*y);
		System.out.println(otroNumero);
		System.out.println(myLetter);
		System.out.println(myLetter*2);
		System.out.println(otraLetra);
	}

}
