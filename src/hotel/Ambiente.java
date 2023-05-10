package hotel;

public enum Ambiente {
	VENTANA(5, "Ventana"),
	TERRAZA(10, "Terraza");
	
	private double precio; 
	private String tipo;
	
	Ambiente(int precio, String tipo) {
		this.precio = precio;
		this.tipo = tipo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	@Override
	public String toString() {
		return tipo;
	}
}
/**
 * 
 * M + V = 30
 * M + T = 40
 * I + V = 20
 * I + T = 25
 * 
 * 20 + 10 = 30
 * 20 + 20 = 40
 * 15 + 5 = 20
 * 15 + 10 = 25
 * El Multiplicador está en las camas
 * 
 * 
 * */
 