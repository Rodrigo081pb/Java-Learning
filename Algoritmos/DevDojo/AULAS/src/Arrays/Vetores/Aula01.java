package Arrays.Vetores;


public class Aula01 {
    public static void main(String[] args) {
        // Declaração de um array
                                // tamanho do array = 4
        double[] notas = new double[4];

        notas[0]=3.5;
        notas[1]=4.5;
        notas[2]=5.5;
        notas[3]=10.0;

        double media = (notas[0]+notas[1]+notas[2]+notas[3]) / 3;

        System.out.println("media: "+Math.round(media));

        for (double valor : notas){
            System.out.println(valor);
        }

        System.out.println("SKASKAKSASAKSAK");

        for(int i = 0; i < notas.length; i++){
            System.out.println(notas[i]);
        }


    }
}
