import java.util.Scanner;

public class Exercicio3{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        System.out.print("Escolha o 1° número: ");
        int n1 = sc.nextInt();
        System.out.print("Escolha o 2° número: ");
        int n2 = sc.nextInt();
        System.out.print("Escolha o 3° número: ");
        int n3 = sc.nextInt();

        if ((n1 > n2) && (n1 > n3)){
            System.out.println("O maior número é o "+n1);
        }
        else if ((n2 > n1) && (n2 > n3)){
            System.out.println("O maior número é o "+n2);
        }
        else{
            System.out.println("O maior número é o "+n3);
        }
    sc.close();

    }

}
