//T�tulo: Prueba Array 2
//Fecha: 05/09/2019
//Autor: Jos� Mar�a Alba
//Descripci�n: Uso de arrays unidimensionales 

import java.util.Arrays;
import java.util.Scanner;

public class PruebaArray2 {

	public static void main (String [] args) {
		
		int numeroPagos = 0;
		int total = 0;
		int [] cantidades;
		Scanner scanner = null;
		
		scanner = new Scanner(System.in);
		
		System.out.print("�Cuantos pagos? ");
		numeroPagos = scanner.nextInt();
		
		cantidades = new int[numeroPagos];
				
		for (int i=0; i < numeroPagos; i++) {
			
			System.out.print("Introduzca pago " + (i+1) + ":");
			cantidades[i] = scanner.nextInt();
			total += cantidades[i];
			System.out.println();
		}
		for (int i = 0; i < numeroPagos; i++) {
			
			System.out.println(cantidades[i]);
		}
		System.out.println("Total: " + total);
		ordenar(cantidades);
	}
	
	public static void ordenar (int [] values) {
		
		for (int i = 0; i < values.length; i++) {
			
			for (int j = 0; j < values.length - 1; j++) {
				
				if (values[j] > values [j + 1]) {
					
					values [j + 1] += values[j];
					values[j] = values [j + 1] - values[j];
					values [j + 1] -= values[j];
					
				}
			}
		}
		
		System.out.println(Arrays.toString(values));
		
	}
}