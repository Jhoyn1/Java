import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha um número: ");
        int n = sc.nextInt();
        while (n < 0){
            System.out.println("Número inválido, tente outro: ");
            n = sc.nextInt();
        }
        sc.close();
    }
}
