package AULA3.HERANCA;

public class Main {

    public static void main(String[] args){
        Colaborador colaborador1 = new Colaborador();

        Gerente gerente1 = new Gerente();

        gerente1.setName("Rodrigo");

        System.out.println(gerente1.getName());

    }

}
