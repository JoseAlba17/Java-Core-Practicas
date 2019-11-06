//Título: Pastel
//Fecha: 09/09/2019
//Autor: José María Alba
//Descripción: Clase pastel
//Keywords: clases 

/*Declaración de una clase de nombre Pastel.
 * Aquí se definirán todos los elementos de la case:
 * - Atributos (caractarísticas)
 * - Métodos (funciones)
*/
public class Pastel {
	
	//Declaración de atributos o variables de la clase
	private String sabor;
	private char tamaño;
	private String forma;
	private boolean gluten;
	private int numCalorias;
	private String topping;
	private float cantidad;
	
	//Método contructor predeterminado
	public Pastel () {
		
	}

	//Constructor parametrizado
	public Pastel (String sabor) {
		
		//Asignar el parámetro a la variable de instancia de esta clase
		//lo mismo que hacer sabor = sabor;
		this.sabor = sabor;
	}
	
	public Pastel (String sabor, char tamaño, String forma, boolean gluten, int numCalorias, String topping, float cantidad) {
		
		//Inicialización de variables de instancia
		this.sabor = sabor;
		this.tamaño = tamaño;
		this.forma = forma;
		this.gluten = gluten;
		this.numCalorias = numCalorias;
		this.topping = topping;
		this.cantidad = cantidad;
			
	}
	
	// GETS Y SETS DE SABOR

	//Método get, permite obtener el valor de sabor (Salida)
	public String getSabor () {
		return sabor;
	}
	
	//Método set, permite setear el valor de sabor (Entrada)
	public void setSabor (String sabor) {
		this.sabor = sabor;
	}
	
	// GETS Y SETS DE TAMAÑO
	
	public char getTamaño () {
		return tamaño;
	}
	
	public void setTamaño (char tamaño) {
		this.tamaño = tamaño;
	}
	
	// GETS Y SETS DE FORMA
	
	public String getForma () {
		return forma;
	}
	
	public void setForma(String forma) {
		this.forma = forma;
	}
	
	// GETS Y SETS DE GLUTEN
	
	public boolean hasGluten () { //Para booleanos se acostumbra por convención poner has/is, en lugar de get
		return gluten;
	}
	
	public void setGluten(boolean gluten) {
		this.gluten = gluten;
	}
	
	// GETS Y SETS DE NUMCALORIAS
	
	public int getnumCalorias () {
		return numCalorias;
	}
	
	public void setnumCalorias(int numCalorias) {
		this.numCalorias = numCalorias;
	}
	
	// GETS Y SETS DE TOPPING
	
	public String gettopping () {
		return topping;
	}
	
	public void settopping(String topping) {
		this.topping = topping;
	}
	
	// GETS Y SETS DE CANTIDAD
	
	public float getcantidad () {
		return cantidad;
	}
	
	public void setcantidad(float cantidad) {
		this.cantidad = cantidad;
	}
	
}
