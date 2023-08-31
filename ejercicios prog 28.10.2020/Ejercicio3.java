public class Ejercicio3{
	public static void main(String args[]){
		
		int x = 88;
		double y = 3.5;
		double z = -5.2;
		
		double a, b, c, d, e, f, g, h, i, j, k, l, m, n;
				
			System.out.println("el resultado de a es:" + (a = x + y + z));
			System.out.println("el resultado de b es:" + (b = 2 * y + 3 * (x - z)));
			System.out.println("el resultado de c es:" + (c = x / y));
			System.out.println("el resultado de d es:" + (d = x % y));
			System.out.println("el resultado de e es:" + (e = x / (y + z)));
			System.out.println("el resultado de f es:" + (f = (x / y) + z));
			System.out.println("el resultado de g es:" + (g = 2 * x / 3 * y));
			System.out.println("el resultado de h es:" + (h = 2 * x / (3 * y)));
			System.out.println("el resultado de i es:" + (i = x * y % z));
			System.out.println("el resultado de j es:" + (j = x * (y % z)));
			System.out.println("el resultado de k es:" + (k = 3 * x - z * 2 * x));
			System.out.println("el resultado de l es:" + (l = 2 * x / 5 % y));
			System.out.println("el resultado de m es:" + (m = x - 100 % y % z));
			System.out.println("el resultado de n es:" + (n = x - y - z * 2));
	
	}

}