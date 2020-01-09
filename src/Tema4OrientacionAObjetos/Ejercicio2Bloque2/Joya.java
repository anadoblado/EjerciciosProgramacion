package Tema4OrientacionAObjetos.Ejercicio2Bloque2;

public class Joya extends Antiguedad {

	public Joya() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @param nombre
	 * @param anoFabricacion
	 * @param origen
	 * @param precio
	 */
	public Joya(String nombre, String anoFabricacion, String origen, String precio) {
		super(anoFabricacion, origen, precio, nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "La joya: " + nombre + " originaria de: " + origen + "fabricado en el año: " + anoFabricacion + "valorada en: " + precio;
	}
	
	

}
