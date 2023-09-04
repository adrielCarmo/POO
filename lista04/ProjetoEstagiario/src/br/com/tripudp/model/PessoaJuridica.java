package br.com.tripudp.model;

import java.util.Date;

public abstract class PessoaJuridica extends BasePessoa {
    protected Date dataAbertura;
    protected String cnpj;

    public PessoaJuridica() {
    }

    public PessoaJuridica(Date dataAbertura, String cnpj) {
        super();
        this.dataAbertura = dataAbertura;
        this.cnpj = cnpj;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public String getCNPJ() {
        return cnpj;
    }

    public void setCNPJ(String cnpj) {
        this.cnpj = cnpj;
    }
}
