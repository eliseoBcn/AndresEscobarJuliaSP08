package n1ejercicio3;

import java.util.ArrayList;

public class TestEjercicio3 {

	public TestEjercicio3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		ArrayList<String> listaMeses  = new ArrayList<String>();
		// Añadimos elementos
		listaMeses.add("Enero");
		listaMeses.add("Febrero");
		listaMeses.add("Marzo");
		listaMeses.add("Abril");
		listaMeses.add("Mayo");
		listaMeses.add("Junio");
		listaMeses.add("Julio");
		listaMeses.add("Agosto");
		listaMeses.add("Septiembre");
		listaMeses.add("Octubre");
		listaMeses.add("Noviembre");		
		listaMeses.add("Diciembre");
 
 		listaMeses.forEach((n) -> System.out.println(n));
	}

}
