package n1ejercicio7;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListaOrdenadaDesc {

	public ListaOrdenadaDesc() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

	 
	List<String>  palabras = Arrays.asList("Java", "Lambdas",  "Stream", "APIxxxxxxxxx");

    palabras.sort( ( (o1,o2) ->  Integer.compare( o2.length() ,    o1.length()  )      )     ) ;
	palabras.forEach(System.out::println );
	
	
	List<String>  palabras2 = Arrays.asList("Java","444444", "Lambdas", "8888", "Stream tres", "APIxxxxxxxxx", "a", "1334");

	
   palabras2.sort ( ( (o1,o2) ->  Integer.compare( o2.length() ,    o1.length()  )  )        ) ;
	    
   palabras2.forEach(System.out::println );
	
	
	}
	
	
	
}
