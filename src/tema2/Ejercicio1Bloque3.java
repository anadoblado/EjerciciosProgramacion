package tema2;

import javax.swing.JOptionPane;

public class Ejercicio1Bloque3 {

	public static void main(String[] args) {
		// pedir una opci�n de los distintos casos
		// realmente ESTE ES EL EJERCICIO 2
		
		//boolean prueba = true;
		//while (prueba) {
		
			String str= JOptionPane.showInputDialog("Intruduce el n�mero \n"
					+ " 1 si quieres una raiz en�sima \n"
					+ " 2 si quieres una potencia \n "
					+ "3 si quieres el resto de la  division \n "
					+ "si quieres que explote elige otro n�mero \n");
			// con el \n saltamos de l�nea
		
			int caso = Integer.parseInt(str);
		
			switch (caso) {
			case 0:
				return;
				
			case 1:
				
				// lectura del radicando y del �ndice de la raiz para calcular RAIZ ENESIMA
				
				str = JOptionPane.showInputDialog("Introduce la base");
				float radicando = Float.parseFloat(str);
			
				str = JOptionPane.showInputDialog("Introduce cualquier �ndice");
				float indice = Float.parseFloat(str);
			
				System.out.println("La raiz en�sima es: " + Math.pow(radicando, 1f/indice)); // con 1f lo que hago es que el 1 sea un float
			
				break;
			case 2:
				str = JOptionPane.showInputDialog("Introduce cualquier base");
				float base = Float.parseFloat(str);
			
				str = JOptionPane.showInputDialog("Introduce exponente");
				float exponente = Float.parseFloat(str);
			
				System.out.println("El valor de la potencia es: " + Math.pow(base, exponente));
				break;
			
			case 3:
				str = JOptionPane.showInputDialog("Introduce el dividendo");
				float dividendo = Float.parseFloat(str);
			
				str = JOptionPane.showInputDialog("Introduce el divisor");
				float divisor = Float.parseFloat(str);
			
				System.out.println("El resto de la divisi�n es: " + (dividendo % divisor));
			
				break;
			
			default:
				System.out.println("No doy para mas");
		}
		
		
		
		

	//}
	}

}
