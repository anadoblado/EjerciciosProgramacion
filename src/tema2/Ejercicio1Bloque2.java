package tema2;

import javax.swing.JOptionPane;

public class Ejercicio1Bloque2 {

	public static void main(String[] args) {
		// Un n�mero que encaja en una de las cuatro categor�as

		String str = JOptionPane.showInputDialog("Introduce un n�mero ");
		int a = Integer.parseInt(str);
		
		
		
		int acNegativos = 0;
		int acBajos = 0;
		int acMedios = 0;
		int acAltos = 0;
		
		if (a < 0) {
			System.out.println("Hay " + (acNegativos + 1) + " n�meros negativos");
		}else {
			if ((a >= 0) && (a < 25)) {
				System.out.println("Hay" + (acBajos + 1) + " n�meros bajos");
			}else {
				if (a >= 25 && a < 250) {
					System.out.println("Hay" + (acMedios + 1) + " n�meros medios");
				}else {
					if (a>=250) {
						System.out.println("Hay" + (acAltos + 1) + " n�meros altos");
					}
				}
			}
		}
		
		
	}

}
