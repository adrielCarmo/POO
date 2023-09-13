package uniderp.poo.escola.dominio;

import java.time.LocalDate;

public abstract class BaseDadosComum extends BaseIdentificador {
    protected LocalDate dataInsercao;

    public BaseDadosComum() {
    }

    public BaseDadosComum(int codigo, LocalDate dataInsercao) {
        super(codigo);
        this.dataInsercao = dataInsercao;
    }

    public LocalDate getDataInsercao() {
        return dataInsercao;
    }

    public void setDataInsercao(LocalDate dataInsercao) {
        this.dataInsercao = dataInsercao;
    }
}
