package tema2;

import javax.swing.JOptionPane;

public class ejercicio3Bloque2 {
	public static void main(String[] args) {
		
		String str = JOptionPane.showInputDialog("Para calcular la hipotenusa pulsa 1 " + 
		"Para calcular la superficie de una circunferencia pulsa 2 " +
		"Para calcular el perímetro de una circunferencia pulsa 3 " + 
		"Para calcular el área de un rectángulo pulsa 4 " + 
		"Para calcular el área de un triángulo pulsa 5 " + 
		"Para salir de la aplicación pulsa 0 ");
		
		int caso = Integer.parseInt(str);
		
		 
		
		// if (caso == 0 || caso == 1 || caso == 2 || caso == 3 || caso == 4 || caso == 5) 
		
		// while ( caso !=0) {
			
		
		switch (caso) {
			case 0:
			return;
			
			case 1:
				str = JOptionPane.showInputDialog("Introduce el valor para el cateto 1");
				float cat1 = Float.parseFloat(str);
			
				str = JOptionPane.showInputDialog("Introduce el valor para el cateto 2");
				float cat2 = Float.parseFloat(str);
			
				System.out.println("El valor de la hipotenusa correspondiente a ese triángulo"
					+ "es: " + (Math.sqrt(Math.pow(cat1, 2) + Math.pow(cat2, 2))));
			break;
			
					
			
			
			case 2:
				str = JOptionPane.showInputDialog("Introduce el valor del radio de la circunferencia");
				float radio = Integer.parseInt(str);
			
				System.out.println("La superficie de la circunferencia es: " + 
				(Math.PI* Math.pow(radio, 2)));
			break;
		
			
			case 3:
				str = JOptionPane.showInputDialog("Introduce el valor del radio de la circunferencia");
				float radio2 = Integer.parseInt(str);	
			
				System.out.println("El perímetro de la circunferencia es: " + 
				(Math.PI*radio2*2));
			
		
			
			case 4:
				str = JOptionPane.showInputDialog("Introduce el valor de la base");
				float base = Float.parseFloat(str);
			
				str = JOptionPane.showInputDialog("Introduce el valor de la altura");
				float altura = Float.parseFloat(str);
			
				System.out.println("La superficie del rectángulo es: " + (base * altura));
		    break;
		
			case 5:
				str = JOptionPane.showInputDialog("Introduce el valor de la base");
				float base2 = Float.parseFloat(str);
			
				str = JOptionPane.showInputDialog("Introduce el valor de la altura");
				float altura2 = Float.parseFloat(str);
			
				System.out.println("La superficie del triángulo es: " + ((base2*altura2)/2));
		    break;
		
		default:
			System.out.println("Opción incorrecta");
			
		
		
		}
		
		
	
		
		
		
		
		
	}

}
