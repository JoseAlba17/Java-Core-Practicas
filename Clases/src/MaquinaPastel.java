
public class MaquinaPastel {
	//Variables de clase
	public static final int CANTIDAD_MAX = 50;
	public static final int CANTIDAD_GAS_MAX = 600;
	
	//Variables de instancia
	private int numeroPasteles;
	private boolean encendida;
	private int cantidadGas;
	private int temperatura;
	
	public MaquinaPastel () {
		
	}
	
	public MaquinaPastel (int numeroPasteles, 
			boolean encendida, int cantidadGas, 
			int temperatura) {
		
		this.numeroPasteles = numeroPasteles;
		this.encendida = encendida;
		this.cantidadGas = cantidadGas;
		this.temperatura = temperatura;
	}
	
	public MaquinaPastel (int cantidadGas, int temperatura) {
		this.cantidadGas = cantidadGas;
		this.temperatura = temperatura;
	}
	
	//GET y SET de numeroPasteles
	public int getNumeroPasteles () {
		return numeroPasteles;
	}
	
	public void setNumeroPasteles (int numeroPasteles) {
		this.numeroPasteles = numeroPasteles;
	}
	
	//GET y SET de encendida
	public boolean isEncendida () {
		return encendida;
	}
	
	public void setEncendida (boolean encendida) {
		this.encendida = encendida;
	}
	
	//GET y SET de cantidadGas
	public int getCantidadGas () {
		return cantidadGas;
	}
	
	public void setCantidadGas (int cantidadGas) {
		this.cantidadGas = cantidadGas;
	}
	
	//GET y SET de temperatura
	public int getTemperatura () {
		return temperatura;
	}
	
	public void setTemperatura (int temperatura) {
		this.temperatura = temperatura;
	}
	
	public void encender () {
		encendida = true;
		System.out.println("M�quina encendida. �Lista para operar!");
	}
	
	public void apagar () {
		encendida = false;
		System.out.println("M�quina apagada.");
	}
	
	public void abastecerGas () {
		if (cantidadGas < CANTIDAD_GAS_MAX) {
			setCantidadGas(cantidadGas += 10);
			System.out.println("�Ya hay gas!");
		} else {
			System.out.println("El tanque est� lleno");
		}
	}
	
	public void alarma () {
		System.out.println("Titititititititititiii!!!");
		System.out.println("Pastel terminado");
	}
	
	public void ajustaTermperatura (int grados) {
		setTemperatura(temperatura += grados);
	}
	
	public Pastel hornear(String sabor, char tama�o, String topping) {
		
		if(encendida) {
			
			System.out.println("Empezando a hornear");
			
			Pastel pastel = new Pastel();
			pastel.setSabor(sabor);
			pastel.setTama�o(tama�o);
			pastel.settopping(topping);
			
			numeroPasteles++;
			cantidadGas-=10;
			verificarGas();
			
			alarma();
			
			return pastel;
		} else {
			return null;
		}
				
	}
	
	public Pastel [] hornear (int cantidad, String sabor) {
		
		//Arreglo de referencias o arreglo de objetos
		Pastel [] pasteles = new Pastel[cantidad];
		
		for(int i = 0; i < cantidad; i++) {
			pasteles[i] = new Pastel(sabor);
			//Acceder al objeto en el �ndice
			//Establecer tama�o a S
			pasteles[i].setTama�o('S');
		}
		
		return pasteles;
	}
	
	public void verificarGas() {
		
		if(cantidadGas <= 0) {
			System.out.println("Se acab� el gas. Por favor llena el tanque.");
			abastecerGas();
		}
		
	}
}
