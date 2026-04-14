import javax.swing.JOptionPane;

public class App_GUI {
    public static void extrato_padronizado(Conta obj){
        String extrato = "---Extrato---\n" + "Número: " + obj.numero + "\nTitular: " + obj.dono + "\nSaldo: R$ " + obj.extrato() + "\nLimite: R$ " + obj.imprimirLimite();

        JOptionPane.showMessageDialog(null, extrato);
    }
    public static void main(String[] args) {
        Conta c = new Conta(001, "João", 0., 1000.);

        c.depositar(15000.);
        extrato_padronizado(c);

        String valorStr = JOptionPane.showInputDialog("Valor do saque: R$ ");
        double valor = Double.parseDouble(valorStr); // double com d minúsculo indica que é um tipo primitivo, enquanto Double com D maiúsculo indica que é uma classe (wrapper) do tipo double

        if(c.sacar(valor)){
            System.out.println("Saque realizado com sucesso.");
            extrato_padronizado(c);
        }
        else 
            JOptionPane.showMessageDialog(null, "Saldo insuficiente.");

        
    }
}