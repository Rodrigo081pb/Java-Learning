package TiposPrimitivos;
import java.util.Scanner;


public class EntradaDeDados {
    public static void main(String[] args) {
        // para ativar a classe precisamos criar um objeto
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = teclado.nextLine();
        System.out.printf("Olá %s me diga que nota você tirou:", nome);
        float nota = teclado.nextFloat();
        System.out.println("================================================");
        System.out.println("           Carregando nota no sistema           ");
        System.out.println("================================================");
        System.out.println("================================================");
        System.out.println("                  BOLETIM                       ");
        System.out.println("================================================");
        System.out.printf("ALUNO: %s ", nome + "\n");
        System.out.printf("NOTA:  é %.1f  \n", nota);
        System.out.println("================================================");
    }
}
