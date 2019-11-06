//Título: Taco
//Fecha: 11/09/2019
//Autor: José María Alba
//Descripción: Clase Taco 
//Keywords: relación de clases

public class Taco {

	//Composición de objetos
	
	private Tortilla[] tortilla;
	private Guiso guiso;
	private Topping [] toppings;
	private boolean esDoble;
	private String tipo;
	private short cantidad;
	
	public Taco() {
		
	}
	
	public Taco(Tortilla[] tortilla, Guiso guiso) {
		this.tortilla = tortilla;
		this.guiso = guiso;
	}

	public Taco(Tortilla[] tortilla, Guiso guiso, Topping[] toppings, boolean esDoble, String tipo) {
		this.tortilla = tortilla;
		this.guiso = guiso;
		this.toppings = toppings;
		this.esDoble = esDoble;
		this.tipo = tipo;
	}

	//get y set de Tortilla//
	public Tortilla[] getTortilla() {
		return tortilla;
	}

	public void setTortilla(Tortilla[] tortilla) {
		this.tortilla = tortilla;
	}

	//get y set de Guiso//
	public Guiso getGuiso() {
		return guiso;
	}

	public void setGuiso(Guiso guiso) {
		this.guiso = guiso;
	}

	//get y set de Toppings//
	public Topping[] getToppings() {
		return toppings;
	}
	//Topping... Argumentos o parátmetros del mismo tipo como una serie de elementos
	public void setToppings(Topping[] toppings) {
		this.toppings = toppings;
	}

	//get y set de EsDoble//
	public boolean EsDoble() {
		return esDoble;
	}

	public void setEsDoble(boolean esDoble) {
		this.esDoble = esDoble;
	}

	//get y set de Tipo//
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public boolean meVoyAEnchilar() {
		
		boolean toppingPica = false;
		//for each, recorre elementos de un arreglo
		for(Topping t: toppings) {
			if(t.EsPicante()) {
				toppingPica = true;
				break; //Sale del ciclo cuando encuentre el primer topping picante
			}
		}
		return toppingPica || guiso.getNivelPicante() > 5;
	}
	
	public boolean esVegetariano() {
		return !guiso.tieneCarne();
	}
	
	public boolean seVaADeshacer() {
		
		boolean tieneSalsa = false;
		for(Topping t: toppings) {
			if(t.esLiquido()) {
				tieneSalsa = true;
			}
		}
		return tieneSalsa && !esDoble;
	}
	
	public boolean alcanzaParaDos() {
		return !seVaADeshacer() && esDoble;
	}
	
}
