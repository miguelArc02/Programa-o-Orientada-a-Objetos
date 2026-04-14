public class ParametrosVariaveis {
    void parametrosVariaveis(String... objs){
        System.out.println("Args: ");
        for(int i = 0; i < objs.length; i++){
            System.out.println(objs[i]);
        }
    }
}
