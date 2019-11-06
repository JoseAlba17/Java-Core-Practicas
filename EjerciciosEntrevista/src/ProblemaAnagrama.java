//Título: Problema Anagrama
//Fecha: 09/09/2019
//Autor: José María Alba
//Descripción: El problema recibe 2 Strings y determina si una es anagrama de la otra
//Keywords: Arrays, métodos de ordenamiento 

//Importación estática. Importa todo lo que es estático
import static java.util.Arrays.sort;
import java.util.Arrays;

public class ProblemaAnagrama {

	public static void main (String [] args) {
		
		String cad1 = "sol";
		String cad2 = "los";
		
		System.out.println(esAnagrama(cad1,cad2));
	}
	
	public static boolean esAnagrama (String cad1, String cad2) {
		
		char [] arr1 = cad1.toCharArray(); //convierte un arreglo tipo String a un arreglo tipo Char
		char [] arr2 = cad2.toCharArray(); //convierte un arreglo tipo String a un arreglo tipo Char
		
		System.out.println("Antes del ordenamiento");
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.equals(arr1,arr2));
		
		//Ordena un array tipo Char en orden ascendente, de acuerdo a su valor ASCII
		sort(arr1);
		sort(arr2);
		System.out.println();
		
		System.out.println("Después del ordenamiento");
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		//Devuelve un valor Booleano que indica su ambos arreglos son o no iguales
		return Arrays.equals(arr1,arr2);
	}
}
