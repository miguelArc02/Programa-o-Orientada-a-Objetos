public class App {
    public static void main(String[] args) throws Exception {
        Conta c = new Conta(001, "João", 0., 1000.);

        System.out.println("Nome: " + c.dono + " - Número: " + c.numero);
        System.out.println("Saldo: " + c.extrato() + " - Limite: " + c.imprimirLimite());

        c.depositar(15000.);
        System.out.println("Novo saldo: " + c.extrato() + " - Novo limite: " + c.imprimirLimite());
        
        c.sacar(1500.);
        System.out.println("Saldo: " + c.extrato() + " - Novo limite: " + c.imprimirLimite());

        if(c.sacar(20000.)){
            System.out.println("Saque realizado com sucesso.");
            System.out.println("Saldo: " + c.extrato() + " - Novo limite: " + c.imprimirLimite());
        }
        else
            System.out.println("Saldo insuficiente");

        // -------------------------------------------------------------------------------------------

        Num m = new Num(), n = new Num();

        m.somar(5);
        n.somar(10);
        System.out.println("Soma de m: " + m.i + "\nSoma de n: " + n.i);

        m.somar2(10).somar2(20).somar2(25); // Encadeamento de chamadas (fluent)
        System.out.println("Soma de m: " + m.i);

        // ------------------------------------------------------------------------------------------
        ParametrosVariaveis p = new ParametrosVariaveis();
        p.parametrosVariaveis("Oi", "Tudo bem", "Bacana", "opa");
    }
}
