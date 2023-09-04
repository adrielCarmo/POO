package br.com.tripudp.model;

public class Funcionario extends PessoaFisica {
    private int matricula;
    private String setor;
    private String cargo;
    private double salario;
    private ContaDeposito conta;

    public Funcionario() {
    }

    public Funcionario(int matricula, String setor, String cargo, double salario, ContaDeposito conta) {
        super();
        this.matricula = matricula;
        this.setor = setor;
        this.cargo = cargo;
        this.salario = salario;
        this.conta = conta;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public ContaDeposito getConta() {
        return conta;
    }

    public void setConta(ContaDeposito conta) {
        this.conta = conta;
    }
}
