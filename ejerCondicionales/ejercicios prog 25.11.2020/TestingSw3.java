package condicionalesSwitch;
import java.util.*;
public class TestingSw3 {
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
    System.out.println("introduce radio");
    double radio = scanner.nextDouble();
    System.out.println("introduce altura");
	double altura = scanner.nextDouble();;
	System.out.println("introduce area o volumen");
	String caracter = scanner.next();
	
	final double PI = 3.1416;
	
	switch (caracter){
	case "a":
		double resultA = getArea(PI, radio, altura);
		System.out.println("el resultado es: " + resultA);
	break;
	case "v":
		double resultV = getVolumen(PI, radio, altura);
		System.out.println("el resultado es: " + resultV);
	break;	
	default:
		System.out.println("ninguna de las opciones anteriores");
	}//switch
		
scanner.close();
	}//main
	public static double getArea(double PI, double radio, double altura) {
		double getA = (2*PI*radio*altura)+(2*PI*Math.pow(radio, 2));
		return getA ;
	}//getArea
	public static double getVolumen(double PI, double radio, double altura) {
		double getV = (PI*Math.pow(radio, 2))*altura;
		return getV;
	}//Met
}//TestingSw3
