package Modelos2;

public class AppConta {
    public static void main(String[] args) {
        Conta conta1 = new Conta();

        try {
            conta1.depositar(-7); // Tenta chamar a função de depositar
        } catch (Exception e) {
            System.out.println("ERRO"); // Tratamento de erro da Exceção lançada pela função de depositar
        }
        
        System.out.println(conta1.getSaldo());
    }
}
