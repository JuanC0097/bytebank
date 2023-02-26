package bytebank;

//Nuevo objeto > Cuenta
public class Cuenta {

	//Atributos
    double saldo;
    int agencia;
    int numero;
    

    //Metodo depositar
    public void depositar(double valor) {
        
    	this.saldo = this.saldo + valor;
    	
    }

    //Metodo retirar
    public boolean retirar(double valor) {
    	
        if(this.saldo >= valor) {
        	
            this.saldo -= valor;
            return true;
            
        } return false;
    }

    //Metodo transferir
    public boolean transferir(double valor, Cuenta destino) {
    	
        if(this.saldo >= valor) {
        	
            this.saldo -= valor;
            destino.depositar(valor);
            return true;
            
        } return false;
    }

}
