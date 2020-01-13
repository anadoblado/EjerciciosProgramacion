package Juegos.juegoCarrera;

import java.awt.Color;

import java.util.ArrayList;
import java.util.List;


public class Carrera {
	//creo el ArrayList de vehículo
	public List <Vehiculo> vehiculos = new ArrayList<Vehiculo>();
	//creo los vehículos para luego añadirlos
	Vehiculo Fran = new Coche ("Fran", 0, Color.GREEN);
	Vehiculo Arturo = new Moto ("Arturo", 1, Color.BLUE);
	Vehiculo Ana = new Coche ("Ana", 2, Color.RED);
	Vehiculo Antonio = new Moto ("Antonio", 3, Color.ORANGE);
	// Un ArrayList para guadar la dimensión del tacómetro
	private List <Integer> dimensionTacometro = new ArrayList <Integer>();
	//ArrayList que va a contener los vehículo, se añaden según van acabando la carrera
	protected List <Vehiculo> podium = new ArrayList<Vehiculo>();
	
	// creo los vehículos y los mete en el ArrayList
	public Carrera (){
		
		vehiculos.add(Fran);
		vehiculos.add(Antonio);
		vehiculos.add(Arturo);
		vehiculos.add(Ana);

	}
	
	/**
	 * Saca el podium por consola
	 */
	public void imprimirPodium () {
		System.out.println(podium.toString());
	}
	/**
	 * Hace que avancen los vehículos y los muestra
	 */
	public void avanzar () {
		for (int i = 0; i < vehiculos.size(); i++) {
			Vehiculo v = vehiculos.get(i);
			boolean movimiento = v.seMueve();
			System.out.println("El vehículo de " + vehiculos.get(i).getNombre() + " está en la posición " + vehiculos.get(i).getPosicion());
			if(movimiento == false) {
				podium.add(vehiculos.get(i));
				vehiculos.remove(i);
			}
		}
		System.out.println();
	}
	
	/**
	 * Hacemos el fin de partida cuando el ArrayList de vehículos está vacio
	 * @return
	 */
	public boolean finPartida () {
		boolean estaVacio = true;
		return vehiculos.isEmpty();
		
		
		
		
	}
	
	
	/**
	 * Ordena el ArrayList del tacómetro, que marca los turnos que ha necesitado para acabar la carrera
	 */
	public void podium (){
		int menorValor;
		//recorro la lista de vehículos para poder sacar el tamaño de los tacometros, y con ella 
		//hacer los valores en la lista de dimensión del tacómetro, así creo mi lista
		for (int i = 0; i < vehiculos.size(); i++) {
			dimensionTacometro.add(getVehiculos().get(i).tacometro.size());
			
		}
		
		boolean hayIntecambios;
		do {
			hayIntecambios = false;
			
			for (int j = 0; j < dimensionTacometro.size() - 1; j++) {	
				
				if (dimensionTacometro.get(j+1) < dimensionTacometro.get(j)) {
					menorValor = dimensionTacometro.get(j+1);
					dimensionTacometro.add(j+1, dimensionTacometro.get(j));
					dimensionTacometro.add(j, menorValor);
					hayIntecambios = true;
					
				}
			}
			
		} while (hayIntecambios);
		
		}

	
	/**
	 * @return the vehiculos
	 */
	public List<Vehiculo> getVehiculos() {
		return vehiculos;
	}

	/**
	 * @param vehiculos the vehiculos to set
	 */
	public void setVehiculos(List<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}

	/**
	 * @return the fran
	 */
	public Vehiculo getFran() {
		return Fran;
	}

	/**
	 * @param fran the fran to set
	 */
	public void setFran(Vehiculo fran) {
		Fran = fran;
	}

	/**
	 * @return the arturo
	 */
	public Vehiculo getArturo() {
		return Arturo;
	}

	/**
	 * @param arturo the arturo to set
	 */
	public void setArturo(Vehiculo arturo) {
		Arturo = arturo;
	}

	/**
	 * @return the ana
	 */
	public Vehiculo getAna() {
		return Ana;
	}

	/**
	 * @param ana the ana to set
	 */
	public void setAna(Vehiculo ana) {
		Ana = ana;
	}

	/**
	 * @return the antonio
	 */
	public Vehiculo getAntonio() {
		return Antonio;
	}

	/**
	 * @param antonio the antonio to set
	 */
	public void setAntonio(Vehiculo antonio) {
		Antonio = antonio;
	}

	/**
	 * @return the dimensionTacometro
	 */
	public List<Integer> getDimensionTacometro() {
		return dimensionTacometro;
	}

	/**
	 * @param dimensionTacometro the dimensionTacometro to set
	 */
	public void setDimensionTacometro(List<Integer> dimensionTacometro) {
		this.dimensionTacometro = dimensionTacometro;
	}
	
	
}
