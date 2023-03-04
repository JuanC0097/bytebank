package bytebank;

public class TestMetodos {

	public static void main(String[] args) {
		Cuenta cuentaMilena = new Cuenta(548, 6456);
		cuentaMilena.depositar(1000);
		cuentaMilena.depositar(500);
		System.out.println(cuentaMilena.getSaldo());
		
		Cuenta cuentajuan = new Cuenta(15, 6456);
		
		boolean retiroExitoso = cuentaMilena.transferir(300, cuentajuan);
		if(retiroExitoso) {
			System.out.println("transferencia exitoso");
		}else {
			System.out.println("Fondos insufisientes");
		}
	}
	
}
