package tema2;

import javax.swing.JOptionPane;

public class Ejercicio1Bloque2 {

	public static void main(String[] args) {
		// Un número que encaja en una de las cuatro categorías

		String str = JOptionPane.showInputDialog("Introduce un número ");
		int a = Integer.parseInt(str);
		
		
		
		int acNegativos = 0;
		int acBajos = 0;
		int acMedios = 0;
		int acAltos = 0;
		
		if (a < 0) {
			System.out.println("Hay " + (acNegativos + 1) + " números negativos");
		}else {
			if ((a >= 0) && (a < 25)) {
				System.out.println("Hay" + (acBajos + 1) + " números bajos");
			}else {
				if (a >= 25 && a < 250) {
					System.out.println("Hay" + (acMedios + 1) + " números medios");
				}else {
					if (a>=250) {
						System.out.println("Hay" + (acAltos + 1) + " números altos");
					}
				}
			}
		}
		
		
	}

}
