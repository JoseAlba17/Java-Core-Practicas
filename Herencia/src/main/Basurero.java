package main;
/*import Basura.Basura;
import Basura.Inorganica;
import Basura.Organica;*/
import Basura.*;

//@title: Basurero
//@date: 12/09/2019
//@author: José María Alba
//@description:
//@keywords: relación de clases

public class Basurero {

	public static void main(String[] args) {
		
		Basura basura = new Basura(10, 50, "Sólido", 3);
		Organica organica = new Organica();
		organica.degradarse();
		
		//Polimorfismo
		Basura comida = new Organica();//Comida es basura pero del tipo orgánica, porque Organica hereda de la case Basura
		comida.degradarse();
		
		Basura botella = new Inorganica(11,50,"Sólido", 100, "Plástico");
		botella.degradarse();
		
		Organica cascaraNaranja = new Organica(100, 1, "Solido", 1, 1, 3, true);
		
		Filtro.separarBasura(cascaraNaranja);
		
		Basura bolsa [] = new Basura[5];
		bolsa[0] = comida;
		bolsa[1] = botella;
		bolsa[2] = cascaraNaranja;
		bolsa[3] = new Inorganica(11,50,"Solido", 150, "Metal");
		bolsa[4] = new Organica(0.5f, 1,"Sólido", 10, 1, 5.3f,false);
		
		Filtro.separarBolsa(bolsa);

	}

}
