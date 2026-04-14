import Modelos.Cliente;

public class App {
    public static void main(String[] args) throws Exception {
        // Endereco end1 = new Endereco("dos Bobos", "Messias", 1); //Dá erro pois a classe Endereço só é acessível pela classe Cliente, ou se ela estivesse no mesmo pacote(pasta) que o App main
        Cliente cliente1 = new Cliente();

        cliente1.setNome("João");
        cliente1.setCpf("000.000.000-01");
        cliente1.setData_nasc("01/01/2000");
        cliente1.setEnd("Rua dos bobos", "Centro", 1);

        System.out.println("Dados do cliente " + cliente1.getNome() + ": \nCPF: " + cliente1.getCpf() + "\nData de Nascimento: " + cliente1.getData_nasc() + "\nEndereço: " + cliente1.getEnd());
    }
}
