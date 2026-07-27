import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import static java.lang.System.in;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)throws IOException {

    /*
      ==============================================================================================
      DESAFIO 3
      ==============================================================================================

        o que ele quer basicamente que isso seja exibido na tela

        laço de repetição

        l0 = a + 1 * b = 2(armazenar esse resultado)
        l1 = 0 + 1 * b + 2 + 2 = 6
        l2 = 0 + 1 * b + 2 * 2 + 4 = 14

    */
        //        2 6 14 30 62 126 254 510 1022 2046
        //        8 14 26 50 98


        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int soma = a;
            int incremento=b;
            for (int j = 0; j < n; j++){
                if( j < n -1 ){
                    System.out.println(" ");

                    incremento*=2;
                }
                System.out.println();
            }


//            int incremento2 =  a + i * b + inc;
//            soma = soma += incremento;
//            System.out.println(soma);
        }
        in.close();



        /*
       ==============================================================================================
       DESAFIO 1
       ==============================================================================================

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        int N = 2;
        for (int i = 1; i <= 10; i++){
            int resultado = N * i ;
            System.out.println(N+" x "+i+" = "+resultado);
        }

         ele quer isso
        2 x 1 = 2
        2 x 2 = 4
        2 x 3 = 6
        2 x 4 = 8
        2 x 5 = 10
        2 x 6 = 12
        2 x 7 = 14
        2 x 8 = 16
        2 x 9 = 18
        2 x 10 = 20

        2 x 1 = 2


        bufferedReader.close();

    ==============================================================================================
    DESAFIO 2
    ==============================================================================================
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<1;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            // formatar a saida
            // tô dizendo pra o printf que eu quero que tenha ocupe 15 spaços de string
            // e tô falando pro double que ele tem 03 posições
            System.out.printf("%-15s%03d%n", s1, x);
        }
        System.out.println("================================");

    */

    }
}
