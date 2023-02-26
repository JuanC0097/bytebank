package bytebank;

public class TestReferencia1 {

	//metodo main
	public static void main(String[] args) {
		
		
		//instanciar cuenta		nuevo objeto en la memoria de java saldo = 200 
		Cuenta primeraCuenta = new Cuenta(); 
		
		//guardar el valor de saldo 
		primeraCuenta.saldo = 200; 
		
		//instanciar nuevo objeto,  guardando el objeto de primeraCuenta 
		Cuenta segundaCuenta = primeraCuenta; 
		
		//asignamos otro valor al atributo de saldo del objeto 
		segundaCuenta.saldo = 100; 
		//imprimimos el valor de primera y segunda cuenta (los cuales son los mismos) 
		System.out.println("saldo de primera cuenta: " + primeraCuenta.saldo); 
		System.out.println("saldo de segunda cuenta: " + segundaCuenta.saldo); 
		
		//cambiamos el valor de saldo de la segunda cuenta, siendo ahora 500 
		segundaCuenta.saldo += 400; 
		
		//imprimimos el valor de la primera cuenta, se vera reflejado el valor de saldo que cambiamos 
		System.out.println("saldo de primera cuenta: " + primeraCuenta.saldo); 
		
		//impresion de la ubicacion en memoria en ambos casos imprimira a la misma ubicacion 
		System.out.println(primeraCuenta);
		System.out.println(segundaCuenta);
		
		
		
		
	}
	
}
