package uniderp.poo.escola.dominio;

import java.util.Date;

public abstract class BaseDadosComum extends BaseIdentificador {
    protected String endereco;
    protected String telefone;
    protected Date dataInsercao;

    public BaseDadosComum() {
    }

    public BaseDadosComum(String endereco, String telefone, Date dataInsercao) {
        this.endereco = endereco;
        this.telefone = telefone;
        this.dataInsercao = dataInsercao;
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

    public Date getDataInsercao() {
        return dataInsercao;
    }

    public void setDataInsercao(Date dataInsercao) {
        this.dataInsercao = dataInsercao;
    }

}
