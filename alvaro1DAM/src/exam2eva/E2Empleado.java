package exam2eva;

public class E2Empleado {
	private String dni;
	private String nombre;
	private double sueldoBase;
	private double horasExtras;
	private double importeHorasExtras;
	
	//Tenemos que crear el constructor por defecto:
	public E2Empleado() {
		
	}
	//1º constructor con todos los atributos
	public E2Empleado(String dni, String nombre, double sueldoBase, double horasExtras, double importeHorasExtras) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.sueldoBase = sueldoBase;
		this.horasExtras = horasExtras;
		this.importeHorasExtras = importeHorasExtras;
	}
	//2º constructor con "x" datos y el resto los metemos por teclado(SUELDOBASE E IMPORTEHORASEXTRAS)
	public E2Empleado(String dni, String nombre, double horasExtras) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.horasExtras = horasExtras; // no tenemos porque llamar igual a las variables, se puede cambiar, por ello eclipse usa el This, para identificarlo.
		this.sueldoBase=1500;
		this.importeHorasExtras=25;
	}
	//3 º constructor. Recordar que los constructores no pueden tener los mismos tipos porque eclipse lo entiende como si fuera el mismo constructor, por ello debemos o meter
	//un parametro o quitarlo.
	public E2Empleado(String dni, String nombre, double sueldoBase,double horasExtras) {
			super();
			this.dni = dni;
			this.nombre = nombre;
			this.sueldoBase = sueldoBase;
			this.horasExtras = horasExtras;
	}
	// 4º GENERAMOS LOS GET Y LOS SET.
	public String getDni() {
			return dni;
	}
	public void setDni(String dni) {
			this.dni = dni;
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
	public double getHorasExtras() {
			return horasExtras;
	}
	public void setHorasExtras(double horasExtras) {
			this.horasExtras = horasExtras;
	}
	public double getImporteHorasExtras() {
			return importeHorasExtras;
	}
	public void setImporteHorasExtras(double importeHorasExtras) {
			this.importeHorasExtras = importeHorasExtras;
	}
	//5º CREAMOS EL METODO: •	Metodo que calcula el total a cobrar por empleado :
	public  double totalACobrar() { // si da error recordar que es double porque lo que debe llevar un returny debemos quitar el void.
	return sueldoBase+(horasExtras*importeHorasExtras);
	}
}
