package GUANABARA.AULAS.AULA02;

public class Aula02 {
    public static void main(String[] args) {
        Lapis lapis1 = new Lapis();
        lapis1.setCor("Vermelho");
        lapis1.setMarca("Bic");
        lapis1.setPontaFeita(true);
        lapis1.setPonta(1.0);
        lapis1.setPorcentagemUsoBorracha(100);
        lapis1.setBorracha(true);

        lapis1.fazerPonta();
        lapis1.escrever();
        lapis1.apagar();

        System.out.println("    ");
        System.out.println("=====");

        lapis1.status();
        
        System.out.println("    ");
        System.out.println("=====");

        Lapis lapis2 = new Lapis();
        lapis2.setCor("Azul");
        lapis2.setMarca("DoWave");
        lapis2.setPontaFeita(true);
        lapis2.setPonta(1.0);
        lapis2.setPorcentagemUsoBorracha(100);
        lapis2.setBorracha(true);

        lapis2.fazerPonta();
        lapis2.escrever();
        lapis2.apagar();


    }
}
