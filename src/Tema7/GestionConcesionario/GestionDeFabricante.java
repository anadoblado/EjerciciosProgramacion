package Tema7.GestionConcesionario;

import java.util.List;

import Tema7.Utils;
import Tema7.GestionConcesionario.modelo.ControladorFabricante;
import Tema7.GestionConcesionario.modelo.ErrorBBDDException;

public class GestionDeFabricante {
	
	public static void menuGestionFabricante() {
		int option = -1;
		do {
			try {
				System.out.println("\n\t\tGESTI�N DE FABRICANTE");
				System.out.println("\n\t\t1.- Listado de fabricantes");
				System.out.println("\n\t\t2.- Alta de fabricante");
				System.out.println("\n\t\t3.- Modificaci�n de fabricante");
				System.out.println("\n\t\t4.- Baja de fabricante");
				System.out.println("\n\t\t0.- Salir");
				System.out.println("\n\t\tElija una opci�n: ");
				
				option = Utils.getIntConsola(0, 4);
				switch (option) {
				case 0:
					break;
				case 1: listado(true);
					break;
				case 2: alta();
					break;
				case 3: modificacion();
					break;
				case 4: baja();
					break;
				}
			} catch (ErrorBBDDException e) {
				System.out.println("\n\tError de acceso a datos " + e.getMessage() + "\n");
				e.printStackTrace();
			}
		} while (option != 0);
	}
	
	/**
	 * 
	 * @param pausaFinal
	 * @throws ErrorBBDDException
	 */
	public static void listado(boolean pausaFinal) throws ErrorBBDDException{
		List<Fabricante> fabricantes = ControladorFabricante.getAll();
		System.out.println("\n\tListado de fabricantes: \n");
		for (Fabricante fab : fabricantes) {
			System.out.println("\t" + fab.toString());
			
		}
		if (pausaFinal) {
			System.out.println("\n\tPulse 'Intro' para continuar");
			Utils.pausa();
		}
	}
	
	/**
	 * 
	 * @throws ErrorBBDDException
	 */
	private static void alta() throws ErrorBBDDException{
		System.out.println("\n\tAlta de fabricante");
		
		Fabricante fab = new Fabricante();
		System.out.println("\nIntroduce el 'CIF' del fabricante");
		fab.setCif(Utils.getStringConsola());
		System.out.println("\nIntroduce el 'Nombre' del fabricante");
		fab.setNombre(Utils.getStringConsola());
		
		ControladorFabricante.almacenar(fab);
		
		System.out.println("\n\tFabricante insertado correctamente. Pulse 'Intro' para continuar");
		Utils.pausa();
	}
	
	/**
	 * 
	 * @throws ErrorBBDDException
	 */
	private static void modificacion() throws ErrorBBDDException{
		System.out.println("\n\tModificaci�n de fabricante\n");
		
		Fabricante fab = seleccionarPorElUsuario();
		
		if (fab != null) {
			System.out.println("\nIntroduzca 'CIF' del fabricante ('Intro' para modificar): ");
			String str = Utils.getStringConsola();
			if(!str.equals("")) fab.setCif(str);
			
			System.out.println("\nIntroduzca 'Nombre' del fabricante ('Intro' para modificar): ");
			str = Utils.getStringConsola();
			if (!str.equals("")) fab.setNombre(str);
			
			ControladorFabricante.almacenar(fab);
			
			System.out.println("\n\tModificado correctamente. Pulse 'Intro' para continuar ");
			Utils.pausa();
		}
		
	}
	
	/**
	 * 
	 * @return
	 * @throws ErrorBBDDException
	 */
	private static Fabricante seleccionarPorElUsuario() throws ErrorBBDDException{
		Fabricante fab = null;
		int id = -2;
		do {
			System.out.println("\n\tIntroduzca ID del fabricante ('-1' para ver el listado, '0' para salir)");
			id = Utils.getIntConsola(-1);
			if(id == -1) {
				listado(false);
			}
			else {
				if(id != 0) {
					fab = ControladorFabricante.get(id);
					if(fab == null) {
						System.out.println("\n\tError. Ha especificado un ID inv�lido.");
					}
				}
			}
			
		} while (fab == null && id != 0);
		return fab;
	}
	
	/**
	 * 
	 * @throws ErrorBBDDException
	 */
	private static void baja()  throws ErrorBBDDException{
		System.out.println("\n\tEliminar registro de fabricantes");
		
		Fabricante fab = seleccionarPorElUsuario();
		
		if(fab != null) {
			System.out.println("\n\t�Realmente quiere eliminar el registro? (S/N)");
			String str = Utils.getStringConsola();
			if(str.equalsIgnoreCase("S")) {
				ControladorFabricante.eliminar(fab);
				System.out.println("\n\tEl registro se elimin� correctamente. Pulsa 'Intro' para continuar");
				Utils.pausa();
			}
		}
	}
	

}
