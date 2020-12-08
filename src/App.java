public class App {
    public static void main(String[] args) throws Exception {

        Cachorro cachorro1 = new Cachorro();
        cachorro1.nome =  "Zeus";
        cachorro1.raca =  "Fila";
        cachorro1.cor =  "Pardo";
        cachorro1.adulto = false;
        
        Cachorro cachorro2 = new Cachorro();
        cachorro2.nome =  "Pluto";
        cachorro2.raca =  "Pit Bull";
        cachorro2.cor =  "Preto";
        cachorro2.adulto = false;

        System.out.println("");
        System.out.println(" Meus Cachorros ");
        System.out.println("Nome: "+cachorro1.nome);
        System.out.println("Raça: "+cachorro1.raca);
        System.out.println("Cor: "+cachorro1.cor);
        System.out.println("Adulto: "+cachorro1.adulto);

        cachorro1.latir();
        System.out.println("");
        System.out.println("Nome: "+cachorro2.nome);
        System.out.println("Raça: "+cachorro2.raca);
        System.out.println("Cor: "+cachorro2.cor);
        System.out.println("Adulto: "+cachorro2.adulto);


        cachorro1.comer();
        System.out.println("");
        Gato gato1 = new Gato();
        gato1.nome = "Liliti";
        gato1.raca = "Angorá";
        gato1.cor = "Marron";
        gato1.adulto = true;

        System.out.println("");
        System.out.println(" Minha Gata ");
        System.out.println("Nome: "+gato1.nome);
        System.out.println("Raça: "+gato1.raca);
        System.out.println("Cor: "+gato1.cor);
        System.out.println("Adulto: "+gato1.adulto);
        System.out.println("");
        gato1.miar();
        gato1.brincar();
    }

}