package br.com.vehicleudp.model;

public class Caminhao extends Veiculo{
    private String tipoCarga;
    private int qntRodas;

    public Caminhao() {
    }

    public Caminhao(int codigo, String nome, String modelo, String cor, String placa, String chassi, int numEixos, int anoFabricacao, int anoModelo, double capacidadeCarga, double pesoLiquido, double pesoTotal, double potenciaCV, String fabricante, String tipoVeiculo, String tipoCombustivel, String codRenavam, int qntPortas, int qntMarchas, String estadoUF, String cidade, Proprietario proprietario, String tipoCarga, int qntRodas) {
        super(codigo, nome, modelo, cor, placa, chassi, numEixos, anoFabricacao, anoModelo, capacidadeCarga, pesoLiquido, pesoTotal, potenciaCV, fabricante, tipoVeiculo, tipoCombustivel, codRenavam, qntPortas, qntMarchas, estadoUF, cidade, proprietario);
        this.tipoCarga = tipoCarga;
        this.qntRodas = qntRodas;
    }

    public String getTipoCarga() {
        return tipoCarga;
    }

    public void setTipoCarga(String tipoCarga) {
        this.tipoCarga = tipoCarga;
    }

    public int getQntRodas() {
        return qntRodas;
    }

    public void setQntRodas(int qntRodas) {
        this.qntRodas = qntRodas;
    }

    @Override
    public void imprimir() {
        System.out.println("Caminhão: " + this.nome);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Placa: " + this.placa);
        System.out.println("Ano: " + this.anoFabricacao);
        System.out.println("Tipo de Combustível: " + this.tipoCombustivel);
        System.out.println("Capacidade de Carga (em KG): " + this.capacidadeCarga);
        System.out.println("Número de Eixos: " + this.numEixos);
        System.out.println("Nome do Proprietário: " + this.proprietario.getNome());
    }
}
