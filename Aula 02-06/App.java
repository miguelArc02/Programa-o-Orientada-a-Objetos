import java.util.List;
import java.util.LinkedList;

public class App {
    public static void relatorio(List<Usuario> lista){
        for (Usuario user : lista) {
            System.out.println("Nome: " + user.getNome());
            System.out.println("Limite: " + user.getLimiteEmprestimos());
        }
    }
    
    public static void main(String[] args) throws Exception {
        List<Usuario> usuarios = new LinkedList<>();
    }
}
