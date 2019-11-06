//Título: PruebaMatriz
//Fecha: 06/09/2019
//Autor: José María Alba
//Descripción: uso de arrays de más de una dimensión
//Keywords: matrices

import java.util.Scanner;
import java.util.Random;

public class PruebaMatriz {

	public static final int TAMAÑO = 8;
	public static final int NUMERO_BOMBAS = 12;
	public static void main (String [] args) {
		int [][] posiciones = new int [TAMAÑO][TAMAÑO];
		int [][] encontradas = new int [TAMAÑO][TAMAÑO];
		int fila = 0, columna = 0, bombas = 0;
		Scanner scanner = null;
		String[] coordenadas = null;
		
		scanner = new Scanner(System.in);
		
		llenar (posiciones);
		System.out.println("= ENCONTRANDO BOMBAS =");
		
		while(bombas < NUMERO_BOMBAS) {
			
		System.out.print("Ingresa una coordenada: ");
		//Separa los valores introducidos y los guarda en un vector String
			coordenadas = scanner.nextLine().split(",");
			
			//Convierte los valores del vector String a Int
			fila = Integer.parseInt(coordenadas[0]);
			columna = Integer.parseInt(coordenadas[1]);
			
			if (posiciones[fila][columna] == 1) {
				
				System.out.println("Acertaste!!");
				posiciones[fila][columna] = -1;
				encontradas[fila][columna]= 1;
				bombas++	;
				System.out.println("Bombas desactivadas: " + bombas + " / " + NUMERO_BOMBAS);
				System.out.println();
				imprimir(encontradas);
				
			} else {
				
				System.out.println("Fallaste!!");
				imprimir(encontradas);
				
			}
			
		}
		
		scanner.close();
	}
 	
	public static void imprimir ( int [][] matriz) {
				
		for (int i = 0; i < TAMAÑO; i++) {
			
			for (int j = 0; j < TAMAÑO; j++) {
				
				System.out.print(matriz[i][j] +" ");
			}
			
			System.out.println();
		}	
		
	}
	
	public static void llenar (int [][] matriz) {
		
		Random random = new Random();
		int obj = 0, fila = 0, columna = 0;
		
		while(obj < NUMERO_BOMBAS) {
			
			//random.nextInt(n) devuelve un valor tipo Int entre 0 y n-1
			fila = random.nextInt(TAMAÑO);
			columna = random.nextInt(TAMAÑO);
			
			if (matriz [fila][columna] != 1) {
				
				matriz [fila][columna] = 1;
				obj++;
			}
		}
	}
}
