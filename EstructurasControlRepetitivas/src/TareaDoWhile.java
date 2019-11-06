//Título: Tarea Do While
//Fecha: 04/09/2019
//Autor: José María Alba
//Descripción: Progama para decidir si se va a salir o no, 
//			   dado que puede o no estar lloviendo

import java.util.Scanner;

public class TareaDoWhile {
	
	public static void main (String [] args) {

		boolean estaLloviendo = true;
		boolean quieroSalir = true;
		Scanner scanner = null;
		
		scanner = new Scanner(System.in);
		
		do {
			System.out.println("¿Vas a salir? ");
			quieroSalir = scanner.next().equalsIgnoreCase("si");
					
			if(quieroSalir) {
				
				System.out.println("¿Está lloviendo? ");
				estaLloviendo = scanner.next().equalsIgnoreCase("si");
				
				if(estaLloviendo) {
					System.out.println("No salgas. Mejor espera a que deje de llover");
				} else {
					System.out.println("Puedes salir");
				}
			}
	
		}while(estaLloviendo && quieroSalir);
		System.out.println("FIN DEL PROGRAMA");
	}

}
