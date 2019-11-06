package Basura;
//@title: Basura
//@date: 12/09/2019
//@author: José María Alba
//@description: superclase para diferenciar tipo de basura
//@keywords: relación de clases

public class Basura {

	private float peso;//Peso de la carga
	private int volumen;//Volumen de la carga
	private String estado;//Estado de la materia
	private int degradacion;//Tiempo de descomposicion
	private boolean esToxico;
	private short nivelToxico;
	
	public Basura() {
		
	}

	public Basura(float peso, int volumen, String estado, int degradacion, boolean esToxico,
			short nivelToxico) {
		this.peso = peso;
		this.volumen = volumen;
		this.estado = estado;
		this.degradacion = degradacion;
		this.esToxico = esToxico;
		this.nivelToxico = nivelToxico;
	}

	public Basura(float peso, int volumen, String estado, int degradacion) {
		this.peso = peso;
		this.volumen = volumen;
		this.estado = estado;
		this.degradacion = degradacion;
	}

	//get y set de Peso//
	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	//get y set de Volumen//
	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}

	//get y set de Estado//
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	//get y set de Degradacion//
	public int getDegradacion() {
		return degradacion;
	}

	public void setDegradacion(int degradacion) {
		this.degradacion = degradacion;
	}

	//get y set de EsToxico//
	public boolean isEsToxico() {
		return esToxico;
	}

	public void setEsToxico(boolean esToxico) {
		this.esToxico = esToxico;
	}

	//get y set de NivelToxico//
	public short getNivelToxico() {
		return nivelToxico;
	}

	public void setNivelToxico(short nivelToxico) {
		this.nivelToxico = nivelToxico;
	}
	
	public void degradarse() {
		System.out.println("La basura se ha degrada en " + degradacion);
	}
}
