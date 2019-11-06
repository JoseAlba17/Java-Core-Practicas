//T�tulo: Prueba Repetitiva While
//Fecha: 04/09/2019
//Autor: Jos� Mar�a Alba
//Descripci�n: 

import java.util.Scanner;

public class PruebaRepetitivaWhile {

	public static void main (String [] args) {
		
		final String CONTRASE�A_REAL = "PlazaDelS0LALA$B";
		
		int numeroIntentos = 0;
		String contrase�a = "";
		boolean accesoCorrecto = false;
		Scanner scanner = null;
		
		scanner = new Scanner(System.in);
		
		while(!accesoCorrecto && numeroIntentos < 3) {
			
			System.out.print("Contrase�a: ");
			contrase�a = scanner.nextLine();
			
			if(contrase�a.equals(CONTRASE�A_REAL)) {
			
				accesoCorrecto = true;
				
			} else {
				
				numeroIntentos++;
			
			}
		}
		scanner.close();
		
		if (accesoCorrecto) {

			System.out.println("Acceso correcto");
			
		} else {
			
			System.out.println("Sigue participando");
			System.out.println("Crea una cuenta nueva");
			
		}
	}
	
}
