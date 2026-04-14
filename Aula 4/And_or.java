public class And_or {
    public static void main(String[] args){
        /* & significa "E" ou "AND" em java. O &, quando usado uma única vez, verifica obrigatoriamente ambas as condições do if, enquanto
        &&, se a primeira condição já for inválida, ela automaticamente pula o if*/
        int x = 10, y = 0;

        if(x!=0 && x/y>1)
            System.out.println("X é diferente de 0 ou x/y é maior que 1");

        // || significa "OU" ou "OR" em java.
        if(x!=0 || x*y==0)
            System.out.println("X é diferente de 0 ou x*y é igual à 0");

        // para utilizar constantes, utiliza-se "final" antes do tipo da constante durante sua criação. Utiliza-se caixa alta por convenção
        // final float PI = 3.14159f; // Esse f no final indica que se trata de um float
        //PI = 3.555f; // Em java, quando se tenta alterar um valor de uma constante, ela dá erro.
    }
}
