package AULA13.ThreadInterfaceRunnable;

public class Pessoa extends Thread {

    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(nome + " está executando a iteração " + i);
            try {
                Thread.sleep(500); // Pausa de 500ms para simular trabalho
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
