package bytebank;

//Nuevo objeto > Cuenta
public class Cuenta {

	//Atributos
    double saldo;
    int agencia;
    int numero;
    Cliente titular = new Cliente();
    

    //Metodo depositar no retorna
    public void depositar(double valor) {
        
    	this.saldo = this.saldo + valor;
    	
    }

    //Metodo retirar retorna
    public boolean retirar(double valor) {
    	
        if(this.saldo >= valor) {
        	
            this.saldo -= valor;
            return true;
            
        } return false;
    }

    //Metodo transferir retorna
    public boolean transferir(double valor, Cuenta destino) {
    	
        if(this.saldo >= valor) {
        	
            this.saldo -= valor;
            destino.depositar(valor);
            return true;
            
        } return false;
    }

}
