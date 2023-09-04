package br.com.tripudp.model;

import java.util.Date;

public class Usuario extends Identificador {
    private String nome;
    private String senha;
    private String email;
    private int perfil;
    private Date dataRegistro;

    public Usuario(String nome, String senha, String email, int perfil, Date dataRegistro) {
        super();
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        this.perfil = perfil;
        this.dataRegistro = dataRegistro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPerfil() {
        return perfil;
    }

    public void setPerfil(int perfil) {
        this.perfil = perfil;
    }

    public Date getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(Date dataRegistro) {
        this.dataRegistro = dataRegistro;
    }
}
