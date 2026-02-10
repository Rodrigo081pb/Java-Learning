package AULA14.Exceptions;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {

        test();
        System.out.println("Fim");

        teste2();
        System.out.println("Fim 2");
    }

    private static void test(){
        throw new RuntimeException();
    }

    private static void teste2(){

        // tratar um arquivo inexistente
        try {
            throw new FileNotFoundException();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    };

}
