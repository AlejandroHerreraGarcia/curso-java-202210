package curso.java.poo;

public class MainCliente {

	public static void main(String[] args) {
		// 4 objetos de tipo cliente --> Array --> importe totalde la compra de todos los clientes
		Cliente cliente1 = new Cliente ("Pepe");
		Cliente cliente2 = new Cliente ("Noespepe", "Impostor");
		Cliente cliente3 = new Cliente ("Juan", "Perez", "12345678L");
		Cliente cliente4 = new Cliente ("Eva");
		
		Cliente [] arrayClientes = {cliente1, cliente2, cliente3, cliente4};
 
        cliente1.comprar(20);
		cliente1.comprar(10);
		cliente2.comprar(20);
		cliente3.comprar(50);
		cliente3.comprar(20);
		cliente4.comprar(10);
		
		importeTotalClientes(arrayClientes);
		
		/*
		 * System.out.println(cliente1.getImporteCompra());
		 * System.out.println(cliente2.getImporteCompra());
		 * System.out.println(cliente3.getImporteCompra());
		 * System.out.println(cliente4.getImporteCompra());
		 */

	}
	
	private static void importeTotalClientes(Cliente [] clientes) {
		double totalImporte = 0.0;
		for (Cliente cliente : clientes) {
			totalImporte += cliente.getImporteCompra();
		}
		System.out.println("El total de la compra de todos los clientes es: " + totalImporte);
	}

}
