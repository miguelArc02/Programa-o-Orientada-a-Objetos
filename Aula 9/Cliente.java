package Pacote1;
public class Cliente{
    private String nome;
    private static int qnt; // Atributo de Classe (Igual para todos os objetos instaciados a partir dessa classe)

    public Cliente(String nome){
        this.nome = nome;
        qnt++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static int getQnt(){
        return qnt;
    }
}