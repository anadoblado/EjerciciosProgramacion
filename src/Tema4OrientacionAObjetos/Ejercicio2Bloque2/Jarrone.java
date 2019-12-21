package Tema4OrientacionAObjetos.Ejercicio2Bloque2;

public class Jarrone extends Antiguedad {

	public Jarrone() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @param nombre
	 * @param anoFabricacion
	 * @param origen
	 * @param precio
	 */
	public Jarrone(String nombre, String anoFabricacion, String origen, String precio) {
		super(nombre, anoFabricacion, origen, precio);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public String toString() {
		return "Nombre del artículo: " + nombre + ", año de fabricación: " + anoFabricacion + " , originario de: " + origen + " y valorado en: " + precio;
	}
	
	

}
