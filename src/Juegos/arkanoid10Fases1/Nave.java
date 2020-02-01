package Juegos.arkanoid10Fases1;

import java.awt.Graphics;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;


public class Nave extends ObjetoAPintar implements KeyListener, MouseMotionListener, MouseListener {

	private BufferedImage image;
	protected boolean left, right, space, BOTTON1; // booleanos que generan el movimiento de la nave
	protected int vx;
	protected static final int SPEED = 10;
	private int contador = 0;
	private long startTime;
	private long usedTime;
	private int contadorTime = 0;
	
	public Nave() {
		// definimos las coordenadas para comenzar el juego
		this.xCoord = 250;
		this.yCoord = 700;
		image = SpritesRepository.getInstance().getSprite("nave-50x15.png");
		this.ancho = this.image.getWidth();
		this.alto = this.image.getHeight();
		startTime = System.currentTimeMillis();
	}

	

	@Override
	public void paint(Graphics2D g) {
		drawImage(g);
		
	}
	
	private void drawImage(Graphics g) {
		g.drawImage(this.image, this.xCoord, this.yCoord, null);
		
	}
	
//	public void primerPunto() {
//		PuntoAltaPrecision p = new PuntoAltaPrecision(this.xCoord,this.yCoord);
//				//PintaArkanoid.getInstance().getBall().getxCoord(), PintaArkanoid.getInstance().getBall().getyCoord());
//		TrayectoriaRecta t = new TrayectoriaRecta(1.7f, p, false);
//		PintaArkanoid.getInstance().getBall().setP(p);
//		PintaArkanoid.getInstance().getBall().setT(t);
//	}

	@Override
	public void seMueve() {
		usedTime = System.currentTimeMillis() - startTime;
		

//		
//		// la nave se mueve de forma horizontal
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
		case KeyEvent.VK_SPACE: space = true;
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
		if(left) {
			vx = -SPEED;
			space = false;
		}
		if(right) {
			vx = SPEED;
			space = false;
		}
		if(space) {
			PintaArkanoid.getInstance().getBall().setContador(1);;
			PintaArkanoid.getInstance().ball.lanzarPelota();
			//sonido
			}
		//if(BOTTON1) {PintaArkanoid.getInstance().ball.seMueve();}
		
	}



	/**
	 * @return the bOTTON1
	 */
	public boolean isBOTTON1() {
		return BOTTON1;
	}



	/**
	 * @param bOTTON1 the bOTTON1 to set
	 */
	public void setBOTTON1(boolean bOTTON1) {
		BOTTON1 = bOTTON1;
	}



	@Override
	public void keyReleased(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_RIGHT: right = false;
		break;
		case KeyEvent.VK_LEFT: left = false;
		break;
		//case KeyEvent.VK_SPACE: space = false;
		//break;
		
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



	/**
	 * @return the space
	 */
	public boolean isSpace() {
		return space;
	}



	/**
	 * @param space the space to set
	 */
	public void setSpace(boolean space) {
		this.space = space;
	}



	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getButton()==MouseEvent.BUTTON1 && contador == 0) {
			contador++;
			
			PintaArkanoid.getInstance().getBall().lanzarPelota();
			//sonido
			
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
		
	}



	



	

}
