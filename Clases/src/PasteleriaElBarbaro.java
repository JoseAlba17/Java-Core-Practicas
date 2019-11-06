import java.util.Random;

public class PasteleriaElBarbaro {

	public static void main (String [] args) {
		
		//Instanciación de un objeto (crear un objeto del tipo de una clase)
		MaquinaPastel maq1 = new MaquinaPastel();
		MaquinaPastel oster = new MaquinaPastel();
		
		//Instanciación de un objeto con sobrecarga de contructores
		MaquinaPastel maquinita = new MaquinaPastel(500,40);
		maquinita.encender();
		
		//Acceso estático
		maq1.setCantidadGas(MaquinaPastel.CANTIDAD_GAS_MAX); //
		maq1.encender();
		maq1.abastecerGas();
		Pastel pastel = maq1.hornear("Fresa",'S',"Panditas");
		envolver(pastel);
		
		oster.setCantidadGas(MaquinaPastel.CANTIDAD_GAS_MAX); //
		oster.encender();
		oster.abastecerGas();
		Pastel pastel2 = oster.hornear("Chocolate",'M', "Chocoretas");
		envolver(pastel);
		
		//Activar Ejemplo advanced challenge
		pedirPastelesGeneration(maq1, 27);
		
		if(!oster.isEncendida()) {
			oster.encender();
		}
		
		System.out.println("Fin del día");
		System.out.println("Número de pasteles hechos: " + maq1.getNumeroPasteles());
		maq1.apagar();
	}
	
	public static void envolver (Pastel pastel) {
		
		System.out.println();
		System.out.println("Mostrando pasteles");
		System.out.println("Pastel normal");
		System.out.println("Sabor: " + pastel.getSabor());
		System.out.println("Tamaño: " + pastel.getTamaño());
		System.out.println("Forma: " + pastel.getForma());
		System.out.println("Tiene gluten: " + pastel.hasGluten());
		System.out.println("Número de calorías: " + pastel.getnumCalorias());
		System.out.println("Topping: " + pastel.gettopping());
		System.out.println("Cantidad: " + pastel.getcantidad());
	}
	
	//Ejemplo advanced challenge
	public static void pedirPastelesGeneration(MaquinaPastel maquinaPastel, int cantidadPasteles) {
		String [] sabores = {"Fresa","Mango","Zanahoria", "Chocolate", "Vainilla"};
		char [] tamaños = {'S','M','L','X'};
		String[] toppings = {"Zucaritas","Chocoretas","Chococrispies","Nuez","Glaseado","Fresas","Duraznos"};
		
		Random random = new Random();
		
		for (int i=0; i < cantidadPasteles; i++) {
			maquinaPastel.hornear(sabores[random.nextInt(sabores.length)], tamaños[random.nextInt(tamaños.length)], toppings[random.nextInt(toppings.length)]);
		}
	}
}
