package Tema4OrientacionAObjetos.Ejercicio1Bloque2;

public class Tienda {

	public Tienda() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		ProductosPerecederos manzanas = new ProductosPerecederos(12, "manzana", 1, "11-03-2020");
		ProductosPerecederos pan = new ProductosPerecederos(1, "baguette", (float) 0.5, "12-12-2019");
		ProductosNoPerecederos papel = new ProductosNoPerecederos(23, "papel higiénico", (float) 1.49);
		ProductosNoPerecederos gel = new ProductosNoPerecederos(122, "gel la toja", (float) 2.59);
		
		
		
		System.out.println("Tenemos: \n" + manzanas + ", \n" + pan + ", \n" + papel + " \n y " + gel);

	}

}
