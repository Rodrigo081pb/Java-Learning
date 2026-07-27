package ControleDeFluxo;

import java.util.Scanner;

public class Aula5  {
    public static void main(String[] args) {
        // desafio 1 : pedir nome e idade usuário e indicar qual categoria de natação ele vai participar
        Scanner scanner = new Scanner(System.in);
        System.out.print("Me diga seu nome: ");
        String nome = scanner.next();
        System.out.print("Me diga sua idade: ");
        int idade = scanner.nextInt();
        if (idade < 10){
            System.out.printf("O participante : %s que tem %s anos irá participar na categoria infantil", nome,idade);
        } else if (idade >= 11 && idade <=15) {
            System.out.printf("O participante : %s que tem %s anos irá participar na categoria Juvenil", nome,idade);
        } else if(idade >= 16 && idade <=19){
            System.out.printf("O participante : %s que tem %s anos irá participar na categoria Pré adulto", nome,idade);
        } else {
            System.out.printf("O participante : %s que tem %s anos irá participar na categoria Adulto", nome,idade);
        }


//        while (inicio <= fim){
//            int meio =  (inicio+fim)/2;
//            if (busca[meio] == valorCorreto){
//                System.out.println("encontrei o valor correto é: "+ busca[meio]);
//                break;
//            } else if (busca[meio] < valorCorreto){
//                inicio = meio+1;
//            } else{
//                fim = meio-1;
//            }
//        }

    }
}
