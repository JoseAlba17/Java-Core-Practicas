//Título: Lampara
//Fecha: 10/09/2019
//Autor: José María Alba
//Descripción: Clase lámpara 
//Keywords: clases

public class Foco {

	private int watts;
	private boolean encendido;
	private String forma;
	private String color;
	
	public Foco() {
		
	}
	
	public Foco(int watts, boolean encendido, String forma, String color) {
		this.watts = watts;
		this.encendido = encendido;
		this.forma = forma;
		this.color = color;
	}
	
	public Foco (int watts, String forma, String color) {
		this.watts = watts;
		this.encendido = false;
		this.forma = forma;
		this.color = color;
	}
	
	//GET y SET de Watts
	
	public int getWatts () {
		return watts;
	}
	
	public void setWatts (int watts) {
		this.watts = watts;
	}
	
	//GET y SET de Encendido
	
	public boolean estaEncendido () {
		return encendido;
	}
	
	public void setEncendido (boolean encendido) {
		this.encendido = encendido;
	}
		
	//GET y SET de Forma
		
	public String getForma () {
		return forma;
	}
	
	public void setForma (String forma) {
		this.forma = forma;
	}
	
	//GET y SET de Color
	
	public String getColor () {
		return color;
	}
	
	public void setColor (String color) {
		this.color = color;
	}
}
