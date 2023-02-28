package bytebank;

public class PruebaConstructor {

	public static void main(String[] args) {
		/*
		 * AL utilizar un constructor personalizado, este nos obliga a informar el parametro solicitado
		 * En este caso el numero de agencia. con la validacion dentro del construtor.
		 * 
		 * Si se implementa el cambio desde el constructor, no es necesario el metodo set, ya que
		 * debemos informar este dato desde la creacion de la nueva instancia
		 */
		Cuenta cuenta1 = new Cuenta(367);
		//Cuenta cuenta2 = new Cuenta(845);
		//Cuenta cuenta3 = new Cuenta(3);
	
		System.out.println(cuenta1.getAgencia());
		
	}
	
}
