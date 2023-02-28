package bytebank;


//Encapsulamiento
/*
 * aislar partes del codigo,para evitar conflictos
 * public: modificador de acceso, permite ingresar a una variable,desde cualquier parte.
 * private: modificador de acceso, solo se puede modificar una variable por medio de metodos.
 */
public class PruebaAcceso {

	public static void main(String[] args) {
		
		Cuenta cuenta = new Cuenta(3);
		cuenta.depositar(400);
		cuenta.retirar(300);
		//Evitar un saldo negativo
		System.out.println(cuenta.getSaldo()); // print -100;
		System.out.println(cuenta.getAgencia());//print 0
		
	}
	
}
