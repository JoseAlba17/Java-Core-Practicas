//Programa que hace las 4 operaciones matem�ticas (suma, resta, multiplicaci�n y divisi�n con flotantes y doubles
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
		System.out.printf("\nLa multiplicaci�n de %.2f + %.2f es igual a: %.2f", num1, num2, (num1*num2));
		System.out.printf("\nLa divisi�n de %.2f + %.2f es igual a: %.2f", num1, num2, (num1/num2));
		scanner.close();
		
	}
}
