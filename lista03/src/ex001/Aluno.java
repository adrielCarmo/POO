package ex001;

import java.util.Date;

public class Aluno extends BasePessoa {

    private String matricula;
    private Date dataMatricula;

    public Aluno() {

    }

    public Aluno(int codigo, String nome, String endereco, String telefone, String rg, String cpf, Date dataNascimento, Date dataInsercao, String matricula, Date dataMatricula) {
        super(codigo, nome, endereco, telefone, rg, cpf, dataNascimento, dataInsercao);
        this.matricula = matricula;
        this.dataMatricula = dataMatricula;
    }
}
