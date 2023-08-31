package condicionalesIFSwitch;
import java.util.*;
public class TestingSw3 {
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
    System.out.println("introduce radio");
    double radio = scanner.nextDouble();
    System.out.println("introduce altura");
	double altura = scanner.nextDouble();;
	System.out.println("introduce a para area o v para volumen");
	String caracter = scanner.next();
	
	final double PI = 3.1416;
	
	char caract = caracter.charAt(0);
	
	switch (caract){
	case 'a':
		System.out.println(getArea(PI, radio, altura));
	break;
	case 'v':
		System.out.println(getVolumen(PI, radio, altura));
	break;	
	default:
		System.out.println("ninguna de las opciones anteriores");
	}//switch
scanner.close();
}//main
	public static double getArea(double PI, double radio, double altura) {
		return (2*PI*radio*altura)+(2*PI*Math.pow(radio, 2)); 
	}//getArea
	public static double getVolumen(double PI, double radio, double altura) {
		return (PI*Math.pow(radio, 2))*altura;
	}//getVolumen
}//TestingSw3
