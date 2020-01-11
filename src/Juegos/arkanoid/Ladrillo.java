package Juegos.arkanoid;

import java.awt.Color;
import java.awt.Graphics;
public class Ladrillo extends ObjetoAPintar{

	protected static Color color;
	private static Ladrillo instance = null;
	public Ladrillo(Color color, int xCoord, int yCoord) {
		super();
		this.color = color;
		this.xCoord = xCoord;
		this.yCoord = yCoord;
		
	}

	@Override
	public void paint(Graphics g) {
		g.setColor(this.color);
		g.fillRect(xCoord, yCoord, 30, 10);
		
	}
	
	public static Ladrillo getInstance() {
		if (instance == null) {
			instance = new Ladrillo (color, xCoord, yCoord);
		}
		return instance;
	}

	/**
	 * @return the color
	 */
	public static Color getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public static void setColor(Color color) {
		Ladrillo.color = color;
	}

	/**
	 * @param instance the instance to set
	 */
	public static void setInstance(Ladrillo instance) {
		Ladrillo.instance = instance;
	}

	
}
