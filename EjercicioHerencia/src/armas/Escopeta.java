//@title: Escopeta
//@date: 13/09/2019
//@author: Jos� Mar�a Alba
//@description: clase hija de la clase Arma
//@keywords: relaci�n de clases

package armas;

public class Escopeta extends Arma {

	private double peso;
	private String descripcion;
	private int fuerzaRetorno;
	private boolean proteccionRequerida;

	public Escopeta() {

	}

	public Escopeta(int calibreArma, String marca, boolean estaCargada, double peso, int fuerzaRetorno, boolean proteccionRequerida,  int municionesRestantes, int espacioRecamara) {
		super(calibreArma, marca, estaCargada, municionesRestantes, espacioRecamara);
		this.peso = peso;
		this.fuerzaRetorno = fuerzaRetorno;
		this.proteccionRequerida = proteccionRequerida;
	}

	public Escopeta(int calibreArma, String marca, boolean estaCargada, double peso, String descripcion, int fuerzaRetorno, boolean proteccionRequerida, int municionesRestantes, int espacioRecamara) {
		super(calibreArma, marca, estaCargada, municionesRestantes, espacioRecamara);
		this.peso = peso;
		this.descripcion = descripcion;
		this.fuerzaRetorno = fuerzaRetorno;
		this.proteccionRequerida = proteccionRequerida;
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

	// get y set de ProteccionRequerida//
	public boolean isProteccionRequerida() {
		return proteccionRequerida;
	}

	public void setRequiereProteccion(boolean requiereProteccion) {
		this.proteccionRequerida = requiereProteccion;
	}

	@Override
	public void cargarArma(Municion municion, Arma arma) {
		// TODO Auto-generated method stub
		System.out.println("Chuck chuck");
	}

	@Override
	public void dispararArma(Arma arma, Municion municion) {
		// TODO Auto-generated method stub
		System.out.println("PUUUM");
	}

	@Override
	public void mostrarSpecs(Arma arma, Municion municion) {
		// TODO Auto-generated method stub
		super.mostrarSpecs(arma, municion);
		System.out.println("Descripci�n: " + this.getDescripcion());
		System.out.println("Peso: " + this.getPeso());
		System.out.println("Fuerza de retorno al disparar: " + this.getFuerzaRetorno());
	}

}
