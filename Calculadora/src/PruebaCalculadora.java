//Programa que hace una calculadora

//Importar la clase Scanner para poder leer valores desde teclado
import java.util.Scanner;

public class PruebaCalculadora {

		public static void main (String[] args) {
			
			//Declaraci�n de varibales tipo enteras e inicializaci�n en cero
			int numero1 = 0, numero2 = 0, resultado = 0;
			
			//Declaraci�n e instanciaci�n de un objeto Scanner 
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Ingresa primer numero: ");
			
			//Esperando un valor desde teclado y realizando una asignaci�n de valores
			numero1 = scanner.nextInt();
					
			System.out.print("Ingresa segundo numero: ");
			
			//Esperando un valor desde teclado y realizando una asignaci�n de valores
			numero2 = scanner.nextInt();
			
			//Realizando una suma que tiene como resultado
			resultado = numero1 + numero2;
			
			//Cerrando objeto scanner
			scanner.close();
			
			//Presentaci�n en pantalla del resultado
			System.out.println("El resultado es: " + resultado);
		}
}
