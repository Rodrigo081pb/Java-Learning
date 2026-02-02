package AULA11.APIANDGENERICS.STREAMS;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        // Stream : uma sequência de dados que pode ser processada de forma funcional
        // Stream API : conjunto de classes e métodos que permitem o processamento de coleções de forma funcional

        // Gerando uma sequência de números aleatórios : o generate serve para gerar uma sequência de valores a partir de uma função
        System.out.println("== Gerando Números Aleatórios ==");
        var value1 = Stream.generate(() -> new Random().nextInt())
                .limit(5)
                .toArray(Integer[]::new);

        // Imprimindo os números gerados
        System.out.println("Números Aleatórios Gerados:");
        for (var v : value1) {
            System.out.println(v);
        }

        // Gerando uma sequência de números pares : o iterate serve para gerar uma sequência de números a partir de uma regra
        System.out.println("== Gerando Números Pares ==");
        var value2 = Stream.iterate(0, n -> n + 2)
                .limit(5)
                .toArray(Integer[]::new);

        System.out.println(value2);


        // Aqui estamos criando um stream de nomes, filtrando apenas os nomes com 3 letras,
        // convertendo esses nomes para maiúsculas e imprimindo cada um deles.
        System.out.println("== Imprimindo Nomes com 3 letras em Maiúsculo ==");
        Stream.of("Ana", "Bia", "Lia", "Gui")
                .filter(name -> name.length() == 3)
                .map(String::toUpperCase)
                .forEach(System.out::println);

        // filtrando números pares, elevando ao quadrado e coletando em um array
        System.out.println("== Imprimindo números pares ao quadrado ==");
        var valores = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .toArray(Integer[]::new);

        System.out.println(Arrays.toString(valores));

        // filtrando nomes que terminam com a letra "i" e coletando em um array
        System.out.println("== Imprimindo filtro pelas Letras I ==");
        var nomes = Stream.of("Ana", "Bia", "Lia", "Gui")
                .filter(name -> name.endsWith("i"))
                .toArray(String[]::new);

        System.out.println(Arrays.toString(nomes));

    }
}
