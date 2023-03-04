package bytebank;

public class TestGetSet {

	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(0, 0);
		
		cuenta.setNumero(23);
		System.out.println(cuenta.getNumero());
		
		Cliente juan = new Cliente();
		juan.setNombre("juan cui");
		
		
		cuenta.setTitular(juan);
		
		System.out.println(cuenta.getTitular().getNombre());
		
		cuenta.getTitular().setTelefono("5484645");
		//en dos lineas
		Cliente titular = cuenta.getTitular();
		titular.setTelefono("6548943565");
		
		//comprobaciones
		
		System.out.println(titular);
		System.out.println(juan);
		System.out.println(cuenta.getTitular());
		
		
	}
	
}
