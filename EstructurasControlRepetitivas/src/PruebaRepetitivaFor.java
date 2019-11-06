//Título: Prueba Repetitiva For
//Fecha: 04/09/2019
//Autor: José María Alba
//Descripción: 

import java.util.Scanner;

public class PruebaRepetitivaFor {
	
	public static void main (String [] args) {
		int contador = 0;
		int numSaludos = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("¿Cuántas veces quieres que te salude? ");
		numSaludos = scanner.nextInt();
		
		for(contador = 1; contador <= numSaludos; contador++) {
			System.out.println("¡Hola!");
		}
	}
}
