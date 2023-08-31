package pooConstructores;

public class E1Coche {
	    private String ciudad; //Ciudad de cada objeto taxi
	    private String matricula; //Matrícula de cada objeto taxi
	    private String provincia; //Provincia asignado a cada objeto taxi
	    private int tipoMotor; //Tipo de motor asignado a cada objeto taxi. 0 = desconocido, 1 = gasolina, 2 = diesel
	    
	    //Constructor: cuando se cree un objeto taxi se ejecutará el código que incluyamos en el constructor
		public E1Coche(String ciudad, String matricula, String provincia,	int tipoMotor) {
			this.ciudad = ciudad;
			this.matricula = matricula;
			this.provincia = provincia;
			this.tipoMotor = tipoMotor;
		}
		public E1Coche(String ciudad) {
			
			this.ciudad = ciudad;
		}
		public E1Coche (String valorMatricula, String valorProvincia, int valorTipoMotor) {
	        ciudad = "Madrid";
	        matricula = valorMatricula;
	        provincia = valorProvincia;
	        tipoMotor = valorTipoMotor;
	    } //Cierre del constructor
	 
		public String getCiudad () { 
	    	return ciudad; 
		}
		//Método para obtener la matrícula del objeto coche
	    
		public String getMatricula () { 
	    	return matricula; 
	    	} //Cierre del método
	    //Método para obtener la provincia del objeto coche
	    
	    public String getProvincia () {
	    	return provincia; 
	    	} //Cierre del método  
	 
	    //Método para obtener el tipo de motor del objeto coche
	    public int getTipoMotor () { 
	    	return tipoMotor;
	    	} //Cierre del método
	}

