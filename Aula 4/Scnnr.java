import java.util.Scanner;

public class Scnnr {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double n1, n2, n3, m;

        System.out.println("Digite a nota 1: ");
        n1 = scn.nextDouble();

        System.out.println("Digite a nota 2: ");
        n2 = scn.nextDouble();

        System.out.println("Digite a nota 3: ");
        n3 = scn.nextDouble();

        m = (n1 + n2 + n3) / 3;

        if(m>=7)
            System.out.println("Aprovado");
        else{
            double nota_min = (double) 7. - m;
            System.out.printf("Prova Final  -  Nota mínima estimada: %.2f", nota_min);
        }
        
        scn.close();
    }
}
