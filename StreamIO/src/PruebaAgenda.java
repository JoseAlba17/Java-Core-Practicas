import insumos.*;

public class PruebaAgenda {

	public static void main(String[] args) {
		
		Agenda agenda = new Agenda("La de la infancia");
		try {
		
			agenda.escribir("Apuntes del d�a", Archivo.Prioridad.ALTA, "Ejemplos de archivo");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
