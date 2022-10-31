package curso.java.colecciones.enotas.pojo;

import java.util.HashSet;
import java.util.Set;

public class Estudiante extends Persona {
	
	private Set <Asignatura> asignaturas = new HashSet <Asignatura>();

	public Estudiante(String nombre, String apellidos, String dni, Set <Asignatura> asignaturas) {
		super(nombre, apellidos, dni);
		this.asignaturas = asignaturas;
	}

	public Set<Asignatura> getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(Set<Asignatura> asignaturas) {
		this.asignaturas = asignaturas;
	}

	
	
	
}
