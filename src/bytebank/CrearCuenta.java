package bytebank;

public class CrearCuenta {
	
	
	public static void main(String[] args) {
		
		//Sintasis para definir una nueva instancia del objeto
		
		Cuenta primeraCuenta = new Cuenta(3214);
		primeraCuenta.depositar(1000);
		System.out.println("saldo de cuenta1: " + primeraCuenta.getSaldo());
		
		//SEGUNDA CUENTA
		Cuenta segundaCuenta = new Cuenta(32);
		
		segundaCuenta.depositar(1000);
		
		
	}

}
