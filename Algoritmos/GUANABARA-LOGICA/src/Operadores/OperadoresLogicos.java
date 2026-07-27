package Operadores;

public class OperadoresLogicos {
    public static void main(String[] args) {
        /*
        ============================================================================
                                OPERADORES LÓGICOS

        E   : &&
        OU  : ||
        XOU : ^       ISSO SIGNIFICA QUE BASICAMENTE OU UMA OU ESCLUSIVAMENTE A OUTRA PODE SER TRUE DE ACORDO COM A CONDIÇÃO ESTABELECIDA
        NOT : !
        ============================================================================
         */

        int a = 2;
        int b = 10;
        int c = 14;

        Boolean resultado = (a < b || b < c);
        System.out.println(resultado);
    }
}
