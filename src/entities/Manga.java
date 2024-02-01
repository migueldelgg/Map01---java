package entities;

import java.util.Objects;

public class Manga {
    private Long id ;
    private String nome;
    private Double price;

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Double getPrice() {
        return price;
    }

    public Manga(Long id, String nome, Double price) {
        this.id = id;
        this.nome = nome;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Objects.equals(id, manga.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", price=" + price +
                '}';
    }
}
