package VideojuegoFormulaUno;

import java.util.ArrayList;
import java.util.List;

import ExamenObjetos2018.Examen2.Utils;

public class Pista {

	List<Obstaculo> obstaculos = new  ArrayList <Obstaculo>();
	private int longitud = 100;
	
	public Pista() {
		crearObstaculo();
		
	
	}
	
	public void crearObstaculo() {
		for (int i = 0; i < 4; i++) {
			int ale = Utils.numeroAleatorioSimple();
			if (ale < 0.5) {
				obstaculos.add(new Rampa());
			}
			else {
				obstaculos.add(new ManchaAceite());
			}
			System.out.println("el obstaculo " + obstaculos.get(i) + "está en la posición " + obstaculos.get(i).getPosicion());
		}
	}

	/**
	 * @return the obstaculos
	 */
	public List<Obstaculo> getObstaculos() {
		return obstaculos;
	}

	/**
	 * @param obstaculos the obstaculos to set
	 */
	public void setObstaculos(List<Obstaculo> obstaculos) {
		this.obstaculos = obstaculos;
	}

	/**
	 * @return the longitud
	 */
	public int getLongitud() {
		return longitud;
	}

	/**
	 * @param longitud the longitud to set
	 */
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	
	
}

