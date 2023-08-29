package ex001;

import java.util.Date;

public abstract class BasePessoa {
    protected int codigo;
    protected String nome, endereco, telefone, rg, cpf;
    protected Date dataNascimento, dataInsercao;

    public BasePessoa() {

    }

    public BasePessoa(int codigo, String nome, String endereco, String telefone, String rg, String cpf, Date dataNascimento, Date dataInsercao) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.rg = rg;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.dataInsercao = dataInsercao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Date getDataInsercao() {
        return dataInsercao;
    }

    public void setDataInsercao(Date dataInsercao) {
        this.dataInsercao = dataInsercao;
    }
}