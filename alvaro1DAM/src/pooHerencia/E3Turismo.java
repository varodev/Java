package pooHerencia;

public class E3Turismo extends E3Vehiculo {
private int numPlazas;

////////////////C
public E3Turismo() {
	super();
}

 public E3Turismo(String matricula, String marca, String modelo, String color, int numPuertas, int potencia) {
	super(matricula, marca, modelo, color, numPuertas, potencia);
	this.numPuertas = numPuertas;
	this.potencia = potencia;
 }

////////////////GS
 public int getNumPlazas() {
	return numPlazas;
 } 

 public void setNumPlazas(int numPlazas) {
	this.numPlazas = numPlazas;
 }

@Override
public String toString() {
	return "Turismo [numPlazas=" + numPlazas + "]";
}
 
 
}
