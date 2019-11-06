//T�tulo: Tortilla
//Fecha: 11/09/2019
//Autor: Jos� Mar�a Alba
//Descripci�n: Clase Tortilla 
//Keywords: relaci�n de clases

public class Tortilla {

	private String tipo;
	private String color;
	private char tama�o;
	private boolean hechaAMano;
	
	public Tortilla (int cantidad) {
		
	}
	
	public Tortilla(String tipo, String color, char tama�o) {
		this.tipo = tipo;
		this.color = color;
		this.tama�o = tama�o;
	}

	//Constructor parametrizado completo
	public Tortilla(String tipo, String color, char tama�o, boolean hechaAMano) {
		this.tipo = tipo;
		this.color = color;
		this.tama�o = tama�o;
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
	
	//get y set de Tama�o//
	public char getTama�o() {
		return tama�o;
	}
	
	public void setTama�o(char tama�o) {
		this.tama�o = tama�o;
	}
	
	//get y set de HechaAMano//
	public boolean isHechaAMano() {
		return hechaAMano;
	}
	
	public void setHechaAMano(boolean hechaAMano) {
		this.hechaAMano = hechaAMano;
	}
	
}
