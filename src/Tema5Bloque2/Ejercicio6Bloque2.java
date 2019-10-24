package Tema5Bloque2;

import javax.swing.JOptionPane;

public class Ejercicio6Bloque2 {

	public static void main(String[] args) {
		// Realiza un ejercicio igual al anterior, 
		//en el que el usuario también pueda deteminar la dirección del movimiento.
		int array[]=new int [7];
				
		for (int i = 0; i < array.length; i++) {
			array[i]=(int)Math.round(Math.random()*100);
			System.out.print(array[i]+" ");
			
		}
		
		System.out.println(" ");
		int lugares=Integer.parseInt((JOptionPane.showInputDialog("Di los lugares que se mueve el último número")));
		int direccion=Integer.parseInt((JOptionPane.showInputDialog("Di la dirección hacia donde se deplaza, "
				+ "siendo 1 si es a la derecha y 0 a la izquierda")));
		
		
		switch(direccion) {
		case 0:
			for (int j = 0; j < lugares; j++) {
				int	aux=array[0];
				
				for (int i =0 ; i <array.length-1 ; i++) {
					array[i]=array[i+1];
					array[i+1]=aux;
						
				}
				array[array.length-1]=aux;
			}
			for (int i = 0; i < array.length; i++) {
				
				System.out.print(array[i] + " ");
			}
			break;
		case 1:
			for (int j = 0; j < lugares; j++) {
				int	aux=array[array.length-1];
				
				for (int i =array.length-1 ; i > 0 ; i--) {
					array[i]=array[i-1];
					array[i-1]=aux;
						
				}
				array[0]=aux;
			}
			for (int i = 0; i < array.length; i++) {
				
				System.out.print(array[i] + " ");
			}
			break;
		}

	}

}
