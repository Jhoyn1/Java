import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual é o seu nome? ");
        String nome = sc.nextLine();
        System.out.print("Qual é a sua idade? ");
        int idade = sc.nextInt();
        
        sc.close();
        
        System.out.println("Seu nome é "+nome+" e sua idade é "+idade+ " anos");

    }
}
