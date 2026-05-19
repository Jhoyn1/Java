public class Animais{
    public static void main(String[] args) {
        
        Cachorro c1 = new Cachorro();

        c1.especie = "Cachorro";
        c1.nome = "Benedita";
        c1.raca = "Vira-Lata";

        Gato g1 = new Gato();

        g1.especie = "Gato";
        g1.nome = "Luna";
        g1.raca = "Siames";

        Vaca b1 = new Vaca();
        
        b1.especie = "Vaca";
        b1.nome = "Mimosa";
        b1.raca = "Holstein-Frísia";

        c1.Som();
        g1.Som();
        b1.Som();


    }
}