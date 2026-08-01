package GUANABARA.AULAS.AULA01;

class caderno{
    public static void main(String[] args) {
        Caneta caneta = new Caneta("Bic","Vermelha",1.2,100,true);
        caneta.destampar();
        caneta.Escrever();

    }
}

public class Caneta {

    String modelo;
    String cor;
    Double ponta;
    int carga;
    Boolean tampada;

    public Caneta(String modelo, String cor, Double ponta, int carga, Boolean tampada) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.carga = carga;
        this.tampada = tampada;
    }

    public void Escrever(){
        if(tampada==true){
            System.out.println("Não pode escrever porque tá tampada");
        } else{
            System.out.println("Escrevendo");
            carga = carga - 1;
            System.out.println("Agora você tem a carga em %" + carga);
        }
    };

    public void destampar(){
        if(tampada==true){
            System.out.println("Destampando");
            tampada = false;
        } else {
            System.out.println("Já ta destampada");
        }
    }

    public void tampar(){
        if(tampada==true){
            System.out.println("A caneta já está tampada");
        } else {
            System.out.println("Tampei");
            tampada=true;
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Double getPonta() {
        return ponta;
    }

    public void setPonta(Double ponta) {
        this.ponta = ponta;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public Boolean getTampada() {
        return tampada;
    }

    public void setTampada(Boolean tampada) {
        this.tampada = tampada;
    }
}
