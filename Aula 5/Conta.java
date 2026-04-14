class Conta {
    int numero;
    String dono;
    private double saldo;
    private double limite;

    Conta(int numero, String dono, double saldoInicial, double limite){
        this.numero = numero;
        this.dono = dono;
        saldo = saldoInicial;
        this.limite = limite;
    }

    private void aumentarLimite(){
        System.out.println("Aumento de Limite");
        this.limite += (0.05 * this.saldo);
    }

    private void diminuirLimite(){
        System.out.println("Diminuição de Limite");
        this.limite -= (0.05 * this.saldo);
    }

    void depositar(double valor){
        System.out.println("Depósito de " + valor + " reais");
        this.saldo += valor;
        aumentarLimite();
    }

    boolean sacar(double valor){
        if(valor <= this.saldo + this.limite){
            System.out.println("Saque de " + valor + " reais");
            this.saldo -= valor;
            diminuirLimite();
            return true;
        }
        return false;
    }

    double extrato(){
        return this.saldo;
    }

    double imprimirLimite(){
        return this.limite;
    }
}
