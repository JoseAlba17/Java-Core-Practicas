//Título: Topping
//Fecha: 11/09/2019
//Autor: José María Alba
//Descripción: Clase Topping
//Keywords: relación de clases

public class Topping {

	private String nombre;
	private boolean esLiquido;
	private boolean esPicante;
	
	public Topping() {
		
	}
			
	public Topping(String nombre, boolean esPicante) {
		this.nombre = nombre;
		this.esPicante = esPicante;
	}

	public Topping(String nombre, boolean esLiquido, boolean esPicante) {
		this.nombre = nombre;
		this.esLiquido = esLiquido;
		this.esPicante = esPicante;
	}

	//get y set de Nombre//
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//get y set de EsLiquido//
	public boolean esLiquido() {
		return esLiquido;
	}

	public void setEsLiquido(boolean esLiquido) {
		this.esLiquido = esLiquido;
	}

	//get y set de EsPicante//
	public boolean EsPicante() {
		return esPicante;
	}

	public void setEsPicante(boolean esPicante) {
		this.esPicante = esPicante;
	}

	//Sobreescritura
	//Compara un objeto con otro, basado en una, dos o tres propiedades
	@Override
	public boolean equals(Object obj) {
		Topping topping = (Topping)obj;
		return this.nombre.contentEquals(topping.nombre);
	}
	
	
	
}
