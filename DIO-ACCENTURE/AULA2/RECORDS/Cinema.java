package AULA2.RECORDS;

/*
* Record:
*
* Record é como se a gente estivesse passando os parâmetros dentro do ()
* como o exemplo abaixo
*
* Outro ponto é que o record é um tipo de classe com valor imutável
*
* */

import static java.lang.System.out;

public record Cinema(String Filme, String Tema, Integer Sala) {

    public void Apresentacao(){
        System.out.println("FILME: "+ Filme +" TEMA: " + Tema + "SALA" + Sala);
    }

}
