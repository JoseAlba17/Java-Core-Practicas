package insumos;
import java.util.Date;
import java.io.File;

public class Archivo {

	private String nombre;
	private Date fecha;
	public Prioridad prioridad;
	private File contenido;
	
	public enum Prioridad {
		ALTA, MEDIA, BAJA
	}

	public Archivo(String nombre, Date fecha, Prioridad prioridad) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.prioridad = prioridad;
	}
	
	public Archivo(String nombre, Prioridad prioridad) {
		this.nombre = nombre;
		this.prioridad = prioridad;
	}

	public Archivo() {
	}

	//get y set de Nombre//
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//get y set de Fecha//
	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	//get y set de Prioridad//
	public Prioridad getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(Prioridad prioridad) {
		this.prioridad = prioridad;
	}

	//get y set de Contenido//
	public File getContenido() {
		return contenido;
	}

	public void setContenido(File contenido) {
		this.contenido = contenido;
	}
	
	
}
