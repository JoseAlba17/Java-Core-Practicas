package Basura;
//@title: Organica
//@date: 12/09/2019
//@author: José María Alba
//@description: 
//@keywords: relación de clases

public class Organica extends Basura {
	
	private int cantidadLixiviados;
	private float nivelPh;
	private boolean apesta;
	
	public Organica() {
		super(10, 500, "Sólido", 1);
	}
	
	public Organica (float peso, int volumen, String estado, int degradacion, int cantidad, float nivelPh, boolean apesta) {
		//Se debe inicializar primero la clase padre o superclase, por eso esta línea va primero que las instancias.
		super(peso, volumen, estado, degradacion);//Superconstructor
		
		this.cantidadLixiviados = cantidad;
		this.nivelPh = nivelPh;
		this.apesta = apesta;
	}
	
	public Organica (int cantidad, float nivelPh, boolean apesta) {
		
		this.cantidadLixiviados = cantidad;
		this.nivelPh = nivelPh;
		this.apesta = apesta;
	}

	//get y set de CantidadLixiviados//
	public int getCantidadLixiviados() {
		return cantidadLixiviados;
	}

	public void setCantidadLixiviados(int cantidadLixiviados) {
		this.cantidadLixiviados = cantidadLixiviados;
	}

	//get y set de NivelPh//
	public float getNivelPh() {
		return nivelPh;
	}

	public void setNivelPh(float nivelPh) {
		this.nivelPh = nivelPh;
	}

	//get y set de Apesta//
	public boolean isApesta() {
		return apesta;
	}

	public void setApesta(boolean apesta) {
		this.apesta = apesta;
	}

	@Override
	public void degradarse() {
		// TODO Auto-generated method stub
		System.out.println("La basura orgánica tarda menos en degradarse");
	}
	
	
}
