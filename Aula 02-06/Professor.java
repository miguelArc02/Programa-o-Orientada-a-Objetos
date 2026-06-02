public class Professor extends Usuario {
    public Professor(String nome){
        super(nome);
    }
    
    public int getLimiteEmprestimos(){
        return 5;
    }
}
