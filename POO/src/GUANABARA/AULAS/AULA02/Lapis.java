package GUANABARA.AULAS.AULA02;

public class Lapis {
    private Double tamanho;
    private String cor;
    private Double ponta;
    private String marca;
    private boolean pontaFeita;
    private boolean escreveuCaderno;
    private boolean borracha;
    private int porcentagemUsoBorracha;

    void escrever(){
        if(escreveuCaderno){
            System.out.println("O caderno já tá escrito");
        } else {
            System.out.println("Escrevendo");
            setEscreveuCaderno(true);
        }
    }

    void fazerPonta(){
        if(pontaFeita){
            System.out.println("O ponta foi feita!");
        } else {
            System.out.println("Fazendo ponta");
            setPontaFeita(true);
            System.out.println("O ponta foi feita ? " + getPontaFeita());
        }
    }

    void apagar(){
        if(escreveuCaderno && borracha){
            System.out.println("Apagando");
            int porcentagem = getPorcentagemUsoBorracha() - 1;
            setPorcentagemUsoBorracha(porcentagem);
            System.out.println(getPorcentagemUsoBorracha() + "%");
        } else {
            System.out.println("Já tá apagado");
        }
    }

    void status(){
        System.out.println("Marca: " + getMarca());
        System.out.println("Cor: " + getCor());
        System.out.println("Ponta: " + getPonta());
        System.out.println("Ponto feita: " + getPontaFeita());
        System.out.println("Porcentagem Uso borracha: " + getPorcentagemUsoBorracha());
        System.out.println("Existe borracha? " + isBorracha());
    }


    public Double getTamanho() {
        return tamanho;
    }

    public void setTamanho(Double tamanho) {
        this.tamanho = tamanho;
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean getPontaFeita() {
        return pontaFeita;
    }

    public void setPontaFeita(boolean pontaFeita) {
        this.pontaFeita = pontaFeita;
    }

    public boolean isEscreveuCaderno() {
        return escreveuCaderno;
    }

    public void setEscreveuCaderno(boolean escreveuCaderno) {
        this.escreveuCaderno = escreveuCaderno;
    }

    public boolean isBorracha() {
        return borracha;
    }

    public void setBorracha(boolean borracha) {
        this.borracha = borracha;
    }

    public int getPorcentagemUsoBorracha() {
        return porcentagemUsoBorracha;
    }

    public void setPorcentagemUsoBorracha(int porcentagemUsoBorracha) {
        this.porcentagemUsoBorracha = porcentagemUsoBorracha;
    }

}
