import java.util.Scanner;


public class App{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite um nome para o Cliente ");
        String nome = sc.next();

        Cliente c1 = new Cliente(1092, nome);
        if(c1.abrirConta(234) == true){
            System.out.println("Conta criada com sucesso ");
            }else{
            System.out.println("Já existe uma conta cadastrada");
        }
    }


}