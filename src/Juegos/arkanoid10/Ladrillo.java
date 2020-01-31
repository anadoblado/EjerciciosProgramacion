package Juegos.arkanoid10;

import java.awt.Color;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;


public class Ladrillo extends ObjetoAPintar{

	protected  Color color;
	public static Color COLORES[] = new Color[] {Color.BLACK, Color.BLUE, Color.CYAN, Color.DARK_GRAY, Color.GREEN,
			Color.LIGHT_GRAY, Color.MAGENTA};
	
	public final int ANCHO_LADRILLO = 40;
	public final int ALTO_LADRILLO = 20;

	
	public Ladrillo() {
		super();
		this.color = color;
		this.xCoord = xCoord;
		this.yCoord = yCoord;
		this.ancho = ANCHO_LADRILLO;
		this.alto = ALTO_LADRILLO;
	}

	@Override
	public void paint(Graphics2D g) {
		g.setColor(getColor());
		g.fillRect(xCoord, yCoord, ANCHO_LADRILLO, ALTO_LADRILLO);
		g.setColor(Color.white);
		g.drawRect(xCoord, yCoord, ANCHO_LADRILLO, ALTO_LADRILLO);
		g.setColor(Color.black);
		g.drawRect(xCoord+2, yCoord+(ANCHO_LADRILLO/4), ANCHO_LADRILLO-4, 2);
		g.drawRect(xCoord+2, yCoord+(ANCHO_LADRILLO/2), ANCHO_LADRILLO-2, 2);
		
	}
	
	
	

	/**
	 * @return the color
	 */
	public  Color getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(Color color) {
		this.color = color;
	}

	/**
	 * @return the cOLORES
	 */
	public static Color[] getCOLORES() {
		return COLORES;
	}

	/**
	 * @param cOLORES the cOLORES to set
	 */
	public static void setCOLORES(Color[] cOLORES) {
		COLORES = cOLORES;
	}

	@Override
	public void seMueve() {
		// TODO Auto-generated method stub
		
	}

	protected boolean isMarketParaBorrar() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void collisionWith(ObjetoAPintar objetoCollisioned) {
		super.collisionWith(objetoCollisioned);
		if (objetoCollisioned instanceof Pelota) {
			this.setMarketParaBorrar(true);
			this.createExplosion();
		}
	}

	/**
	 * 
	 */
	public void createExplosion () {
		Explosion explota = new Explosion();
		explota.setxCoord(this.xCoord + 10);
		explota.setyCoord(this.yCoord + 5);
		PintaArkanoid.getInstance().addNewObjetoParaLaProximaIteracion(explota);
	}
	

	
}
