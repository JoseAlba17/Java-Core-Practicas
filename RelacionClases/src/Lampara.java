//Título: Lampara
//Fecha: 10/09/2019
//Autor: José María Alba
//Descripción: Clase lámpara 
//Keywords: clases 

import java.util.Random;

public class Lampara {

	private static final String [] colores = {"Verde", "Rojo", "Rosa","Amarillo", "Azul"};
	
	private int lumens;
	private String material;
	private String lugar;
	
	private Foco foco;
	
	public Lampara(int lumens, String material, String lugar, Foco foco) {
		this.lumens = lumens;
		this.material = material;
		this.lugar = lugar;
		foco.setColor(colores[0]);
		this.foco = foco;
	}
	
	public Lampara(int lumens, String material, Foco foco) {
		this.lumens = lumens;
		this.material = material;
		this.foco = foco;
	}
	
	public Lampara(int lumens, Foco foco) {
		this.lumens = lumens;
		this.foco = foco;
	}
	
	//Get y Set de Lumens
	public int getLumens() {
		return lumens;
	}
	
	public void setLumens(int lumens) {
		this.lumens = lumens;
	}
	
	//Get y Set de Meterial
	public String getMaterial() {
		return material;
	}
	
	public void setMaterial(String material) {
		this.material = material;
	}
	
	//Get y Set de Lugar
	public String getLugar() {
		return lugar;
	}
	
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	
	//Get y Set de Foco
	public Foco getFoco() {
		return foco;
	}
	
	public void setFoco(Foco foco) {
		this.foco = foco;
	}
	
	public void encender () {
		foco.setColor(colores[0]);
		foco.setEncendido(!foco.estaEncendido());
		if (foco.estaEncendido()) {
			System.out.println("Encendido");
		} else {
			System.out.println("");
		}
	}
	
	public void cambiarColor() {
		Random random = new Random();
		foco.setColor(colores[random.nextInt(colores.length)]);
	}
}
