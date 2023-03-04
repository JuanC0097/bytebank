package bytebank;

public class TestCuentaSinCliente {

	public static void main(String[] args) {
		//agencia y cuenta
		Cuenta cuentaMilena = new Cuenta(777, 52);
		System.out.println(cuentaMilena.getSaldo());
		
		// Descomentar esta linea para evitar el NullPointerException
        // cuentaDeJimena.titular = new Cliente(); Antiguo
        // cuentaDeJimena.setTitular(new Cliente()); Nuevo
		System.out.println(cuentaMilena.getTitular());
	
		 //cuentaDeJimena.titular.nombre = "Jimena";
		cuentaMilena.getTitular().setNombre("constanza");
		System.out.println(cuentaMilena.getTitular().getNombre());
	}	
}
