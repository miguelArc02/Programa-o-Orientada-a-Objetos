public abstract class Usuario {
    private String nome;

    public Usuario(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public abstract int getLimiteEmprestimos();
}