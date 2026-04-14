public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente1 = new Cliente("João", "Duarte", "03/08/2010", "000.000.000-01");
        Conta conta1 = new Conta(1, cliente1);

        conta1.depositar(20000);
        System.out.println(conta1.extrato());

        conta1.sacar(5000);
        System.out.println(conta1.extrato());

        Cliente cliente2 = new Cliente("Jorge", "Moraes", "04/07/2002", "000.000.000-02");
        Conta conta2 = new Conta(2, cliente2);

        System.out.println(conta2.extrato());

        conta1.transferir(2000, conta2);

        System.out.println("Saldo conta 1: " + conta1.extrato());
        System.out.println("Saldo conta 2: " + conta2.extrato());

        System.out.println(conta1.detalhes());
    }
}