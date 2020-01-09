package Tema4OrientacionAObjetos.Ejercicio6Bloque3.ej3;

public class Rama extends ElementoDeArbol {

	protected ElementoDeArbol e1;
	protected ElementoDeArbol e2;
	protected ElementoDeArbol e3;
	
	public Rama() {
		super();
	}

	

	/**
	 * @param e1
	 * @param e2
	 * @param e3
	 */
	public Rama(ElementoDeArbol e1, ElementoDeArbol e2, ElementoDeArbol e3) {
		super();
		this.e1 = e1;
		this.e2 = e2;
		this.e3 = e3;
	}


	

	@Override
	public String toString() {
		return "Rama [e1=" + e1 + ", e2=" + e2 + ", e3=" + e3 + ", getElementoDeArbol1()=" + getElementoDeArbol1()
				+ ", getElementoDeArbol2()=" + getElementoDeArbol2() + ", getElementoDeArbol3()="
				+ getElementoDeArbol3() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}



	/**
	 * @return the e1
	 */
	public ElementoDeArbol getE1() {
		return e1;
	}



	/**
	 * @param e1 the e1 to set
	 */
	public void setE1(ElementoDeArbol e1) {
		this.e1 = e1;
	}



	/**
	 * @return the e2
	 */
	public ElementoDeArbol getE2() {
		return e2;
	}



	/**
	 * @param e2 the e2 to set
	 */
	public void setE2(ElementoDeArbol e2) {
		this.e2 = e2;
	}



	/**
	 * @return the e3
	 */
	public ElementoDeArbol getE3() {
		return e3;
	}



	/**
	 * @param e3 the e3 to set
	 */
	public void setE3(ElementoDeArbol e3) {
		this.e3 = e3;
	}



	
	
	

}
