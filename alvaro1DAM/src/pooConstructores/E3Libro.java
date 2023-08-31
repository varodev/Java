package pooConstructores;

public class E3Libro {
	private String titulo;
    private String autor;
    private int ejemplares;
    private int prestados;

    //constructor por defecto
    public E3Libro() {
    }

    //constructor con parámetros
    public E3Libro(String titulo, String autor, int ejemplares, int prestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
    }

//faltan constructores

    //getters y setters
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public int getPrestados() {
        return prestados;
    }

    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    //método para realizar el prestamo de un libro
    public boolean prestamo() {
    	if (prestados < ejemplares) {
            prestados++; //pasa saber del contador
            return true;
        } else {
            return false;
        }
        
    }

    //método para realizar la devolución de un libro
    public boolean devolucion() {
         if (prestados == 0) {
            return false;
        } else {
            prestados--;
		return true;
        }
    }

//método toString sobrescrito para mostrar los datos de la clase Libro
    //se puede utilizar metodos get 
    
	public String toString() {
        return "titulo: " + titulo + "\nautor: " + autor +
                  "\nejemplares: " + ejemplares + "\nprestados: " + prestados;
    }

	public E3Libro(String titulo, String autor, int ejemplares) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.ejemplares = ejemplares;
	}
}
