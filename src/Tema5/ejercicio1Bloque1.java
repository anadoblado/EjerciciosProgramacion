package Tema5;

import javax.swing.JOptionPane;

public class ejercicio1Bloque1 {

	public static void main(String[] args) {
		/*Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar
		 *  entre un límite inferior y uno superior que debe especificar el usuario. 
		 *  Debes mostrar el array en pantalla para comprobar el funcionamiento*/
		
		/*
		 * PETICION DE LIMITES AL USUARIO
		 * int limiteInf, limiteSup
		 * int array[]= new int[150]
		 * INICIALIZAMOS EL CONTENIDO DEL ARRAY
		 * SNIPPETS pongo for y salen las plantillas
		 *  for(int i=0; i<array.length; i++){
		 *  array [i]= (int)Math.round(Math.random()*(limiteSup-limiteInf)+limiteInf);
		 *  }
		 *  
		 *  IMPRIMIR EN LA CONSOLA EL ARRAY CREADO
		 *  for(int i=0; i<array.length;i++){
		 *  System.out.print(array[i]+ " ")}
		 *  
		 *  IMPRIMO UN SALTO DE LINEA
		 *  System.out.println();
		 *  
		 *  OTRA FORMA DE ITERAR EN EL ARRAY
		 *  for(int num:array){
		 *  Syso(num + "")}*/
		 
		int limiteInf, limiteSup;
		  
		int numeros[] = new int[10];
		limiteInf = Integer.parseInt(JOptionPane.showInputDialog("Introduce límite inferior del intervalo"));
		limiteSup = Integer.parseInt(JOptionPane.showInputDialog("Introduce límite superior del intervalo"));
		
		for(int i=0; i<numeros.length; i++) {
			
			numeros[i]=(int)Math.round(Math.random()*(limiteSup-limiteInf)+limiteInf);
			System.out.print(numeros[i]+" ");
		}

	}

}
