package Tema7.GestionConcesionario;

public class Fabricante {
	// Creamos los campos que tiena la tabla de Fabricante
	int id;
	String cif;
	String nombre;
	
	public Fabricante() {
		
	}
	
	public Fabricante(int id, String cif, String nombre) {
		super();
		this.id = id;
		this.cif = cif;
		this.nombre = nombre;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the cif
	 */
	public String getCif() {
		return cif;
	}

	/**
	 * @param cif the cif to set
	 */
	public void setCif(String cif) {
		this.cif = cif;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Fabricante [id=" + id + ", cif=" + cif + ", nombre=" + nombre + "]";
	}
	
	

}
