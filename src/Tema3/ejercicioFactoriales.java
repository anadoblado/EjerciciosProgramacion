package Tema3;

import javax.swing.JOptionPane;

public class ejercicioFactoriales {

	public static void main(String[] args) {
		// calcular los factoriales de un número introducido
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número del que quieras obtener sus factoriales"));
		int numeroPorAnterior = numero;
	
		for (int i = numero - 1;i > 1 ;i--) {
			numeroPorAnterior *= i;
		}
		System.out.println("El producto de sus factores es: "+ numeroPorAnterior);
		

	}

}
