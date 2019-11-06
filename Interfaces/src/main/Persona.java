package main;

public class Persona implements Accionable {

	private String nombre;
	private short edad;
	private float estatura;

	public Persona() {

	}

	public Persona(String nombre, short edad, float estatura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.estatura = estatura;
	}

	//get y set de Nombre//
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//get y set de Edad//
	public short getEdad() {
		return edad;
	}

	public void setEdad(short edad) {
		this.edad = edad;
	}

	//get y set de Estatura//
	public float getEstatura() {
		return estatura;
	}

	public void setEstatura(float estatura) {
		this.estatura = estatura;
	}

	@Override
	public void despertar() {
		// TODO Auto-generated method stub
		System.out.println(nombre + " despierta");
	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		System.out.println(nombre + " come");
	}

	@Override
	public void caminar() {
		// TODO Auto-generated method stub
		System.out.println(nombre + " camina");
	}

	@Override
	public void respirar() {
		// TODO Auto-generated method stub
		System.out.println(nombre + " respira");
	}

	@Override
	public void dormir() {
		// TODO Auto-generated method stub
		System.out.println(nombre + " duerme");
	}

	@Override
	public void pensar() {
		// TODO Auto-generated method stub
		System.out.println(nombre + " piensa");
	}

}
