package Operadores;

public class OperadoresUnitarios {

    /*

     ++ Incremento a ++ | exemplo : a = a + 1
     -- Decremento a -- | exemplo : a = a - a

     */

    public static void main(String[] args) {

//        int numero = 5;
//        numero++;
//        System.out.println(numero);
//        numero--;
//        System.out.println(numero);

        /*
        =======================================================================
                                     OBSERVAÇÃO
        =======================================================================

        Observe o exemplo abaixo:

        int a = 10;
        int valor = 10 - a++;
        System.out.println(valor); | AQUI O RETORNO VAI SER 0, o motivo é bem simples porque o incremento
                                     que está sendo feito nele vem depois então inicialmente ele faz o seguinte
                                     faz a subtração 10(a) - 10(valor) : 0, esse cenário iria mudar caso
                                     o ++ viesse antes do valor de (A)

        System.out.println(a); | vai retornar 11 pois essa operação foi feita individualmente após a finalização
                                 da operação mencionada em valor no detalha "a++" se viesse antes o valor  10 - 11 que
                                 é igual a -1

        int numero = 10;
        int valor = 10 - ++numero; : vai retornar -1 o motivo é bem simples (10 - + 11 (1+10(numero)) )
        System.out.println(valor); -1
        System.out.println(numero); 11

        Exemplo de decremento após a operação:

        int numero = 10;
        int valor = 10 - numero--;
        System.out.println(valor); 10 - 10(- 1 = vai direto pra variável após a operação) = 0 primeiro ele faz o 10 - 10 e depois faz a operação do valor do numero
        System.out.println(numero); 10 -1 = 9

        int numero = 10;
        int valor = 10 - --numero;
        System.out.println(valor); // 10 - 1-10(9 já foi salva no endereço de memória) = 1
        System.out.println(numero); // 9

         */

    }


}
