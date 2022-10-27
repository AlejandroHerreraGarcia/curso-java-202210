package curso.java.poo.maniquis;

import curso.java.poo.maniquis.pojo.Boton;
import curso.java.poo.maniquis.pojo.Camisa;
import curso.java.poo.maniquis.pojo.Maniqui;
import curso.java.poo.maniquis.pojo.Pantalon;
import curso.java.poo.maniquis.pojo.Vestido;

public class Tienda {
	private String nombre;
	
	

	public Tienda(String nombre) {
		super();
		this.nombre = nombre;
	}



	public static void main(String[] args) {
		Tienda t1 = new Tienda("Tienda1");
		Maniqui[] maniquis = t1.crearTienda();
		
		maniquis[1].desvestir();
		maniquis[0].getCamisa().getBotones()[0] = null;
		
		t1.calculaPrecioRopaMajniquis(maniquis);

	}
	
	private void calculaPrecioRopaMajniquis(Maniqui[] maniquis) {
		double totalPrecio = 0;
		for (Maniqui maniqui : maniquis) {
			if (maniqui.getCamisa() != null) {
				totalPrecio +=maniqui.getCamisa().getPrecio();
			}
			if (maniqui.getPantalon() != null) {
				totalPrecio +=maniqui.getPantalon().getPrecio();
			}
			if (maniqui.getVestido() != null) {
				totalPrecio +=maniqui.getVestido().getPrecio();
			}
		}
		System.out.println("El precio de toda la ropa que llevan los naiquies es de " + totalPrecio);
	}
	
	private Maniqui[] crearTienda() {
		Boton boton1 = new Boton("negro", "redondo");
		Boton boton2 = new Boton("negro", "redondo");
		Boton boton3 = new Boton("negro", "redondo");
		Boton boton4 = new Boton("negro", "redondo");
		Boton boton5 = new Boton("negro", "redondo");
		Boton boton6 = new Boton("negro", "redondo");
		
		Boton[] botonesCamisa1 = {boton1, boton2};
		Boton[] botonesCamisa2 = {boton3, boton4, boton5};
		
		Camisa camisa1 = new Camisa("Negra", "L", 60, botonesCamisa1);
		Camisa camisa2 = new Camisa("Negra", "M", 40);
		camisa2.setBotones(botonesCamisa2);
		
		Pantalon pantalon = new Pantalon("Vaquiero", "38", 50, boton6);
		
		Vestido vestido = new Vestido("Verde", "38", 60);
		
		Maniqui maniqui1 = new Maniqui(1);
		Maniqui maniqui2 = new Maniqui(2, vestido);
		
		maniqui1.vestir(camisa1, pantalon);
		
		Maniqui[] maniquis = {maniqui1, maniqui2};
		
		return maniquis;
	}
		
		
}
