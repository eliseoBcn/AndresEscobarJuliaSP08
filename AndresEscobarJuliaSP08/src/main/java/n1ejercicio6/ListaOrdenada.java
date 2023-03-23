package n1ejercicio6;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

 
import n1ejercicio5.INumeroPi;
import n1ejercicio5.NumeroPi;

public class ListaOrdenada {

	public ListaOrdenada() {
		// TODO Auto-generated constructor stub
	}


	public static void main(String[] args) {
//		

	 
	List<String>  palabras = Arrays.asList("Java", "Lambdas",  "Stream tres", "APIxxxxxxxxx", "a");

	
   palabras.sort ( ( (o1,o2) ->  Integer.compare( o1.length() ,    o2.length()  )  )        ) ;
    
	palabras.forEach(System.out::println );
	
	List<String>  palabras2 = Arrays.asList("Java","444444", "Lambdas", "8888", "Stream tres", "APIxxxxxxxxx", "a", "1334");

	
	   palabras2.sort ( ( (o1,o2) ->  Integer.compare( o1.length() ,    o2.length()  )  )        ) ;
	    
		palabras2.forEach(System.out::println );
		
	
	}



}
