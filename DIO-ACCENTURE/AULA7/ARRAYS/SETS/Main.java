package AULA7.ARRAYS.SETS;

import AULA5.INTERFACE.FUNCIONAL.User;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Um hashset é uma coleção que não permite elementos duplicados
        Set<Usuario> usuarios = new HashSet<>();

        usuarios.add(new Usuario(1, "Maria"));
        usuarios.add(new Usuario(2, "João"));

        System.out.println(usuarios.contains(new Usuario(1, "Maria")));

        usuarios.removeAll(List.of(new Usuario(1, "Maria")));

        // Apagando usuarios por ids
        usuarios.removeIf(usuario -> usuario.getId() == 1 );


    }

}
