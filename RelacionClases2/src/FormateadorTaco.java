
public class FormateadorTaco {

	public static String formatoOrden(Taco taco) {
		
		StringBuilder builder = new StringBuilder();
		builder.append("Taco de ");
		builder.append(taco.getGuiso().getNombre());
		int cantidad = taco.getToppings().length;
		CharSequence [] nombres = new CharSequence[cantidad];
		int contador = 0;
		for(Topping t: taco.getToppings()) {
			nombres[contador] = t.getNombre();
			contador++;
		}
		builder.append(" con ");
		builder.append(String.join(", ", nombres));
		
		return builder.toString();
	}
	
}
