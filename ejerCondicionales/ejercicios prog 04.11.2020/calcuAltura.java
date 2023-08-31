
public class calcuAltura{
	public static void main(String args[]){
		
		double piernas = 1.2;
		double tronco = 0.5;
		double cabeza = 0.2;
		
	 
	double resultado = calcularAltura (piernas, tronco, cabeza);
	System.out.println("sumatorio es " + resultado + " metros");
	
	
	}
	public static double calcularAltura(double piernas, double tronco, double cabeza){
	double calcu = piernas + tronco + cabeza; 
	return calcu;
		
	
	}

}
