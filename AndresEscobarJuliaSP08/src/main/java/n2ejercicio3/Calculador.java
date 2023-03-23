package n2ejercicio3;

public class Calculador {

	public Calculador() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
	 
		
		ICalculator  suma 			= (x, y) -> x + y;	
		ICalculator  resta  		= (x, y) -> x - y;
		ICalculator  multiplicacion = (x, y) -> x * y;
		ICalculator  division   	= (x, y) -> x / y;
        
        System.out.println(suma.operacion(13, 24));
        System.out.println(resta.operacion(4, 5));
        System.out.println(multiplicacion.operacion(144, 23.435f));
        System.out.println(division.operacion( 666333, 333));		
        
        
	}
}
