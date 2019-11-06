
import java.util.Scanner;
//import java.util.Random;

public class PruebaRepetitivaWhileTarea {
	
	public static final String ALFABETO = "abcdefghijklmnñopqrstuvwxyz ";
	
	public static void main(String[] args) {
		int longitud = 0;
		int i = 0;
		int llave = 0;
		String sinCifrar = "";
		String cifrar = "";
		Scanner scanner = null;
		
		scanner = new Scanner(System.in);
		System.out.println("Escribe tu mensaje a encriptar con Ceaser cypher");
		sinCifrar = scanner.nextLine().toLowerCase();
		longitud = sinCifrar.length();
		
		do { 
			llave = (int)(Math.random()*ALFABETO.length());
		} while (llave == 0);
		
		System.out.println("La llave es: " + llave + " que es la letra " + ALFABETO.charAt(llave));
		scanner.close();
		
		while (i < longitud) {
			cifrar += ALFABETO.charAt((ALFABETO.indexOf(sinCifrar.charAt(i)) + llave) % ALFABETO.length());
			i++;
		}
		
		System.out.println("El mensaje sin cifrar es: "+ sinCifrar);
		System.out.println("El mensaje cifrado es: " + cifrar);
	}
}
