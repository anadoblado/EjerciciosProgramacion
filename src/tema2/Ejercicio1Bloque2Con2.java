package tema2;

import javax.swing.JOptionPane;

public class Ejercicio1Bloque2Con2 {
	public static void main(String[] args) {
		// Dos n�meros 	que encajan en alguna de las cuatro categor�as

		String str = JOptionPane.showInputDialog("Introduce un n�mero ");
		int a = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduce un segundo n�mero ");
		int b = Integer.parseInt(str);
		
		int acNegativos = 0;
		int acBajos = 0;
		int acMedios = 0;
		int acAltos = 0;
		
		if ((a < 0)&&(b < 0)) {
			System.out.println("Hay " + (acNegativos + 2) + "n�meros negativos");
		}else {
			if (((a >= 0) && (a < 25)) && (b < 0)) {
				System.out.println("Hay" + (acBajos + 1) + "n�meros bajos y hay " + (acNegativos + 1) + " negativos" ); 
			}else {
				if ((a >= 25 && a < 250) && (b < 0)) {
					System.out.println("Hay" + (acMedios + 1) + "n�meros medios y hay " + (acNegativos + 1) + " negativos");
				}else {
					if ((a>=250) && (b < 0)) {
						System.out.println("Hay" + (acAltos + 1) + "n�meros altos y hay " + (acNegativos + 1) + " negativos");
					}else {
						if (((a >= 0) && (a < 25)) && ((b >= 0) && (b < 25))) {
							System.out.println("Hay " + (acBajos + 2) + "n�meros medios");
						}else {
							if ((a>=250) && ((b >= 0) && (b < 25))) {
								System.out.println("Hay " + (acAltos + 1) + "n�meros altos y hay " + (acBajos + 1) + "n�meros medios");
							}else {
								if ((a >= 25 && a < 250) && (b >= 25 && b < 250)) {
									System.out.println("Hay " + (acAltos + 2) + "n�meros altos");
								}
								
								
							}
							
						}
					}
				}
			}
		}
		
		
	}

}
