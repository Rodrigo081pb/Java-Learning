package AULA7.ARRAYS.SETS;

import java.util.Objects;

import static java.util.Objects.hash;
import static java.util.Objects.isNull;

public class Usuario {

    private String nome;

    private Integer id;

    public Usuario(int i, String maria) {
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Usuario() {
    }

    @Override
    public String toString(){
      return String.format("Usuario{id=%d, nome='%s'}", this.id, this.nome);
    };

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if ((isNull(obj)) || (!(obj instanceof  Usuario usuario ))) return false;
        return this.id == usuario.getId() && Objects.equals(usuario.getNome(), this.nome);
    }

    @Override
    public int hashCode() {
        return hash(this.id, this.nome);
    }

}
