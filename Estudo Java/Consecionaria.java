    public class Consecionaria {
    
    public static void main(String[] args) {
        
        Carro carro1 = new Carro();

        carro1.ano = 2020;
        carro1.cor = "Amarelo";
        carro1.kmr = 70000;
        carro1.marca = "Volkswagen";
        carro1.modelo = "Argo";
        carro1.valor = 75000;

        Endereco endereco1 = new Endereco();

        endereco1.rua = "Rodovia Visconde de Mauá"; 
        endereco1.numero = 5652;
        endereco1.bairro = "Jardim Europa";
        endereco1.cidade = "Caucaia";
        endereco1.estado = "Ceará";


        Cliente Flavio = new Cliente();

        Flavio.CPF = "12345678991";
        Flavio.nome = "Flavio Costa dos Santos";
        Flavio.Endereco = endereco1;
        Flavio.trabalho = "Gerente da Petrobras";
        Flavio.salario = 60000;

        carro1.Test_Drive();
        System.out.println(carro1.kmr);

        Flavio.Olhar();
        Flavio.Olhar();
        Flavio.Olhar();

        carro1.Venda();
        Flavio.Compra();
        

    }
}
