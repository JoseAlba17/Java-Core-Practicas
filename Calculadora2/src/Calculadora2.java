//Programa que hace las 4 operaciones matemáticas (suma, resta, multiplicación y división con flotantes y doubles
import java.util.Scanner;

public class Calculadora2 {
	
	public static void main (String [] args) {
		
		double num1 = 0;
		double num2 = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingresa primer numero: ");
		num1 = scanner.nextDouble();
		
		System.out.print("Ingresa segundo numero: ");
		num2 = scanner.nextDouble();
		
		System.out.printf("\nLa suma de %.2f + %.2f es igual a: %.2f", num1, num2, (num1+num2));
		System.out.printf("\nLa resta de %.2f + %.2f es igual a: %.2f", num1, num2, (num1-num2));
		System.out.printf("\nLa multiplicación de %.2f + %.2f es igual a: %.2f", num1, num2, (num1*num2));
		System.out.printf("\nLa división de %.2f + %.2f es igual a: %.2f", num1, num2, (num1/num2));
		scanner.close();
		
	}
}
