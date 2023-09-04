package br.com.tripudp.model;

public abstract class Identificador {
    private int id;

    public Identificador() {

    }

    public Identificador(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
