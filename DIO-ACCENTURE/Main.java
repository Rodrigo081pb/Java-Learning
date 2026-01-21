public class Main {
    public static void main(String[] args) {
        CLASSES.Pessoa pessoa = new CLASSES.Pessoa("Ana", 30);
        pessoa.apresentar();

        CLASSES.Funcionario funcionario = new CLASSES.Funcionario("Carlos", 40, "Engenheiro");
        funcionario.apresentar();
    }
}
