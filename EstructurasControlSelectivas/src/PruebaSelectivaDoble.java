//Título: Prueba Selectiva Doble
//Fecha: 03/09/2019
//Autor: José María Alba
//Descripción:

import java.util.Scanner;

public class PruebaSelectivaDoble {

	public static void main (String [] args) {
		
		int numeroPizzas = 0;
		int pizzasSobrantes = 0;
		Scanner scanner = null;
		
		scanner = new Scanner(System.in);
		
		System.out.println("Número de pizzas: ");
		numeroPizzas = scanner.nextInt();
		
		System.out.println("Una flota de Generation después...");
		
		System.out.println("Número de consumidas: ");
		pizzasSobrantes = numeroPizzas - scanner.nextInt();
		
		scanner.close();
		
		if (pizzasSobrantes <= 3) {
			System.out.println("Una vuelta a Liru Sisa después...");
			pizzasSobrantes+=10;
			System.out.println("Compramos 10 pizzas más. \nAhora tenemos " + pizzasSobrantes + " pizzas!!");
		} else {
			System.out.println("No se hagan de la boca chiquita!!");
		}
	}
}
