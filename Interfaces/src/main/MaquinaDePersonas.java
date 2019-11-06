package main;

public class MaquinaDePersonas {

	public static void main(String[] args) {

		Persona personaNormal = new Persona("Pancho", (short) 50, 1.80f);
		personaNormal.comer();

		SuperHeroe superman = new SuperHeroe("Clark", (short)31, 1.91f, "Super fuerza", "Superman");
		superman.volar();
		
		VoladorDePapantla elvolador = new VoladorDePapantla();
		elvolador.setExperiencia((short)6);
		elvolador.setArmoniza(true);
		elvolador.armonizar(" Jarabe Tapatío ");
		
		//Asignación polimórfica
		Evolucionable evolucionable = superman;
		evolucionable.volar();
	}
}
