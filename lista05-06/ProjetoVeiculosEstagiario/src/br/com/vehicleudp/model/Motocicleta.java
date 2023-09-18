package br.com.vehicleudp.model;

public class Motocicleta extends Veiculo{
    private int qntCilindradas;
    private String tipoFreio;

    public Motocicleta() {
    }

    public Motocicleta(int codigo, String nome, String modelo, String cor, String placa, String chassi, int numEixos, int anoFabricacao, int anoModelo, double capacidadeCarga, double pesoLiquido, double pesoTotal, double potenciaCV, String fabricante, String tipoVeiculo, String tipoCombustivel, String codRenavam, int qntPortas, int qntMarchas, String estadoUF, String cidade, Proprietario proprietario, int qntCilindradas, String tipoFreio) {
        super(codigo, nome, modelo, cor, placa, chassi, numEixos, anoFabricacao, anoModelo, capacidadeCarga, pesoLiquido, pesoTotal, potenciaCV, fabricante, tipoVeiculo, tipoCombustivel, codRenavam, qntPortas, qntMarchas, estadoUF, cidade, proprietario);
        this.qntCilindradas = qntCilindradas;
        this.tipoFreio = tipoFreio;
    }

    public int getQntCilindradas() {
        return qntCilindradas;
    }

    public void setQntCilindradas(int qntCilindradas) {
        this.qntCilindradas = qntCilindradas;
    }

    public String getTipoFreio() {
        return tipoFreio;
    }

    public void setTipoFreio(String tipoFreio) {
        this.tipoFreio = tipoFreio;
    }

    @Override
    public void imprimir() {
        System.out.println("Motocicleta: " + this.nome);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Placa: " + this.placa);
        System.out.println("Ano: " + this.anoFabricacao);
        System.out.println("Tipo de Combustível: " + this.tipoCombustivel);
        System.out.println("Quantidade de Cilindradas: " + this.qntCilindradas);
        System.out.println("Tipo de Freio: " + this.tipoFreio);
        System.out.println("Nome do Proprietário: " + this.proprietario.getNome());
    }
}
