package Exercicios.LacosDeRepeticao.For;

public class BuscaLinear {
    public static void main(String[] args) {

        int []busca = new int[] {10,20,30,40,50};
        int valorCorreto = 30;

        for(int i = 0; i<busca.length; i++){
            if(busca[i] == valorCorreto){
                System.out.println("Encontrei o valor correto: " + valorCorreto);
                break;
            } else {
                System.out.println("não encontrei o valor correto " + busca[i] );
            }
        }
    }
}
