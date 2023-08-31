package pooHerencia;

public class E3Vehiculo {
protected String matricula;	
protected String marca;
protected String modelo;
protected String color;
protected int numPuertas;
protected int potencia;


/////////////C
public E3Vehiculo() {
	super();
}

public E3Vehiculo(String matricula, String marca, String modelo, String color, int numPuertas, int potencia) {
	super();
	this.matricula = matricula;
	this.marca = marca;
	this.modelo = modelo;
	this.color = color;
	this.numPuertas = numPuertas;
	this.potencia = potencia;
}

///////////////GS
public String getMatricula() {
	return matricula;
}

public void setMatricula(String matricula) {
	this.matricula = matricula;
}

public String getMarca() {
	return marca;
}

public void setMarca(String marca) {
	this.marca = marca;
}

public String getModelo() {
	return modelo;
}

public void setModelo(String modelo) {
	this.modelo = modelo;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public int getNumPuertas() {
	return numPuertas;
}

public void setNumPuertas(int numPuertas) {
	this.numPuertas = numPuertas;
}

public int getPotencia() {
	return potencia;
}

public void setPotencia(int potencia) {
	this.potencia = potencia;
}

@Override
public String toString() {
	return "E3Vehiculo [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color
			+ ", numPuertas=" + numPuertas + ", potencia=" + potencia + "]";
}









}//vehiculo
