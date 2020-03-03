package Tema7.GestionConcesionario;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Venta {

	int id;
	int idCliente;
	int idConcesionario;
	int idCoche;
	String fecha;
	Float precioVenta;
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	public Venta() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param idCliente
	 * @param idFabricante
	 * @param idCoche
	 * @param fecha
	 * @param precioVenta
	 */
	public Venta(int id, int idCliente, int idConcesionario, int idCoche, String fecha, Float precioVenta) {
		super();
		this.id = id;
		this.idCliente = idCliente;
		this.idConcesionario = idConcesionario;
		this.idCoche = idCoche;
		this.fecha = fecha;
		this.precioVenta = precioVenta;
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
	 * @return the idCliente
	 */
	public int getIdCliente() {
		return idCliente;
	}

	/**
	 * @param idCliente the idCliente to set
	 */
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	/**
	 * @return the idFabricante
	 */
	public int getIdConcesionario() {
		return idConcesionario;
	}

	/**
	 * @param idFabricante the idFabricante to set
	 */
	public void setIdConcesionario(int idConcesionario) {
		this.idConcesionario = idConcesionario;
	}

	/**
	 * @return the idCoche
	 */
	public int getIdCoche() {
		return idCoche;
	}

	/**
	 * @param idCoche the idCoche to set
	 */
	public void setIdCoche(int idCoche) {
		this.idCoche = idCoche;
	}

	/**
	 * @return the fecha
	 */
	public String getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(Date fecha) throws ParseException{
		this.fecha = sdf.format(fecha);
	}

	/**
	 * @return the precioVenta
	 */
	public Float getPrecioVenta() {
		return precioVenta;
	}

	/**
	 * @param precioVenta the precioVenta to set
	 */
	public void setPrecioVenta(Float precioVenta) {
		this.precioVenta = precioVenta;
	}

	/**
	 * @return the sdf
	 */
	public SimpleDateFormat getSdf() {
		return sdf;
	}

	/**
	 * @param sdf the sdf to set
	 */
	public void setSdf(SimpleDateFormat sdf) {
		this.sdf = sdf;
	}

	@Override
	public String toString() {
		return "Ventas [id=" + id + ", idCliente=" + idCliente + ", idFabricante=" + idConcesionario + ", idCoche="
				+ idCoche + ", fecha=" + fecha + ", precioVenta=" + precioVenta + ", sdf=" + sdf + "]";
	}
	
	

}
