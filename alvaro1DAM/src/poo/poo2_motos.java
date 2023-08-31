package poo;
public class poo2_motos {
	
	private int cilindrada;
	private String marca;
	private String modelo;
	private String matricula;
	protected String color = "negro";
	private int id;
	private static int siguienteId=0;

	public poo2_motos() {//sc constructores
		this.id=++siguienteId;
		
	}
	public poo2_motos(int cilindrada, String marca, String modelo, String matricula) {//sc constructores
		this.cilindrada=cilindrada;
		this.marca=marca;
		this.modelo=modelo;
		this.matricula=matricula;
		this.id=++siguienteId;
	
	}
	public poo2_motos(String marca, String modelo) {//sc constructores
		this.marca=marca;
		this.modelo=modelo;
		this.id=++siguienteId;
	}
	
	protected int getCilindrada() {
		return cilindrada;
	}
	protected int getIdentificador() {
		return id;
	}
	protected void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	protected String getMarca() {
		return marca;
	}
	protected void setMarca(String marca) {
		this.marca = marca;
	}
	protected String getModelo() {
		return modelo;
	}
	protected void setModelo(String modelo) {
		this.modelo = modelo;
	}
	protected String getMatricula() {
		return matricula;
	}
	protected void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	protected void setColor(String colorNuevo) {
		this.color=colorNuevo;
	}
	
}
