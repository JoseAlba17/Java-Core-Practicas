package main;

public class VoladorDePapantla extends Persona implements Evolucionable, Armonizable {

	private boolean armoniza;
	private short experiencia;
	
	
	//get y set de Armoniza//
	public boolean isArmoniza() {
		return armoniza;
	}

	public void setArmoniza(boolean armoniza) {
		this.armoniza = armoniza;
	}

	//get y set de Experiencia//
	public short getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(short experiencia) {
		this.experiencia = experiencia;
	}

	@Override
	public void volar() {
		// TODO Auto-generated method stub
		System.out.println("Vuela dando vueltas en Veracruz");
	}

	@Override
	public void fusionar(Persona persona) {
		// TODO Auto-generated method stub
		System.out.println("No se puede fusionar.");
	}

	@Override
	public void usarPoder() {
		// TODO Auto-generated method stub
		System.out.println("Ataque no mareador");
	}

	public void vomitar() {
		if (experiencia < 5) {
			System.out.println("Se va a guacarear");
			experiencia += 2;
		} else {
			System.out.println("Aguanta un rato más");
		}
	}

	@Override
	public void armonizar(String sonido) {
		// TODO Auto-generated method stub
		if(experiencia > 5 && armoniza) {
			System.out.println("Se escucha música de fondo: " + sonido);
		} else {
			System.out.println("Subete a volar");
		}
	}
}
