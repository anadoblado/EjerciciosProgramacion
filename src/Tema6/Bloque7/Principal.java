package Tema6.Bloque7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
	
	private static List<TresDigitosEnLaFraseListener> digitosEnLaFraseListener = new ArrayList<TresDigitosEnLaFraseListener>();

	public static void main(String[] args) {
		Perro snoopy = new Perro("Snoopy");
		int contador=0;
		
		
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduce palabras");
			String pantalla = sc.nextLine();
			for (int i = 0; i < pantalla.length(); i++) {
				char palabra = pantalla.charAt(i);
				if(Character.isDigit(palabra)) {
					contador++;				
				}
				if(contador == 3) {
					fireTresDigitosEnLaFraseListener(new TresDigitosEnLaFraseEvent (palabra));
				}
			}
			
			
			
			
		}

	}
	
	

	private static void fireTresDigitosEnLaFraseListener(TresDigitosEnLaFraseEvent tresDigitosEnLaFraseEvent) {
		// TODO Auto-generated method stub
		
	}

}
