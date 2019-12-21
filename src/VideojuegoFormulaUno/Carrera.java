package VideojuegoFormulaUno;

import java.util.ArrayList;
import java.util.List;


public class Carrera {
	public List <Vehiculo> vehiculos = new ArrayList<Vehiculo>();
	Vehiculo Fran = new Coche ("Fran");
	Vehiculo Arturo = new Moto ("Arturo");
	Vehiculo Ana = new Coche ("Ana");
	Vehiculo Antonio = new Moto ("Antonio");
	
	public Carrera (){
		
		vehiculos.add(Fran);
		vehiculos.add(Antonio);
		vehiculos.add(Arturo);
		vehiculos.add(Ana);

	}
	
	public void avanzar () {
		for (int i = 0; i < vehiculos.size(); i++) {
			vehiculos.get(i).seMueve();
			System.out.println("El vehículo de: " + vehiculos.get(i).getNombre() + " está en la posición " + vehiculos.get(i).getPosicion());
			
		}
		System.out.println();
	}
	
	public void correrCarrera () {
		
	}
	
	public boolean finPartida () {
		for (int i = 0; i < vehiculos.size(); i++) {
			if(vehiculos.get(i).getPosicion() < 100) {
				return false;
			}
		}
		
		return true;
		
		
	}
	
	public void compruebaPosicion (Vehiculo vehiculosVehiculo, Obstaculo obstaculo[]) {
		for (int i = 0; i < vehiculos.size(); i++) {
			if (vehiculos.get(i).getPosicion() == obstaculo[i].getPosicion()) {
				
			}
		}
		
		
	}
	public static void ordenaArray (int array[]) {
		boolean hayIntercambios;
		do {
			hayIntercambios = false;
			// Empieza el algoritmo
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i+1] < array[i]) {
					// Entonces hago un intercambio
					int aux = array[i+1];
					array[i+1] = array[i];
					array[i] = aux;
					hayIntercambios = true;
				}
			}
		} while (hayIntercambios);

	}
	
	public void podium () {
		boolean hayIntercambios;
		for (int i = 0; i < vehiculos.size()-1; i++) {
			if (vehiculos.get(i+1).getPosicion() < vehiculos.get(i).getPosicion()) {
				int aux = vehiculos.get(i+1).getPosicion();
				vehiculos.get(i+1).getPosicion() = vehiculos.get(i).getPosicion;
				
			}
		}
	}
	
}
