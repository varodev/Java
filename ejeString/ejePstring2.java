package string;
import java.util.*;
public class ejePstring2 {
    public static void main(String[] args) {
		
try(Scanner teclado=new Scanner(System.in)){
    System.out.println("Se presentan los participantes. ");
   	
    System.out.println( "A continuación, hará su lanzamiento el jugador 1");
   	int jugador1= (int)Math.round((Math.random()*6)+0.5);
    System.out.println("El jugador 1 ha sacado: "+jugador1);
   
    System.out.println( "A continuación, hará su lanzamiento el jugador 2");
    int jugador2= (int)Math.round((Math.random()*6)+0.5);
    System.out.println("El jugador 2 ha sacado: "+jugador2);
    	
    if (jugador1>jugador2){
    	System.out.println("jugador 1 gano con una puntuación de "+jugador1);
    	}
    	else {
    	System.out.println("jugador 2 gano con una puntuación de "+jugador2);
    	}
    int ganador = Math.max(jugador1, jugador2);
    System.out.println("Quien sacó "+ganador+" es el ganador");
    	
    	

}//try
	}//main
}//ejePstring2
