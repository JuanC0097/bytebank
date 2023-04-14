package bytebank;

public class TestCuentaConCliente {

	public static void main(String[] args) {
		//Creacion Cliente
		Cliente juan = new Cliente();
		//Operaciones
		juan.setNombre("Juan");
		juan.setDocumento("35418615561");
		juan.setTelefono("351 548 1458");
		
		//Creacion Cuenta
		Cuenta cuentaJuan = new Cuenta(777, 1);
		//Operaciones
		cuentaJuan.depositar(1000);
		
		//cuentaJuan.titular = juan
		cuentaJuan.setTitular(juan);
		System.out.println(cuentaJuan.getTitular().getNombre());
		
		Cliente carlos = new Cliente();
		carlos.setDocumento("265461");
		System.out.println(carlos.getDocumento());
		
	}
	
}
