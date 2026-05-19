import java.util.Scanner;

public class Exercicio4 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual é o seu nome? ");
        String nome = sc.nextLine();
        System.out.println("E qual é a sua idade? ");
        int idade = sc.nextInt();
        String faixa_etaria;

        if (idade <= 12){
            faixa_etaria = "Criança";
        }
        else if (idade <= 17){
            faixa_etaria = "Adolescente";
        }
        else if (idade <= 25){
            faixa_etaria = "Jovem";
        }
        else if (idade <= 59){
            faixa_etaria = "Adulto";
        }
        else{
            faixa_etaria = "Idoso";
        }
        System.out.println("Olá "+nome+ " você tem "+idade+ " anos e é considerado um "+faixa_etaria);
        sc.close();
    }
}
