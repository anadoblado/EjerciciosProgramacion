package Tema4OrientacionAObjetos.Ejercicio1Bloque2;

public class ProductosPerecederos extends Productos {
	private String fechaCaducidad;
	
	public ProductosPerecederos () {
		super ();
	}

	/**
	 * 
	 * @param codigo
	 * @param nombre
	 * @param precio
	 * @param fechaCaducidad 
	 */
	public ProductosPerecederos(int codigo, String nombre, float precio, String fechaCaducidad) {
		super(codigo, nombre, precio);
		this.fechaCaducidad = fechaCaducidad;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return  nombre + " " + "precio: " + precio + " " + "con código: "+ codigo + " y fecha de caducidad: " + fechaCaducidad;
	}

	/**
	 * @return the fechaCaducidad
	 */
	public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	/**
	 * @param fechaCaducidad the fechaCaducidad to set
	 */
	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	
	

}
