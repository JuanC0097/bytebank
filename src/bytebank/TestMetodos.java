package bytebank;

//Clase para probar los metodos del objeto Cuenta
public class TestMetodos {

	/* 1.Definir metodo <main> para ejecutar todas las pruebas 
	 * 2.Definir instancias  
	 * 3.prueba metodo depositar "sin retorno" 
	 * 4.prueba metodo retirar "sin retorno"
	 * 5.prueba del metodo transferir "retorno boolean" 
	 */
	public class PruebaMetodos { 
		
		public static void main(String[] args) { 
			
			//Creacion de nuevas instancias del objeto Cuenta() 
			Cuenta cuentaDejuan = new Cuenta(); 
			Cuenta cuentaDeAlejandra = new Cuenta(); 
			Cuenta cuentaDeMilena = new Cuenta(); 
			
			
			////////////////////////////////////////////////////////////////////////////////// 
			//PRUEBA DEL METODO DEPOSITAR 
			cuentaDejuan.depositar(5000); 
			cuentaDeMilena.depositar(5000); 
			cuentaDeAlejandra.depositar(5000); 
			//IMPRESIONES DEL SALDO ACTUAL CON DEPOSITO 
			System.out.println("SALDO CON DEPOSITO");
			System.out.println("Saldo actual de juan: " + cuentaDejuan.saldo); 
			System.out.println("Saldo actual de milena: " + cuentaDeMilena.saldo); 
			System.out.println("Saldo actual de alejandra: " + cuentaDeAlejandra.saldo); 
			System.out.println(); System.out.println(); System.out.println(); 
			
			
			////////////////////////////////////////////////////////////////////////////////// 
			//PRUEBA DEL METODO RETIRAR 
			cuentaDejuan.retirar(1000); 
			cuentaDeMilena.retirar(1000); 
			cuentaDeAlejandra.retirar(1000);
			
			//IMPRESIONES DEL SALDO ACTUAL CON RETIRO 
			System.out.println("SALDO CON RETIRO"); 
			System.out.println("Saldo actual extraccion  de juan: " + cuentaDejuan.saldo); 
			System.out.println("Saldo actual extraccion de milena: " + cuentaDeMilena.saldo); 
			System.out.println("Saldo actual extraccion de alejandra: " + cuentaDeAlejandra.saldo); 
			System.out.println(); 
			System.out.println(); 
			System.out.println(); 
			
			////////////////////////////////////////////////////////////////////////////////// 
			//PRUEBAS DEL METODO TRANSFERIR 
			/*CREACION DEL METODO:  
			 * 1. Creacion de boolean para validar transferencia 
			 * 2. Llamar al metodo transferir =  instancia del objeto extraccion(paramatros = cantidad a extraer y cuenta a depositar) 
			 */ 
			//PRUEBA N°1 TRANSFERENCIA DE JUAN A MILENA 
			boolean exitoDeTransferenciaMilena = cuentaDejuan.transferir(1000, cuentaDeMilena); 
			
			System.out.println("SALDO CON TRANSFERENCIA"); 
			
			if(exitoDeTransferenciaMilena) { 
				
				System.out.println("La transferencia fue exitosa a la cuenta de Milena: " + cuentaDeMilena.saldo); 
				System.out.println("Saldo restante de juan: " + cuentaDejuan.saldo ); 
				
			}else { 
				
				System.out.println("la transferencia no se puedo llevar acabo, cuenta milena:" + cuentaDeMilena.saldo); 
				System.out.println("Saldo de juan: " + cuentaDejuan.saldo ); } System.out.println(); 
				
			
			//PRUEBA N°2	TRANSFERENCIA DE ALEJANDRA A JUAN 
			boolean exitoTransferenciaJuan = cuentaDeAlejandra.transferir(1000, cuentaDejuan); 
			if(exitoTransferenciaJuan) {
				
				System.out.println("La transferencia fue exitosa a la cuenta de juan: " + cuentaDejuan.saldo); 
				System.out.println("Saldo restante de alejandra: " + cuentaDeAlejandra.saldo );
				
			}else {
				
				System.out.println("la transferencia no se puedo llevar acabo, cuenta juan:" + cuentaDejuan.saldo); 
				System.out.println("Saldo de alejandra: " + cuentaDeAlejandra.saldo ); 
			} 
			System.out.println(); 
			
			
			//PRUEBA N°3	TRANSFERENCIA DENEGADA 
			boolean transferenciaAlejandra = cuentaDeAlejandra.transferir(4000, cuentaDeMilena);
			if(transferenciaAlejandra) {
				
				System.out.println("La transaccion fue exitosa");
			}System.out.println("Transferencia denegada, por falta de fondos"); 
			
			
			
			
			//Prueba del repositorio
		
		
		
		}
	}
	
	
}
