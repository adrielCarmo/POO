package uniderp.poo.escola.dominio;

import java.time.LocalDate;
import java.util.Date;

public class Fornecedor extends BasePessoaJuridica {
    private String servico;
    private LocalDate dataContrato;
    private int periodoMeses;

    public Fornecedor() {
    }

    public Fornecedor(int codigo, Date dataInsercao, String endereco, String telefone, String nomeFantasia, String razaoSocial, String cnpj, String inscricaoEstadual, LocalDate dataAbertura, String servico, LocalDate dataContrato, int periodoMeses) {
        super(codigo, dataInsercao, endereco, telefone, nomeFantasia, razaoSocial, cnpj, inscricaoEstadual, dataAbertura);
        this.servico = servico;
        this.dataContrato = dataContrato;
        this.periodoMeses = periodoMeses;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public LocalDate getDataContrato() {
        return dataContrato;
    }

    public void setDataContrato(LocalDate dataContrato) {
        this.dataContrato = dataContrato;
    }

    public int getPeriodoMeses() {
        return periodoMeses;
    }

    public void setPeriodoMeses(int periodoMeses) {
        this.periodoMeses = periodoMeses;
    }

    @Override
    public void imprimir() {
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Data de Inserção:" + this.dataInsercao);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Nome Fantasia: " + this.nomeFantasia);
        System.out.println("Razão Social: " + this.razaoSocial);
        System.out.println("CNPJ: " + this.cnpj);
        System.out.println("Inscrição Estadual: " + this.inscricaoEstadual);
        System.out.println("Data de Abertura: " + this.dataAbertura);
        System.out.println("Serviço: " + this.servico);
        System.out.println("Data do Contrato: " + this.dataContrato);
        System.out.println("Período em Meses: " + this.periodoMeses);
    }
}
