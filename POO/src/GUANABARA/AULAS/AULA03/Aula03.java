package GUANABARA.AULAS.AULA03;

public class Aula03 {
    public String modelo;
    public String cor;
    private Double ponta;
    protected int carga;
    protected boolean tampada;

    public void escrever(){
        System.out.println("Escrevendo");
    }

    private void rabiscar(){
        System.out.println("Rabiscando");
    }

    protected void tampar(){
        System.out.println("Tampando");
    }

    protected void destampar(){
        System.out.println("Destampando");
    }


}
