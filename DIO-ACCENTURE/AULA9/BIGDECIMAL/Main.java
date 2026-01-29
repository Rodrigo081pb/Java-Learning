package AULA9.BIGDECIMAL;

import java.math.BigDecimal;

public class Main {
    public static void Main(String[] args) {
        // Usado para cálculos financeiros ou qualquer situação que exija alta precisão

        // Exemplo de imprecisão com double que é um problema comum em cálculos financeiros
        double x = 0.1 + 0.2;
        System.out.println(x);

        // Usando BigDecimal para precisão
        BigDecimal valor1 = new BigDecimal("0.1");
        BigDecimal valor2 = new BigDecimal("0.2");
        BigDecimal resultado = valor1.add(valor2);
        System.out.println(resultado); // Saída correta: 0.3

        // Boas práticas ao usar BigDecimal
        // Usar string para o construtor
        // Use métodos como: add, subtract, multiply, divide

    }
}
