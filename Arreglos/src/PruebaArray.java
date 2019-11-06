//T�tulo: Prueba Array
//Fecha: 05/09/2019
//Autor: Jos� Mar�a Alba
//Descripci�n: Uso de arrays unidimensionales 

public class PruebaArray {

	public static void main (String [] args) {
		
		//Declaraci�n de variables
		int i;
		
		//Declaraci�n de vectores
		//Son objetos, tienen m�todos
		//Dimensi�n: de 0 hasta TAMA�O-1
		int [] numeros = new int [5];
		char [] letras = new char [10];
		
		//Asignaci�n de valores a vectores
		numeros[0] = 10;
		numeros[1] = 9;
		numeros[2] = 5;
		numeros[3] = 2;
		numeros[4] = 6;
		
		letras[0] = 'a';
		letras[1] = 'b';
		letras[2] = 'c';
		letras[3] = 'd';
		letras[4] = 'e';
		letras[5] = 'f';
		letras[6] = 'g';
		letras[7] = 'h';
		letras[8] = 'i';
		letras[9] = 'j';
		
		//Acceder a valores a trav�s del �ndice
		for(i = 0; i < numeros.length; i++) {
			
			System.out.println("Valor en " + i + ": " + numeros[i]);
		
		}
		
		System.out.println("");
		
		//Acceder a letras a trav�s del �ndice
		for(i = 0; i < letras.length; i++) {
			
			//Se genera un caso excepcional de error para que cuando pase, el programa lo reciba y lo trate, sin que le programa truene
			try {
				System.out.println("Letra en " + i + ": " + letras[i]);
			} catch (Exception error) {
				System.out.println("�ndice fuera de rango");
				System.out.println(error.getMessage());
			}
				
		} 
	}
}