package ExamenObjetos2018;

public class Principal {

	

	public static void main(String[] args) {
		Baraja baraja = new Baraja();
		
	baraja.imprimir();
	
	baraja.abajoHaciaArriba();
	baraja.imprimir();
	
	baraja.arribaHaciaAbajo();
	baraja.imprimir();
	
	baraja.mezclar();
	baraja.imprimir();
	
	baraja.ordenar();
	baraja.imprimir();

	}

}
