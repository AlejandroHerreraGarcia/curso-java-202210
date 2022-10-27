package curso.java.poo.maniquis.pojo;

public class Maniqui {
	
	private long id;
	private Camisa camisa;
	private Pantalon pantalon;
	private Vestido vestido;
	
	
	public Maniqui(long id) {
		super();
		this.id = id;
	}


	public Maniqui(long id, Vestido vestido) {
		super();
		this.id = id;
		this.vestido = vestido;
	}


	public Maniqui(long id, Camisa camisa, Pantalon pantalon) {
		super();
		this.id = id;
		this.camisa = camisa;
		this.pantalon = pantalon;
	}

	

	public Camisa getCamisa() {
		return camisa;
	}


	public void setCamisa(Camisa camisa) {
		this.camisa = camisa;
	}


	public Pantalon getPantalon() {
		return pantalon;
	}


	public void setPantalon(Pantalon pantalon) {
		this.pantalon = pantalon;
	}


	public Vestido getVestido() {
		return vestido;
	}


	public void setVestido(Vestido vestido) {
		this.vestido = vestido;
	}


	public long getId() {
		return id;
	}
	
	
	
	public void vestir(Vestido vestido) {
		desvestir();
		this.vestido = vestido;
	}
	
	public void vestir(Camisa camisa, Pantalon pantalon) {
		desvestir();
		this.camisa = camisa;
		this.pantalon = pantalon;
	}
	
	public void desvestir() {
		if (camisa != null) {
			camisa = null;
		}
		if (pantalon != null) {
			pantalon = null;
		}
		if (vestido != null) {
			vestido = null;
		}
	}

}
