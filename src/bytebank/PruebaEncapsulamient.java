package bytebank;

public class PruebaEncapsulamient {

	public static void main(String[] args) {
		
		Cuenta cuenta = new Cuenta(232);
		Cliente cliente = new Cliente();
		
		cliente.setNombre("juan");
		cliente.setNumeroIdentidad("12165489465");
		
		cuenta.setTitular(cliente);
		
		
		//pbtener nombre
		System.out.println(cliente.getNombre());
		System.out.println(cuenta.getTitular().getNombre());
		
		
		//obtener el objeto
		System.out.println(cliente);
		System.out.println(cuenta.getTitular());
		
	}

}
