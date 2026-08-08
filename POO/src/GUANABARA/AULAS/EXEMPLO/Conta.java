package GUANABARA.AULAS.EXEMPLO;

public class Conta {
    private String nome;

    void apresentar(String nome){
        this.nome = nome;
        System.out.println("Nome da conta: " + nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
