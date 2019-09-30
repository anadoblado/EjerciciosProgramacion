package tema1;

import javax.swing.JOptionPane;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		String str = JOptionPane.showInputDialog("Introduce el Euribor");
		float Euribor = Float.parseFloat(str);
		
		str = JOptionPane.showInputDialog("Introduce el Interés Diferencial");
		float Diferencial = Float.parseFloat(str);
		// Float.parseFloat define la variable en flotante
		
		str = JOptionPane.showInputDialog("Introduce el Capital inicial");
		float Capital = Float.parseFloat(str);
		
		str = JOptionPane.showInputDialog("Introduce el número de cuotas");
		float Ncuotas = Float.parseFloat(str);
		
		
		float Interesanual = Euribor + Diferencial;
		float Im = (Interesanual/12)/100;
		float a = (1+Im);
		double b = Math.pow(a, Ncuotas);
		
		double Cuotamensual = Capital*(Im*(b)/(b-1));    
		

		System.out.println("Cuota mensual: " + Cuotamensual);
		
		

	}

}
