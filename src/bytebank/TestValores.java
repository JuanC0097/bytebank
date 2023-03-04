package bytebank;

public class TestValores {
	
	
	public static void main(String[] args) {
		
		//Cuenta cuenta = new Cuenta(95, 546);
		//cuenta.setAgencia(-50);
		//cuenta.setNumero(-330);
		
		
		Cuenta cuenta = new Cuenta(0, 0);
		
		System.out.println(cuenta.getAgencia());
		cuenta.setAgencia(52);
		
		Cuenta cuenta2 = new Cuenta(5744, 5468);
		Cuenta cuenta3 = new Cuenta(7463, 5424);
		cuenta2.depositar(5);
		cuenta3.depositar(515);
		
		System.out.println("Total de cuentas creadas: " +Cuenta.getTotal());
		
		
		
		
	}

}
