//@title: ArmeriaElBarbaro
//@date: 13/09/2019
//@author: José María Alba
//@description: clase que manda llamar a las clases Escopeta y Pistola
//@keywords: relación de clases

package main;

import java.util.Scanner;
import armas.*;

public class ArmeriaElBarabaro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean respuesta = true;
		int opcionArma = 0;
		char opcionPistola = ' ', opcionEscopeta = ' ';

		Scanner scanner = new Scanner(System.in);

		System.out.println("Bienvenido a Armería el Bárbaro");

		do {
			System.out.println("");
			System.out.print("Elige un arma (1. Pistola, 2. Escopeta): ");
			opcionArma = scanner.nextInt();
			scanner.nextLine();

			switch (opcionArma) {

			case 1:
				System.out.println("A. Colt");
				System.out.println("B. Beretta");
				System.out.println("C. Mauser");
				System.out.print("Elige arma: ");
				opcionPistola = scanner.next().toUpperCase().charAt(0);
				scanner.nextLine();
				System.out.println("");

				switch (opcionPistola) {
				case 'A':
					Pistola colt = new Pistola(45, "Colt M1911", false, 1.130,
							"Pistola semiautomática de acción simple", 2, 0, 5);
					Municion balasColt = new Municion(45, "Colt", false);
					colt.mostrarSpecs(colt, balasColt);
					break;
				case 'B':
					Pistola beretta = new Pistola(9, "Beretta 9000", false, 0.73,
							"Pistola semiautomática compacta para uso civil", 2, 1, 5);
					Municion balasBeretta = new Municion(9, "Colt", false);
					beretta.mostrarSpecs(beretta, balasBeretta);
					break;
				case 'C':
					Pistola mauser = new Pistola(9, "Mauser C-96", false, 1.250,
							"Pistola semiautomática con cañón corto y empuñadura pequeña", 2, 3, 5);
					Municion balasMauser = new Municion(9, "Colt", false);
					mauser.mostrarSpecs(mauser, balasMauser);
					break;
				}
				break;

			case 2:
				System.out.println("A. Winchester");
				System.out.println("B. Remington");
				System.out.println("C. Benelli");
				System.out.print("Elige arma: ");
				opcionEscopeta = scanner.next().toUpperCase().charAt(0);
				scanner.nextLine();

				switch (opcionEscopeta) {
				case 'A':
					Escopeta winchester = new Escopeta(7, "Winchester", false, 3.1,
							"Fusil de palanca para cacería, accionado manualmente", 8, true, 2, 4);
					Municion balasWinchester = new Municion(7, "Winchester", true);
					winchester.mostrarSpecs(winchester, balasWinchester);
					break;
				case 'B':
					Escopeta remington = new Escopeta(12, "Remington 870", false, 3.2,
							"Escopeta semiautomática con portilla de eyección", 10, true, 3, 6);
					Municion balasRemington = new Municion(12, "Remington", true);
					remington.mostrarSpecs(remington, balasRemington);
					break;
				case 'C':
					Escopeta benelli = new Escopeta(12, "Benelli M4 Super 90", false, 3.1,
							"Escopeta semiautomática con capacidad para 7 cartuchos de calibre 12", 12, true, 1, 6);
					Municion balasBenelli = new Municion(12, "Benelli", true);
					benelli.mostrarSpecs(benelli, balasBenelli);
					break;
				}
				break;

			}

			System.out.print("Deseas elegir otra arma? ");
			respuesta = scanner.next().equalsIgnoreCase("si");
		} while (respuesta == true);
	}

}
