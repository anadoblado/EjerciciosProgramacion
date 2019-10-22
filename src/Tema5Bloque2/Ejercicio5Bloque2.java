package Tema5Bloque2;

import javax.swing.JOptionPane;

public class Ejercicio5Bloque2 {

	public static void main(String[] args) {
		// Realiza un ejercicio igual al anterior, pero en el que el usuario 
		//pueda indicar la cantidad de posiciones que deseamos desplazar.
		
		int array[]=new int [5];
		int lugares=Integer.parseInt((JOptionPane.showInputDialog("Di los lugares que se mueve el último número")));
		
		
		for (int i = 0; i < array.length; i++) {
			array[i]=(int)Math.round(Math.random()*100);
			System.out.print(array[i]+" ");
		}
	
		System.out.println(" ");
		int aux = array [array.length-lugares];
		for (int i = 0; i < lugares; i++) {
			aux=array[array.length-1];
			
			for ( i =array.length-1 ; i > 0 ; i--) {
				array[i]=array[i-1];
				array[i-1]=aux;
				
				
				
			}
			
		}
		
		
		
		array[0]=aux;
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.print(array[i] + " ");
		}

	}

}
