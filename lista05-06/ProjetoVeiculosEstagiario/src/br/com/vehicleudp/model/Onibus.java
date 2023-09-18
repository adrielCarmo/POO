package br.com.vehicleudp.model;

public class Onibus extends Veiculo {
    private int qntPassageiros;
    private String tipoTransporte;
    private String nomeCompanhia;

    public Onibus() {
    }

    public Onibus(int codigo, String nome, String modelo, String cor, String placa, String chassi, int numEixos, int anoFabricacao, int anoModelo, double capacidadeCarga, double pesoLiquido, double pesoTotal, double potenciaCV, String fabricante, String tipoVeiculo, String tipoCombustivel, String codRenavam, int qntPortas, int qntMarchas, String estadoUF, String cidade, Proprietario proprietario, int qntPassageiros, String tipoTransporte, String nomeCompanhia) {
        super(codigo, nome, modelo, cor, placa, chassi, numEixos, anoFabricacao, anoModelo, capacidadeCarga, pesoLiquido, pesoTotal, potenciaCV, fabricante, tipoVeiculo, tipoCombustivel, codRenavam, qntPortas, qntMarchas, estadoUF, cidade, proprietario);
        this.qntPassageiros = qntPassageiros;
        this.tipoTransporte = tipoTransporte;
        this.nomeCompanhia = nomeCompanhia;
    }

    public int getQntPassageiros() {
        return qntPassageiros;
    }

    public void setQntPassageiros(int qntPassageiros) {
        this.qntPassageiros = qntPassageiros;
    }

    public String getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(String tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public String getNomeCompanhia() {
        return nomeCompanhia;
    }

    public void setNomeCompanhia(String nomeCompanhia) {
        this.nomeCompanhia = nomeCompanhia;
    }

    @Override
    public void imprimir() {
        System.out.println("Ônibus: " + this.nome);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Placa: " + this.placa);
        System.out.println("Ano: " + this.anoFabricacao);
        System.out.println("Tipo de Combustível " + this.tipoCombustivel);
        System.out.println("Quantidade de Passageiros: " + this.qntPassageiros);
        System.out.println("Nome da Companhia: " + this.nomeCompanhia);
        System.out.println("Nome do Proprietário: " + this.proprietario.getNome());
    }
}
