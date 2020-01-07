package VideojuegoFormulaUno;

import java.awt.Color;
import java.awt.Graphics;
import java.util.List;

public class Moto extends Vehiculo {

	public Moto(String nombre, int numeroPista, Color color) {
		super(nombre, numeroPista, color);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Aquí se pinta la moto, es un rectángulo verde
	 */
	@Override
	public void paint(Graphics g) {
		this.getP().paint(g);
		this.paintMe(g);
	}
	@Override
	public void paintMe(Graphics g) {
		g.setColor(this.getColor());
		g.fillOval(this.getPosicion()*PintaCarrera.getJframeWidth()/100, this.getyCoord()+20, 50, 50);
		System.out.println("Estoy en la posición " + this.getPosicion() + "," + this.getyCoord() + " " + this.getNombre());
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
