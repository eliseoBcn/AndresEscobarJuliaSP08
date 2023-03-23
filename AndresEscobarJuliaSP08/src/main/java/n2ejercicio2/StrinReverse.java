package n2ejercicio2;

public class StrinReverse {

	public StrinReverse() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		IStringReverse     stringreverse = ( n ) ->  {
			String resultado = "";
			for ( String e:n.split(" ") ) {
				resultado += new StringBuilder(e).reverse().toString() + " ";
				
			}
			return resultado;
		};
		
		
		    System.out.println( stringreverse.reverse("HOLA") );    
	}

}
