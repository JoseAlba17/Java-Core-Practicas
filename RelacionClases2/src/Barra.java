//Título: Barra
//Fecha: 11/09/2019
//Autor: José María Alba
//Descripción: Clase Barra
//Keywords: relación de clases

public class Barra {

	private Topping [] toppings;
	
	public Barra() {
		
	}
	
	public Barra(Topping [] toppings) {
		this.toppings = toppings;
	}
	
	public void llenar() {
		toppings = new Topping[5];
		toppings[0] = new Topping("Salsa verde", false);
		toppings[1] = new Topping("Salsa roja", true);
		toppings[2] = new Topping("Cebolla", false);
		toppings[3] = new Topping("Cilantro", false);
		toppings[4] = new Topping("Jalapeños", true);
	}
	
	public Topping obtenerTopping(String nombre) {
		Topping prueba = new Topping(nombre,false);
		for(Topping toppings: toppings) {
			if(toppings.equals(prueba)) {
				return toppings;
			}
		}
		return null;
	}
}
