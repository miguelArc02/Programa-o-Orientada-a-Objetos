package Pacote1;
public class AppReferencialExterno{
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Nome");
        Conta conta1 = new Conta(cliente1);

        String nome = conta1.getTitular().getNome();

        System.out.println("---Antes---\n" + nome);

        cliente1.setNome("Bartolomeu");

        nome = conta1.getTitular().getNome();
        System.out.println("---Depois---\n" + nome);
    }
}
