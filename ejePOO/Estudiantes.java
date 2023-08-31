package poo;
	public class Estudiantes {
			private String nombre;
			private String apellido;
			private String correo;
			private int edad;

		public Estudiantes(String nombre, String apellido) {
			this.nombre = nombre;
			this.apellido = apellido;
			this.correo="psanchez@gmqtech.es";
		}

		public Estudiantes() {
		}
			
		public Estudiantes(String nombre, String apellido, String correo) {
			super();
			this.nombre = nombre;
			this.apellido = apellido;
			this.correo = correo;
		}

		public Estudiantes(String nombre, String apellido, String correo, int edad) {
			super();
			this.nombre = nombre;
			this.apellido = apellido;
			this.correo = correo;
			this.edad = edad;
		}

		public Estudiantes(String nombre) {
			super();
			this.nombre = nombre;
			this.edad = 20;
		}

		public Estudiantes(String nombre, String apellido, int edad) {
			super();
			this.nombre = nombre;
			this.apellido = apellido;
			this.edad = edad;
		}

		public String getNombre() {
			return nombre;
		}
			
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
			
		public String getApellido() {
			return apellido;
		}
			
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
		
		public String getCorreo() {
			return correo;
		}
			
		public void setCorreo(String correo) {
			this.correo = correo;
		}

		public int getEdad() {
			return edad;
		}

        public void setEdad(int edad) {
			this.edad = edad;
		}
    }		

