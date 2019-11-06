
public class Tazo {
	
	private String numero;
	private String tipo;
	private int nivel;
	private String nombrePersonaje;

	public Tazo() {
	
	}

	public Tazo(String numero, String tipo, int nivel, String nombrePersonaje) {
		super();
		this.numero = numero;
		this.tipo = tipo;
		this.nivel = nivel;
		this.nombrePersonaje = nombrePersonaje;
	}

	//Get y Set de Numero//
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	//Get y Set de Tipo//
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	//Get y Set de Nivel//
	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	//Get y Set de NombrePersonaje//
	public String getNombrePersonaje() {
		return nombrePersonaje;
	}

	public void setNombrePersonaje(String nombrePersonaje) {
		this.nombrePersonaje = nombrePersonaje;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nombrePersonaje;
	}
	
	
	
	

}
