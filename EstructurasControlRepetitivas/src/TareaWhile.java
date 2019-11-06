//Título: Tarea While
//Fecha: 04/09/2019
//Autor: José María Alba
//Descripción: simulación del juguete Magic 8 Ball, que recibe una pregunta y arroja una predicción de futuro

import java.util.Random;
import java.util.Scanner;

public class TareaWhile {

	public static void main(String[] args) {

		// Instanciación de objetos
		Scanner scanner = null;
		Random rand = new Random();

		scanner = new Scanner(System.in);

		// Declaración de variables
		int aleatorio = 1;
		boolean continuar = true;

		System.out.println("= MAGIC 8 BALL =");
		System.out.println("Bienvenido, mortal");

		while (continuar) {
			System.out.println("¿Cuál es tu pregunta? ");
			scanner.nextLine();
			aleatorio = rand.nextInt(5) + 1;

			switch (aleatorio) {

			case 1:
				System.out.println("Puede ser");
				break;

			case 2:
				System.out.println("No");
				break;

			case 3:
				System.out.println("Sigue soñando");
				break;

			case 4:
				System.out.println("Tal vez");
				break;

			case 5:
				System.out.println("¿Sabes contar? ¡No cuentes con ello!");
				break;

			}
			System.out.print("¿Quieres hacer otra pregunta? ");
			continuar = scanner.next().equalsIgnoreCase("si");
			scanner.nextLine();
		}
		scanner.close();
		System.out.println("FIN DEL PROGRAMA");
	}

}
