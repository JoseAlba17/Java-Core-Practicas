//T�tulo: Prueba Selectiva
//Fecha: 03/09/2019
//Autor: Jos� Mar�a Alba
//Descripci�n:

import java.util.Scanner;

public class PruebaSelectiva {
	
	public static void main (String [] args) {
		
		short edad = 0;
		boolean tieneCarrera = false;
		String carrera = null;
		Scanner scanner = null;
		
		scanner = new Scanner(System.in);
		
		System.out.print("Ingresar edad: ");
		edad = scanner.nextShort();
		
		System.out.print("Tienes carrera: ");
		tieneCarrera = scanner.next().equalsIgnoreCase("si");
		scanner.nextLine(); //Usado como un fflush, para consumir el caracter de salto de l�nea que se qued� en el buffer
		
		
		//Estructura selectiva simple. S�lo nos interesa un caso
		if(edad > 17 && tieneCarrera) {
			System.out.println("Es una persona mayor de edad y legal");
			System.out.print("�Cu�l es tu carrera? ");
			carrera = scanner.nextLine();
			
			System.out.println("Est� listo para entrar al curso de Generation");
		}
		
		scanner.close();
		
		System.out.println("Edad: " + edad);
		System.out.println("Carrera: " + carrera);
		System.out.println("Fin del programa");
	}

}
