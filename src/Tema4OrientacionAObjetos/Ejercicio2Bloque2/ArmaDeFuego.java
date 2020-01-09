package Tema4OrientacionAObjetos.Ejercicio2Bloque2;

public class ArmaDeFuego extends Antiguedad {

	private String epoca;
	private String tamano;
	
	/**
	 * 
	 */
	public ArmaDeFuego() {
		super ();
	}

	/**
	 * 
	 * @param nombre
	 * @param anoFabricacion
	 * @param origen
	 * @param precio
	 * @param tamano
	 * @param epoca
	 */
	public ArmaDeFuego(String nombre, String anoFabricacion, String origen, String precio, String tamano, String epoca) {
		super(nombre, anoFabricacion, origen, precio);
		this.epoca = epoca;
		this.tamano = tamano;
	}

	
	@Override
	public String toString() {
		return "Nombre del artículo: " + nombre + " de la época: " + epoca + " /n" + " con tamaño: " + tamano + " originario de: " + origen +
				" del año: " + anoFabricacion + " y valorado en: " + precio;
	}

	/**
	 * @return the epoca
	 */
	public String getEpoca() {
		return epoca;
	}

	/**
	 * @param epoca the epoca to set
	 */
	public void setEpoca(String epoca) {
		this.epoca = epoca;
	}

	/**
	 * @return the tamano
	 */
	public String getTamano() {
		return tamano;
	}

	/**
	 * @param tamano the tamano to set
	 */
	public void setTamano(String tamano) {
		this.tamano = tamano;
	}

	
	
	
}
