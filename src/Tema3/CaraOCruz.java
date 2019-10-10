package Tema3;

import javax.swing.JOptionPane;

public class CaraOCruz {

	public static void main(String[] args) {
		// cara o cruz
		
		int cara = 1;
		int cruz = 2;
		
		int tirada = (int)Math.round(Math.random()+1);
		
		String src = JOptionPane.showInputDialog("Introduce 1 para cara y 2 para cruz");
		int introducido = Integer.parseInt(src);
		
		if (tirada == introducido) {
			System.out.println("Has acertaddo!!!!");
			
		}
		else {
			System.out.println("Has fallado");
		}
			
		 			
			
		

	}

}
