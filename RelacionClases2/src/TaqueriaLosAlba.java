//Título: TaqueriaLosAlba
//Fecha: 11/09/2019
//Autor: José María Alba
//Descripción: Clase TaqueriaLosAlba
//Keywords: relación de clases

public class TaqueriaLosAlba {

	public static void main(String[] args) {
		
		Barra barra = new Barra();
		barra.llenar();
		
		Guiso guiso = new Guiso("Pastor", true, (short)1);
		
		Taco pastor = new Taco();
		pastor.setEsDoble(false);
		pastor.setGuiso(guiso);
		pastor.setTipo("Blando");
		pastor.setTortilla(obtenerTortillas(2));
		
		Topping cilantro = barra.obtenerTopping("Cilantro");
		Topping cebolla = barra.obtenerTopping("Cebolla");
		Topping salsa = barra.obtenerTopping("Salsa verde");
		
		Topping [] extras = new Topping[3];
		extras[0] = cilantro;
		extras[1] = cebolla;
		extras[2] = salsa;
		
		pastor.setToppings(extras);
		
		System.out.println(FormateadorTaco.formatoOrden(pastor));

	}

	public static Tortilla[] obtenerTortillas(int cantidad) {
		Tortilla [] tortillas = new Tortilla[cantidad];
		for(int i=0; i < cantidad; i++) {
			tortillas[i] = new Tortilla("Masa", "Amarilla",'G', true);
		}
		return tortillas;
	}
	
}
