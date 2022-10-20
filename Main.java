import java.util.Scanner;

public class Main {

    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        calculadora c = new calculadora();

        int opcao = 5;
        int num1;
        int num2;

        System.out.println("-Escolha uma opção-");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.println("0. Sair");
        System.out.printf("Operação: ");

        opcao = input.nextInt();

        while (opcao !=0){

            System.out.printf("Digite o primeiro número: ");
            num1 = input.nextInt();
            input.nextLine();
            System.out.printf("Digite o segundo número: ");
            num2 = input.nextInt();

            if (opcao == 1){
                int operacao = c.soma(num1, num2);
                System.out.printf("\nO resul2tado da soma é: %d\n", operacao);
                break;
            }

            if(opcao == 2){
                int operacao =c.subtrair(num1, num2);
                System.out.printf("\nO resultado da soma é: %d\n", operacao);
                break;
            }

            if(opcao == 3){
                int operacao =c.multiplicar(num1, num2);
                System.out.printf("\nO resultado da soma é: %d\n", operacao);
                break;
            }

            if (opcao == 4){
                int operacao =c.dividir(num1, num2);
                System.out.printf("\nO resultado da soma é: %d\n", operacao);
                break;
            }else{
                System.out.println("Saindo!");
                break;
            }


        }
    }
}