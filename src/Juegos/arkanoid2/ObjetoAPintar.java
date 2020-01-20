package Juegos.arkanoid2;

import java.awt.Color;
import java.awt.Graphics;

public abstract class ObjetoAPintar {
	protected static String nombre;
	protected  int xCoord;
	protected  int yCoord;
	protected int ancho, alto;
	
	

	/**
	 */
	public ObjetoAPintar() {
		super();
	
	}
	
	/**
	 * Pintar que van a heredar
	 */
	public abstract void paint(Graphics g);
	public abstract void seMueve();


	

	@Override
	public String toString() {
		return "ObjetosAPintar [nombre=" + nombre + ", xCoord=" + xCoord + ", yCoord=" + yCoord
				+ ", ancho=" + ancho + ", alto=" + alto + ", getNombre()=" + getNombre() 
				+ ", getxCoord()=" + getxCoord() + ", getyCoord()=" + getyCoord() + ", getAncho()=" + getAncho()
				+ ", getAlto()=" + getAlto() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
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

	

	

	/**
	 * @return the xCoord
	 */
	public int getxCoord() {
		return xCoord;
	}

	/**
	 * @param xCoord the xCoord to set
	 */
	public void setxCoord(int xCoord) {
		this.xCoord = xCoord;
	}

	/**
	 * @return the yCoord
	 */
	public int getyCoord() {
		return yCoord;
	}

	/**
	 * @param yCoord the yCoord to set
	 */
	public void setyCoord(int yCoord) {
		this.yCoord = yCoord;
	}

	/**
	 * @return the ancho
	 */
	public int getAncho() {
		return ancho;
	}

	/**
	 * @param ancho the ancho to set
	 */
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	/**
	 * @return the alto
	 */
	public int getAlto() {
		return alto;
	}

	/**
	 * @param alto the alto to set
	 */
	public void setAlto(int alto) {
		this.alto = alto;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
