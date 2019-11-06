import java.util.Scanner;
public class MyDoWhile {
	public static void main(String[] args) {
		
		boolean posponer=false;
		short minutosTranscurridos=0;
		Scanner scanner=null;
		
		scanner=new Scanner(System.in);
		
		System.out.println("Ya levantese son las 7a.m.");
		
		do {
			System.out.println("Posponer la alarma?");
			posponer=scanner.nextLine().equalsIgnoreCase("si");
			System.out.println(posponer?"No sea flojo compa":
				"Animo, a darle");
			minutosTranscurridos+=10;
			if (minutosTranscurridos>=30) {
				while (posponer) {
					System.out.println("LEVANTATE!");
					posponer=!scanner.nextLine().equalsIgnoreCase("si");
				}
			}
		}while(posponer);
		scanner.close();
	}
}
