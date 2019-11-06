import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		
		//Declaracion y asignacion de valores
		String operacion = null;
		String[] cantidades = null;
		String[] operadores = {"\\+","\\-","\\*","\\/"};
		float resultado = 0;
		
		//Inicializacion del Stream Scanner
		Scanner scanner = new Scanner(System.in);
		
		//Peticion de la operacion
		System.out.println("Ingresa la operacion a efectuar:");
		operacion = scanner.nextLine().toLowerCase();

		//Validacion de informacion de entrada y calculo del resultado
		while(operacion != "salir") {
			
			if((cantidades = operacion.split("\\+",2)).length > 1) {
				
				resultado = Float.valueOf(cantidades[0]) + Float.valueOf(cantidades[1]);
				System.out.println("El resultado es: " + Math.round(resultado * 100)/100d);
				System.out.println("Ingresa otra operacion:");
				operacion = scanner.nextLine().toLowerCase();
			}
			
			else if((cantidades = operacion.split("\\-",2)).length > 1) {
				
				resultado = Float.valueOf(cantidades[0]) - Float.valueOf(cantidades[1]);
				System.out.println("El resultado es: " + Math.round(resultado * 100)/100d);
				System.out.println("Ingresa otra operacion:");
				operacion = scanner.nextLine().toLowerCase();
			}
			
			else if((cantidades = operacion.split("\\*",2)).length > 1){
				
				resultado = Float.valueOf(cantidades[0]) * Float.valueOf(cantidades[1]);
				System.out.println("El resultado es: " + Math.round(resultado * 100)/100d);
				System.out.println("Ingresa otra operacion:");
				operacion = scanner.nextLine().toLowerCase();
			}
			
			else if((cantidades = operacion.split("\\/",2)).length > 1){
				
				resultado = Float.valueOf(cantidades[0]) / Float.valueOf(cantidades[1]);
				System.out.println("El resultado es: " + Math.round(resultado * 100)/100d);
				System.out.println("Ingresa otra operacion:");
				operacion = scanner.nextLine().toLowerCase();
			}
	
		}
		
		//Cierre de Stream
		scanner.close();
		
	}
}
