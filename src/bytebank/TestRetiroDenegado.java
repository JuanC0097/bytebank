package bytebank;

public class TestRetiroDenegado {

	public static void main(String[] args) {
		
		Cuenta cuenta = new Cuenta(0, 0);
		
		cuenta.depositar(1000);
		System.out.println(cuenta.retira(3000));
		System.out.println(cuenta.getSaldo());
		
		//cuenta.saldo = cuenta.saldo - 1001
	}
	
}
	
