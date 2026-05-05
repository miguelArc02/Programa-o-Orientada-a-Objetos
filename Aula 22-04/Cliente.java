public class Cliente {
    private final String id;
    private String nome;

    public Cliente(String id, String nome){
        if(id == null || id.isBlank()) 
            throw new IllegalArgumentException("ID inválido");
        this.id = id;
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
