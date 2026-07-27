package TiposPrimitivos;

public class SaidaDeDados {

    public static void main(String[] args) {
        float nota = 8.5f;
        String nome = "Kauã";

        System.out.print("Sua nota é " + nota + "\n");
        System.out.println("Sua nota é " +  nota+ "\n");

        // Manipulando resultado
        System.out.printf("Sua nota de %s é %.2f \n",nome, nota); // sua nota é 8,50
    }
}
