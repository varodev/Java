package pooClasesAbstractasPolim;

public class Estudiantes extends Personas {
	private String curso;

	//////////////////////////C
	public Estudiantes() {
		super();
	}

	public Estudiantes(String nombre, String apellido, String dni, String estadoCivil, String curso) {
		super(nombre, apellido, dni, estadoCivil);
		this.curso=curso;
	}

	///////////////////////////GS
	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
}
