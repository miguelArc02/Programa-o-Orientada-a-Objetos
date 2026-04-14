package Modelos2;

public class Conta {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor){
        if(valor < 0) throw new IllegalArgumentException("Valor inválido.");

        this.saldo += valor;
    }
}
