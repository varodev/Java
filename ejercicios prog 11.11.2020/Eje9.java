import java.util.*;

public class Eje9{

    public static void main(String[] args){

           Scanner sc = new Scanner(System.in);
           
		   System.out.print("Introduzca longitud del primer cateto: ");
           double cateto1 = sc.nextDouble();
           
		   System.out.print("Introduzca longitud del segundo cateto: ");
           double cateto2 = sc.nextDouble();
           
		   System.out.println("Hipotenusa -> " +  Math.sqrt(Math.pow(cateto1,2)+  Math.pow(cateto2, 2)));          
    }
}