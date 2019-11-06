//Programa que hace una calculadora

//Importar la clase Scanner para poder leer valores desde teclado
import java.util.Scanner;

public class PruebaCalculadora {

		public static void main (String[] args) {
			
			//Declaración de varibales tipo enteras e inicialización en cero
			int numero1 = 0, numero2 = 0, resultado = 0;
			
			//Declaración e instanciación de un objeto Scanner 
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Ingresa primer numero: ");
			
			//Esperando un valor desde teclado y realizando una asignación de valores
			numero1 = scanner.nextInt();
					
			System.out.print("Ingresa segundo numero: ");
			
			//Esperando un valor desde teclado y realizando una asignación de valores
			numero2 = scanner.nextInt();
			
			//Realizando una suma que tiene como resultado
			resultado = numero1 + numero2;
			
			//Cerrando objeto scanner
			scanner.close();
			
			//Presentación en pantalla del resultado
			System.out.println("El resultado es: " + resultado);
		}
}
