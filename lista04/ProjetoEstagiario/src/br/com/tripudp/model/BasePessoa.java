package br.com.tripudp.model;

public abstract class BasePessoa extends Identificador {
    protected String nome;
    protected String telefone;
    protected Usuario usuario;
    protected Endereco endereco;

    public BasePessoa(String nome, String telefone, Usuario usuario, Endereco endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.usuario = new Usuario();
        this.endereco = new Endereco();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
