package AULA12.DATES;

public class CALENDAR {

    // Calendar : classe mais antiga que o Date,
    // mas ainda amplamente utilizada para manipulação de datas e horários

    public static void main(String[] args) {
        java.util.Calendar calendario = java.util.Calendar.getInstance();

        System.out.println("Data e hora atual: " + calendario.getTime());

        // Adicionando 5 dias
        calendario.add(java.util.Calendar.DAY_OF_MONTH, 5);
        System.out.println("Data após adicionar 5 dias: " + calendario.getTime());

        // Subtraindo 2 meses
        calendario.add(java.util.Calendar.MONTH, -2);
        System.out.println("Data após subtrair 2 meses: " + calendario.getTime());

        // Definindo uma data específica
        calendario.set(2023, java.util.Calendar.DECEMBER, 25);
        System.out.println("Data definida para 25 de dezembro de 2023: " + calendario.getTime());
    }

}
