package curso.java.poo.carreracaballos;

import curso.java.poo.carreracaballos.pojo.Caballo;
import curso.java.poo.carreracaballos.pojo.Carrera;

public class Hipodromo {
	public static void main(String[] args) {
		Hipodromo h1 = new Hipodromo();
		
		h1.jugar();
		
	}

	private void jugar() {
		
		Caballo caballo1 = new Caballo("Rayito", 11, 2, 3, 6);
		Caballo caballo2 = new Caballo("Calcetines", 1, 2, 3, 6);
		
		Caballo[] caballos = {caballo1, caballo2};
		Carrera c1 = new Carrera("Carrera1", 15, caballos);
		
		c1.iniciarCarrera();
	}
	
}
