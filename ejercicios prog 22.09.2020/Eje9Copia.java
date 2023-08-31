public class Eje9Copia{
	public static void main(String args[]){
		
		int cantidad = 100000;
		double interesMensual = 0.035;
		int numeroPagos = 180;
		
		double cuota = cantidad*interesMensual/(1-(1/Math.pow(1+interesMensual,numeroPagos)));

		System.out.println("el resultado de la cuota es: " + cuota + "euros");
		
				
	}
	
	
}