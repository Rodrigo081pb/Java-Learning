package Exercicios.OperadoresAritmeticos;

class Cambio {
    static void DolarReal(double valor){
        double dolar = 5.07;
        double saldo = dolar * valor;
        System.out.println("Você converteu :U$" + valor +" para real é o seu saldo é: R$" + saldo);
    }

    static void RealDolar(double valor){
        double dolar = 5.07;
        double saldo = valor / dolar;
        saldo = Math.round(saldo);
        System.out.println("Você converteu o valor de :R$" + valor +" e o seu saldo é: U$" + saldo);
    }

}

public class TaxaDeCambio {
    public static void main(String[] args) {
        Cambio cambio = new Cambio();
        cambio.DolarReal(1);
        cambio.RealDolar(50);
    }
}
