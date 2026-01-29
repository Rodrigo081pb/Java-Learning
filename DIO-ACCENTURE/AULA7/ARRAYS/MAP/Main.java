package AULA7.ARRAYS.MAP;

import AULA7.ARRAYS.MAP.DOMAIN.Carro;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        // Map = coleção de pares chave-valor
        // HashMap = implementação de Map que não mantém ordem dos elementos
        Map<String, Carro> relampago = new HashMap<>();

        // Diferente do HashMap aqui a gente usa o put para adicionar os elementos
        // A chave é o email e o valor é o objeto Carro
        // Adicionando elementos no Map
        relampago.put("must@email.com", new Carro("Mustang", "Vermelho", 2020));
        relampago.put("cama@email.com", new Carro("Camaro", "Amarelo", 2019));
        relampago.put("charl@email.com", new Carro("Challenger", "Preto", 2021));
        System.out.println(relampago);

        System.out.println("--------------------------------------------------");

        // Chamando apenas as keys
        relampago.keySet().forEach(System.out::println);
        System.out.println("--------------------------------------------------");

        // Chamando apenas os values
        relampago.values().forEach(System.out::println);
        System.out.println("--------------------------------------------------");

    }
}
