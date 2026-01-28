package AULA7.ARRAYS.ARRAYSLISTS;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        // Criando uma lista de marcas utilizando uma classe pra criar um array deste tipo
        List<Marcas> marcas = new ArrayList<>();
        var marca = new Marcas(1, "Nike");
        var marcas2 = new Marcas(2, "Adidas");
        var marcas3 = new Marcas(3, "Puma");
        marcas.add(marca);
        marcas.add(marcas2);
        marcas.add(marcas3);

        System.out.println(marcas.getFirst());

        System.out.println(marcas);

        System.out.println("------");

        System.out.println("Lista de marcas: ");
        for (Marcas m : marcas) {
            m.Apresentar();
        }

//        // Tipando uma lista com o tipo string
//        List<String> teste = new ArrayList<>();
//        teste.add("a");
//        var vogal = teste.get(0);
//        System.out.println(vogal);

        // Criando um ArrayList que é uma lista
        // List teste = new ArrayList();
        // teste.add("a");  adicionando elementos na lista
        // teste.add(1); autoboxing de int para Integer
        // teste.add(false);  autoboxing de boolean para Boolean
    }
}
