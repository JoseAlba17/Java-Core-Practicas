
import java.util.Scanner;

public class PruebaRepetitivaForTarea {
	
	public static final String ALPHA_NUMERICO = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789*$_.";
	
	public static void main(String[] args) {
		int contador = 0;
		int largoContraseña = 0;
		int posNuevoCaracter = 0;
		String contraseña = "";
		Scanner scanner = null;
		
		scanner = new Scanner(System.in);
		
		System.out.println("¿De que largo quieres tu nueva contraseña? ");
		largoContraseña = scanner.nextInt();
		scanner.close();
		
		for (contador=1; contador <= largoContraseña ; contador++) {
			posNuevoCaracter = (int)(Math.random()*ALPHA_NUMERICO.length());
			contraseña += ALPHA_NUMERICO.charAt(posNuevoCaracter);
		}
		 System.out.println("Tu nueva contraseña es: " + contraseña);
	}

}
