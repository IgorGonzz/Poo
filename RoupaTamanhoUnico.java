public class RoupaTamanhoUnico extends Peca {

    public RoupaTamanhoUnico(String descricao, int quantidade, int estoqueMin, int estoqueMax) {
        super(descricao, quantidade, estoqueMin, estoqueMax);
    }

    @Override
    public void venda() {
        if (quantidade > 0) {
            quantidade--;
            System.out.println("Venda realizada: 1 unidade de " + descricao);
        } else {
            System.out.println("Estoque insuficiente.");
        }
    }
}
