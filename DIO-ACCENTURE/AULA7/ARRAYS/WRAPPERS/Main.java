package AULA7.ARRAYS.WRAPPERS;

public class Main {
    public static void main(String[] args){
        // Wrapper = classes que envolvem os tipos primitivos
        // int = Integer
        // double = Double
        // float = Float
        // char = Character
        // boolean = Boolean

        int num1 = 10; // tipo primitivo
        Integer num2 = 20; // wrapper

        System.out.println(num1);
        System.out.println(num2);

        System.out.println("--------------------------------------------------");

        // Autoboxing = conversão automática de tipos primitivos para wrappers
        Integer num3 = 30; // autoboxing
        Double num4 = 40.0; // autoboxing

        System.out.println(num3);
        System.out.println(num4);

        System.out.println("--------------------------------------------------");

        // Unboxing = conversão automática de wrappers para tipos primitivos
        int num5 = num3; // unboxing
        double num6 = num4; // unboxing

        System.out.println(num5);
        System.out.println(num6);
    }
}
