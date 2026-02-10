public class Shopping {

    private String Lojas;
    private Integer Valores;
    
    public Shopping(String lojas, Integer valores) {
        Lojas = lojas;
        Valores = valores;
    }

    public String getLojas() {
        return Lojas;
    }

    public Integer getValores() {
        return Valores;
    }

    public void setLojas(String lojas) {
        Lojas = lojas;
    }

    public void setValores(Integer valores) {
        Valores = valores;
    }
    
    public void mostrarCompra() {
        System.out.println("Loja: " + Lojas + " | Valor: " + Valores);
    }

    public void Comprar() {
        System.out.println("Compra realizada na loja " + Lojas + " no valor de " + Valores);
    }
    

}
