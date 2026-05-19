class Gerente extends Funcionario {

    double bonus;

    @Override
    public void exibir() {
        salario += bonus;
        System.out.println(nome);
        System.out.println(salario);
    } 
    }
    
