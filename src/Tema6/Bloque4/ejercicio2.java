package Tema6.Bloque4;

import javax.swing.JOptionPane;

public class ejercicio2 {

	public ejercicio2() {
		
	}

	private static void recogerFrase() throws EspaciosEnBlancoException,
                                              MenosDeTresPalabrasException,
                                              SinBombillaException,
                                              PalabraOfensivaException{
		
		String str = JOptionPane.showInputDialog("Introduce una frase con la palabra \"bombilla\"");
		
		// Comprobar si la frase tiene alguna palabra
		if(str.trim().equals("")) {
			throw new EspaciosEnBlancoException("No has metido ninguna palagra");
		}
		
		// Mínimo 3 palabras
		String palabras[] = str.split("[ ]{1,}");
		if (palabras.length < 3) {
			throw new MenosDeTresPalabrasException(3);
		}
		
		// No aparece la palabra bombilla
		if(str.toUpperCase().indexOf("BOMBILLA") == -1) {
			throw new SinBombillaException();
		}
		
		// Metemos un array con una lista de palabras prohibidas, y comprobamos si aparecen en la frase
		String palabrasOfensivas[] = new String[] {"tonto", "tonta", "idiota", "estúpido", "estúpida"};
		for (String palabraChunga : palabrasOfensivas) {
			if (str.toUpperCase().indexOf(palabraChunga) != -1) {
				throw new PalabraOfensivaException("Palabra" + palabraChunga + "encontrada");
			}
		}
		System.out.println("La frase introducida es: " + str);
		
	}
	
	public static void main(String[] args) {
		
			try {
				recogerFrase();
			} catch (EspaciosEnBlancoException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (MenosDeTresPalabrasException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SinBombillaException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (PalabraOfensivaException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		

	}

}
