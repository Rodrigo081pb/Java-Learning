package TiposPrimitivos;

public class TesteTipos {
    public static void main(String[] args) {
        int idade = 22;
        // String valor = idade;  não funciona

        // Convertendo valores

        // inteiro
        String valor = Integer.toString(idade);

        String dinheiro = "30";
        int dinheiroReal = Integer.parseInt(dinheiro);

        // Float

        String dinheiroFloat = "30.5";
        float dineiroRealFloat= Float.parseFloat(dinheiroFloat);

    }

}
