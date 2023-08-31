package vectores;
import java.util.*;
public class ejeArray17 {

		Scanner scanner;
		int myArray[];
		int reverse;
						
		public void presentar() {
			scanner=new Scanner(System.in);
			myArray = new int[10];	
			  for (int i=0; i<myArray.length;i++) {
					System.out.println("Introduce el numero " + (i+1));
					myArray[i]=scanner.nextInt();
			}
		}//presentar
		
		public void position() {
			for (int i=0; i<myArray.length/2;i++) {
				reverse=myArray[i];
				myArray[i]=myArray[myArray.length-1-i];
				myArray[myArray.length-1-i]=reverse;
			}
			for (int i=0; i<myArray.length;i++) {
				System.out.println(myArray[i]);
			}
		}//position
 		
  public static void main(String[] args) {
      ejeArray17 eje= new ejeArray17();
		eje.presentar();
		eje.position();
  }//main
}//ejeArray17
