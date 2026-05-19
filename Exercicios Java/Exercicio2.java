import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Escolha o 1° número: ");
        Double N1 = sc.nextDouble();
        System.out.print("Escolha o 2° número: ");
        Double N2 = sc.nextDouble();
        System.out.print("Qual operação será?");
        System.out.print("Coloque + para soma \n Coloque - para subtração\n Coloque * para multiplicação\n Coloque / para divisão\n");
        String operacao = sc.next();
        Double resultado = 0.5;
        if (operacao.equals("+")){
            resultado = N1 + N2;
        }
        else if (operacao.equals("-")){
            resultado = N1 - N2;
        }
        else if (operacao.equals("*")){
            resultado = N1 * N2;
        }
        else if (operacao.equals("/")){
            resultado = N1 / N2;
        }
        else{
            System.out.print("Opção indisponivel");
        }

        System.out.print("O resultado da operação é igual a:"+resultado);

        sc.close();
    }
}
