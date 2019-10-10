package Tema3;

import javax.swing.JOptionPane;

public class AlMejorDeTres {

	public static void main(String[] args) {
		// gana quien acierte 2
		
		int cara = 1;
		int cruz = 2;
		int tirada = (int)Math.round(Math.random()+1);
		int contadorP = 0;
		int contadorM = 0;
		
		
		
		for(;contadorP != 2 && contadorM != 2;) {
			String src = JOptionPane.showInputDialog("Introduce 1 para cara y 2 para cruz");
			int introducido = Integer.parseInt(src);
			if (tirada == introducido) {
				contadorP++;
			}
			else {
				contadorM++;
		}
			
		
		
		}
		if (contadorP == 2) {
			System.out.println("Has ganado");
		}
		else {
			System.out.println("Has perdido");
		}
		 			
			
		

	

	}

}
