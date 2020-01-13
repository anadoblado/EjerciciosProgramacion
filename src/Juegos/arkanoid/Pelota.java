package Juegos.arkanoid;

import java.awt.Color;
import java.awt.Graphics;

public class Pelota extends ObjetoAPintar {

	private static Pelota instance = null;
	
	public Pelota(String nombre) {
		super();
	}

	@Override
	public void paint(Graphics g) {
		
		g.setColor(Color.gray);
		
		g.fillOval(xCoord, yCoord, 15, 15);
		
		
	}
	
	public void seMueve() {
		
		xCoord += (int)((Math.random()-(1/2))*PintaArkanoid.getJframeWidth()/2);
		yCoord += (int)((Math.random()-(1/2))*PintaArkanoid.getJframeHeight()/2);
		
		if (xCoord>PintaArkanoid.getJframeWidth()) {
			xCoord = PintaArkanoid.getJframeWidth();
			
		}
		if (yCoord>PintaArkanoid.getJframeHeight()) {
			yCoord = PintaArkanoid.getJframeHeight();
			
		}
		
	}
	

	@Override
	public String toString() {
		return "Pelota [nombre=" + nombre + ", xCoord=" + xCoord + ", yCoord=" + yCoord + ", ancho=" + ancho + ", alto="
				+ alto + ", toString()=" + super.toString() + ", getNombre()=" + getNombre() + ", getxCoord()="
				+ getxCoord() + ", getyCoord()=" + getyCoord() + ", getAncho()=" + getAncho() + ", getAlto()="
				+ getAlto() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	

	/**
	 * 
	 * @return
	 */
	public static Pelota getInstance() {
		if (instance == null) {
			instance = new Pelota (nombre);
		}
		return instance;
	}

	/**
	 * 
	 * @param instance
	 */
	public static void setInstance(Pelota instance) {
		Pelota.instance = instance;
	}
	

}
