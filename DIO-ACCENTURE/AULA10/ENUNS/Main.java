package AULA10.ENUNS;

public class Main {
    public void main(String[] args) {
        Status status = Status.ATIVO;

        switch (status) {
            case ATIVO:
                System.out.println("O status é ATIVO");
                break;
            case INATIVO:
                System.out.println("O status é INATIVO");
                break;
            case BLOQUEADO:
                System.out.println("O status é BLOQUEADO");
                break;
        }
    }
}
