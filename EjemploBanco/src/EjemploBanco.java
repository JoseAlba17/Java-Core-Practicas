//T�tulo: Tarea Operador
//Fecha: 03/09/2019
//Autor: Jos� Mar�a Alba
//Descripci�n:

public class EjemploBanco {

	public static void main (String [] args) {
		
		int dineroBanco = 1000;
		int dineroBilletera = 250;
		
		System.out.println(" - BALANCE BANCO - ");
		System.out.println("Dinero en banco: " + dineroBanco);
		System.out.println("Dinero en billetera: " + dineroBilletera);
		
		System.out.println("");
		
		System.out.println("//// DISPOSICI�N /////");
		System.out.println("MONTO: $250 ");
		
		System.out.println("");
		
		System.out.println(" - BALANCE BANCO - ");
		System.out.println("Dinero en banco: " + (dineroBanco-=250));
		System.out.println("Dinero en billetera: " + (dineroBilletera+=250));
				
	}
	
}
