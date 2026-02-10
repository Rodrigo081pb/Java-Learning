package AULA8.CLASSE.STRING.StringBuilderAndStringBuffer;

public class Main {
    public static void main(String[] args){

        // StringBuilder = classe mutável para manipulação de strings
        /*
        *
        *             Cenário StringBuilder
        *
        */

        StringBuilder sb = new StringBuilder("Java");
        sb.append(" é ");
        sb.append("legal!");

        System.out.println(sb);

        /*============================================================================================================*/

        /*
         *
         *             Cenário StringBuffer
         *
         * StringBuffer = classe mutável e thread-safe para manipulação de strings
         * TREAD-SAFE SIGNIFICA QUE É SEGURA PARA USO EM AMBIENTES MULTI-THREAD
         *
         */




    }
}
