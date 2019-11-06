//@title: Municion
//@date: 13/09/2019
//@author: José María Alba
//@description: Clase relacionada con la clase Arma
//@keywords: relación de clases

package armas;

public class Municion {

	private int calibre;
	private String marca;
	private boolean tienePerdigones;
	
	public Municion() {
	
	}

	public Municion(int calibre, String marca, boolean tienePerdigones) {
		super();
		this.calibre = calibre;
		this.marca = marca;
		this.tienePerdigones = tienePerdigones;
	}
	
	public Municion(int calibre, boolean tienePerdigones) {
		super();
		this.calibre = calibre;
		this.tienePerdigones = tienePerdigones;
	}

	//get y set de Calibre//
	public int getCalibre() {
		return calibre;
	}

	public void setCalibre(int calibre) {
		this.calibre = calibre;
	}

	//get y set de Marca//
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	//get y set de TienePerdigones//
	public boolean isTienePerdigones() {
		return tienePerdigones;
	}

	public void setTienePerdigones(boolean tienePerdigones) {
		this.tienePerdigones = tienePerdigones;
	}
		
	public void detonacion () {
		System.out.println("PUM!!!");
	}
}
