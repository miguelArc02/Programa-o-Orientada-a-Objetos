package Modelos;
public class Cliente{
    private String nome;
    private String cpf;
    private String data_nasc;
    private Endereco end;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getEnd() {
        String msgEnd = "Bairro: " + end.getBairro() + "\nRua: " + end.getRua() + "\nNúmero: " + end.getNumero();
        
        return msgEnd;
    }

    public void setEnd(String rua, String bairro, int numero) {
        this.end = new Endereco();
        this.end.setRua(rua);
        this.end.setBairro(bairro);
        this.end.setNumero(numero);
    }

    class Endereco{ // Classe Interna
    private String rua;
    private String bairro;
    private int numero;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}

}

