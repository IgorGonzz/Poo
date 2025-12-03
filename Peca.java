public abstract class Peca {
    protected String descricao;
    protected int quantidade;
    protected int estoqueMin;
    protected int estoqueMax;

    public Peca(String descricao, int quantidade, int estoqueMin, int estoqueMax) {
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.estoqueMin = estoqueMin;
        this.estoqueMax = estoqueMax;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public abstract void venda();

    public void reposicaoEstoque() {
        if (quantidade < estoqueMin) {
            quantidade = estoqueMax;
            System.out.println("Reposição realizada para " + descricao + ". Estoque = " + quantidade);
        }
    }
}
