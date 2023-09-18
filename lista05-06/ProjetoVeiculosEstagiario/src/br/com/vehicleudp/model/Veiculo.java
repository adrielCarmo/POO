package br.com.vehicleudp.model;

public abstract class Veiculo extends Identificador implements Impressao {
    protected String nome;
    protected String modelo;
    protected String cor;
    protected String placa;
    protected String chassi;
    protected int numEixos;
    protected int anoFabricacao;
    protected int anoModelo;
    protected double capacidadeCarga;
    protected double pesoLiquido;
    protected double pesoTotal;
    protected double potenciaCV;
    protected String fabricante;
    protected String tipoVeiculo;
    protected String tipoCombustivel;
    protected String codRenavam;
    protected int qntPortas;
    protected int qntMarchas;
    protected String estadoUF;
    protected String cidade;
    protected Proprietario proprietario;

    public Veiculo() {
    }

    public Veiculo(int codigo, String nome, String modelo, String cor, String placa, String chassi, int numEixos, int anoFabricacao, int anoModelo, double capacidadeCarga, double pesoLiquido, double pesoTotal, double potenciaCV, String fabricante, String tipoVeiculo, String tipoCombustivel, String codRenavam, int qntPortas, int qntMarchas, String estadoUF, String cidade, Proprietario proprietario) {
        super(codigo);
        this.nome = nome;
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
        this.chassi = chassi;
        this.numEixos = numEixos;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.capacidadeCarga = capacidadeCarga;
        this.pesoLiquido = pesoLiquido;
        this.pesoTotal = pesoTotal;
        this.potenciaCV = potenciaCV;
        this.fabricante = fabricante;
        this.tipoVeiculo = tipoVeiculo;
        this.tipoCombustivel = tipoCombustivel;
        this.codRenavam = codRenavam;
        this.qntPortas = qntPortas;
        this.qntMarchas = qntMarchas;
        this.estadoUF = estadoUF;
        this.cidade = cidade;
        this.proprietario = proprietario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public int getNumEixos() {
        return numEixos;
    }

    public void setNumEixos(int numEixos) {
        this.numEixos = numEixos;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public double getPesoLiquido() {
        return pesoLiquido;
    }

    public void setPesoLiquido(double pesoLiquido) {
        this.pesoLiquido = pesoLiquido;
    }

    public double getPesoTotal() {
        return pesoTotal;
    }

    public void setPesoTotal(double pesoTotal) {
        this.pesoTotal = pesoTotal;
    }

    public double getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(double potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getCodRenavam() {
        return codRenavam;
    }

    public void setCodRenavam(String codRenavam) {
        this.codRenavam = codRenavam;
    }

    public int getQntPortas() {
        return qntPortas;
    }

    public void setQntPortas(int qntPortas) {
        this.qntPortas = qntPortas;
    }

    public int getQntMarchas() {
        return qntMarchas;
    }

    public void setQntMarchas(int qntMarchas) {
        this.qntMarchas = qntMarchas;
    }

    public String getEstadoUF() {
        return estadoUF;
    }

    public void setEstadoUF(String estadoUF) {
        this.estadoUF = estadoUF;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }
}
