package AULA8.CLASSE.STRING.STRING;

public class Main {
    public static void main(String[] args){
        var value = "java;java;java;java";

        // O que esta acontecendo aqui é a questão de substituição
        value.replaceFirst("j","J");
        System.out.println(value);


        value.split(";");
        for (var val: value.split(";")) {
            System.out.println(val);
        }
    }
}
