package Tema3;

import javax.swing.JOptionPane;

public class Ejercicio3Bloque1 {

	public static void main(String[] args) {
		// pedir numeros al usuario, introducirlos y sacar los positivos y negativos
		
        String str = JOptionPane.showInputDialog("Introduce la cantidad de números");
        int cantidad = Integer.parseInt(str);
        
        int i;
        int positivos = 0;
        int negativos = 0;
        
        for (i=0; i < cantidad; i++) {
        	str = JOptionPane.showInputDialog("Introduce un número");
        	int numeros = Integer.parseInt(str);
        	
        	if (numeros>0) {
        		positivos++;
        		
        	}else {
        		
        		negativos++;
        		
        	}
        	
        }
        
        System.out.println("Hay: "  + positivos +  "  números positivos");
        System.out.println("Hay: " + negativos + " números negativos");

	}

}
