package main;

public class SuperHeroe extends Persona implements Evolucionable {

	private String poder;
	private String nombre;
	
	

	public SuperHeroe(String nombre, short edad, float estatura, String poder, String alias) {
		super(nombre,edad,estatura);
		this.poder = poder;
		this.nombre = alias;
	}

	//get y set de Poder//
	public String getPoder() {
		return poder;
	}

	public void setPoder(String poder) {
		this.poder = poder;
	}

	//get y set de Nombre//
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void volar() {
		// TODO Auto-generated method stub
		System.out.println(nombre + " vuela");
	}

	@Override
	public void fusionar(Persona persona) {
		// TODO Auto-generated method stub
		System.out.println(" Fuuuusión! con " + persona.getNombre());
	}

	@Override
	public void usarPoder() {
		// TODO Auto-generated method stub
		System.out.println(" Ataque con " + poder);
	}
	
}
