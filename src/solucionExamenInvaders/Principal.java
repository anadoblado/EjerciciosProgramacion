package solucionExamenInvaders;

public class Principal {

	public static void main (String args[]) {
		CampoBatalla campoBatalla = new CampoBatalla("Waterloo");
		
		
		// Comienza el bucle principal del juego
		do {
			// El primer humano dispara al primer malvado
			Malvado primerMalvadoVivo = (Malvado) campoBatalla.getPrimerElementoVivoEnArray(campoBatalla.getMalvados());
			primerMalvadoVivo.recibirDisparo();
			
			// El primer malvado dispara sobre el primer humano vivo
			Humano primerHumanoVivo = (Humano) campoBatalla.getPrimerElementoVivoEnArray(campoBatalla.getHumanos());
			primerHumanoVivo.recibirDisparo();
			
			// Muestro el estado actual de la batalla
			campoBatalla.imprimirSituacionActual();
			
		} while (!campoBatalla.esFinDeJuego());
		
		// determino el ganador de la partida
		if (campoBatalla.quedanElementosVivosEnArray(campoBatalla.getHumanos())) {
			System.out.println("Los humanos ganan");
		}
		else {
			System.out.println("Los malvados ganan");
		}
		
	}
	
}
