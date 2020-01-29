package Juegos.arkanoid7;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Pelota extends ObjetoAPintar /*implements MouseListener*/ {
	
	protected int vx = 7;
	protected int vy = 7;
	protected final int ANCHO_PELOTA = 15;
	protected final int ALTO_PELOTA = 15;
	
	

	private static Pelota instance = null;
	public Rectangle dimensionBall = null;
	
	public Pelota(String nombre) {
		super();
		
		this.ancho = ANCHO_PELOTA;
		this.alto = ALTO_PELOTA;

	}

	@Override
	public void paint(Graphics2D g) {
		
		g.setColor(Color.gray);
		g.fillOval(xCoord, yCoord, ANCHO_PELOTA, ALTO_PELOTA);
		
		
	}
	/**
	 * el método que hace que se muevan los actores
	 */
	public void seMueve() {
		// TODO: Si toco espacio o pasan 5 seg sin tocar espacio
		//if (PintaArkanoid.getInstance().getNave().isSpace() || PintaArkanoid.getInstance().getNave().isBOTTON1()) {
			
			xCoord += vx;
			yCoord += vy;
		
			if (xCoord>PintaArkanoid.getInstance().getWidth() - ANCHO_PELOTA|| xCoord < 0) {
				vx = -vx  ;		
			}
			if (yCoord>PintaArkanoid.getInstance().getHeight() - ALTO_PELOTA || yCoord < 0) {
				vy = -vy;
				
			}
			
		//}
		//else {
			//this.xCoord = PintaArkanoid.getInstance().getNave().getxCoord() +15;
			//this.yCoord = PintaArkanoid.getInstance().getNave().getyCoord() -15;
		//}
		/*xCoord += vx;
		yCoord += vy;
	
		if (xCoord>PintaArkanoid.getInstance().getWidth() - ANCHO_PELOTA|| xCoord < 0) {
			vx = -vx  ;		
		}
		if (yCoord>PintaArkanoid.getInstance().getHeight() - ALTO_PELOTA || yCoord < 0) {
			vy = -vy;
			
		}*/
		
		
	}
	/**
	 * es el movimiento de la pelota
	 */
	/*public void moverse() {
		xCoord += vx;
		yCoord += vy;
	
		if (xCoord>PintaArkanoid.getInstance().getWidth() - ANCHO_PELOTA|| xCoord < 0) {
			vx = -vx  ;		
		}
		if (yCoord>PintaArkanoid.getInstance().getHeight() - ALTO_PELOTA || yCoord < 0) {
			vy = -vy;
			
		}
		
	}*/
	

	@Override
	public void collisionWith(ObjetoAPintar objetoCollisioned) {
		super.collisionWith(objetoCollisioned);
		
		if (objetoCollisioned instanceof Ladrillo) {
			vx = -vx;
			vy = -vy;
			SoundsRepository.getInstance().playSound(SoundsRepository.EXPLOSION);
			
			
		}
		if (objetoCollisioned instanceof Nave) {
			vx = -vx;
			vy = -vy;
			SoundsRepository.getInstance().playSound(SoundsRepository.REBOTE);
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

	/*@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getButton() == MouseEvent.BUTTON1) {
			this.seMueve();
		}
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}*/

	


	
}
