import java.util.Scanner;

public class Exercicio8 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        double resultado = 0.0;
        System.out.println("Vamos fazer um calculo.");
        System.out.println("Agora escolha o 1° número");
        double n1 = sc.nextDouble();
        System.out.println("Agora escolha o 2° número");
        double n2 = sc.nextDouble();
        System.out.println("Qual você operação você quer?");
        System.out.println("1 - Somar 2 números\n 2 - Subtrair 2 números\n 3 - Multiplicar 2 números\n 4 - Dividir 2 números\n 5 - Sair");
        int operacao = sc.nextInt();
        if (operacao == 1){
            resultado = n1 + n2;
            System.out.println("O resultado é "+resultado);
        }
        else if (operacao == 2){
            resultado = n1 - n2;
            System.out.println("O resultado é "+resultado);
        }
        else if (operacao == 3){
            resultado = n1 * n2;
            System.out.println("O resultado é "+resultado);
        }
        else if (operacao == 4){
            resultado = n1 / n2;
            System.out.println("O resultado é "+resultado);

        }
        else if (operacao == 5){
            System.out.println("Até");
        System.out.println("O resultado é "+resultado);
        }
        else{
            System.out.println("Digito invalido");
        }
        sc.close();
    }
}