import java.util.Scanner;
class Main { 
	public static void main (String[] args){
		System.out.println("Suma varios numeros");
		Scanner scanner = new Scanner(System.in);
		int acumulador = 0;
		int nuevoNumero = 0;
		
		while (nuevoNumero >= 0){
			System.out.println("Insertar un numero nuevo a sumar");
			nuevoNumero = scanner.nextInt();
			if (nuevoNumero > 0){
				acumulador = acumulador + nuevoNumero;
        
        System.out.println("Total: " + acumulador);
        
			}
    }		
				
	}
}
