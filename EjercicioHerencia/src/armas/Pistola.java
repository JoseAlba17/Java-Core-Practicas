//@title: Pistola
//@date: 13/09/2019
//@author: José María Alba
//@description: clase hija de la clase Arma
//@keywords: relación de clases

package armas;

public class Pistola extends Arma {

	private double peso;
	private String descripcion;
	private int fuerzaRetorno;

	public Pistola() {
	}

	public Pistola(int calibreArma, String marca, boolean estaCargada, double peso, int fuerzaRetorno,
			int municionesRestantes, int espacioRecamara) {
		super(calibreArma, marca, estaCargada, municionesRestantes, espacioRecamara);
		this.peso = peso;
		this.fuerzaRetorno = fuerzaRetorno;
	}

	public Pistola(int calibreArma, String marca, boolean estaCargada, double peso, String descripcion,
			int fuerzaRetorno, int municionesRestantes, int espacioRecamara) {
		super(calibreArma, marca, estaCargada, municionesRestantes, espacioRecamara);
		this.peso = peso;
		this.descripcion = descripcion;
		this.fuerzaRetorno = fuerzaRetorno;
	}

	// get y set de Peso//
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	// get y set de Descripcion//
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	// get y set de FuerzaRetorno//
	public int getFuerzaRetorno() {
		return fuerzaRetorno;
	}

	public void setFuerzaRetorno(int fuerzaRetorno) {
		this.fuerzaRetorno = fuerzaRetorno;
	}

	@Override
	public void cargarArma(Municion municion, Arma arma) {
		// TODO Auto-generated method stub
		System.out.println("Click");
	}

	@Override
	public void dispararArma(Arma arma, Municion municion) {
		// TODO Auto-generated method stub
		System.out.println("BANG!!");
		/*
		 * System.out.println("Arma que disparó: " + arma.getMarca());
		 * System.out.println("Calibre: " + arma.getCalibreArma());
		 * System.out.println("Balas restantes/Capacidad: "+
		 * arma.getMunicionesRestantes() + "/" + arma.getEspacioRecamara());
		 */
	}

	@Override
	public void mostrarSpecs(Arma arma, Municion municion) {
		// TODO Auto-generated method stub
		super.mostrarSpecs(arma, municion);
		System.out.println("Descripción: " + this.getDescripcion());
		System.out.println("Peso: " + this.getPeso());
		System.out.println("Fuerza de retorno al disparar: " + this.getFuerzaRetorno());
	}

}
