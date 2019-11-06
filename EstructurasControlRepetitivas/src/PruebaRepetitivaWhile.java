//Título: Prueba Repetitiva While
//Fecha: 04/09/2019
//Autor: José María Alba
//Descripción: 

import java.util.Scanner;

public class PruebaRepetitivaWhile {

	public static void main (String [] args) {
		
		final String CONTRASEÑA_REAL = "PlazaDelS0LALA$B";
		
		int numeroIntentos = 0;
		String contraseña = "";
		boolean accesoCorrecto = false;
		Scanner scanner = null;
		
		scanner = new Scanner(System.in);
		
		while(!accesoCorrecto && numeroIntentos < 3) {
			
			System.out.print("Contraseña: ");
			contraseña = scanner.nextLine();
			
			if(contraseña.equals(CONTRASEÑA_REAL)) {
			
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
