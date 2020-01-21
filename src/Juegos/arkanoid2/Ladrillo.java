package Juegos.arkanoid2;

import java.awt.Color;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;


public class Ladrillo extends ObjetoAPintar{

	protected  Color color;
	public static Color COLORES[] = new Color[] {Color.BLACK, Color.BLUE, Color.CYAN, Color.DARK_GRAY, Color.GREEN,
			Color.LIGHT_GRAY, Color.MAGENTA};
	
	public static final int ANCHO_LADRILLO = 40;
	public static final int ALTO_LADRILLO = 20;

	
	public Ladrillo() {
		super();
		this.color = color;
		this.xCoord = xCoord;
		this.yCoord = yCoord;
		
	}

	@Override
	public void paint(Graphics g) {
		g.setColor(getColor());
		g.fillRect(xCoord, yCoord, ANCHO_LADRILLO, ALTO_LADRILLO);
		g.setColor(Color.white);
		g.drawRect(xCoord, yCoord, ANCHO_LADRILLO, ALTO_LADRILLO);
		
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

	/**
	 * @return the anchoLadrillo
	 */
	public static int getAnchoLadrillo() {
		return ANCHO_LADRILLO;
	}

	/**
	 * @return the altoLadrillo
	 */
	public static int getAltoLadrillo() {
		return ALTO_LADRILLO;
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
		}
	}

	

	
}
