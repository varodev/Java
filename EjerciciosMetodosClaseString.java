package ev2.ejercicios;

public class EjerciciosMetodosClaseString {

	public static void main(String[] args) {

		String frase = "Soy alumno de Desarrollo de Aplicaciones Multiplataforma";
		
		System.out.println("longitud = " + frase.length());
		
		boolean iguales = frase.equals("soy alumno de desarrollo de aplicaciones multiplataforma");
		
		System.out.println("iguales = " + iguales);
		
		boolean igualesIgnoreCase = frase.equalsIgnoreCase("soy alumno de desarrollo de aplicaciones multiplataforma");
		
		System.out.println("igualesIgnoreCase = " + igualesIgnoreCase);
		
		System.out.println("caracterPosicion7 = " + frase.charAt(7));
		
		System.out.println("posicionCaracterA = " + frase.indexOf('a'));
		
		System.out.println("terceraPosicionCaracterO = " + frase.indexOf('o', 10));
		
		System.out.println("posicionPalabraDe = " + frase.indexOf("de"));
		
		System.out.println("posicionPalabraWeb = " + frase.indexOf("web"));
		
		System.out.println(frase.substring(4, 24));
		
		System.out.println(frase.substring(8));
		
		System.out.println("minusculas = " + frase.toLowerCase());
		
		String alumnoMayusculas = frase.substring(0, frase.indexOf("alumno"))
				+ frase.substring(frase.indexOf("alumno"), frase.indexOf("alumno") + "alumno".length()).toUpperCase()
				+ frase.substring(frase.indexOf("alumno") + "alumno".length());
		
		System.out.println("alumnoMayusculas = " + alumnoMayusculas);
		
		String deDesarrollo = frase.substring(frase.indexOf(" de"), frase.indexOf("Desarrollo ") + "desarrollo ".length());
		System.out.println("deDesarrollo = " + deDesarrollo.trim());
		
		System.out.println(frase.replace('a', '@').replace('o', '@'));
		
		System.out.println(frase.replace("de", "con"));
		
		String[] fraseDelimitadaPorA = frase.split("a");
		
		System.out.println(fraseDelimitadaPorA[0] + 'a' + fraseDelimitadaPorA[1]
				+ 'a' + fraseDelimitadaPorA[2] + 'a' + fraseDelimitadaPorA[3]
				+ 'a' + fraseDelimitadaPorA[4] + 'a' + fraseDelimitadaPorA[5] + "a");
		
		char[] letrasFrase = frase.toCharArray();
		
		System.out.println((letrasFrase[18] + "").toUpperCase() + letrasFrase[4]
				+ letrasFrase[51] + letrasFrase[4] + letrasFrase[12] + letrasFrase[5]
				+ letrasFrase[3] + letrasFrase[12] + letrasFrase[16] + letrasFrase[3]
				+ letrasFrase[7] + letrasFrase[31] + letrasFrase[3] + letrasFrase[29]
				+ letrasFrase[18] + letrasFrase[1] + letrasFrase[51] + letrasFrase[12]
				+ letrasFrase[16] + letrasFrase[1] + letrasFrase[18]);
	}

}
