package AULA3.HERANCA;

public class Gerente extends Colaborador {

    private String login;

    private String senha;

    private Integer filiais;

    private Double bonusEmpresarial;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Integer getFiliais() {
        return filiais;
    }

    public void setFiliais(Integer filiais) {
        this.filiais = filiais;
    }

    public Double getBonusEmpresarial() {
        return bonusEmpresarial;
    }

    public void setBonusEmpresarial(Double bonusEmpresarial) {
        this.bonusEmpresarial = bonusEmpresarial;
    }
}
