package LacosDeRepeticao.While;

public class AulaDoWhile {
    public static void main(String[] args) {
        boolean condicao = false;
        while (condicao) {
            System.out.println("Tô aqui");
        }
        System.out.println("Não to mais");

        // vai executar o do independente de qualquer coisa
        do{
            System.out.println("Ahais");
        } while (condicao);




    }
}
