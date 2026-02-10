package AULA5.INTERFACE.FUNCIONAL;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args){

        // A lista é um tipo especial que permite tipos dentro dela.
        // A classe lista é uma interface que retorna uma classe imutavel de itens 
        List<User> users = List.of
        (
            new User("maria", 23),
            new User("Mario", 25),
            new User("Rodrigo", 32),
            new User("Saraiva", 55),
            new User("Regis", 58),
            new User("Sandro", 59)
        );

        // Function é uma interface funcional que recebe um parametro e retorna outro
        var consumer = new Consumer<User>() {
            @Override
            public void accept(final User user) {
                System.out.println(user);
            }
        };
        users.forEach(consumer);

        // Com lambda
        users.forEach( user -> {
            System.out.println(user);
        });
    }
}
