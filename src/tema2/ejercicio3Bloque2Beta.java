package tema2;

import javax.swing.JOptionPane;

public class ejercicio3Bloque2Beta {
	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("Introduce el radio de la circunferencia");
		float radio = Float.parseFloat(str);
		
		str = JOptionPane.showInputDialog("Introduce el valor del cateto 1");
		float cat1 = Float.parseFloat(str);
		
		str = JOptionPane.showInputDialog("Introduce el valor del cateto 2");
		float cat2 = Float.parseFloat(str);
		
		str = JOptionPane.showInputDialog("Introduce el valor de la base");
		float base = Float.parseFloat(str);
		
		str = JOptionPane.showInputDialog("Intruduce el valor de la altura");
		float altura = Float.parseFloat(str);
		
		str = JOptionPane.showInputDialog("Elige 1 si quieres calcular la hipotenusa. " + 
		"Elige 2 si quieres calcular la superficie de la circunferencia. " + 
		"Elige 3 si quieres calcular el per�metro de la circunferencia. " + 
		"Elige 4 si quieres calcular la superficie del rect�ngulo. " + 
		"Elige 5 si quieres calcular la superficie del tri�ngulo. "	+ 
		"Elige 0 para salir. ");
		
		int caso = Integer.parseInt (str);
		
		switch (caso) {
		case 0:
			return;
			
		case 1:
			System.out.println("El valor de la hipotenusa correspondiente a ese tri�ngulo"
					+ "es: " + (Math.sqrt(Math.pow(cat1, 2) + Math.pow(cat2, 2))));
			break;
			
		case 2:
			System.out.println("La superficie de la circunferencia es: " + 
					(Math.PI* Math.pow(radio, 2)));
			break;
			
		case 3:
			System.out.println("El per�metro de la circunferencia es: " + 
					(Math.PI*radio*2));
			break;
			
		case 4:
			System.out.println("La superficie del rect�ngulo es: " + (base * altura));
		    break;
		    
		case 5:
			System.out.println("La superficie del tri�ngulo es: " + ((base*altura)/2));
		    break;
		    
		default:
			System.out.println("No te pases de guay!!!");
		}
	
	}
}
