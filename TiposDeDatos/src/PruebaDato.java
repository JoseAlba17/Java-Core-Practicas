
public class PruebaDato {
	
	public static void main (String [] args) {
		
		//-128 hasta 127
		//Declaraci�n y asignaci�n de valor en binario
		//El prefijo 0b
		byte numeroBinario = 0b1010101;
		
		//Declaraci�n y asignaci�n de un numero 100 en decimal
		byte calificacion = 100;
		
		//-32,768 hasta 32,767
		short a�o = 30019;
		
		//4 bytes
		// -2^31 hasta 2^31-1
		int numPersonasTierra = 700000000;
		
		// 8 bytes
		//-2^63 hasta 2^63-1
		long distanciaSol = 1500000000;
		
		// 4 bytes
		float precioTortilla = 15.50f;
		
		// 8 bytes
		double latitud = 20.6507948;
		
		// 1 bit
		boolean seguireSoltero = true;
		boolean meQuiere = false;
		
		// 2 bytes
		char grupo = 'A';
		char genero = 'F';
		
		//String es una clase
		//Son inmutables
		//String Pool - Heap
		String nombre = "Leo";
		nombre = "Elbarbaro";
		
		int longitud = nombre.length();
		
		System.out.println("N�mero binario decimal: " + numeroBinario);
		System.out.printf("N�mero binario decimal: %s", Integer.toBinaryString(numeroBinario));
		System.out.println();
		
		System.out.println("Calificaci�n: " + calificacion);
		System.out.println("A�o: " + a�o);
		System.out.println("N�mero de personas en la Tierra: " + numPersonasTierra);
		System.out.println("Distancia del Sol: " + distanciaSol);
		
		System.out.println("Precio tortilla: " + precioTortilla);
		System.out.println("Latitud de la Choza de los Peque�ines (escuela): " + latitud);
		
		System.out.println("�Seguir� soltero? " + seguireSoltero);
		System.out.println("�Me quiere? " + meQuiere);
		
		System.out.println("Grupo: " + grupo);
		System.out.println("G�nero: " + grupo);
		
		System.out.println("Nombre: " + nombre);
		System.out.println("Longitud de la cadena: " + longitud);
		
		//N�mero de tarjeta separado en grupos de 4
		long numTarjeta = 4568_8695_3824_4151L;
	}
}
