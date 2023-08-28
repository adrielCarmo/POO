package ex001;

import java.util.Date;

public class Professor extends BasePessoa {
    private String registro;
    private Date dataContratacao;

    public Professor() {

    }

    public Professor(int codigo, String nome, String endereco, String telefone, String rg, String cpf, Date dataNascimento, Date dataInsercao, String registro, Date dataContratacao) {
        super(codigo, nome, endereco, telefone, rg, cpf, dataNascimento, dataInsercao);
        this.registro = registro;
        this.dataContratacao = dataContratacao;
    }
}
