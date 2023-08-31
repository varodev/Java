import java.util.Scanner;

public class EjercicioHoroscopo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Inserte su día de nacimiento: ");
		int dia = entrada.nextInt();
		System.out.println("Inserte su mes de nacimiento (del 1 al 12): ");
		int mes = entrada.nextInt();
		
		/*Acuario 	20 Enero – 18 Febrero
		Piscis 		19 Febrero – 20 Marzo
		Aries		21 Marzo – 19 Abril
		Tauro		20 Abril – 20 Mayo
		Géminis		21 Mayo – 20 Junio
		Cáncer		21 Junio – 22 Julio
		Leo			23 Julio – 22 Agosto
		Virgo		23 Agosto – 22 Septiembre
		Libra		23 Septiembre – 22 Octubre
		Escorpio	23 Octubre – 21 Noviembre
		Sagitario	22 Noviembre – 21 Diciembre
		Capricornio	22 Diciembre – 19 Enero
		 */
		String horoscopo="";
		if(((dia>=20) && (mes==1))||((dia<=18) && (mes==2))) {
			horoscopo="Acuario";
		}else {
			horoscopo="Capricornio";
		}
		System.out.println("Su horóscopo es "+horoscopo);
		
		entrada.close();
		
	}

}
