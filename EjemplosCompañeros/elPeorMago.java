package operadores;

import java.util.Scanner;

public class tareaWhile {
	
	public static void main (String [] args) {
		final short NUM_CARTAS_MASO = 54;
		
		 String tuCarta="";
		 int cartas=0;
		 boolean esMiCarta=false;
		 Scanner scanner= null;
		 
		 scanner=new Scanner(System.in);
		 
		 System.out.println("Un Mago te hace un truco de magia");
		 System.out.println();
		 System.out.println("Te hace elegir una carta sin que el la vea, despues la revuelve en la baraja.");
		 System.out.println("El Mago saca una carta y te pregunta si es tu carta");
		 
		 
		 while(!esMiCarta && cartas<=NUM_CARTAS_MASO){
			 
			System.out.println("esta es tu carta?: ");
			tuCarta= scanner.nextLine();
			
			if (tuCarta.equalsIgnoreCase("si")){
				esMiCarta = true;
			}else { 
				cartas++;
				//System.out.println("y que tal esta otra carta?");
			}
			
			
		 }
		 System.out.println("Aqui esta es tu carta ");
		 scanner.close();
		
		
	}

}
