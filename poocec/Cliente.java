import java.util.ArrayList;

public class Cliente {
    private int id;
    private double saldo;
    //private Conta conta;
    private ArrayList<Contas> contas;
    private String nome;

    public Cliente (int id, String nome){
        this.id = id;
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    /*   
    public boolean abrirConta(int idConta){
        if (this.conta==null){
            this.conta = new Conta(idConta, 0.0, this);
            return true;
        }
        return false;
    }
    */
    
    public void abrirConta(int idConta){
        Conta c1 = new Conta(idConta, 0, this);
        contas.add(c1);
    }
}
