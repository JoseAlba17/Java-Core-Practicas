import java.io.File;
import java.util.Date;
import java.util.List;

public class Ticket {

	private String nombreCliente;
	private String descripcionTicket;
	private Date fechaEntrega;
	private List<String> responsables;
	private List<String> comentarios;
	private List<Etiqueta> etiquetas;

	public enum Etiqueta {
		IMPORTANTE, ESPERA, COTIZACION, URGENTE, SERVICIO
	}

	public Ticket() {
		
	}

	public Ticket(String nombreCliente, String descripcionTicket, Date fechaEntrega, List<String> responsables, List<String> comentarios, List<Etiqueta> etiquetas) {
		
		this.nombreCliente = nombreCliente;
		this.descripcionTicket = descripcionTicket;
		this.fechaEntrega = fechaEntrega;
		this.responsables = responsables;
		this.comentarios = comentarios;
		this.etiquetas = etiquetas;
	}

	//get y set de NombreCliente//
	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	//get y set de DescripcionTicket//
	public String getDescripcionTicket() {
		return descripcionTicket;
	}

	public void setDescripcionTicket(String descripcionTicket) {
		this.descripcionTicket = descripcionTicket;
	}

	//get y set de FechaEntrega//
	public Date getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	//get y set de Responsables//
	public List<String> getResponsables() {
		return responsables;
	}

	public void setResponsables(List<String> responsables) {
		this.responsables = responsables;
	}

	//get y set de Comentarios//
	public List<String> getComentarios() {
		return comentarios;
	}

	public void setComentarios(List<String> comentarios) {
		this.comentarios = comentarios;
	}

	//get y set de Etiquetas//
	public List<Etiqueta> getEtiquetas() {
		return etiquetas;
	}

	public void setEtiquetas(List<Etiqueta> etiquetas) {
		this.etiquetas = etiquetas;
	}
	
}