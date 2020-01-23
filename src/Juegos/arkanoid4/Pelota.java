package Juegos.arkanoid4;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Pelota extends ObjetoAPintar {
	
	protected int vx = 7;
	protected int vy = 7;
	protected final int ANCHO_PELOTA = 15;
	protected final int ALTO_PELOTA = 15;

	private static Pelota instance = null;
	public Rectangle dimensionBall = null;
	
	public Pelota(String nombre) {
		super();
		this.xCoord = 200;
		this.yCoord = 200;
		this.ancho = ANCHO_PELOTA;
		this.alto = ALTO_PELOTA;
	}

	@Override
	public void paint(Graphics2D g) {
		
		g.setColor(Color.gray);
		g.fillOval(xCoord, yCoord, ANCHO_PELOTA, ALTO_PELOTA);
		
		
	}
	
	public void seMueve() {
		/*for (int i = 0; i < 10; i++) {
			xCoord = (int) Math.round(Math.random()*50);
		}*/
		xCoord += vx;
				//(int)((Math.random()-(1/2))*PintaArkanoid.getJframeWidth()/2);
		yCoord += vy;
				//(int)((Math.random()-(1/2))*PintaArkanoid.getJframeHeight()/2);
		
		if (xCoord>PintaArkanoid.getInstance().getWidth() - ANCHO_PELOTA|| xCoord < 0) {
			vx = -vx  ;
			
		}
		if (yCoord>PintaArkanoid.getInstance().getHeight() - ALTO_PELOTA || yCoord < 0) {
			vy = -vy;
			
		}
		
	}
	

	@Override
	public void collisionWith(ObjetoAPintar objetoCollisioned) {
		super.collisionWith(objetoCollisioned);
		
		if (objetoCollisioned instanceof Ladrillo) {
			vx = -vx;
			vy = -vy;
			//System.out.println("Hay colisión" + this.vy);
			
		}
		if (objetoCollisioned instanceof Nave) {
			vx = -vx;
			vy = -vy;
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

	/**
	 * @return the vx
	 */
	public int getVx() {
		return vx;
	}

	/**
	 * @param vx the vx to set
	 */
	public void setVx(int vx) {
		this.vx = vx;
	}

	/**
	 * @return the vy
	 */
	public int getVy() {
		return vy;
	}

	/**
	 * @param vy the vy to set
	 */
	public void setVy(int vy) {
		this.vy = vy;
	}

	/**
	 * @return the dimensionBall
	 */
	public Rectangle getDimensionBall() {
		return dimensionBall;
	}

	/**
	 * @param dimensionBall the dimensionBall to set
	 */
	public void setDimensionBall(Rectangle dimensionBall) {
		this.dimensionBall = dimensionBall;
	}


	
}
