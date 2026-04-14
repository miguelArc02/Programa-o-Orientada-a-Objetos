import java.util.Scanner;

public class Calculadora {

    public static void menu(){
        System.out.println("Escolha a opção desejada: ");
        System.out.println("-".repeat(10));
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("0 - Sair");
        System.out.println("-".repeat(10));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int opcao = 1;
        while(opcao != 0){
            menu();
            opcao = sc.nextInt();

            switch(opcao){
                case 1:{
                    System.out.println("Você escolheu soma.");
                    int num1, num2;

                    System.out.println("Digite o primeiro número: ");
                    num1 = sc.nextInt();
                    System.out.println("Digite o segundo número: ");
                    num2 = sc.nextInt();

                    int soma = num1 + num2;
                    System.out.printf("Soma dos números: %d %n", soma);

                    break;
                }
                    
                case 2:{
                    System.out.println("Você escolheu subtração.");
                    int num1, num2;

                    System.out.println("Digite o primeiro número: ");
                    num1 = sc.nextInt();
                    System.out.println("Digite o segundo número: ");
                    num2 = sc.nextInt();

                    int subtracao = num1 - num2;
                    System.out.printf("Subtração dos números: %d %n", subtracao);

                    break;
                }

                case 3:{
                    System.out.println("Você escolheu multiplicação.");
                    int num1, num2;

                    System.out.println("Digite o primeiro número: ");
                    num1 = sc.nextInt();
                    System.out.println("Digite o segundo número: ");
                    num2 = sc.nextInt();

                    int multplicacao = num1 * num2;
                    System.out.printf("Multiplicação dos números: %d %n", multplicacao);

                    break;
                }

                case 4:{
                    System.out.println("Você escolheu divisão.");
                    int num1, num2;

                    System.out.println("Digite o primeiro número: ");
                    num1 = sc.nextInt();
                    System.out.println("Digite o segundo número: ");
                    num2 = sc.nextInt();

                    if(num2 == 0)
                        while(num2 == 0){
                            System.out.println("Divisor inválido. Digite um novo divisor");
                            num2 = sc.nextInt();
                        }

                    int divisao = Math.round(num1 / num2);
                    System.out.printf("Divisão dos números: %d %n", divisao);

                    break;
                }
                
                case 0:
                    System.out.println("Você escolheu sair.");
                    break;

                default:
                    System.out.println("Opção Inválida. Digite outro número.");

            }
        }
        sc.close();
    }
}
