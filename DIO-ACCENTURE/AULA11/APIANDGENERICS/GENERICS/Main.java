package AULA11.APIANDGENERICS.GENERICS;

public class Main {

    public static class Caixa<T> {

        private T conteudo;

        public void guardar(T conteudo) {
            this.conteudo = conteudo;
        }

        public T abrir() {
            return conteudo;
        }

    }

    public static void main(String[] args) {
        // Generics : permitem criar classes, interfaces e métodos que funcionam com qualquer tipo de dado

        Caixa<String> caixaDeString = new Caixa<>();
        caixaDeString.guardar("Olá, Generics!");
        System.out.println(caixaDeString.abrir());

        System.out.println("-----");

        Caixa<Integer> caixaDeInteger = new Caixa<>();
        caixaDeInteger.guardar(123);
        System.out.println(caixaDeInteger.abrir());

    }
}
