package AULA5.INTERFACE.FUNCIONAL;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args){
        List<User> users = List.of
            (
                new User("maria", 23),
                new User("Mario", 25),
                new User("Rodrigo", 32),
                new User("Saraiva", 55),
                new User("Regis", 58),
                new User("Sandro", 59)
            );

        printStringValue(Record::toString,Users);

        private static void printStringValue(Function<User, String> callback, List<User> users){
            users.forEach(u -> System.out.println(callback.apply(u)));
        }

//        var consumer = new Consumer<User>(){
//
//            @Override
//            public void accept(final User user) {
//                System.out.println(user);
//            }
//        };
//        users.forEach(consumer);
    }
}
