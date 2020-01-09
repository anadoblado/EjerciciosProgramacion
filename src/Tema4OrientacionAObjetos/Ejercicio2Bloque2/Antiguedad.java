package Tema4OrientacionAObjetos.Ejercicio2Bloque2;

public class Antiguedad {

	protected String anoFabricacion;
	protected String origen;
	protected String precio;
	protected String nombre;
	
	/**
	 * 
	 */
	public Antiguedad() {
		super();
		
	}

	/**
	 * @param anoFabricacion
	 * @param origen
	 * @param precio
	 */
	public Antiguedad(String nombre, String anoFabricacion, String origen, String precio) {
		super();
		this.anoFabricacion = anoFabricacion;
		this.origen = origen;
		this.precio = precio;
		this.nombre = nombre;
	}

	
	@Override
	public String toString() {
		return "Antiguedades [anoFabricacion=" + anoFabricacion + ", origen=" + origen + ", precio=" + precio + "]";
	}

	/**
	 * @return the anoFabricacion
	 */
	public String getAnoFabricacion() {
		return anoFabricacion;
	}

	/**
	 * @param anoFabricacion the anoFabricacion to set
	 */
	public void setAnoFabricacion(String anoFabricacion) {
		this.anoFabricacion = anoFabricacion;
	}

	/**
	 * @return the origen
	 */
	public String getOrigen() {
		return origen;
	}

	/**
	 * @param origen the origen to set
	 */
	public void setOrigen(String origen) {
		this.origen = origen;
	}

	/**
	 * @return the precio
	 */
	public String getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	


}
