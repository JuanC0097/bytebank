package bytebank;

public class CrearCuenta {
	
	
	public static void main(String[] args) {
		//Creacion n1
		Cuenta cuentaPrimera = new Cuenta(-1, 23);
		cuentaPrimera.depositar(200);
		
		//operaciones
		cuentaPrimera.depositar(800);
		cuentaPrimera.setAgencia(3);
		cuentaPrimera.setNumero(1);
		//comprobaciones
		System.out.println("Saldo-deposito: "+ cuentaPrimera.getSaldo());
		System.out.println();
		System.out.println();
		System.out.println("Cliente n°1: ");
		System.out.println("agencia: " + cuentaPrimera.getAgencia());
		System.out.println("numero de cuenta: " + cuentaPrimera.getNumero());
		System.out.println("Valor actual de la cuenta: " + cuentaPrimera.getSaldo());
		System.out.println(cuentaPrimera.getSaldo());
		
		//Creacion n2
		Cuenta cuentaSegunda = new Cuenta(-4, 35);
		cuentaPrimera.depositar(50);
		
		//Operaciones
		cuentaSegunda.depositar(50);
		cuentaSegunda.setAgencia(3);
		cuentaSegunda.setNumero(2);
		//Comprobaciones
		System.out.println("saldo-deposito " + cuentaSegunda.getSaldo());
		System.out.println();
		System.out.println();
		System.out.println("Cliente n°2: ");
		System.out.println("Agencia: " + cuentaSegunda.getAgencia());
		System.out.println("numero de cuenta: " + cuentaSegunda.getNumero());
		System.out.println("saldo actual: " + cuentaSegunda.getSaldo());
	
		//referencias
		System.out.println();
		System.out.println("Referencias");
		System.out.println(cuentaPrimera);
		System.out.println(cuentaSegunda);
		
		//comprobacion de numeros de cuenta
		if(cuentaPrimera == cuentaSegunda) {
			System.out.println("es la misma cuenta");
		}else {
			System.out.println("Cuentas diferentes");
		}
		
		
	}

}
