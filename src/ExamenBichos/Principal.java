package ExamenBichos;

import java.io.ObjectInputStream.GetField;

import javax.print.attribute.standard.Finishings;

public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		CampoDeBatalla batalla = new CampoDeBatalla("EstrellaDeLaMuerte");
		
		
		do {
			
			batalla.getPrimerBichoVivoEnArray(batalla.battleDroid).recibirTrallazo();
			batalla.getPrimerBichoVivoEnArray(batalla.trooper).recibirTrallazo();
			batalla.mostrarSituacion(batalla.battleDroid);
			batalla.mostrarSituacion(batalla.trooper);
			System.out.println("");
			
		} while (!batalla.finDeJuego());
		
		if(batalla.getPrimerBichoVivoEnArray(batalla.battleDroid) != null) {
			System.out.println("Han ganado los bichos");
		}
		
		if (batalla.getPrimerBichoVivoEnArray(batalla.trooper) != null) {
			System.out.println("Sobrevivimos");
		}
		System.out.println();
		
		System.out.println("El humano que ha recibido m�s disparos es \n" + batalla.getMasDisparosRecibidos(batalla.trooper));
		System.out.println();
		System.out.println("El bicho que ha recibido m�s disparos es \n" + batalla.getMasDisparosRecibidos(batalla.battleDroid));
		System.out.println();
		System.out.println();
		System.out.println("El humano m�s resistente es \n" + batalla.getMenosDismaposRecibidos(batalla.trooper));
		System.out.println();
		System.out.println("El bicho m�s resiste es \n" + batalla.getMenosDismaposRecibidos(batalla.battleDroid));
		
	}
	

}
