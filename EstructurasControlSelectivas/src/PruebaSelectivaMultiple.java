//Título: Prueba Selectiva Multiple
//Fecha: 03/09/2019
//Autor: José María Alba
//Descripción: Asignar una calificación a cada caso mediante rangos y usando estructura selectiva múltiple (IF anidado)

//Prioridad
// 1. Tiempo
// 2. Número de muertes
// 3. Número de enemigos
// 4. Puntaje

import java.util.Scanner;

public class PruebaSelectivaMultiple {

	public static final int NUM_ENEMIGOS_MAX = 100;
	public static final int TIEMPO_MAX = 30;
	public static final int NUM_MUERTES_MAX = 5;
	public static final int PUNTUACION_MAX = 100000;
	
	public static void main (String [] args) { 
		
		short numeroEnemigos = 0; //
		short tiempo = 0; //
		short numeroDeMuertes = 0; //
		int puntuacion = 0; //
		int resulado = 0;
		Scanner scanner = null;
		
		scanner = new Scanner(System.in);
		
		System.out.println("Enemigos eliminados: ");
		numeroEnemigos = scanner.nextShort();
		
		System.out.println("Tiempo jugado (min): ");
		tiempo = scanner.nextShort();
		
		System.out.println("Cantidad de veces que te mataron: ");
		numeroDeMuertes = scanner.nextShort();
		
		System.out.println("Puntuación obtenida: ");
		puntuacion = scanner.nextInt();
		
		scanner.close();
		
		System.out.println("- ESTADISTICAS DE JUEGO -");
		System.out.println("Cantidad de enemigos eliminados: " + numeroEnemigos + "/" + NUM_ENEMIGOS_MAX);
		System.out.println("Tiempo total de juego: " + tiempo + "/" + TIEMPO_MAX);
		System.out.println("Cantidad de vidas perdidas: " + numeroDeMuertes + "/" + NUM_MUERTES_MAX);
		System.out.println("Puntuación obtenida: " + puntuacion + "/" + PUNTUACION_MAX);		
		
		//numeroEnemigos *= 0.3;
		//tiempo *= 0.15;
		//numeroDeMuertes *= 0.15;
		//puntuacion *= 0.4;
		//calificacion = (numeroEnemigos + numeroDeMuertes + tiempo + puntuacion)*100;
		
		//Cálculo de porcentajes
		numeroEnemigos = (short)((numeroEnemigos * 100) / NUM_ENEMIGOS_MAX);
		tiempo = (short)(100-(tiempo*100) / TIEMPO_MAX);
		numeroDeMuertes = (short)(100 - (numeroDeMuertes * 100) / NUM_MUERTES_MAX);
		puntuacion = puntuacion * 100 / PUNTUACION_MAX;
		
		numeroEnemigos *= 0.2;
		tiempo *= 0.3;
		numeroDeMuertes *= 0.35;
		puntuacion *= 0.15;
		resulado = numeroEnemigos + numeroDeMuertes + tiempo + puntuacion;
		
		System.out.println("Tu evaluación como jugador es: " + resulado + "pts");
		
		if(resulado > 95 ) {
			
			System.out.println("¡Eres el rey!");
			
		} else if(resulado > 90) {
				
				System.out.println("¡Excelente campeón!");
				
			} else if(resulado > 80) {

					System.out.println("¡Vas mejorando!");
					
				} else if(resulado > 70) {
			
						System.out.println("¡Puedes hacerlo mejor!");
						
					} else if(resulado > 60) {

							System.out.println("Sigue participando...");
							
						} else if(resulado > 50) {
								
								System.out.println("Aplícate. Das pena");
										
						}
	}
}
