package Exercicios.Arrays.Vetores;

public class ContandoPares {
    public static void main(String[] args) {
        int [] numeros = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int numerosPares = 0;
        for(int i=0;i<numeros.length;i++){
            if(numeros[i]%2==0){
                System.out.print(numeros[i]+" \n");
                numerosPares++;
            }
        }
        System.out.println("Total pares " + numerosPares);
    }
}
