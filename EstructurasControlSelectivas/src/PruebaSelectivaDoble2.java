//T�tulo: Prueba Selectiva Doble 2
//Fecha: 03/09/2019
//Autor: Jos� Mar�a Alba
//Descripci�n:

import java.util.Scanner;

public class PruebaSelectivaDoble2 {

	public static void main (String [] args) {
	
		boolean llegarTarde = false;
		boolean alcanciaLlena = false;
		boolean yaComi = false;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�Llegaste tarde? ");
		llegarTarde = scanner.next().equalsIgnoreCase("si");
		scanner.nextLine();
		
		System.out.println("�La alcanc�a est� llena? ");
		alcanciaLlena = scanner.next().equalsIgnoreCase("si");
		scanner.nextLine();
		
		System.out.println("�Ya comiste? ");
		yaComi = scanner.next().equalsIgnoreCase("si");
		
		scanner.close();
		
		if(llegarTarde && !alcanciaLlena) {
			if(!yaComi) {
				System.out.println("Leo invita");
			} else {
				System.out.println("Entrale a Torre�n bailando");
			}
		} else {
			System.out.println("Integrate al ritual");
		}
		
		
	}
}
