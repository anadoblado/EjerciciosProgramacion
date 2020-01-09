package ExamenObjetos2018.Examen2;

import ExamenObjetos2018.Carta;

public class CampoBatalla {
	
	private String nombre;
	public static int longitudArray = 20;

	Humano humano[] = new Humano[longitudArray];
	Malvado malo[] = new Malvado [longitudArray];
	
	
	/**
	 * @param nombre
	 */
	public CampoBatalla(String nombre) {
		this.nombre = nombre;
		
		for (int i = 0; i < humano.length; i++) {
			
			humano [i] = new Humano ("Humano" +i);
			malo [i] = new Malvado ("Malvado" + i);
			
		}
		
		malo [malo.length-1].setPuntosDeVida(malo[malo.length-1].getPuntosDeVida()*2);
		humano [humano.length-1].setPuntosDeVida(humano[humano.length-1].getPuntosDeVida()*2);
	}
	
	/**
	 * 
	 */
	public void mezclarEquipos () {
		for (int i = 0; i < 100; i++) {
			int indice1 = (int) Math.round(Math.random()*19);
			int indice2 = (int) Math.round(Math.random()*19);
			
			Malvado aux = malo[indice1];
			malo [indice1] = malo [indice2];
			malo [indice2] = aux;
			
		}
		
		for (int i = 0; i < 20; i++) {
			int indice1 = (int) Math.round(Math.random()*19);
			int indice2 = (int) Math.round(Math.random()*19);
			
			Humano aux2 = humano[indice1];
			humano [indice1] = humano [indice2];
			humano [indice2] = aux2;
			
		}
	}

	/**
	 * 
	 */
	public void mostrar () {
		System.out.println("Humano");
		for (int i = 0; i < humano.length; i++) {
			System.out.println(humano[i]);
			
		}
		System.out.println("Malvado");
		for (int i = 0; i < malo.length; i++) {
			System.out.println(malo[i]);
			
		}
	}
	
	public void disparaElHumano () {
		int primerHumanoVivo = 0;
		int primerMaloVivo = 0;
		
		for (int i = 0; i < humano.length; i++) {
			if(humano[i].getPuntosDeVida() > 0) {
				 primerHumanoVivo = i;
				break;
			}
			
		}
		
		for (int i = 0; i < malo.length; i++) {
			if (malo[i].getPuntosDeVida() > 0) {
				 primerMaloVivo = i;
				break;
			}
			
		}
		
		int disparo = (int) Math.round(Math.random()*(25-5))+5;
		int vidaPrevia = malo[primerMaloVivo].getPuntosDeVida();
		malo[primerMaloVivo].setPuntosDeVida(malo[primerMaloVivo].getPuntosDeVida() - disparo);
		
		System.out.println("El humano que dispara es:" + humano[primerHumanoVivo].getNombre() + " dispara a " + malo[primerMaloVivo].getNombre() + 
				" con un disparo de " + disparo +   "\n que tenia " + vidaPrevia + " y le deja " + malo[primerMaloVivo].getPuntosDeVida());
		
	}
	
	public void disparaElMalo () {
		int primerHumanoVivo = 0;
		int primerMaloVivo = 0;
		
		for (int i = 0; i < malo.length; i++) {
			if (malo[i].getPuntosDeVida() > 0) {
				 primerMaloVivo = i;
				break;
			}
			
		}
		
		for (int i = 0; i < humano.length; i++) {
			if(humano[i].getPuntosDeVida() > 0) {
				 primerHumanoVivo = i;
				break;
			}
			
		}
		int disparo = (int) Math.round(Math.random()*(25-5))+5;
		int vidaPrevia = humano[primerHumanoVivo].getPuntosDeVida();
		humano[primerHumanoVivo].setPuntosDeVida(humano[primerHumanoVivo].getPuntosDeVida() - disparo);
		System.out.println("El malo que dispara es:" + malo[primerMaloVivo].getNombre() + " dispara a " + humano[primerHumanoVivo].getNombre() + 
				" con un disparo de " + disparo +   "\n que tenia " + vidaPrevia + " y le deja " + humano[primerHumanoVivo].getPuntosDeVida());
		
	}
	
	public void tiroteo () {
		int totalVivosHumanos = 0;
		int totalVivosMalos = 0;
		
		
		for (int i = 0; i < humano.length; i++) {
			if(humano[i].estaVivo(false)) {
				do {
					disparaElHumano();
					totalVivosHumanos++;
					
					
				} while (humano[i].estaVivo(true));
			
			}
			
		
		
		for (int j = 0; j < malo.length; j++) {
			if (malo[i].estaVivo(false)) {
			
				do {
					disparaElMalo();
					totalVivosMalos++;
					
				} while (malo[i].estaVivo(true));
			}
			
		}
		
		
		
		System.out.println("Los humanos que quedan vivos son " + totalVivosHumanos +"\n Los malos vivos son " + totalVivosMalos);
		
		}
		
		
	}
	
	
		
	
	
	

}
