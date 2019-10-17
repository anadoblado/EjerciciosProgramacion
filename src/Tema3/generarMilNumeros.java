package Tema3;

public class generarMilNumeros {

	public static void main(String[] args) {
		// Generar mil números y sacar: el mayor, el menor, la suma y la media
		
		int mayor = 0, menor =0;
		int suma = 0, media = 0;
		
		
		for (int i=1; i<1001; i++) {
		int num = (int)(Math.round(Math.random()*1000));
		suma = suma + num;
		media = suma/i;
		
		if (i == 0) {
			mayor = num;
			menor = num;
		
		}
			if (num>mayor) {
				mayor = num;
			}
			if (num<menor) {
				menor = num;
			}
		
		

		}
		System.out.println("El mayor es: " + mayor );
		System.out.println("El menor es : " + menor);
		System.out.println("La suma es: " + suma);
		System.out.println("La media es: " + media);
		
		
	}

}
