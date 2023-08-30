package uniderp.poo.escola.dominio;

public abstract class BasePessoa extends BaseDadosComum {
    protected String nome;

    public BasePessoa() {

    }

    public BasePessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
