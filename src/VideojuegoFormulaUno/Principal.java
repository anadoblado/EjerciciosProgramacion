package VideojuegoFormulaUno;

public class Principal {
	

	public static void main(String[] args) {
		Carrera carrera1 = new Carrera();
		
		do {
			carrera1.avanzar();
			
		} while (carrera1.finPartida()==false);
		

	}

}
