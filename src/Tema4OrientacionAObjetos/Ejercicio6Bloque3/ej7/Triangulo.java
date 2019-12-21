package Tema4OrientacionAObjetos.Ejercicio6Bloque3.ej7;

public class Triangulo extends Figuras {

	public Triangulo(int base, int algura) {
		super(base, algura);
		
	}
	
	/**
	 * 
	 */
	public void imprimir() {
		int contadorAsteriscosPorFilas = 1;
		for (int i = 0; i < base; i++) {
			for (int j = 0; j < contadorAsteriscosPorFilas; j++) {
				System.out.print(figuraRelleno);
				
			}
			contadorAsteriscosPorFilas++;
			System.out.println("");
			
		}
	}

}
