package bytebank;

public class CrearCuenta {
	
	
	public static void main(String[] args) {
		
		//Sintasis para definir una nueva instancia del objeto
		
		Cuenta primeraCuenta = new Cuenta();
		primeraCuenta.saldo = 1000;
		System.out.println("saldo de cuenta1: " + primeraCuenta.saldo);
		
		//SEGUNDA CUENTA
		Cuenta segundaCuenta = new Cuenta();
		
		segundaCuenta.saldo = 1000;
		
		
	}

}
