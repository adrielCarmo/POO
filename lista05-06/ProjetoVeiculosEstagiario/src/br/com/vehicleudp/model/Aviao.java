package br.com.vehicleudp.model;

public class Aviao extends Veiculo {
    private int qntMotores;
    private int qntTurbinas;
    private int qntPassageiros;
    private double comprimento;
    private double altMax;

    public Aviao() {
    }

    public Aviao(int codigo, String nome, String modelo, String cor, String placa, String chassi, int numEixos, int anoFabricacao, int anoModelo, double capacidadeCarga, double pesoLiquido, double pesoTotal, double potenciaCV, String fabricante, String tipoVeiculo, String tipoCombustivel, String codRenavam, int qntPortas, int qntMarchas, String estadoUF, String cidade, Proprietario proprietario, int qntMotores, int qntTurbinas, int qntPassageiros, double comprimento, double altMax) {
        super(codigo, nome, modelo, cor, placa, chassi, numEixos, anoFabricacao, anoModelo, capacidadeCarga, pesoLiquido, pesoTotal, potenciaCV, fabricante, tipoVeiculo, tipoCombustivel, codRenavam, qntPortas, qntMarchas, estadoUF, cidade, proprietario);
        this.qntMotores = qntMotores;
        this.qntTurbinas = qntTurbinas;
        this.qntPassageiros = qntPassageiros;
        this.comprimento = comprimento;
        this.altMax = altMax;
    }

    public int getQntMotores() {
        return qntMotores;
    }

    public void setQntMotores(int qntMotores) {
        this.qntMotores = qntMotores;
    }

    public int getQntTurbinas() {
        return qntTurbinas;
    }

    public void setQntTurbinas(int qntTurbinas) {
        this.qntTurbinas = qntTurbinas;
    }

    public int getQntPassageiros() {
        return qntPassageiros;
    }

    public void setQntPassageiros(int qntPassageiros) {
        this.qntPassageiros = qntPassageiros;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getAltMax() {
        return altMax;
    }

    public void setAltMax(double altMax) {
        this.altMax = altMax;
    }

    @Override
    public void imprimir() {
        System.out.println("Avião: " + this.nome);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Identificação: " + this.placa);
        System.out.println("Ano: " + this.anoFabricacao);
        System.out.println("Altura Máxima: " + this.altMax);
        System.out.println("Quantidade de Passageiros: " + this.qntPassageiros);
        System.out.println("Quantidade de Turbinas: " + this.qntTurbinas);
        System.out.println("Nome do Proprietário: " + this.proprietario.getNome());
    }
}
