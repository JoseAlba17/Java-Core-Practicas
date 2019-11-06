package Basura;

public class Filtro {
	
	public static Basura separarBasura (Basura basura) {
		if(basura.getDegradacion() >= 100) {
			Inorganica inorganica = (Inorganica) basura;
			return inorganica;
		} else {
			Organica organica = (Organica) basura;
			return organica;
		}
		
	}
	
	public static void separarBolsa (Basura [] bolsa) {
		int organica = 0;
		int inorganica = 0;
		
		for(Basura basura: bolsa) {
			if(basura.getDegradacion() >= 100) {
				inorganica++;
			} else {
				organica++;
			}
		}
		System.out.println("Organica: "+ organica);
		System.out.println("Inorganica: "+ inorganica);
	}

}
