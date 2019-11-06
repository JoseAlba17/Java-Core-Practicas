package insumos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import insumos.Archivo.Prioridad;

/**
 * @author josea
 *
 */
public class Agenda {

	public static final String EXTENSION = "txt";

	private String nombre;
	private String propietario;
	private List<Archivo> hojas;

	// Mantener una referencia a una hoja actual
	private Archivo hojaActual;

	public Agenda(String nombre) {
		this.nombre = nombre;
		this.hojas = new ArrayList<>();
	}

	public void escribir(String nombre, Archivo.Prioridad prioridad, String contenido) throws IOException {

		String nombreArchivo = String.format("%s.%s", nombre, EXTENSION);
		Archivo archivo = new Archivo(nombre, prioridad);
		archivo.setFecha(new Date());
		File archivoEscritura = new File(nombreArchivo);
		archivo.setContenido(archivoEscritura);
		if (!archivoEscritura.exists()) {
			// Se creo el archivo
			archivoEscritura.createNewFile();
		}
		// Destino de datos
		FileOutputStream archivoDestino = new FileOutputStream(archivoEscritura, true);
		archivoDestino.write(contenido.getBytes());
		archivoDestino.flush();
		archivoDestino.close();

		hojaActual = archivo;
		System.out.println("Se escribió el archivo");
	}

	public void escribir(String contenido) throws IOException {

		File archivoEscritura = hojaActual.getContenido();
		FileOutputStream archivoDestino = new FileOutputStream(archivoEscritura, true);
		archivoDestino.write(contenido.getBytes());
		archivoDestino.flush();
		archivoDestino.close();
	}

	public void crearHoja(String nombre, Prioridad prioridad) throws IOException {

		Archivo archivo = new Archivo(nombre, prioridad);
		archivo.setFecha(new Date());

		File archivoFisico = new File(String.format("%s.%s", nombre, EXTENSION));
		if (!archivoFisico.exists()) {
			archivoFisico.createNewFile();
		}
		archivo.setContenido(archivoFisico);

		// Establecer hoja actual para escritura
		hojaActual = archivo;

		// Agregar el archivo a la lista
		hojas.add(archivo);
	}

	public void arrancarHoja(String nombre) {

		for (int i = 0; i < hojas.size(); i++) {
			Archivo archivo = hojas.get(i);
			if (archivo.getNombre().equals(nombre)) {
				// Eliminar un archivo físico de SO
				archivo.getContenido().delete();
				// Eliminar el elemento dado por el índice
				hojas.remove(i);
				break;
			}
		}
	}
	
	public void hojear() {
		
		try {
			int contador = 1; 
			for (Archivo hoja : hojas) {
				System.out.println(contador + ". " + hoja.getNombre());
				leer(hoja.getContenido());
				contador++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * Método para leer los datos del archivo
	 * @param archivo Archivo que se va a leer
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public void leer(File archivo) throws FileNotFoundException, IOException{
		
		//Fuente de datos
		FileInputStream input = new FileInputStream(archivo);
		//Crear arreglo con la longitud de bytes del archivo
		byte[] data = new byte[input.available()];
		//Escribir datos en el archivo byte a byte
		input.read(data);
		
		//Conversión a caracteres: mostrar los bytes como String
		System.out.println(new String (data));
		input.close();
	}
	
	
	//Consultar archivos de manera física
	public void consultar() {
		
		// Obtener ruta donde se ejecuta el código
		String ruta = Paths.get("").toAbsolutePath().toString();
		File directorio = new File(ruta);
		File [] archivos = directorio.listFiles();
		
		for (File archivo: archivos) {
			System.out.println(archivo.getName());
		}
	}
	
	public void cerrar() {
		
		hojaActual = null;
		hojas.clear();
		System.out.println("¡Hasta pronto!");
	}
	
	public void cargar() {
		
	}
}
