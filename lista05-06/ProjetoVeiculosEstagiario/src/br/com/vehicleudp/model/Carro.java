package br.com.vehicleudp.model;

public class Carro extends Veiculo {
    private double motorizacao;
    private String tipoDirecao;
    private String obs;

    public Carro() {
    }

    public Carro(int codigo, String nome, String modelo, String cor, String placa, String chassi, int numEixos, int anoFabricacao, int anoModelo, double capacidadeCarga, double pesoLiquido, double pesoTotal, double potenciaCV, String fabricante, String tipoVeiculo, String tipoCombustivel, String codRenavam, int qntPortas, int qntMarchas, String estadoUF, String cidade, Proprietario proprietario, double motorizacao, String tipoDirecao, String obs) {
        super(codigo, nome, modelo, cor, placa, chassi, numEixos, anoFabricacao, anoModelo, capacidadeCarga, pesoLiquido, pesoTotal, potenciaCV, fabricante, tipoVeiculo, tipoCombustivel, codRenavam, qntPortas, qntMarchas, estadoUF, cidade, proprietario);
        this.motorizacao = motorizacao;
        this.tipoDirecao = tipoDirecao;
        this.obs = obs;
    }

    public double getMotorizacao() {
        return motorizacao;
    }

    public void setMotorizacao(double motorizacao) {
        this.motorizacao = motorizacao;
    }

    public String getTipoDirecao() {
        return tipoDirecao;
    }

    public void setTipoDirecao(String tipoDirecao) {
        this.tipoDirecao = tipoDirecao;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    @Override
    public void imprimir() {
        System.out.println("Carro: " + this.nome);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Placa: " + this.placa);
        System.out.println("Ano: " + this.anoFabricacao);
        System.out.println("Tipo de Combustível: " + this.tipoCombustivel);
        System.out.println("Quantidade de Portas: " + this.qntPortas);
        System.out.println("Motorização: " + this.motorizacao);
        System.out.println("Tipo de Direção: " + this.tipoDirecao);
        System.out.println("Nome do Proprietário: " + this.proprietario.getNome());
    }
}
