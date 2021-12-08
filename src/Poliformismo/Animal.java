package Poliformismo;

import java.util.Objects;

public abstract class Animal {
    protected String nome;
    private float distancia;

    public Animal(String nome, float distancia) {
        this.nome = nome;
        this.distancia = distancia;
    }
        abstract public void mover();

    public String getNome() {
        return nome;
    }
    public float getDistancia() {
        return distancia;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;this.distancia = distancia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return Float.compare(animal.getDistancia(), getDistancia()) == 0 && Objects.equals(getNome(), animal.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getDistancia());
    }
}
