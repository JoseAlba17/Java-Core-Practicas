
public class EjemploFor {
	public static final String CANCION= "Around the world, around the world"; 
			
			
	public static void main (String []args) {
		
		
		int i=0;
		int parrafo=18;//totales
		int j=0;//parrafos
		int salto=4;//cada 4 lineas es un parrafo
		
		for(i=0;i<parrafo;i++) {
			for(j=0;j<salto;j++) {
				System.out.println(CANCION);
			}
			System.out.println();
		}
		
		
		
	}

}
