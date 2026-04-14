public class Cliente {
    String nome;
    String sobrenome;
    String data_nasc;
    String cpf;

    public Cliente(String nome, String sobrenome, String data_nasc, String cpf){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.data_nasc = data_nasc;
        this.cpf = cpf;
    }

    public Cliente(String cpf){
        this.cpf = cpf;
        this.nome = "Indefinido";
        this.data_nasc = "01/01/1900";
    }

    public String info(){
        String output = "Nome completo: " + this.nome + " " + this.sobrenome + "\n" + "CPF: " + this.cpf + "\nData de Nascimento: " + this.data_nasc;

        return output;
    }


}