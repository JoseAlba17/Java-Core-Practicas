//Título: Prueba Selectiva
//Fecha: 03/09/2019
//Autor: José María Alba
//Descripción:

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
		scanner.nextLine(); //Usado como un fflush, para consumir el caracter de salto de línea que se quedó en el buffer
		
		
		//Estructura selectiva simple. Sólo nos interesa un caso
		if(edad > 17 && tieneCarrera) {
			System.out.println("Es una persona mayor de edad y legal");
			System.out.print("¿Cuál es tu carrera? ");
			carrera = scanner.nextLine();
			
			System.out.println("Está listo para entrar al curso de Generation");
		}
		
		scanner.close();
		
		System.out.println("Edad: " + edad);
		System.out.println("Carrera: " + carrera);
		System.out.println("Fin del programa");
	}

}
