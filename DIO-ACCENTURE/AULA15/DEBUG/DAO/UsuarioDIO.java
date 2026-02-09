package AULA15.DEBUG.DAO;

import java.time.OffsetDateTime;
import java.util.Objects;

public class UsuarioDIO{
    private long id;
    private String nome;
    private String email;
    private OffsetDateTime aniversario;

    public UsuarioDIO() {
    }

    public UsuarioDIO(long id, String nome, String email, OffsetDateTime aniversario) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.aniversario = aniversario;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public OffsetDateTime getAniversario() {
        return aniversario;
    }

    public void setAniversario(OffsetDateTime aniversario) {
        this.aniversario = aniversario;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        UsuarioDIO that = (UsuarioDIO) o;
        return id == that.id && Objects.equals(nome, that.nome) && Objects.equals(email, that.email) && Objects.equals(aniversario, that.aniversario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, email, aniversario);
    }

    @Override
    public String toString() {
        return "UsuarioDIO{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", aniversario=" + aniversario +
                '}';
    }
}
