package bytebank;

public class TestReferencia3 {
	
	/*
	 * Primera forma:
	 * 1.Instanciar nuevos objetos Cuenta y Cliente
	 * 2.Agregar valor al atributo titular del objeto cuenta
	 * 3.Agregar valor al atributo del objeto Cliente por medio del objeto Cuenta
	 * 4.Imprimir el atributo nombre, ingresando por el objeto Cliente y el objeto Cuenta
	 * 
	 * Segunda forma:
	 * 1.Instanciamos un nuevo objeto Cuenta:
	 *   Al asignar al valor del atributo titular como una nueva instancia del objeto cliente,cada que
	 *   se cree un objeto cuenta, se creara un objeto Cliente.
	 * 2.Imprimimos el acceso al atributo del obj Cliente,por medio de la instancia del obj Cuenta 
	 */
	
	public static void main(String[] args) {
		/*
		//1
		Cuenta cuentaJuan = new Cuenta();
		Cliente usuarioJuan = new Cliente();
		//2
		cuentaJuan.titular = usuarioJuan;
		//3
		cuentaJuan.titular.nombre = "juan";
		//4
		System.out.println(usuarioJuan.nombre);
		System.out.println(cuentaJuan.titular.nombre);
		*/
		
		//1
		Cuenta cuentadejuan = new Cuenta();
		//2
		cuentadejuan.titular.nombre = "juan";
		System.out.println(cuentadejuan.titular.nombre);
		
		
		//Nueva clase
		
		Cuenta cuentaMilena = new Cuenta();
		
		cuentaMilena.titular.nombre = "milena";
		System.out.println(cuentaMilena.titular.nombre);
		
	}

}
