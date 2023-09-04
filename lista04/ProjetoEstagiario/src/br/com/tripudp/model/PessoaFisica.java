package br.com.tripudp.model;

import java.util.Date;

public class PessoaFisica extends BasePessoa {
    protected Date dataNasc;
    protected String rg;
    protected String cpf;

    public PessoaFisica() {
    }

    public PessoaFisica(Date dataNasc, String rg, String cpf) {
        super();
        this.dataNasc = dataNasc;
        this.rg = rg;
        this.cpf = cpf;
    }
}
