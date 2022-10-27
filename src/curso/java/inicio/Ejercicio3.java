package curso.java.inicio;

import java.util.Arrays;

import curso.java.funciones.Utils;

public class Ejercicio3 {

	public static void main(String[] args) {
		apartado1();

	}

	private static void apartado1() {
		int numTiradas = Integer.parseInt(Utils.pideValor("Introduzca el numero de veces que see va a lanzar el dado"));
		int numCaras = 6;
		int [] valores = new int[numTiradas];
		
		int max = 0;
		int min = numCaras;
		int total = 0;
		
		for (int i = 0; i < numTiradas; i++) {
			int tirada = Utils.azar(numCaras);
			valores[i] = tirada;
			total += tirada;
			max = Math.max(tirada, max);
			min  = Math.min(tirada, min);
			
		}
		System.out.println(Arrays.toString(valores));
				
		System.out.println("el valor maximo es: " + max);
		System.out.println("el valor minimo es: " + min);
		System.out.println("la media de los valores es: " + (total/numTiradas));
		
		
	}

}
