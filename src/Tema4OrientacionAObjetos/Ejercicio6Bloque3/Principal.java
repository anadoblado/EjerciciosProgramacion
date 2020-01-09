package Tema4OrientacionAObjetos.Ejercicio6Bloque3;

public class Principal {

	public static void main(String[] args) {
		
		// Primeros platos
		Plato macarranoes = new Plato("Macarrones con tomate", 5f);
		Plato tortilla = new Plato("Tortilla", 3f);
		Plato solomillo = new Plato("Solomillo", 10f);
		Plato pizza = new Plato("Pizza", 7.5f);
		Plato flamenquin = new Plato("Flamenquin", 9f);
		Plato sanJacobo = new Plato("San Jacobo", 11f);
		Plato habicholones = new Plato("Habicholones", 4f);
		
		// Segundos platos
		Plato solomilloRoquefort = new Plato("Solomillo Roquefort", 7f);
		Plato bacalao = new Plato("Bacalao gratinado", 10f);
		Plato lenguado = new Plato("Lenguado", 12f);
		Plato pulpo = new Plato("Pulpo a la gallega", 15f);
		Plato ensalada = new Plato("Ensalada", 5f);
		Plato calamares = new Plato("Calamares rellenos de jamón", 8f);
		
		// Postres
		Plato tartaAbuela = new Plato("Tarta de la abuela", 4f);
		Plato natillas = new Plato("Natillas", 4f);
		Plato tartaQueso = new Plato("Tarta de queso", 4.5f);
		Plato tarta3Chocolates = new Plato("Taras de tres chocolates", 6f);
		Plato fruta = new Plato("Fruta del dia", 3f);
		
		
		//Construimos el menú
		Menu menus[] = new Menu [3];
		menus [0] = new Menu (lenguado, pulpo, fruta);
		menus [1] = new Menu (flamenquin, ensalada, natillas);
		menus [2] = new Menu (flamenquin, solomillo, tarta3Chocolates);
		
		//Imprimo menús con su precio
		for (int i = 0; i < menus.length; i++) {
			System.out.println(menus[i].toString());
			
			System.out.println("Precio: " + menus[i].getPrecio());
		}
		
		

		

		
	}

}
