package Basura;

public class Inorganica extends Basura {

	private String tipo;
	
	public Inorganica () {
		
	}
	
	public Inorganica (float peso, int volumen, String estado, int degradacion) {
		super(peso, volumen, estado, degradacion);
		this.tipo = "Plástico";
	}
	
	public Inorganica (float peso, int volumen, String estado, int degradacion, String tipo) {
		super(peso, volumen, estado, degradacion);
		this.tipo = tipo;
	}

	//get y set de Tipo//
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public void degradarse() {
		// TODO Auto-generated method stub
		System.out.println("La basura inorgánica tarda más en degradarse.");
	}
	
}
