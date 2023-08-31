package ev1.ejercicios;

public class EjercicioNumerosAleatorios {

	public static void main(String[] args) {

		int aleatorio1 = ((int) (Math.random() * 4)) + 5;
		int numero1IgualA6 = (aleatorio1 == 6) ? 1 : 0;
		System.out.println("aleatorio1 = " + aleatorio1);
		
		int aleatorio2 = ((int) (Math.random() * 4)) + 5;
		int numero2IgualA6 = (aleatorio2 == 6) ? 1 : 0;
		System.out.println("aleatorio2 = " + aleatorio2);
		
		int aleatorio3 = ((int) (Math.random() * 4)) + 5;
		int numero3IgualA6 = (aleatorio3 == 6) ? 1 : 0;
		System.out.println("aleatorio3 = " + aleatorio3);
		
		int aleatorio4 = ((int) (Math.random() * 4)) + 5;
		int numero4IgualA6 = (aleatorio4 == 6) ? 1 : 0;
		System.out.println("aleatorio4 = " + aleatorio4);
		
		int aleatorio5 = ((int) (Math.random() * 4)) + 5;
		int numero5IgualA6 = (aleatorio5 == 6) ? 1 : 0;
		System.out.println("aleatorio5 = " + aleatorio5);
		
		int aleatorio6 = ((int) (Math.random() * 4)) + 5;
		int numero6IgualA6 = (aleatorio6 == 6) ? 1 : 0;
		System.out.println("aleatorio6 = " + aleatorio6);
		
		int aleatorio7 = ((int) (Math.random() * 4)) + 5;
		int numero7IgualA6 = (aleatorio7 == 6) ? 1 : 0;
		System.out.println("aleatorio7 = " + aleatorio7);
		
		int aleatorio8 = ((int) (Math.random() * 4)) + 5;
		int numero8IgualA6 = (aleatorio8 == 6) ? 1 : 0;
		System.out.println("aleatorio8 = " + aleatorio8);
		
		int aleatorio9 = ((int) (Math.random() * 4)) + 5;
		int numero9IgualA6 = (aleatorio9 == 6) ? 1 : 0;
		System.out.println("aleatorio9 = " + aleatorio9);
		
		int aleatorio10 = ((int) (Math.random() * 4)) + 5;
		int numero10IgualA6 = (aleatorio10 == 6) ? 1 : 0;
		System.out.println("aleatorio10 = " + aleatorio10);
		
		int totalApariciones = numero1IgualA6 + numero2IgualA6 + numero3IgualA6 +
				numero4IgualA6 + numero5IgualA6 + numero6IgualA6 +numero7IgualA6 +
				numero8IgualA6 + numero9IgualA6 + numero10IgualA6;
		
		System.out.println("El numero 6 ha aparecido " + totalApariciones + " veces");
	}

}
