package curso.java.poo.carreracaballos.pojo;

import curso.java.funciones.Utils;

public class Caballo {
	private String nombre;
	private int dorsal;
	private int velocidad;
	private int experiencia;
	private int edad;
	private int distanciaRecorrida;
	private int metrosAvanzados = 0;
	
	
	
	
	public Caballo(String nombre, int dorsal, int velocidad, int experiencia, int edad) {
		super();
		this.nombre = nombre;
		this.dorsal = dorsal;
		this.velocidad = velocidad;
		this.experiencia = experiencia;
		this.edad = edad;
	}


	
	public Caballo(String nombre, int dorsal, int velocidad, int edad) {
		super();
		this.nombre = nombre;
		this.dorsal = dorsal;
		this.velocidad = velocidad;
		this.edad = edad;
		this.experiencia = 1;
	}


	
	public String getNombre() {
		return nombre;
	}


	public int getDorsal() {
		return dorsal;
	}


	public int getVelocidad() {
		return velocidad;
	}


	public int getExperiencia() {
		return experiencia;
	}


	public int getEdad() {
		return edad;
	}


	public int getDistanciaRecorrida() {
		return distanciaRecorrida;
	}

	
	public int getMetrosAvanzados() {
		return metrosAvanzados;
	}


	public int correr() {
		
		int vRandom = Utils.azar(10);
		
		this.metrosAvanzados = this.velocidad + this.experiencia - this.edad + vRandom;
		this.distanciaRecorrida = this.distanciaRecorrida + metrosAvanzados;
		
		return metrosAvanzados;
	}

}
