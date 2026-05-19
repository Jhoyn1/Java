import java.util.Scanner;

public class Exercicio7 {
    public static void main(String []args){
        System.out.println("O programa vai parar quando o número '0' for escolhido.");
        Scanner sc = new Scanner(System.in);
        int n = 1;
        int soma = 0;
        int contador = 0;
        double media = 0.0;

        while (n != 0){
        System.out.println("Escolha um número: ");
        n = sc.nextInt();
            if (n != 0){
            soma = soma + n;
            contador = contador + 1;
            }
        }
        if (contador > 0){
            media =(double) soma/contador;
        }
        System.out.println("A soma dos números colocados é igual a "+soma+" e a quantidade de números colocados é de "+contador+" e a media é de "+media);
        sc.close();
    } 
}
