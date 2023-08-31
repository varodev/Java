package pooClasesAbstractasPolim;

public class Empleados extends Personas {
	private int anoIncorpo;
	private int numDespacho;
	
////////////////////////C	
	public Empleados() {
		super();
	}
	
	public Empleados(String nombre, String apellido, String dni, String estadoCivil, int anoIncorpo, int numDespacho) {
		super(nombre, apellido, dni, estadoCivil);
		this.anoIncorpo = anoIncorpo;
		this.numDespacho = numDespacho;
		
	}
////////////////////////////////GS
	public int getAnoIncorpo() {
		return anoIncorpo;
	}
	public void setAnoIncorpo(int anoIncorpo) {
		this.anoIncorpo = anoIncorpo;
	}
	public int getNumDespacho() {
		return numDespacho;
	}
	public void setNumDespacho(int numDespacho) {
		this.numDespacho = numDespacho;
	}
}
