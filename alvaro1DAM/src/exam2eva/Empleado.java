package exam2eva;

public class Empleado {
	private String DNI;
	private String nombre;
	private double sueldoBase;
	private int cantidadHorasExtras;
	private double importeHorasExtras;
/////////C
	public Empleado() {
		super();
	}
	public Empleado(String DNI, String nombre, double sueldoBase, int cantidadHorasExtras, double importeHorasExtras) {
		super();
		this.DNI = DNI;
		this.nombre = nombre;
		this.sueldoBase = sueldoBase;
		this.cantidadHorasExtras = cantidadHorasExtras;
		this.importeHorasExtras = importeHorasExtras;
	}
	public Empleado(String DNI, String nombre, int cantidadHorasExtras) {
		super();
		this.DNI = DNI;
		this.nombre = nombre;
		this.cantidadHorasExtras = cantidadHorasExtras;
		this.sueldoBase = 1500;
		this.importeHorasExtras = 25;
	}
	public Empleado(String DNI, String nombre, double sueldoBase) {
		super();
		this.DNI = DNI;
		this.nombre = nombre;
		this.sueldoBase = sueldoBase;
	}
///////GS
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String DNI) {
		this.DNI = DNI;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	public int getCantidadHorasExtras() {
		return cantidadHorasExtras;
	}
	public void setCantidadHorasExtras(int cantidadHorasExtras) {
		this.cantidadHorasExtras = cantidadHorasExtras;
	}
	public double getImporteHorasExtras() {
		return importeHorasExtras;
	}
	public void setImporteHorasExtras(double importeHorasExtras) {
		this.importeHorasExtras = importeHorasExtras;
	}
///////////
	public double sueldo() {
	return sueldoBase+(importeHorasExtras*cantidadHorasExtras);
	}
}
