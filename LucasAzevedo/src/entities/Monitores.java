package entities;

public class Monitores {
    private String nome;
    private int quantidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void imprimirInformacoes() {
        System.out.println("\n" + "Nome do monitor: " + getNome());
        System.out.println("Quantidade de monitores: " + getQuantidade()+ "\n");
    }
}
