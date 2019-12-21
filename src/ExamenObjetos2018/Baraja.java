package ExamenObjetos2018;

import java.util.Arrays;


public class Baraja {
	
	Carta cartas[] = new Carta[52];
	
	
	public Baraja() {
		
		int j= 0;
		
		for (int i = 0; i < 13; i++) {
			cartas[j] = new Carta(j, i+1, "Picas");
			j++;
			
		}
		for (int i = 0; i < 13; i++) {
			cartas[j] = new Carta(j, i+1, "Diamantes");
			j++;
			
		}
		for (int i = 0; i < 13; i++) {
			cartas[j] = new Carta(j, i+1, "Tréboles");
			j++;
		}
		for (int i = 0; i < 13; i++) {
			cartas[j] = new Carta(j, i+1, "Corazones");
			j++;
			
		}
	
	}
	
	/**
	 * 
	 */
	public void imprimir () {
		System.out.println("Baraja");
		for (int i = 0; i < cartas.length; i++) {
			System.out.println(cartas[i]);
		}
		
	}	
		
	/**
	 * 	
	 */
	
	
	public void abajoHaciaArriba () {
		Carta aux = cartas[0];
		for (int i = 1; i < cartas.length; i++) {
			cartas[i-1] = cartas[i];
		}
		cartas[cartas.length - 1] = aux;
	}
	
	/**
	 * 
	 */
	public void arribaHaciaAbajo () {
		Carta aux = cartas[cartas.length-1];
		for (int i = cartas.length-1; i > 0; i--) {
			cartas [i] = cartas [i-1];
			
		}
		cartas[0] = aux;
	}
	
	public void mezclar () {
		
		for (int i = 0; i < 100; i++) {
			int indice1 = (int) Math.round(Math.random()*51);
			int indice2 = (int) Math.round(Math.random()*51);
			
			Carta aux = cartas[indice1];
			cartas [indice1] = cartas [indice2];
			cartas [indice2] = aux;
			
		}
	}
	/**
	 * 
	 */
	public void ordenar () {
		for (int i = cartas.length-1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (cartas[j].getId() > cartas[j+1].getId()) {
					Carta aux = cartas[j];
					cartas [j] = cartas [j+1];
					cartas [j+1] = aux;
					
				}
				
			}
			
		}
	}


	
	
	
	

}
