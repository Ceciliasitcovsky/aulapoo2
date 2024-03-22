public class Conta {
    private int id;
    private double saldo;
    private Cliente cliente;

    public Conta(int id, double saldo, Cliente cliente){
        this.id = id;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public boolean sacar(double valorSaque){
        
        if (this.saldo < valorSaque){
            return false;
        }
        this.saldo -= valorSaque;
            return true;
        
    }
    public void depositar (double valorDeposito){
        this.saldo += valorDeposito;
    }
}
