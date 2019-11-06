/*T�tulo: Producto
 * Fecha: 09/09/2019
 * Autor: Jos� Mar�a Alba
 * Descripci�n: clase que almacena todos los atributos y m�todos de un producto
 * Keywords: Clases
*/

public class Producto {

	//Declaraci�n de atributos o variables de la clase
	private long codigo; //C�digo UPC
	private String descripcion; //Descripci�n del producto
	private float precio; //Precio en d�lares del producto
	private int cantidad;//Cantidad en inventario
	private boolean enExistencia; //Indicador de existencia en inventario
	private char status; //Indicador del status
	
	//M�todo Constructor predeterminado
	public Producto() {
		
	}
	
	//M�todo Constructor parametrizado
	public Producto(long codigo, String descripcion, float precio, int cantidad, boolean enExistencia, char status) {
		
		//Inicializaci�n de variables de instancia
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precio = precio;
		this.cantidad = cantidad;
		this.enExistencia = enExistencia;
		this.status = status;
	}
	
	//GET y SET DEL ATRIBUTO CODIGO
	
	public long getCodigo () {
		return codigo;
	}
	
	public void setCodigo (long codigo) {
		this.codigo = codigo;
	}
	
	//GET y SET DEL ATRIBUTO DESCRIPCION
	
	public String getDescripcion () {
		return descripcion;
	}
	
	public void setDescripcion (String descripcion) {
		this.descripcion = descripcion;
	}
	
	//GET y SET DEL ATRIBUTO PRECIO
	
	public float getPrecio() {
		return precio;
	}
	
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	//GET y SET DEL ATRIBUTO CANTIDAD
	
	public int getCantidad () {
		return cantidad;
	}
	
	public void setCantidad (int cantidad) {
		this.cantidad = cantidad;
	}
	
	//GET y SET DEL ATRIBUTO ENEXISTENCIA
	
	public boolean getEnExistencia () {
		return enExistencia;
	}
	
	public void setEnExistencia(boolean enExistencia) {
		this.enExistencia = enExistencia;
	}
	
	//GET y SET DEL ATRIBUTO STATUS
	
	public char status () {
		return status;
	}
	
	public void status (char status) {
		this.status = status;
	}
}
