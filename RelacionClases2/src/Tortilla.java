//Título: Tortilla
//Fecha: 11/09/2019
//Autor: José María Alba
//Descripción: Clase Tortilla 
//Keywords: relación de clases

public class Tortilla {

	private String tipo;
	private String color;
	private char tamaño;
	private boolean hechaAMano;
	
	public Tortilla (int cantidad) {
		
	}
	
	public Tortilla(String tipo, String color, char tamaño) {
		this.tipo = tipo;
		this.color = color;
		this.tamaño = tamaño;
	}

	//Constructor parametrizado completo
	public Tortilla(String tipo, String color, char tamaño, boolean hechaAMano) {
		this.tipo = tipo;
		this.color = color;
		this.tamaño = tamaño;
		this.hechaAMano = hechaAMano;
	}

	//get y set de Tipo//
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	//get y set de Color//
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	//get y set de Tamaño//
	public char getTamaño() {
		return tamaño;
	}
	
	public void setTamaño(char tamaño) {
		this.tamaño = tamaño;
	}
	
	//get y set de HechaAMano//
	public boolean isHechaAMano() {
		return hechaAMano;
	}
	
	public void setHechaAMano(boolean hechaAMano) {
		this.hechaAMano = hechaAMano;
	}
	
}
