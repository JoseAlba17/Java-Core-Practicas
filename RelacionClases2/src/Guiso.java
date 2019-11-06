//Título: Guiso
//Fecha: 11/09/2019
//Autor: José María Alba
//Descripción: Clase Guiso
//Keywords: relación de clases

public class Guiso {

	private String nombre;
	private boolean tieneCarne;
	private short nivelPicante;
	
	public Guiso() {
		
	}
	
	public Guiso(String nombre, boolean tieneCarne, short nivelPicante) {
		this.nombre = nombre;
		this.tieneCarne = tieneCarne;
		this.nivelPicante = nivelPicante;
	}
	//get y set de Nombre//
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//get y set de tieneCarne//
	public boolean tieneCarne() {
		return tieneCarne;
	}

	public void setTieneCarne(boolean tieneCarne) {
		this.tieneCarne = tieneCarne;
	}

	//get y set de NivelPicante//
	public short getNivelPicante() {
		return nivelPicante;
	}

	public void setNivelPicante(short nivelPicante) {
		this.nivelPicante = nivelPicante;
	}
	
	
}
