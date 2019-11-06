//Título: Prueba Repetitiva Do While
//Fecha: 04/09/2019
//Autor: José María Alba
//Descripción: 

import java.util.Scanner;

public class PruebaRepetitivaDoWhile {

	public static void main (String [] args) {
	
		String respuesta = "";
		Scanner scanner = null;
		short pasos = 0;
		scanner = new Scanner(System.in);
		
		do {
			System.out.println("Quieres avanzar: ");
			respuesta = scanner.nextLine();
			pasos++;
			
			if (pasos == 10) {
				
				System.out.println("Saliste de Generation");
				System.out.println("Bienvenido a TI");
				respuesta = "no";
			}
			
		} while (!respuesta.equalsIgnoreCase("no"));
		
		scanner.close();
		
	}

}
