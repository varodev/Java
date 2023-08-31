package ev3.ejercicios.colegio;

public class Alumno {

	private String nombreCompleto;
	private String titulacion;
	private int curso;
	
	public Alumno(String nombreCompleto, String titulacion, int curso) {

		chequearAlumnoValido(nombreCompleto);
		
		this.nombreCompleto = nombreCompleto;
		this.titulacion = titulacion;
		this.curso = curso;
	}
	
	private void chequearAlumnoValido(String nombreCompleto) {
		
		if(nombreCompleto == null || nombreCompleto.length() < 7) {
			
			System.out.println("Ha habido un problema intentando crear el alumno...");
			
			if(nombreCompleto == null) {
				
				System.out.println("El nombre no puede ser null...");
				
			}else if(nombreCompleto.length() < 7) {
				
				System.out.println("El nombre tiene que tener una longitud mayor de 7 caracteres...");
			}
			
			throw new RuntimeException();
		}
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}
	
	public void setNombreCompleto(String nombreCompleto) {
		
		chequearAlumnoValido(nombreCompleto);
		
		this.nombreCompleto = nombreCompleto;
	}

	public String getTitulacion() {
		return titulacion;
	}
	
	public int getCurso() {
		return curso;
	}
	
	public void promocionarCurso() {
		
		this.curso++;
	}
}
