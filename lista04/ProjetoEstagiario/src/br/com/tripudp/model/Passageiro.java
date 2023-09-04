package br.com.tripudp.model;

public class Passageiro extends PessoaFisica {
    private int numPassaporte;
    private int numBilhete;
    private int pontosFidelidade;
    private String obsMedica;

    public Passageiro() {
    }

    public Passageiro(int numPassaporte, int numBilhete, int pontosFidelidade, String obsMedica) {
        super();
        this.numPassaporte = numPassaporte;
        this.numBilhete = numBilhete;
        this.pontosFidelidade = pontosFidelidade;
        this.obsMedica = obsMedica;
    }

    public int getNumPassaporte() {
        return numPassaporte;
    }

    public void setNumPassaporte(int numPassaporte) {
        this.numPassaporte = numPassaporte;
    }

    public int getNumBilhete() {
        return numBilhete;
    }

    public void setNumBilhete(int numBilhete) {
        this.numBilhete = numBilhete;
    }

    public int getPontosFidelidade() {
        return pontosFidelidade;
    }

    public void setPontosFidelidade(int pontosFidelidade) {
        this.pontosFidelidade = pontosFidelidade;
    }

    public String getObsMedica() {
        return obsMedica;
    }

    public void setObsMedica(String obsMedica) {
        this.obsMedica = obsMedica;
    }
}
