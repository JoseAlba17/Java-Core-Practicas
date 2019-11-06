//Título: Selectiva Multiple 2
//Fecha: 04/09/2019
//Autor: José María Alba
//Descripción: 

import java.util.Scanner;

public class SelectivaMultiple2 {

	public static void main (String [] args) {
		
		final String DESAYUNO = "desayuno"; 
		final String COMIDA = "comida";
		final String CENA = "cena";
		Scanner scanner = null;
		
		String tipoAlimento = "";
		String platillo = "";
				
		scanner = new Scanner(System.in);
		
		//do {
			System.out.println("Introduce desayuno, comida o cena");
			System.out.println("Estás listo para: ");
			tipoAlimento = scanner.nextLine().toLowerCase();
			
			if(tipoAlimento.equals(DESAYUNO) || tipoAlimento.equals(COMIDA) || tipoAlimento.contentEquals(CENA)) {
			
				System.out.println("Escoge un platillo: ");
				
				switch (tipoAlimento) {
					
					case DESAYUNO:
						System.out.println("Tacos");
						System.out.println("Chilaquiles");
						System.out.println("Lonche de pierna");
						System.out.print("Opción: ");
						platillo = scanner.nextLine();
						break;
					
					case COMIDA:
						System.out.println("Pollo con mole");
						System.out.println("Carne asada");
						System.out.println("Torta ahogada");
						System.out.println("Hamburguesa");
						System.out.print("Opción: ");
						platillo = scanner.nextLine();
						break;
						
					case CENA:
						System.out.println("Pozole");
						System.out.println("Tamales");
						System.out.println("Tacos de colores");
						System.out.println("Enchiladas");
						System.out.print("Opción: ");
						platillo = scanner.nextLine();
						break;
						
				}
				scanner.close();
				System.out.printf("Elegiste %s como %s", platillo, tipoAlimento);
			} else {
				
				System.out.println("Opción inválida");
				System.out.flush();
			}
		//} while (!tipoAlimento.equals(DESAYUNO) || !tipoAlimento.equals(COMIDA) || !tipoAlimento.contentEquals(CENA));
	}
}
