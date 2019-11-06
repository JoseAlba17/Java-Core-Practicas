import javax.swing.*;
import java.util.*;
public class While {

	public static void main(String[] args) {
		
		String nombre;
		int Aleatorio;
		int Numero;
		int Intentos;
		
		nombre = "";
		
		Scanner in;
		in = new Scanner(System.in);
		
		//System.out.printf("%1.0f", Math.random()*100);
		
		nombre = JOptionPane.showInputDialog("Bienvenido a mi juego numerico. \n Por favor, introduce tu nombre");
		JOptionPane.showMessageDialog(null, "Hola, " + nombre);
		
		Aleatorio = (int)(Math.random()*100);
		
		Numero = 0;
		Intentos = 0;
		
		while(Numero!=Aleatorio) {
			Intentos++;
			Numero = Integer.parseInt(JOptionPane.showInputDialog("Ahora, introduce cualquier numero entre 1 - 100"));
			if(Aleatorio < Numero) {
				JOptionPane.showInternalMessageDialog(null, "¡Mas bajo!");
				//System.out.println("Mas bajo");
				
			}
			
			else if(Aleatorio > Numero) {
				JOptionPane.showInternalMessageDialog(null, "¡Mas alto!");
				//System.out.println("Mas alto");
			}
			
		}
		
		JOptionPane.showMessageDialog(null, "Acertaste. Lo lograste en " + Intentos +
				" intentos.");
		
		
		
		
		
		
		
		
		
		

	}

}
