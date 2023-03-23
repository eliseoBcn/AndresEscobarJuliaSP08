package n1ejercicio5;

public class NumeroPi   {
	double npi  = 0;
	public NumeroPi( double n) {
		// TODO Auto-generated constructor stub
		this.npi = n;
	}

 	
	public static void main(String[] args) {
		INumeroPi  npi  = () -> 3.14;

	 
		 
		System.out.println("Obteniendo numero Pi " + npi.getPiValue()      );
		}


 
 
 

}
