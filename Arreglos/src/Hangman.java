//Título: Hangman
//Fecha: 06/09/2019
//Autor: José María Alba
//Descripción: Juego del ahorcado usando arrays
//Keywords: vectores, excepciones, 
//			E. de Ctrl. Selectivo, Funciones

import java.util.Scanner;

public class Hangman {

	public static void main (String [] args) {
		
		int tamaño = 0;
		int intentosRestantes = 5;
		boolean yaGano = false;
		String capturaPalabra = null;
		char [] palabraParaAdivinar = null;
		char [] palabraRespuesta = null;
		char letra;
		Scanner scanner = null;
		
		scanner = new Scanner(System.in);
		
		System.out.println("Bienvenido a = HANGMAN =");
		System.out.println("INSTRUCCIONES:");
		//System.out.println("Este juego consiste en....")
		System.out.println("JUGADOR 1, introduce la palabra que JUGADOR 2 deberá advinar: ");
		System.out.print("JUGADOR 1: ");
		capturaPalabra = scanner.next();
		tamaño = capturaPalabra.length();
		
		palabraParaAdivinar = new char[tamaño];
		palabraRespuesta = new char[tamaño];
		
		//tambien se puede usar el metodo split()  
		palabraParaAdivinar = capturaPalabra.toCharArray();
		
		System.out.println("JUGADOR 2, es tu turno para adivinar, letra por letra, la palabra que JUGADOR 2");
		
		while (intentosRestantes > 1 || yaGano) {
			System.out.println("JUGADOR 2, qué letra eliges?");
			System.out.print("JUGADOR 2: ");
			letra = scanner.next().charAt(0);
			
			//Lógica para determinar si la letra introducida es parte de la palabra a advinar
			//yaGano = comparar(intentosRestantes, letra, palabraParaAdivinar, palabraRespuesta);
			for(int i = 0; i < tamaño ; i++) {
				
				if (palabraParaAdivinar [i] == letra) {
					
					
				}
			
			}
			
		}
	}
	
	 //Imprime cantidad de intentos restantes
	 public static void imprimir (int intentos) { 
		 
			switch(intentos) {
			
			case 1:
				System.out.println("Te quedan: " + intentos);
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			}
	  
	 }
}
