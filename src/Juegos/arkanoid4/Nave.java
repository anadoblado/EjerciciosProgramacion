package Juegos.arkanoid4;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;


public class Nave extends ObjetoAPintar implements KeyListener, MouseMotionListener {

	private BufferedImage image;
	protected boolean left, right; // booleanos que generan el movimiento de la nave
	protected int vx;
	protected static final int SPEED = 10;
	
	public Nave() {
		// definimos las coordenadas para comenzar el juego
		this.xCoord = 250;
		this.yCoord = 700;
		image = SpritesRepository.getInstance().getSprite("nave-50x15.png");
		this.ancho = this.image.getWidth();
		this.alto = this.image.getHeight();
	}

	

	@Override
	public void paint(Graphics2D g) {
		drawImage(g);
		
	}
	
	private void drawImage(Graphics g) {
		g.drawImage(this.image, this.xCoord, this.yCoord, null);
		
	}
	

	@Override
	public void seMueve() {
		// la nave se mueve de forma horizontal
		this.xCoord += this.vx;
		
		// limitar el movimiento para que no se salga de los bordes del canvas
		if(this.xCoord < 0) {
			this.xCoord = 0;
		}
		if(this.xCoord > PintaArkanoid.getInstance().getWidth() - this.getAncho()) {
			this.xCoord = PintaArkanoid.getInstance().getWidth() - this.getAncho();
			
		}
		
	}



	@Override
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_RIGHT: right = true;
		break;
		case KeyEvent.VK_LEFT: left = true;
		break;
		
		default : break;
		}	
		updateSpeed();
		
	}



	/**
	 * Cambios de posición de la nave según se pulsan las teclas izq y der
	 */
	private void updateSpeed() {
		vx = 0;
		if(left) vx = -SPEED;
		if(right) vx = SPEED;
		
	}



	@Override
	public void keyReleased(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_RIGHT: right = false;
		break;
		case KeyEvent.VK_LEFT: left = false;
		break;
		
		default : break;
		}	
		updateSpeed();
	
		
	}
	


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseMoved(MouseEvent e) {
		setxCoord(e.getX());
		
	}

	/**
	 * @return the image
	 */
	public BufferedImage getImage() {
		return image;
	}



	/**
	 * @param image the image to set
	 */
	public void setImage(BufferedImage image) {
		this.image = image;
	}



	/**
	 * @return the left
	 */
	public boolean isLeft() {
		return left;
	}



	/**
	 * @param left the left to set
	 */
	public void setLeft(boolean left) {
		this.left = left;
	}



	/**
	 * @return the right
	 */
	public boolean isRight() {
		return right;
	}



	/**
	 * @param right the right to set
	 */
	public void setRight(boolean right) {
		this.right = right;
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
	 * @return the speed
	 */
	public static int getSpeed() {
		return SPEED;
	}



	protected boolean isMarketParaBorrar() {
		// TODO Auto-generated method stub
		return false;
	}



	



	

}
