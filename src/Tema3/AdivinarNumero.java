package Tema3;

import javax.swing.JOptionPane;

public class AdivinarNumero {

	public static void main(String[] args) {
		// Adivinar n�mero pensado
		
		int numeroPensado = (int) Math.round(Math.random () * 100);
		int numeroIntroducido = -1 ;
			
		for (; numeroIntroducido != numeroPensado;) {
			String mensajeAlUsuario = ""; //as� puedo sacar el string las veces que quiera
			
			if(numeroIntroducido != -1) {
				//para que entre en el bucle
				if (numeroIntroducido > numeroPensado) {
					mensajeAlUsuario = "Mi n�mero pensado es menor a " + numeroIntroducido ;
				}
				else {
					if (numeroIntroducido < numeroPensado) {
						mensajeAlUsuario = "Mi n�mero pensao es mayor a " + numeroIntroducido;
					}
				}
			}
			
		}
		System.out.println("Has acertado!!! El n�mero introducido era: " + numeroIntroducido);

	}

}
