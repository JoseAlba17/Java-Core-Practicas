//T�tulo: CasaConLamparas
//Fecha: 10/09/2019
//Autor: Jos� Mar�a Alba
//Descripci�n: Clase CasaConLamparas 
//Keywords: clases

public class CasaConLamparas {

	public static void main(String[] args) {
		
		Foco focoGalleta = new Foco();
		focoGalleta.setWatts(100);
		focoGalleta.setForma("Galleta");
		
		Lampara estrellaDormir = new Lampara(500, "Plastico", "Techo", focoGalleta);
		
		System.out.println("Encender l�mpara");
		estrellaDormir.encender();
		
		Foco focoLampara = estrellaDormir.getFoco();
		System.out.println("Color del foco: "+ estrellaDormir.getFoco().getColor());
		
		estrellaDormir.cambiarColor();
		System.out.println("Color del foco: "+ estrellaDormir.getFoco().getColor());
		
		estrellaDormir.encender();
	}

}
