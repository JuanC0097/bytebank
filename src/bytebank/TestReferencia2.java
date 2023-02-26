package bytebank;

public class TestReferencia2 {

	/*
	 * 1. Instanciar nuevos objetos de Cliente y cuenta
	 * 2. Asignar valor a los atributos de la instancia cliente
	 * 3. Asignar valor a la instancia cuenta.
	 * 4. Asignamos valor al atributo titular del objeto cuenta
	 * 5. Ingresamos a los atributos del objeto Cuenta,llamamos al atributo titular el cual esta
	 *    conectado al objeto cliente, llamamos al atributo documento. Imprimimos.
	 *    
	 * 6. Direccion de memoria de la instancia cuenta y Direccion en memoria de la instancia usuarioUno
	 *    Nos dirigen al mismo espacio en memoria ya que las dos instancias apuntan al mismo lugar en
	 *    memoria.
	 */
	
	public static void main(String[] args) { 
		
		//1
		Cliente usuarioUno = new Cliente(); //objeto Cliente
		Cuenta cuentaUsuarioUno = new Cuenta();//Objeto Cuenta
		
		//2 
		usuarioUno.nombre = "Diego"; 
		usuarioUno.numeroIdentidad = "546846352123"; 
		usuarioUno.profesion = "Desarrollador"; 
		
		//3
		cuentaUsuarioUno.agencia = 1;
		
		//4 
		cuentaUsuarioUno.titular = usuarioUno;
		
		//5
		System.out.println(cuentaUsuarioUno.titular.numeroIdentidad);
		
		//6
		System.out.println(cuentaUsuarioUno.titular);
		System.out.println(usuarioUno);
		
	}
	
}
	
