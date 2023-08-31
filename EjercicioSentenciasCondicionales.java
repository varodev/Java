package ev2.ejercicios;

public class EjercicioSentenciasCondicionales {

	public static void main(String[] args) {

//		condicionalIfElse("MARTES");
		condicionalSwitch("jueves");
	}
	
	static void condicionalIfElse(String diaDeLaSemana) {
		
		if(diaDeLaSemana.equals("LUNES")) {
			
			System.out.println("¡Feliz LUNES!");
			
		} else if(diaDeLaSemana.equals("MARTES")) {
			
			System.out.println("¡Feliz MARTES!");
			
		} else if(diaDeLaSemana.equals("MIÉRCOLES")) {
			
			System.out.println("¡Feliz MIÉRCOLES!");
			
		} else if(diaDeLaSemana.equals("JUEVES")) {
			
			System.out.println("¡Feliz JUEVES!");
			
		} else if(diaDeLaSemana.equals("VIERNES")) {
			
			System.out.println("¡Feliz VIERNES!");
			
		} else if(diaDeLaSemana.equals("SÁBADO")) {
			
			System.out.println("¡Feliz SÁBADO!");
			
		} else if(diaDeLaSemana.equals("DOMINGO")) {
			
			System.out.println("¡Feliz DOMINGO!");
			
		} else {
			
			System.out.println("El día de la semana introducido no es válido...");
		}
	}

	static void condicionalSwitch(String diaDeLaSemana) {
		
		diaDeLaSemana = diaDeLaSemana.toUpperCase();
		
		switch(diaDeLaSemana) {
		
			case "LUNES":
				System.out.println("¡Feliz LUNES!");
				break;
				
			case "MARTES":
				System.out.println("¡Feliz MARTES!");
				break;
				
			case "MIÉRCOLES":
				System.out.println("¡Feliz MIÉRCOLES!");
				break;
				
			case "JUEVES":
				System.out.println("¡Feliz JUEVES!");
				break;
				
			case "VIERNES":
				System.out.println("¡Feliz VIERNES!");
				break;
				
			case "SÁBADO":
				System.out.println("¡Feliz SÁBADO!");
				break;
				
			case "DOMINGO":
				System.out.println("¡Feliz DOMINGO!");
				break;
				
			default:
				System.out.println("El día de la semana introducido no es válido...");
		
		}
	}
}
