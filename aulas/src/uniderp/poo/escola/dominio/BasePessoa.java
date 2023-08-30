package uniderp.poo.escola.dominio;

public abstract class BasePessoa {
    protected String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BasePessoa(String nome) {
        this.nome = nome;
    }
}
