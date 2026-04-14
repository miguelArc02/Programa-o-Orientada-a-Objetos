package Pacote1;

public class AppAtributos {
    public static void main(String[] args) {
        Cliente obj1 = new Cliente("A");
        System.out.println("Quantidade de Clientes: " + Cliente.getQnt());
        Cliente obj2 = new Cliente("B");
        System.out.println("Quantidade de Clientes: " + Cliente.getQnt());
        Cliente obj3 = new Cliente("C");
        System.out.println("Quantidade de Clientes: " + Cliente.getQnt());

        Conta c1 = new Conta(obj1);
        System.out.println("Número da Conta: " + c1.getNumConta());
        Conta c2 = new Conta(obj2);
        System.out.println("Número da Conta: " + c2.getNumConta());
        Conta c3 = new Conta(obj3);
        System.out.println("Número da Conta: " + c3.getNumConta());
    }
}