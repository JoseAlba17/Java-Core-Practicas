import java.util.Scanner;
public class MyFor {
	public static void main(String[] args) {
		
		final short PELICULAS=5;
		Scanner scanner=null;
		
		String nombrePeliculas="";
		scanner=new Scanner(System.in);
		
		short contador=0;
		
		System.out.printf("Ingresa tus %d peliculas favoritas\n",PELICULAS);
		
		for (contador=1;contador<=PELICULAS;contador++) {
			System.out.printf("No. %d: ",contador);
			nombrePeliculas+=("\n"+scanner.nextLine());
		}
		System.out.println("Tus peliculas favoritas por orden son:"+nombrePeliculas);
	}
}
