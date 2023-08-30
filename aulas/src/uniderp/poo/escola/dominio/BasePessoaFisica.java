package uniderp.poo.escola.dominio;

import java.util.Date;

public abstract class BasePessoaFisica {
    protected Date dataNascimento;
    protected String rg;
    protected String cpf;

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
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

    public BasePessoaFisica(Date dataNascimento, String rg, String cpf) {
        this.dataNascimento = dataNascimento;
        this.rg = rg;
        this.cpf = cpf;
    }

    public BasePessoaFisica() {

    }
}
