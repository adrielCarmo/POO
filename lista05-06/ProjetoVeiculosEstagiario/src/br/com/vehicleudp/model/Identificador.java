package br.com.vehicleudp.model;

public abstract class Identificador {
    protected int codigo;

    public Identificador() {
    }

    public Identificador(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }
}
