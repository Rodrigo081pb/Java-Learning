package Operadores;

public class OperadoresRelacionais {
    public static void main(String[] args) {
        /*
        ============================================================================
                               OPERADORES RELACIONAIS
        ============================================================================
        MAIOR : >
        MENOR : <
        MAIOR OU IGUAL : >=
        MENOR OU IGUAL : <=
        IGUAL A : ==
        DIFERENTE DE : !=
        ============================================================================
        OBS: PARA COMPARAR O VALOR EXATO VINDO DE UMA VARIÁVEL APENAS PODEMOS
             UTILIZAR O .EQUALS()

         EX:

        int n1 = 2;
        int n2 = 2;
        int n3 = new int(2);

        Se olharmos direitinho vamos pensar cara todos são iguais, porém
        ao realizarmos uma condição simples...

        resultado = (n1 == n3) ? "igual" : "diferente";
        System.out.printl(resultado); -> ele vai retornar diferente isso porquê essa
                                         variável está em outro tipo de estrutura /
                                         endereço de memória pelo fato de ter sido instanciada
        Aqui o que rola se a gente fazer o seguinte
        resultado = (n1.equals(n3)) ? "igual" : "diferente";
        System.out.printl(resultado); -> vai retornar igual pelo fato da gente ter
                                         comparado o valor exato de dentro da variável
        ============================================================================

         */

        String aluno = "Rodrigo";
        Double nota = 9.0;
        String situacao = "";

        if (nota == 6 || nota < 8){
            situacao = "recuperação";
        } else if (nota >= 8){
            situacao = "aprovado";
        } else {
            situacao = "reprovado";
        }
        System.out.printf("O aluno: %s ficou: %s  %n", aluno, situacao);

        // Isso é uma forma conceitual da parada onde a gente faz meio que um if e else encadeado
        // porém podemos simplificar isso
        String s = (nota < 7) ? "reprovado":"aprovado";
        System.out.println(s);




    }
}
