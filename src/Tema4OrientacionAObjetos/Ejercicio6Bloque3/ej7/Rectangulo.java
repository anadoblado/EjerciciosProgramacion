package Tema4OrientacionAObjetos.Ejercicio6Bloque3.ej7;

public class Rectangulo extends Figuras {
	
	
	
	public Rectangulo(int base, int altura) {
		super(base, altura);

	}

	
	/**
	 * 
	 */
	public void imprimir () {
		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < base; j++) {
				System.out.print(figuraRelleno);
			}
			System.out.println("");			
		}
	}
	

}
