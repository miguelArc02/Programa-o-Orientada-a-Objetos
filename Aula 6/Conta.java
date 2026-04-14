public class Conta {
    int numero;
    double saldo;
    double limite;
    Cliente titular;

    public Conta(int numero, Cliente titular){
        this.numero = numero;
        this.saldo = 0.;
        this.limite = 1000.;
        this.titular = titular;
    }

    private void aumentarLimite(){
        this.limite += this.saldo * 0.05;
    }

    private void diminuirLimite(){
        this.limite -= this.saldo * 0.05;
    }

    void depositar(double valor){
        this.saldo += valor;
        aumentarLimite();
    }

    boolean sacar(double valor){
        if((this.saldo + this.limite) >= valor){
            this.saldo -= valor;
            diminuirLimite();
            return true;
        }
        System.out.println("Saldo insuficiente.");
        return false;
    }

    boolean transferir(double valor, Conta transferido){
        if(this.sacar(valor)){
            transferido.depositar(valor);
            return true;
        }
        return false;
    }

    double extrato(){
        return this.saldo;
    }

    public String detalhes(){
        String output = titular.info() + "\nNúmero da conta: " + this.numero + "\nSaldo da conta: R$ " + this.saldo + "\nLimite da conta: R$ " + this.limite;
        return output;
    }
}