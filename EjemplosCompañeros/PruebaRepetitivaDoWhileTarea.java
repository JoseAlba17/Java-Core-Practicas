
import java.util.Scanner;

public class PruebaRepetitivaDoWhileTarea {
	
	public static void main(String[] args) {
		
		// Declaracion e inicializacion de variables
		boolean posponer = false;
		float alarma = 0;
		int horas = 0;
		int minutos = 0;
		
		Scanner scanner = null;
		
		// Instanciacion de un objeto de tipo Scanner
		scanner = new Scanner(System.in);
		
		// Recibe un float a traves del teclado y realiza la asignacion
		System.out.println("Bienvenido a super Alarma");
		System.out.println("¿A que hora deseas despertar?");
		alarma = scanner.nextFloat();
		
		// Validar la hora
		while (alarma < 0 || alarma > 24) {
			System.out.println("Ingresa un hora correcta");
			alarma = scanner.nextFloat();
		}
		
		System.out.println("---------------------------");
		System.out.println("Nos vemos en un momento...");
		
		// Ciclo do-while
		do {
			System.out.println("---------------------------");
			System.out.println("--Ki Ki Ri Ki--");
			
			// Se obtiene la parte decimal del float para los minutos
			// Se multiplica por 100 para volverlo entero
			// Se redondea para que no solo trunque al valor a la parte entera
			minutos = (int)Math.round((alarma%1*100));
			
			// Se obtiene la parte entera del float para las horas
			// Se divide entre 100 para obtener las horas correctas
			horas = (int)(alarma-(minutos/100));
			
			// Validar si los minutos se exceden de 60
			if(minutos >= 60) {
				// Se resta a minutos 60 y se le suma horas 1
				minutos -= 60;
				horas += 1; 
			}
			
			if (horas >= 24) {
				horas = 0;
			}
		
			// Salida con formato de hora
			System.out.printf("Son las: %d:%d hrs.\n", horas, minutos);
			
			// Recibe un String que compara con "si" y asigna a la variable true o false
			System.out.println("¿Deseas posponer la alarma");
			posponer = scanner.next().equalsIgnoreCase("si");
			
			// Se incrementa la hora en 10 minutos
			alarma = alarma + 0.10f;
			
		}while(posponer); // Mientras posponer sea false el ciclo continua
		
		// Cerrar scanner
		scanner.close();
		
		// Salida
		System.out.println("---------------------------");
		System.out.println("¡Es hora de la magia!");
		System.out.println("---------------------------");
	}

}
