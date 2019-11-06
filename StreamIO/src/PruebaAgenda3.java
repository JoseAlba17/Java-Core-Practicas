import insumos.*;
import insumos.Archivo.Prioridad;
import java.util.Scanner;

public class PruebaAgenda3 {

	public static void main(String[] args) {
		
		String nombreAgenda;
		Agenda agenda = null;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese nombre para nueva agenda: ");
		nombreAgenda = scanner.next();
		agenda = new Agenda(nombreAgenda);
		
		System.out.println("¿Qué deseas hacer? ");
		System.out.println("1. Crear hoja\n"
						+  "2. Elimnar hoja\n"
						+  "3. Elimnar hoja\n");
		
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
