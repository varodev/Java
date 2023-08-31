package pooExcepciones;


public class Excepciones2Electrodomesticos {
	protected int precioBase;
	protected String color;
	protected String consumoEnergetico;
	protected int peso;
	
////////////////////////////////////////C	
	public Excepciones2Electrodomesticos() {
		super();
	}

	public Excepciones2Electrodomesticos(int precioBase, int peso) {
		super();
		this.precioBase = 100;
		this.color = "blanco";
		this.consumoEnergetico="F";
		this.peso = 5;
	}

	public Excepciones2Electrodomesticos(int precioBase, String color, String consumoEnergetico, int peso) {
		super();
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}
////////////////////////////////////M
	public int getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(int precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(String consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public void comprobarConsumoEnergetico (String letra) {
		if (letra.equalsIgnoreCase("a/psp2DAM")||letra.equalsIgnoreCase("b")||letra.equalsIgnoreCase("c")||letra.equalsIgnoreCase("d")||letra.equalsIgnoreCase("e")) {
			this.consumoEnergetico=letra;
		}else {
			this.consumoEnergetico="F";
		}
	}
	
	public void comprobarColor(String color) {
		System.out.println("los colores disponibles son negro, rojo , azul, gris ");
		boolean disponible = false;
		String colores[]= {"negro", "rojo" , "azul", "gris"};
		
		for (int i=0; i<colores.length ;i++) {
			if(colores[i].equals(color)) {
				disponible=true;
			}
		}
		
		if(disponible==true) {
			this.color=color;
		}else {
			this.color="blanco";
		}
	}
	
	public double precioFinal() {
		double plus=0;
		switch (consumoEnergetico) {
		case "A":
			plus+=100;
			break;
		case "B":
			plus+=80;
			break;
		case "C":
			plus+=60;
			break;
		case "D":
			plus+=50;
			break;
		case "E":
			plus+=30;
			break;
		case "F":
			plus+=10;
			break;
		}
		if (peso>=0 && peso<19) {
			plus+=10;
		}else if (peso>=20 && peso<49) {
			plus+=50;
		}else if (peso>=50 && peso<79) {
			plus+=80;
		}else if (peso>=80){
			plus+=100;
		}
		return precioBase+plus;
	}
}
