//Escanea los datos de un usuario, usando todos los tipos de dato

import java.util.Scanner; //Se importa la clase Scanner

public class EscanerDeDatos {

	public static void main (String [] args) {
		
		//Declaración e inicialización de variables
		
		String nombre = null, apellido = ""; //Se crea un objeto tipo String y se inicializa como nulo o vacío
		int edad = 0, grado = 0; //Se crean variables enteras y se inicializan a cero
		float estatura; //Se crea una varibale tipo float y se inicializa
		char grupo =' '; //Se crea una variable tipo char y se inicializa
		boolean casado = false; //Se crea una variable tipo boolean y se inicializa en falso
		//String siEstaCasado = "";//Se crea una variable auxiliar tipo String para hacer el proceso de comparación
		
		Scanner escanear = new Scanner(System.in); //Se crea una instancia de tipo Scanner para leer datos desde teclado
		
		System.out.print("¿Cuál es tu nombre? "); //Se muestra un mensaje pidiendo el nombre
		nombre = escanear.next(); //Se recibe el nombre como una String
		
		System.out.print("¿Cuál es tu apellido? "); //Se muestra un mensaje pidiendo el apellido
		apellido = escanear.next(); //Se recibe el apellido como una String
		
		System.out.print("¿Qué edad tienes? "); //Se muestra un mensaje pidiendo la edad
		edad = escanear.nextInt(); //Se recibe la edad como un int
		
		System.out.print("¿Cuál es tu estatura? "); //Se muestra un mensaje pidiendo la estatura
		estatura = escanear.nextFloat(); //Se recibe la estatura como un float
		
		System.out.print("¿En qué grado cursas? ");  //Se muestra un mensaje pidiendo el grado
		grado = escanear.nextInt(); //Se recibe el grado como un int
		
		System.out.print("¿Cuál es tu grupo? "); //Se muestra un mensaje pidiendo el grupo
		grupo = escanear.next().charAt(0); //Se recibe el grupo como un char
		
		System.out.print("¿Eres casado(a)?: ");  //Se muestra un mensaje preguntando si está casado o no
		//siEstaCasado = escanear.next();  //Se recibe el estado civil como una String 
		casado = escanear.next().equalsIgnoreCase("si"); //Se compara la variable recuperada y se guarda el resultado de la comparación en un bolean
		
		//Presentación en pantalla de los datos capturados
		System.out.println("");
		System.out.println("Los datos capturados son los siguientes: ");
		System.out.println("Nombre: " + nombre + " " + apellido);
		System.out.println("Edad: " + edad);
		System.out.println("Estatura: " + estatura + " m");
		System.out.println("El grado y grupo que cursa es: " + grado + "°" + grupo);
		System.out.println("Casado: " + casado);
		
		escanear.close(); //Cerrar el escaner
	}
}
