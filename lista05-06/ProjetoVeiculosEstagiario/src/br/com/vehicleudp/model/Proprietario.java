package br.com.vehicleudp.model;

import java.time.LocalDate;

public class Proprietario extends Identificador {
    private String nome;
    private LocalDate dataNasc;
    private String telefone;
    private String cpf;
    private String cnh;
    private Endereco endereco;

    public Proprietario() {
    }

    public Proprietario(int codigo, String nome, LocalDate dataNasc, String telefone, String cpf, String cnh, Endereco endereco) {
        super(codigo);
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.telefone = telefone;
        this.cpf = cpf;
        this.cnh = cnh;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
