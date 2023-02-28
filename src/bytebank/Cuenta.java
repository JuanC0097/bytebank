package bytebank;

//Nuevo objeto > Cuenta
public class Cuenta {

	//atributos con modificador de acceso
	/*
	 * Los modificadores mejoran la seguridad ya que protegen nuestros datos, la unica forma de acceder a ellos con los metodos get y set
	 * Public: Permite el acceso desde cualquier parte del codigo
	 * Private: protege los atributos del objeto, solo los atributos y metodos son accesibles dentro de la clase de los declara
	 */
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular = new Cliente();
    
    /*
     * Metodo constructor
     * nos retorna el objeto cuenta, nos permite manipular el objeto desde su nacimiento
     * SE UTILIZAN PARA INICIALIZAR LOS ATRIBUTOS.
     */
    /*
     * Contador de  cuentas
     * keyword static, dice esta variable sera de la clase, y no sera alterada en la instancia
     * 1. la clase define lo que sera la instancia.
     */
    private static int total = 0;
    
    public Cuenta(int agencia) {
    	
    	if(this.agencia <=0) {
    		
    		System.out.println("No se permite el valor 0");
    		this.agencia = 1;
    		
    	}else {
    		this.agencia = agencia;
    	}
    	total++;
    	System.out.println("Numero de cuentas creadas: " + total);
    	
    }
    
    
    /*
     * Metodos set para saldo:*/
    //accesible all	|	no retorna / recibe double	|	Metodo depositar: comportamiento de saldo
    public void depositar(double valor) {
        
    	//A este saldo agregale el valor
    	this.saldo = this.getSaldo() + valor;
    	
    }

    //accesibles all	|	retorna  booleano   |	Metodo retirar: comportamiento de saldo |	Atributo de la clase Cuenta
    public boolean retirar(double valor) {
    	//si el valor de saldo es mayor o igual al valor ingresado: True
        if(this.saldo >= valor) {
        	
            this.saldo -= valor;
            return true;
            
        } return false;
    }

 //accesibles all	|	retorna boobleano	|Recibe el valor a transferir y la cuenta destino    |	Metodo retirar: comportamiento de saldo |	Atributo de la clase Cuenta    
    public boolean transferir(double valor, Cuenta destino) {
    	/*
    	 * si este saldo es mayor o  igual al valor ingresado:
    	 * retira el valor del este saldo
    	 * deposita el valor en la cuenta de destino
    	 * sino: false
    	 */
        if(this.getSaldo() >= valor) {
        	
            this.saldo -= valor;
            destino.depositar(valor);
            return true;
            
        } return false;
    }
    

/*
 * Para ingresar a los atributos innaccesibles, necesitamos getter y setter
 * NO TODAS LAS VARIABLES PRIVADAS NECESITAN SER ACCESIBLES
 * metodos intermediarios entre los atributos,los comportamientos y atributos
 * 
 */
    
    public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}
	/*
	 * metodo de la clase, para ingresar al total
	 */
	public static int getTotal() {
		return Cuenta.total;
		
	}
    
    
}
