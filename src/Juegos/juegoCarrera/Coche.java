package Juegos.juegoCarrera;


import java.awt.Color;
import java.awt.Graphics;
import java.util.List;

public class Coche extends Vehiculo {

	public Coche(String nombre, int numeroPista, Color color) {
		super(nombre, numeroPista, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public boolean seMueve() {
		// TODO Auto-generated method stub
		return super.seMueve();
	}
    
	/**
	 * Pinta el coche
	 */
	@Override
	public void paint(Graphics g) {
		// aquí tenemos el método paint que pinta al coche y a la pista
		this.getP().paint(g);
		this.paintMe(g);
	}
	
	public void paintMe(Graphics g){
		// pinta sólo el coche
		g.setColor(this.getColor());
		g.fillRect((this.getPosicion()*PintaCarrera.getJframeWidth()/100)+10, this.getyCoord()+35, 30, 20);
		g.fillRect((this.getPosicion()*PintaCarrera.getJframeWidth()/100), this.getyCoord()+50, 50, 20);
		g.setColor(Color.BLACK);
		g.fillRect((this.getPosicion()*PintaCarrera.getJframeWidth()/100)+13, this.getyCoord()+37, 20, 15);
		g.fillOval((this.getPosicion()*PintaCarrera.getJframeWidth()/100)+30, this.getyCoord()+65, 15, 15);
		g.fillOval((this.getPosicion()*PintaCarrera.getJframeWidth()/100)+5, this.getyCoord()+65, 15, 15);
	
		System.out.println("Estoy en la posición " + this.getPosicion() + "," + this.getyCoord() + " " + this.getNombre());
		

	}

	

	@Override
	public void imprimirTacometro() {
		// TODO Auto-generated method stub
		super.imprimirTacometro();
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return super.getNombre();
	}

	@Override
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		super.setNombre(nombre);
	}

	@Override
	public int getPosicion() {
		// TODO Auto-generated method stub
		return super.getPosicion();
	}

	@Override
	public void setPosicion(int posicion) {
		// TODO Auto-generated method stub
		super.setPosicion(posicion);
	}

	@Override
	public Color getColor() {
		// TODO Auto-generated method stub
		return super.getColor();
	}

	@Override
	public void setColor(Color color) {
		// TODO Auto-generated method stub
		super.setColor(color);
	}

	@Override
	public Pista getP() {
		// TODO Auto-generated method stub
		return super.getP();
	}

	@Override
	public void setP(Pista p) {
		// TODO Auto-generated method stub
		super.setP(p);
	}

	@Override
	public List<Integer> getTacometro() {
		// TODO Auto-generated method stub
		return super.getTacometro();
	}

	@Override
	public void setTacometro(List<Integer> tacometro) {
		// TODO Auto-generated method stub
		super.setTacometro(tacometro);
	}
	
}
