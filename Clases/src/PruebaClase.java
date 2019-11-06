//Título: Prueba clase	
//Fecha: 09/09/2019
//Autor: José María Alba
//Descripción: 
//Keywords: Clases 

public class PruebaClase {

	public static void main (String [] args) {
		
		//Instancias de la clase Pastel
		Pastel pastelNormal = new Pastel();
		Pastel pastelXV = new Pastel("Chocolate");
		
		//Acceder a los miembros de un objeto
		pastelNormal.setSabor("Chocomenta");
		pastelNormal.setTamaño('C');
		pastelNormal.setForma("Circulo");
		pastelNormal.setGluten(true);
		pastelNormal.setnumCalorias(1000);
		pastelNormal.settopping("Lunetas");
		pastelNormal.setcantidad(100);
		
		pastelXV.setSabor("Chocolate");
		pastelXV.setTamaño('G');
		pastelXV.setForma("Castillo");
		pastelXV.setGluten(false);
		pastelXV.setnumCalorias(5000);
		pastelXV.settopping("Chocochips");
		pastelXV.setcantidad(10000);
		
		System.out.println("Mostrando pasteles");
		System.out.println("Pastel normal");
		System.out.println("Sabor: " + pastelNormal.getSabor());
		System.out.println("Tamaño: " + pastelNormal.getTamaño());
		System.out.println("Forma: " + pastelNormal.getForma());
		System.out.println("Tiene gluten: " + pastelNormal.hasGluten());
		System.out.println("Número de calorías: " + pastelNormal.getnumCalorias());
		System.out.println("Topping: " + pastelNormal.gettopping());
		System.out.println("Cantidad: " + pastelNormal.getcantidad());
		System.out.println();
		System.out.println("Pastel de XV Años");
		System.out.println("Sabor: " + pastelXV.getSabor());
		System.out.println("Tamaño: " + pastelXV.getTamaño());
		System.out.println("Forma: " + pastelXV.getForma());
		System.out.println("Tiene gluten: " + pastelXV.hasGluten());
		System.out.println("Número de calorías: " + pastelXV.getnumCalorias());
		System.out.println("Topping: " + pastelXV.gettopping());
		System.out.println("Cantidad: " + pastelXV.getcantidad());
	
	}
}
