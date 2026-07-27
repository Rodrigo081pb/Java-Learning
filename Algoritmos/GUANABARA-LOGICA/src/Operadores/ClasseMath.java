package Operadores;

public class ClasseMath {
    public static void main(String[] args) {
        /*
        ===============================================================
                                CLASSE MATH
        ===============================================================

        Descritivo:

        É uma classe java que permite fazer operações mais sofisticadas
        como

        PI, EXPONENCIAÇÃO, RAIZ QUADRADA, RAIZ CÚBICA

        ===============================================================
                               exemplos
        ===============================================================

        PI:             Math.PI = 3,1415...
        Exponenciação:  Math.pow(5,2) = 25
        RAIZ QUADRADA:  Math.sqrt(25) = 5
        RAIZ CÚBICA  :  Math.cbrt(27) = 3

        ===============================================================
                               Arrendondamentos
        ===============================================================

        abs : valor absluto:                Math.abs(-10)   = 10
        floor: Arredonda para baixo:        Math.floor(3.9) = 3
        ceil: Arredonda para cima:          Math.ceil(4.2)  = 5
        round: Arredonda aritmeticamente:   Math.round(5.6) = 6






        ===============================================================
                                   Exemplos
        ===============================================================



        // USO DO VALOR ABSOLUTO:

        float valor = 6.2f;
        int ar = (int)Math.abs(valor); // forcei a usar int
        System.out.println(ar); // valor absoluto 6

        // USO DO FLOOR = ARREDONDA PARA BAIXO

        float valorFloor = 6.9f;
        int arFloor = (int)Math.abs(valorFloor);
        System.out.println(arFloor); // 6

        // USO DO CEIL = Arrendonda para cima

        float valorCeil = 10.8f;
        int arCeil = (int)Math.ceil(valorCeil);
        System.out.println(arCeil); // 11

        // USO DO ROUND = ARREDONDAMENTO ARITMETICO

        float numero1 = 10.5f; // aqui é como se fosse um 10.50
        float numero2 = 10.15f;

        float operacao = numero1 - numero2; // 10.50 - 10.15 = 0.35
        System.out.println(operacao); // 0.35
        System.out.println(Math.ceil(operacao)); // 1
        System.out.println(Math.floor(operacao)); // 0



        ===============================================================
                        GERAÇÃO DE NÚMEROS ALEATÓRIOS
        ===============================================================

        */

        double rodrigo = Math.random();
        System.out.println(rodrigo);

        int numeroAleatorio = (int) (5 + rodrigo * (10-5));
        System.out.println(numeroAleatorio);








    }
}
