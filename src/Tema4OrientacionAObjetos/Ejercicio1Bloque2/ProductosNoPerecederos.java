/**
 * 
 */
package Tema4OrientacionAObjetos.Ejercicio1Bloque2;

/**
 * @author anita
 *
 */
public class ProductosNoPerecederos extends Productos {

	
	
	/**
	 * 
	 */
	public ProductosNoPerecederos() {
		super();
	}

	/**
	 * @param codigo
	 * @param nombre
	 * @param precio
	 */
	public ProductosNoPerecederos(int codigo, String nombre, float precio) {
		super(codigo, nombre, precio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return  nombre + " con precio: " + precio + " y su código es: " + codigo;
	}
	
	

}
