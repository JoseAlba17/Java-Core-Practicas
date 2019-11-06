import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Lista {

	public static final String EXTENSION = "txt";
	private String nombreLista;
	private List<Ticket> tickets;

	// Mantener una referencia al ticket actual
	private Ticket ticketActual;

	public Lista(String nombreLista, List<Ticket> tickets, Ticket ticketActual) {
		this.nombreLista = nombreLista;
		this.tickets = new ArrayList<>();
		this.ticketActual = ticketActual;
	}

	// Crear ticket
	public void crearTicket(String nombreCliente, String descripcionTicket, Date fechaEntrega, List<String> responsables, List<String> comentarios, Etiqueta etiquetas) {

		String nombreTicket = String.format("%s.%s", nombreCliente, EXTENSION);
		Ticket ticket = new Ticket(nombreTicket, descripcionTicket, fechaEntrega, responsables, comentarios, etiquetas);
	}
	// Actualizar ticket
	// Mover ticket a otra lista
	// Eliminar ticket

}
