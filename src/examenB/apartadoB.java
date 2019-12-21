package examenB;

import javax.swing.JOptionPane;

public class apartadoB {

	public static void main(String[] args) {
		// Crea una clase con un método “main” que compruebe si un número es primo

		//le pido un número al usuario para comprobar si es primo
		int num=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
		boolean primo=true;
		
		for ( int contador = 2; contador < num; contador++) {//voy incrementando el contador
							
			if (num % contador == 0) {//divido el numero entre el contador para ver si es primo
			primo=false;
				
			}
			
		}
		
		if(primo) {
			System.out.println("El número " + num + " es primo");
		}
		else {
			System.out.println("El número " + num + " no es primo");
		}
	}

}
