public class Main {
    public static void main(String[] args) {
        Shopping compra1 = new Americanas("Americanas", 150);
        compra1.mostrarCompra(); // Herdado da classe Shopping
        compra1.Comprar(); // Método sobrescrito na classe Americanas
    }
}
