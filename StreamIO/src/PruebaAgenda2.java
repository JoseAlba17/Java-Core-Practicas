import insumos.*;
import insumos.Archivo.Prioridad;

public class PruebaAgenda2 {

	public static void main(String[] args) {
		
		Agenda agenda = new Agenda("Asuntos familiares");
		
		try {
		
			//Primera hoja
			agenda.crearHoja("Vacaciones", Prioridad.MEDIA);
			agenda.escribir("- Viaje a Cancún\n");
			agenda.escribir("- Intercambio de Navidad\n");
			
			//Segunda hoja
			agenda.crearHoja("Gastos", Prioridad.ALTA);
			agenda.escribir("- Pagar la luz\n");
			agenda.escribir("- Pagar el gas\n");
			agenda.escribir("- Pagar comida\n");
			
			System.out.println("Hojeando...\n");
			agenda.hojear();
			
			System.out.println("\nMostrando archivos físicos...");
			agenda.consultar();
			
			System.out.println("\nSe arranca la hoja Gastos.txt");
			System.out.println("\nMostrando archivos físicos...");
			agenda.arrancarHoja("Gastos");
			agenda.consultar();
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
	}
}
