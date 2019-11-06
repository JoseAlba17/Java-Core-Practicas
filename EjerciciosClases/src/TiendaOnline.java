/*Título: Tienda Online
 * Fecha: 09/09/2019
 * Autor: José María Alba
 * Descripción: ejemplo con una tienda online del uso de clases
 * Keywords: Clases
*/

import java.util.Scanner;

public class TiendaOnline {

	public static void main (String [] args) {

		//Instancias de la clase Producto y Scanner
		Producto nuevoProducto = new Producto();
		Scanner scanner = new Scanner(System.in);
		String desc = null;
		
		System.out.print("Ingresa código UPC: ");
		nuevoProducto.setCodigo(scanner.nextLong());
				
		System.out.print("Ingresa cantidad del producto: ");
		nuevoProducto.setCantidad(scanner.nextInt());
		scanner.nextLine();
		
		System.out.print("Ingresa la descripción del producto: ");
		desc = scanner.nextLine();
		nuevoProducto.setDescripcion(desc);
		
		System.out.print("Ingresa el precio del producto: ");
		nuevoProducto.setPrecio(scanner.nextFloat());
		
		System.out.print("¿Hay existencias del producto en inventario? ");
		nuevoProducto.setEnExistencia(scanner.next().equalsIgnoreCase("si"));
		
		System.out.print("¿Qué status tiene el producto? ");
		nuevoProducto.setCantidad(scanner.next().charAt(0));
		
		scanner.close();
		
		System.out.println("");
		System.out.println("El producto ingresado es:");
		System.out.println("Código UPC: " + nuevoProducto.getCodigo());
		System.out.println("Cantidad: " + nuevoProducto.getCantidad());
		System.out.println("Descripción:" + nuevoProducto.getDescripcion());
		System.out.println("Precio: $" + nuevoProducto.getPrecio());
		System.out.println("Se tenía en inventario: " + nuevoProducto.getEnExistencia());
		
	}
}
