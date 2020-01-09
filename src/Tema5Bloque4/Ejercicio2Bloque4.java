package Tema5Bloque4;

public class Ejercicio2Bloque4 {

	public static void main(String[] args) {
		//  Crea un array de 20 números enteros generados al azar entre 0 y 10.
		//Analiza el array y calcula el porcentaje (con decimales) de notas aprobadas
		//( >= 5 ) y de notas suspensas.

		int notas[]  = new int[20]; 
		int i, aprobados = 0, suspensos = 0;
		float porcentajeAprobados = 0, porcentajeSuspensos=0;
			
		for ( i = 0; i < notas.length; i++) {//creo el array de las notas
			notas[i]=(int) Math.round(Math.random()*10);
			System.out.println("La nota es: " + notas[i]+" ");
		}
		for (int j = 0; j < notas.length; j++) {//recorro el array para ver los aprobados y suspensos
			if(notas[j] >= 5) {//contamos la cantidad de aprobados
				aprobados++;
		
				
			}else {//contamos los suspensos
				suspensos++;
			}
			
		}
		 porcentajeAprobados=(float) aprobados/20;
		 porcentajeSuspensos = (float) suspensos/20;
		System.out.println("El porcentaje de aprobados es: " +porcentajeAprobados*100+"%");
		System.out.println("El porcentaje de suspenso es: " + porcentajeSuspensos*100+"%");
		
	}

}
