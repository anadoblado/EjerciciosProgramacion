package Juegos.arkanoid;

import java.awt.Color;
import java.awt.Graphics;
public class Ladrillo extends ObjetoAPintar{

	protected Color color;
	public Ladrillo(String nombre, Color color) {
		super(nombre);
		this.color = color;
		
	}

	@Override
	public void paint(Graphics g) {
		g.setColor(this.color);
		g.fillRect(xCoord, yCoord, getxCoord(), getAlto());
		
	}

}
