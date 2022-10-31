package curso.java.colecciones.enotas.pojo;

public class Asignatura {

	private String nombre;
	private String nota;
	
	
	public Asignatura(String nombre, String nota) {
		super();
		this.nombre = nombre;
		this.nota = nota;
	}
	
	public Asignatura(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNota() {
		return nota;
	}

	public void setNota(String nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Asignatura [nombre=" + nombre + ", nota=" + nota + "]";
	}
	
	
	
	
	
}
