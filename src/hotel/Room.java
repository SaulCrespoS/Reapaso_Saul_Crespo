package hotel;

public class Room {
	private int id;
	private Ambiente ambiente;
	private Cama cama;
	private double precio;
	private boolean disponible;
	
	Room() {
		this(0, "ventana", "individuales");
	}
	
	Room(int id, String ambiente, String cama) {
		this.id = id;
		setAmbiente(ambiente);
		setCama(cama);
		setPrecio();
		disponible = true;
	}
	 
	Room(int id, String ambiente, String cama, boolean disponible) {
		this.id = id;
		setAmbiente(ambiente);
		setCama(cama);
		setPrecio();
		this.disponible = disponible;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Ambiente getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		switch(ambiente.toLowerCase()) {
			case "ventana" -> this.ambiente = Ambiente.VENTANA;
			case "terraza" -> this.ambiente = Ambiente.TERRAZA;
			default -> this.ambiente = Ambiente.VENTANA;
		}
	}
	public Cama getCama() {
		return cama;
	}
	
	public void setCama(String cama) {
		switch(cama.toLowerCase()) {
			case "matrimonio" -> this.cama = Cama.MATRIMONIO;
			case "individuales" -> this.cama= Cama.DOS_INDIVIDUALES;
			default -> this.cama = Cama.DOS_INDIVIDUALES;
		}
	}
	
	public double getPrecio() {
		return precio;
	} 
	public void setPrecio() {
		precio = cama.getBase() + (ambiente.getPrecio() * cama.getMultiplicador());
	}
	
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	
	public String getDisponible() {
		return (isDisponible())? "Disponible.": "No disponible.";
	} 
	
	public String getImporteTotal(int dias) {
		return (dias > 0)? "El precio total de la habitación " + id + " durante " + dias + " días es " + (precio * dias) + " euros." : "Cantidad de días no válida";
	}
	
	
	@Override
	public String toString() {
		return "HABITACION " + id + ":"
				+ "\n\t-" + cama + "\t-" + ambiente
				+"\n\t" + precio + " euros.\t-" + getDisponible();
	}
}