package bytebank;

public class Cuenta {

	
    private double saldo;
    private int agencia = 1;
    private int numero;
    private Cliente titular = new Cliente();
    
    
    private static int total;
    //constructor
    public Cuenta(int agencia, int numero) {
    	
    	this.agencia = agencia;
    	this.numero = numero;
    	System.out.println("Creacion de cuenta, Cuenta n° " +  this.numero);
    	
    	Cuenta.total ++;
    	
    }
    
    public void depositar(double valor) {
    	this.saldo = this.saldo + valor;
    }

    public boolean retira(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } return false;
    }

    public boolean transferir(double valor, Cuenta destino) {
        if(this.saldo >= valor) {	
            this.saldo -= valor;
            destino.depositar(valor);
            return true;
            
        } return false;
    }
    
    //getters y setters
    public double getSaldo() {//lo modifica deposita
		return saldo;
	}
    
    public int getAgencia() {
		return agencia;
	}
    
	public void setAgencia(int agencia) {
	   	if(agencia > 0) {
    		this.agencia = agencia;
	 }
	}
    
    public int getNumero() {
		return numero;
	}
   

	public void setNumero(int numero) {
		if(numero > 0) {
			this.numero = numero;
		}
	}

	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getTotal() {
		return Cuenta.total;
	}
    
    
}
