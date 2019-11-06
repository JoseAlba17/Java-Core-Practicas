/*Título: Producto
 * Fecha: 09/09/2019
 * Autor: José María Alba
 * Descripción: clase que almacena todos los atributos y métodos de un producto
 * Keywords: Clases
*/

public class Producto {

	//Declaración de atributos o variables de la clase
	private long codigo; //Código UPC
	private String descripcion; //Descripción del producto
	private float precio; //Precio en dólares del producto
	private int cantidad;//Cantidad en inventario
	private boolean enExistencia; //Indicador de existencia en inventario
	private char status; //Indicador del status
	
	//Método Constructor predeterminado
	public Producto() {
		
	}
	
	//Método Constructor parametrizado
	public Producto(long codigo, String descripcion, float precio, int cantidad, boolean enExistencia, char status) {
		
		//Inicialización de variables de instancia
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
