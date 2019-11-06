//T�tulo: Prueba clase	
//Fecha: 09/09/2019
//Autor: Jos� Mar�a Alba
//Descripci�n: 
//Keywords: Clases 

public class PruebaClase {

	public static void main (String [] args) {
		
		//Instancias de la clase Pastel
		Pastel pastelNormal = new Pastel();
		Pastel pastelXV = new Pastel("Chocolate");
		
		//Acceder a los miembros de un objeto
		pastelNormal.setSabor("Chocomenta");
		pastelNormal.setTama�o('C');
		pastelNormal.setForma("Circulo");
		pastelNormal.setGluten(true);
		pastelNormal.setnumCalorias(1000);
		pastelNormal.settopping("Lunetas");
		pastelNormal.setcantidad(100);
		
		pastelXV.setSabor("Chocolate");
		pastelXV.setTama�o('G');
		pastelXV.setForma("Castillo");
		pastelXV.setGluten(false);
		pastelXV.setnumCalorias(5000);
		pastelXV.settopping("Chocochips");
		pastelXV.setcantidad(10000);
		
		System.out.println("Mostrando pasteles");
		System.out.println("Pastel normal");
		System.out.println("Sabor: " + pastelNormal.getSabor());
		System.out.println("Tama�o: " + pastelNormal.getTama�o());
		System.out.println("Forma: " + pastelNormal.getForma());
		System.out.println("Tiene gluten: " + pastelNormal.hasGluten());
		System.out.println("N�mero de calor�as: " + pastelNormal.getnumCalorias());
		System.out.println("Topping: " + pastelNormal.gettopping());
		System.out.println("Cantidad: " + pastelNormal.getcantidad());
		System.out.println();
		System.out.println("Pastel de XV A�os");
		System.out.println("Sabor: " + pastelXV.getSabor());
		System.out.println("Tama�o: " + pastelXV.getTama�o());
		System.out.println("Forma: " + pastelXV.getForma());
		System.out.println("Tiene gluten: " + pastelXV.hasGluten());
		System.out.println("N�mero de calor�as: " + pastelXV.getnumCalorias());
		System.out.println("Topping: " + pastelXV.gettopping());
		System.out.println("Cantidad: " + pastelXV.getcantidad());
	
	}
}
