package Exercicios.OpcionaisMoodle.Aula05.zoologico;

import java.util.Objects;

abstract class Animal {
    String nome;
    public abstract void emitirSom();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(nome, animal.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}

