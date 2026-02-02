package AULA13.ThreadInterfaceRunnable;

import java.util.ArrayList;
import java.util.List;

public class Main {

    /*
    *       Uma Thread é uma unidade de execução dentro de um processo.
    *       Cada Thread pode executar tarefas de forma independente e simultânea.
    *       Em Java, existem duas maneiras principais de criar Threads:
    *
    *       1. Estendendo a classe Thread:
    *         - Você cria uma nova classe que estende a classe Thread e sobrescreve o método run().
    *
    *       2. Implementando a interface Runnable:
    *
    *          - Você cria uma classe que implementa a interface Runnable e fornece a implementação do método run().
    *
    *       ----
    *       Então basicamente é que para criar uma Thread em Java, você pode estender a classe Thread ou implementar a interface Runnable.
    *       conseguimos executar tarefas simultâneas em um programa Java usando Threads.
    *       ---
    *
    *
    * */

    private static List<Integer> numbers = new ArrayList<>();

    public static void main(String[] args){

        Runnable inc = () -> {
            for (int i = 0; i < 1000; i++) {
                synchronized (numbers) {
                    numbers.add(i);
                }
            }
        };



        Pessoa pessoa1 = new Pessoa("Jonas");

        pessoa1.run();

    }
}
