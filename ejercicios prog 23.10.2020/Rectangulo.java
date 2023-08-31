import java.util.*;
public class Rectangulo{
		public static void main(String[]args){
			
			//Creamos nuestra variable teclado, que será la encargada de leer los datos.
			Scanner teclado = new Scanner(System.in);
			
			//Calcular el area de rectangulo: base y altura.
			
			//Primero preguntamos por la base y, luego la guardamos en la variable base
			System.out.println("Por favor, introduzca la base: ");
			int base = teclado.nextInt();
			
			//Después preguntamos por la altura y, luego la guardamos en la variable altura
			System.out.println("Por favor, introduzca la altura: ");
			int altura = teclado.nextInt();
			
			//Por último calculamos el área del rectángulo
			int area = base*altura;
			
			//Imprimimos por pantalla el resultado
			System.out.println("El area del rectangulo es: " + area);
			
			
			
		


		}
}