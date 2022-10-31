package curso.java.colecciones.enotas.pojo;

public class Asignatura {

	private String nombre;
	private int nota;
	
	
	public Asignatura(String nombre, int nota) {
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

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "\tAsignatura [nombre=" + nombre + ", nota=" + nota + "]";
	}
	
	
	
	
	
}
