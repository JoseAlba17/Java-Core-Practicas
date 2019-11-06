
import java.util.Scanner;

public class PruebaRepetitivaForTarea {
	
	public static final String ALPHA_NUMERICO = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789*$_.";
	
	public static void main(String[] args) {
		int contador = 0;
		int largoContrase�a = 0;
		int posNuevoCaracter = 0;
		String contrase�a = "";
		Scanner scanner = null;
		
		scanner = new Scanner(System.in);
		
		System.out.println("�De que largo quieres tu nueva contrase�a? ");
		largoContrase�a = scanner.nextInt();
		scanner.close();
		
		for (contador=1; contador <= largoContrase�a ; contador++) {
			posNuevoCaracter = (int)(Math.random()*ALPHA_NUMERICO.length());
			contrase�a += ALPHA_NUMERICO.charAt(posNuevoCaracter);
		}
		 System.out.println("Tu nueva contrase�a es: " + contrase�a);
	}

}
