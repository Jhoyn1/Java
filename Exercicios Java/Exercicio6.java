import java.util.Scanner;

public class Exercicio6{ 
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        int n = 1;
        int soma = 0;
        while (n != 0){
            System.out.println("Digite um número: ");
            n = sc.nextInt();
            soma = soma + n;
            contador = contador + 1;
        }

        System.out.println("A soma dos números colocados é igual a "+soma+" e a quantidade de números colocados é de "+contador);
        sc.close();
    }
}