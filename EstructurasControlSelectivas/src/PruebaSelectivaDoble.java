//T�tulo: Prueba Selectiva Doble
//Fecha: 03/09/2019
//Autor: Jos� Mar�a Alba
//Descripci�n:

import java.util.Scanner;

public class PruebaSelectivaDoble {

	public static void main (String [] args) {
		
		int numeroPizzas = 0;
		int pizzasSobrantes = 0;
		Scanner scanner = null;
		
		scanner = new Scanner(System.in);
		
		System.out.println("N�mero de pizzas: ");
		numeroPizzas = scanner.nextInt();
		
		System.out.println("Una flota de Generation despu�s...");
		
		System.out.println("N�mero de consumidas: ");
		pizzasSobrantes = numeroPizzas - scanner.nextInt();
		
		scanner.close();
		
		if (pizzasSobrantes <= 3) {
			System.out.println("Una vuelta a Liru Sisa despu�s...");
			pizzasSobrantes+=10;
			System.out.println("Compramos 10 pizzas m�s. \nAhora tenemos " + pizzasSobrantes + " pizzas!!");
		} else {
			System.out.println("No se hagan de la boca chiquita!!");
		}
	}
}
