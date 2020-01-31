package Juegos.arkanoid10Fases;

public class PuntoAltaPrecision {
	public float x;
	public float y;
	//usamos valores float, porque en las cuentas saldrán decimales

	/**
	 * Constructor
	 * @param x
	 * @param y
	 */
	public PuntoAltaPrecision(float x, float y) {
		this.x = x;
		this.y = y;
		
	}

	@Override
	public String toString() {
		
		return "PuntoAltaPrecision [x = " + x + ", y = " + y + "]";
	}
	

}
