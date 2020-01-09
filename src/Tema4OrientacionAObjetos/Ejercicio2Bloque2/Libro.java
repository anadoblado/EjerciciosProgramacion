/**
 * 
 */
package Tema4OrientacionAObjetos.Ejercicio2Bloque2;

/**
 * @author anita
 *
 */
public class Libro extends Antiguedad {

	private String titulo;
	/**
	 * 
	 */
	public Libro() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @param nombre
	 * @param anoFabricacion
	 * @param origen
	 * @param precio
	 * @param titulo
	 */
	public Libro(String nombre, String anoFabricacion, String origen, String precio, String titulo) {
		super(nombre, anoFabricacion, origen, precio);
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "El libro: " + titulo + " del año: " + anoFabricacion + " es de origen: "+ origen + " y con precio: " + precio;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
	

}
