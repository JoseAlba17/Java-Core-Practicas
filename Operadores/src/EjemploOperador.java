//Título: Ejemplo Operador
//Fecha: 03/09/2019
//Autor: José María Alba
//Descripción:

public class EjemploOperador {

	public static void main (String [] args) {
		
		System.out.println("(1 - 1 + 1) = " + (1 - 1 + 1));
		System.out.println("(1 * 6 + 1 - 1) = " + (1 * 6 + 1 - 1));
		System.out.println("(2 / 2 + 1 * 6) = " + (2 / 2 + 1 * 6));
		System.out.println("(5 * 1 * 6 + 10) = " + (5 * 1 * 6 + 10));
		System.out.println("(((1 + 2) * 10) + 5) = " + (((1 + 2) * 10) + 5));
		System.out.println("(3 % 2 + 10 / 2 * 60) = " + (3 % 2 + 10 / 2 * 60));
		System.out.println("");
		System.out.println("1 > 5: " + (1 > 5));
		System.out.println("10 > 3: " + (10 > 3));
		System.out.println("2 == 0: " + (2 == 0));
		System.out.println("2 == 2: " + (2 == 2));
		System.out.println("2 >= 2: " + (2 >= 2));
		System.out.println("1 <= 10: " + (1 <= 10));
		System.out.println("10 != 5: " + (10 != 5));
		System.out.println("10 < 20: " + (10 < 20));
		System.out.println("");
		
		boolean estaApagada = true;
		boolean estaDesconectada = true;
		
		System.out.println((estaApagada && !estaDesconectada)? "Préndela" : "Cámbiala");
		
		boolean estaLloviendo = false;
		boolean tengoDinero = true;
		boolean tengoConQuienSalir = false;
		
		//Vamos a salir
		System.out.println((tengoDinero || tengoConQuienSalir) && !estaLloviendo);
		
		boolean hayPizza = true;
		boolean alcanzarLugar = false;
		boolean tenerHambre = true;
		
		System.out.println(hayPizza && (alcanzarLugar || tenerHambre));
		System.out.println((hayPizza && alcanzarLugar) || tenerHambre);
		
		boolean hayRefresco = false;
		
		System.out.print("¿Iré a comer al comedor? ");
		boolean yaSeArmo = ((hayPizza || hayPizza) && (alcanzarLugar && tenerHambre));
		System.out.println(yaSeArmo? "Ya se armó" : "A mi casa");
		
		int ganasVivir = 0;
		int energia = 1;
		int dinero = 100;
		int amigos = 5;
		int huevosCanasta = 10;
		int bateadas = 5;
		int numBarbaros = 60;
		int numLenguajes = 4;
		
		System.out.println("Sin la programación mis ganas de vivir: " + ganasVivir++);
		System.out.println("Con la programación mis ganas de vivir: " + ganasVivir);
		
		System.out.println("Energía sin comer chilaquiles: " + energia++);
		System.out.println("Energía comiendo chilaquiles con frijoles y huevito: " + energia);
		
		System.out.println("Mi dinero sin pareja: " + dinero);
		System.out.println("Mi dinero con pareja: " + (dinero-=100));
		
		System.out.println("Amigos sin ir a meetups: " + amigos);
		System.out.println("Amigos asistiendo a meetups y haciendo networking: " + (amigos*=5));
		
		System.out.println("Cantidad de huevos de gallina con gallo: " + huevosCanasta);
		System.out.println("Huevos de gallina sin gallo: " + (huevosCanasta/=2));
		
		System.out.println("Bateadas sin tinder: " + bateadas);
		System.out.println("Bateadas con tinder: " + (bateadas+=5));
		
		System.out.println("Bárbaros sin predicar la palabra: " + numBarbaros);
		System.out.println("Bárbaros predicando la palabra de la magia: " + (numBarbaros*=100));
		
		System.out.println("Lenguajes de programación pegándole todo el día: " + numLenguajes--);
		System.out.println("Lenguajes de programación no pegándole y pensando que ya lo sabes todo: " + numLenguajes);
		
		System.out.println("Lenguajes de programación pegándole todo el día: " + numLenguajes);
		System.out.println("Lenguajes de programación no pegándole y pensando que ya lo sabes todo: " + --numLenguajes);
	}
}