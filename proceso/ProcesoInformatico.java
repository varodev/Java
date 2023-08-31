package ev3.ejercicios.proceso;

public class ProcesoInformatico {

	// ATRIBUTOS
	
	private static final String DESCRIPCION_POR_DEFECTO = "Descripción no disponible";
	
	private static int contadorProcesos;
	
	private String nombre;
	private String descripcion;
	private int pid;
	
	static {
		
		contadorProcesos = 927;
	}
	
	
	// CONSTRUCTORES
	
	public ProcesoInformatico(String nombre, String descripcion) {

		this.nombre = nombre;
		this.descripcion = descripcion;
		this.pid = ++contadorProcesos;
	}
	
	public ProcesoInformatico(String nombre) {

		this.nombre = nombre;
		this.descripcion = DESCRIPCION_POR_DEFECTO;
		this.pid = ++contadorProcesos;
	}
	
	
	// MÉTODOS
	
	public String getNombre() {
		return nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public static int getContadorProcesos() {
		return contadorProcesos;
	}

	public int getPid() {
		return pid;
	}
	
	public static int proximoId() {
		return contadorProcesos + 1;
	}
	
	public static void plataforma() {
		System.out.println("Windows DAM");
	}
}
