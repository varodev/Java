public class Eje9{
	public static void main(String args[]){
		
		int cantidad = 100000;
		double interesMensual = 3.5;
		int numeroPagos = 12;
		
		double cuota;
		
		cuota = cantidad*interesMensual/(1-(1/Math.pow(1+interesMensual,numeroPagos)));

		System.out.println("el resultado de la cuota es: " + cuota + "euros");
		
				
	}
	
	
}