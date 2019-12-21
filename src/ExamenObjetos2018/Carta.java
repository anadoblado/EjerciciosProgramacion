package ExamenObjetos2018;

public class Carta {
	
	private int id;
	private int valor;
	private String palo;
	
	

	/**
	 * @param id
	 * @param valor
	 * @param palo
	 */
	public Carta(int id, int valor, String palo) {
		super();
		this.id = id;
		this.valor = valor;
		this.palo = palo;
	}



	@Override
	public String toString() {
		return "Carta [id=" + id + ", valor=" + valor + ", palo=" + palo + "]";
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
	 * @return the valor
	 */
	public int getValor() {
		return valor;
	}



	/**
	 * @param valor the valor to set
	 */
	public void setValor(int valor) {
		this.valor = valor;
	}



	/**
	 * @return the palo
	 */
	public String getPalo() {
		return palo;
	}



	/**
	 * @param palo the palo to set
	 */
	public void setPalo(String palo) {
		this.palo = palo;
	}





}
