//@title: Arma
//@date: 13/09/2019
//@author: Jos� Mar�a Alba
//@description: clase padre, relacionada con la clase Municion 
//@keywords: relaci�n de clases

package armas;

public class Arma {
	
	private int calibreArma;
	private String marca;
	private boolean estaCargada = false;
	private int espacioRecamara;
	private int municionesRestantes;
	
	public Arma() {
		super();
	}

	public Arma(int calibreArma, String marca, boolean estaCargada, int municionesRestantes, int espacioRecamara) {
		super();
		this.calibreArma = calibreArma;
		this.marca = marca;
		this.estaCargada = estaCargada;
		this.municionesRestantes = municionesRestantes;
		this.espacioRecamara = espacioRecamara;
		
	}

	//get y set de CalibreArma//
	public int getCalibreArma() {
		return calibreArma;
	}

	public void setCalibreArma(int calibreArma) {
		this.calibreArma = calibreArma;
	}

	//get y set de marca//
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		marca = marca;
	}

	//get y set de EstaCargada//
	public boolean EstaCargada(Arma arma) {
		if (arma.getMunicionesRestantes() > 0) {
			arma.setEstaCargada(true);
		} else {
			arma.setEstaCargada(false);
		}
		
		return estaCargada;
	}

	public void setEstaCargada(boolean estaCargada) {
		this.estaCargada = estaCargada;
	}
	
	//get y set de MunicionesRestantes//
	public int getMunicionesRestantes() {
		return municionesRestantes;
	}

	public void setMunicionesRestantes(int municionesRestantes) {
		this.municionesRestantes = municionesRestantes;
	}

	//get y set de EspacioRecamara//
	public int getEspacioRecamara() {
		return espacioRecamara;
	}

	public void setEspacioRecamara(int espacioRecamara) {
		this.espacioRecamara = espacioRecamara;
	}

	//M�todo para cargar arma
	public void cargarArma (Municion municion, Arma arma) {

		if(arma.getMunicionesRestantes() < arma.getEspacioRecamara()) {
			
			if(municion.getCalibre() != arma.getCalibreArma()) {
				System.out.println("Calibre err�neo para el arma seleccionada. "
						+ "Por favor use el calibre correcto");
			} else {
				arma.municionesRestantes++;
				System.out.println("Se ha puesto una bala en la rec�mara del arma y est�" 
				+ " lista para usarse");
							
			}

		} else {
			System.out.println("Arma cargada al m�ximo. No queda espacio "
					+ "para m�s balas en al rec�mara. ");
		}
	}
	
	public void dispararArma (Arma arma, Municion municion) {
		if(arma.getMunicionesRestantes() == 0) {
			System.out.println("Arma descargada. Favor de cargar munici�n.");
		} else {
			municion.detonacion();
			arma.municionesRestantes--;			
		}
		
	}
	
	public void mostrarSpecs(Arma arma, Municion municion) {
		System.out.println("Arma selecionada: " + arma.getMarca());
		System.out.println("Calibre: " + arma.getCalibreArma());
		System.out.println("Estado de rec�mara: " + arma.getMunicionesRestantes() + "/" + arma.getEspacioRecamara() + " balas");
	}
	
}
