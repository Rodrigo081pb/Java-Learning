package EstruturasDeControle.EstruturasCondicionais;

import java.util.Scanner;

public class MultiplaEscolhaSwith {
    public static void main(String[] args) {
        String homemAranha;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o número da versão do homem aranha favorito");
        int versao = input.nextInt();

        switch(versao){
            case 1:
                homemAranha = "Tobey";
                break;
            case 2:
                homemAranha = "Andrew";
                break;
            case 3:
                homemAranha = "Tom";
                break;
            case 4:
                homemAranha = "Miles";
                break;
            default:
                homemAranha = "";
                break;
        }

        System.out.println(homemAranha);
    }

}
