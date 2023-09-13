package uniderp.poo.escola.dominio;

import java.time.LocalDate;
import java.util.Date;

public abstract class BasePessoaJuridica extends BasePessoa {
    protected String nomeFantasia;
    protected String razaoSocial;
    protected String cnpj;
    protected String inscricaoEstadual;
    protected LocalDate dataAbertura;

    public BasePessoaJuridica() {
    }

    public BasePessoaJuridica(int codigo, Date dataInsercao, String endereco, String telefone, String nomeFantasia, String razaoSocial, String cnpj, String inscricaoEstadual, LocalDate dataAbertura) {
        super(codigo, dataInsercao, endereco, telefone);
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.dataAbertura = dataAbertura;
    }
}
