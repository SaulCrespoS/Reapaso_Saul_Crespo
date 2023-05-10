package hotel;

public enum Cama {
	MATRIMONIO(20,2, "Una cama de Matrimonio."),
	DOS_INDIVIDUALES(15,1, "Dos camas individuales.");
	
	private float base;
	private int multiplicador;
	private String tipo;
	
	Cama(int base, int multiplicador, String tipo) {
		this.setBase(base);
		this.setMultiplicador(multiplicador);
		this.tipo = tipo;
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public int getMultiplicador() {
		return multiplicador;
	}

	public void setMultiplicador(int multiplicador) {
		this.multiplicador = multiplicador;
	}
	
	@Override
	public String toString() {
		return this.tipo;
	}


}
	
