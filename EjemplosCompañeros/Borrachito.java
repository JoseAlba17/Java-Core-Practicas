import java.util.Scanner;

public class Borrachito {
	
	public static void main(String[] args) {
		
		//Declaracion de variables
		int numeroCaguamas = 0;
		String respuesta = "";
	
		//Inicializacion Stream scanner
		Scanner scanner = new Scanner(System.in);
		
		//Obtener la primer respuesta de la noche
		System.out.println("Hola ¿gustas una caguama?: ");
		respuesta = scanner.nextLine().toLowerCase();
		
		//Validacion de las respuestas para ver si la fiesta sigue
		if(respuesta.equals("si")) {
			
			System.out.println("Tenga su guama apa");
			
			while(respuesta != "si") {
				
				System.out.println("¿Ya te sientes pedo?");
				respuesta = scanner.nextLine().toLowerCase();
				
				if(respuesta.equals("no")) {
					
					numeroCaguamas+=1;
					System.out.println("Eres cabron!! Llevas " + numeroCaguamas +" Chingate otra");
				}else {
					
					System.out.println("Ay apa!! Ya se te arrastra la lengua ¿Quieres vomitar y seguirle?");
					respuesta = scanner.nextLine();
					
					if (respuesta.equals("no")) {
						
						System.out.println("Ni aguantas nada");
						break;
					}else {
						System.out.println("Eso chingon, ten te mereces otra caguama");
					}
				}
				
			}	
		}else if(respuesta.equals("no")) {
			
			System.out.println("Eres persona sana lo respeto");
		}
		
		//Cerrado del Stream;
		scanner.close();
	}
}
