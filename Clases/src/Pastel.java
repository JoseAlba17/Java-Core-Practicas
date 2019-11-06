//T�tulo: Pastel
//Fecha: 09/09/2019
//Autor: Jos� Mar�a Alba
//Descripci�n: Clase pastel
//Keywords: clases 

/*Declaraci�n de una clase de nombre Pastel.
 * Aqu� se definir�n todos los elementos de la case:
 * - Atributos (caractar�sticas)
 * - M�todos (funciones)
*/
public class Pastel {
	
	//Declaraci�n de atributos o variables de la clase
	private String sabor;
	private char tama�o;
	private String forma;
	private boolean gluten;
	private int numCalorias;
	private String topping;
	private float cantidad;
	
	//M�todo contructor predeterminado
	public Pastel () {
		
	}

	//Constructor parametrizado
	public Pastel (String sabor) {
		
		//Asignar el par�metro a la variable de instancia de esta clase
		//lo mismo que hacer sabor = sabor;
		this.sabor = sabor;
	}
	
	public Pastel (String sabor, char tama�o, String forma, boolean gluten, int numCalorias, String topping, float cantidad) {
		
		//Inicializaci�n de variables de instancia
		this.sabor = sabor;
		this.tama�o = tama�o;
		this.forma = forma;
		this.gluten = gluten;
		this.numCalorias = numCalorias;
		this.topping = topping;
		this.cantidad = cantidad;
			
	}
	
	// GETS Y SETS DE SABOR

	//M�todo get, permite obtener el valor de sabor (Salida)
	public String getSabor () {
		return sabor;
	}
	
	//M�todo set, permite setear el valor de sabor (Entrada)
	public void setSabor (String sabor) {
		this.sabor = sabor;
	}
	
	// GETS Y SETS DE TAMA�O
	
	public char getTama�o () {
		return tama�o;
	}
	
	public void setTama�o (char tama�o) {
		this.tama�o = tama�o;
	}
	
	// GETS Y SETS DE FORMA
	
	public String getForma () {
		return forma;
	}
	
	public void setForma(String forma) {
		this.forma = forma;
	}
	
	// GETS Y SETS DE GLUTEN
	
	public boolean hasGluten () { //Para booleanos se acostumbra por convenci�n poner has/is, en lugar de get
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
