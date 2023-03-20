package n1ejercicio5;

public class NumeroPi implements INumeroPi {
	double npi  = 0;
	public NumeroPi( double n) {
		// TODO Auto-generated constructor stub
		this.npi = n;
	}

 	
	public static void main(String[] args) {
	
		INumeroPi  npi = new NumeroPi(3.1415);
		System.out.println("Obteniendo numero Pi " + npi.getPiValue()      );
		}


	@Override
	public double getPiValue() {
		// TODO Auto-generated method stub
		return  npi;
	}

 

}
