public class Empresa {
    public static void main(String[] args) {
        
        Funcionario Pedro = new Funcionario();
        Pedro.nome = "Pedro Fonseca Tasso Junior";
        Pedro.salario = 2300.86;


        Gerente Gilberto = new Gerente();
        Gilberto.nome = "Gilberto dos Santos Paiva";
        Gilberto.salario = 6200.20;
        Gilberto.bonus = 731.80;

        Pedro.exibir();
        Gilberto.exibir();
    }
    
}
