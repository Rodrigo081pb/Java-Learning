package AULA12.DATES;

public class DATE {

    public static void main(String[] args) {
        // Date : classe mais antiga para representar datas e horários
        java.util.Date dataAtual = new java.util.Date();
        System.out.println("Data e hora atual: " + dataAtual);

        // Criando uma data específica (1 de janeiro de 2023)
        java.util.Date dataEspecifica = new java.util.Date(123, 0, 1); // Ano desde 1900, mês começa em 0
        System.out.println("Data específica: " + dataEspecifica);

        // Comparando datas
        if (dataAtual.after(dataEspecifica)) {
            System.out.println("A data atual é depois da data específica.");
        } else if (dataAtual.before(dataEspecifica)) {
            System.out.println("A data atual é antes da data específica.");
        } else {
            System.out.println("As datas são iguais.");
        }
    }

}
