package ex001;

import java.util.Date;

public abstract class BasePessoa {
    private int codigo;
    private String nome, endereco, telefone, rg, cpf;
    private Date dataNascimento, dataInsercao;

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
}