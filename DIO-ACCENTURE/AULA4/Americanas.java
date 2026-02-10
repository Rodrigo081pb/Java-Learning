// Aqui iremos fazer o polimorfismo com as lojas Americanas

public class Americanas extends Shopping {

    public Americanas(String lojas, Integer valores) {
        super(lojas, valores);
    }

    @Override
    public void Comprar() {
        System.out.println("Compra realizada nas Americanas no valor de " + getValores());
    }

    @Override
    public void mostrarCompra() {
         System.out.println("Loja: " + "Americanas" + " | Valor: " + getValores());
    }

}
