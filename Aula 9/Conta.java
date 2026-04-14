package Pacote1;
public class Conta {
    private Cliente titular;
    private static int proximoNumero = 1;
    private int numConta;


    public Conta(Cliente titular){
        // this.titular = titular; --> Passa a referência do objeto do titular. Não é adequado
        this.titular = new Cliente(titular.getNome()); // --> Cria uma cópia do atributo do objeto do titular. Mais adequado.
        this.numConta = proximoNumero;
        proximoNumero++;
    }

    public Cliente getTitular() {
        return titular;
    }

    public int getNumConta(){
        return this.numConta;
    }

    public static int getProximoNumero(){
        return proximoNumero;
    }
}
