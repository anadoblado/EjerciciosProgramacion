package ExamenDiciembreOO;

import examenA.Utils;

public abstract class Utensilio {
	
	private int id;
	private int suciedad;
	private int durezaSuciedad;
	private int suciedadTotal;
	private int pasadasHastaEstarLimpio;
	
	
	

	
	
	/**
	 * @param id
	 * @param suciedad
	 * @param durezaSuciedad
	 * @param suciedadTotal
	 */
	public Utensilio(int id) {
		super();
		this.id = id;
		this.suciedad = Utils.obtenerNumeroAleatorio(10, 100);
		this.durezaSuciedad = Utils.obtenerNumeroAleatorio(1, 3);
		this.suciedadTotal = suciedad * durezaSuciedad;
		this.pasadasHastaEstarLimpio = 0;
	}

	public void limpiar() {
	}





	public abstract void seRompe ();

}
