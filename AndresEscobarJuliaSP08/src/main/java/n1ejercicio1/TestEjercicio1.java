package n1ejercicio1;

import java.util.ArrayList;

public class TestEjercicio1 {

	public TestEjercicio1() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		
	    // Texto
	ArrayList<String> listaMeses  = new ArrayList<String>();
	// Añadimos elementos
	listaMeses.add("En");
	listaMeses.add("un");
	listaMeses.add("lugar");
	listaMeses.add("de");
	listaMeses.add("la");
	listaMeses.add("Mancha");
	listaMeses.add("cuyo");
	listaMeses.add("nombre");
	listaMeses.add("no");
	listaMeses.add("quiero");
	listaMeses.add("acordarme");		

	
//	listaMeses.forEach((listaMeses) -> System.out.println(listaMeses));

	listaMeses.forEach((n) -> System.out.println(n));
	
	System.out.println("-------------Con filtro---------------- ");
	listaMeses.stream()
		.filter(name-> name.contains("o")).forEach(System.out::println);

	    
	}
}
