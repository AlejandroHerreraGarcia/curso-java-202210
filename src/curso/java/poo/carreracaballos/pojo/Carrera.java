package curso.java.poo.carreracaballos.pojo;

import java.util.Iterator;

public class Carrera {
	
	private String nombre;
	private int distancia;
	private Caballo[] caballos;
	
	
	
	public Carrera(String nombre, int distancia, Caballo[] caballos) {
		super();
		this.nombre = nombre;
		this.distancia = distancia;
		this.caballos = caballos;
	}

	

	public String getNombre() {
		return nombre;
	}


	public int getDistancia() {
		return distancia;
	}


	public Caballo[] getCaballos() {
		return caballos;
	}

	
//
	public Caballo iniciarCarrera() {
		int posicionCaballo = 0;
		for (int i = 0; i < caballos.length; i++) {
			for (int j = 0; j < distancia; j++) {
				caballos[i].correr();
				
				System.out.println("Distancia recorrida este turno por " + caballos[i].getNombre() + ": " + caballos[i].getMetrosAvanzados());
				System.out.println("Distancia total recorrida por " + caballos[i].getNombre() +": " + caballos[i].getDistanciaRecorrida());
				if (caballos[i].getDistanciaRecorrida() >= distancia) {
					j = distancia;
					if (caballos[i].getDistanciaRecorrida() > caballos[posicionCaballo].getDistanciaRecorrida()) {
						posicionCaballo = i;
					}
				}
			}
		}
		System.out.println("El caballo ganador es " + caballos[posicionCaballo].getNombre() + " con una distancia de " + caballos[posicionCaballo].getDistanciaRecorrida());
		return caballos[posicionCaballo];
	}
}
