package AULA7.ARRAYS.ARRAYSLISTS;

import java.util.Objects;

public class Marcas {

    private Integer id;

    private String nome;

    public Marcas(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void Apresentar(){
        System.out.println("Marca: " + this.nome + " ID: " + this.id);
    }

    @Override
    public boolean equals(final Object obj) {
        var Isquals = false;
        if (obj instanceof Marcas marcas) {
            if (this == marcas) Isquals = true;
            if (this.id == marcas.id && Objects.equals(this.nome, marcas.nome)) Isquals = true;
        }
        return Isquals;
    }

    public String toString() {
        return String.format("Marca{id=%d, nome='%s'}", this.id, this.nome);
    }
}
