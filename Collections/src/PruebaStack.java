import java.util.Stack;

public class PruebaStack {

	public static void main(String[] args) {
		
		//Declaración e instanciación de la fila
		Stack<Tazo> portaTazos = new Stack<Tazo>();
		
		//Agregarlos a la pila (PortaTazos)
		portaTazos.push(new Tazo("342", "Normal",4,"Calamardo guapo"));
		portaTazos.push(new Tazo("424","Metalico",3,"Colorburguer"));
		
		System.out.println("");
		System.out.println(portaTazos.toString());
		System.out.println("Numero de tazos: " + portaTazos.size());
		
		portaTazos.push(new Tazo("0","Especial", 3, "Bob Esponja Peste"));
		
		System.out.println("");
		System.out.println(portaTazos.toString());
		System.out.println("Numero de tazos: " + portaTazos.size());
		
		portaTazos.push(new Tazo("1234","Metalico", 1, "Los chicos que lloran"));
		portaTazos.push(new Tazo("3124","Normal", 2, "Don Cangrejo"));
		portaTazos.push(new Tazo("3","Normal", 5, "Patricio Estrella"));
		portaTazos.push(new Tazo("5","Metalico", 4, "Gary"));
		
		System.out.println("");
		System.out.println(portaTazos.toString());
		System.out.println("Numero de tazos: " + portaTazos.size());
		
		Tazo tazoTope = portaTazos.peek();
		System.out.println("Tazo tope: " + tazoTope);
		
		System.out.println("");
		System.out.println("Sacar tazos (pop)");
		portaTazos.pop();
		portaTazos.pop();
		portaTazos.pop();
		
		System.out.println("");
		System.out.println(portaTazos.toString());
		System.out.println("Numero de tazos: " + portaTazos.size());
		
		while(!portaTazos.isEmpty()) {
			portaTazos.pop();
			System.out.println(portaTazos.toString());
		}
	}

}
