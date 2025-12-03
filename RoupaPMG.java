import java.util.InputMismatchException;
import java.util.Scanner;

public class RoupaPMG extends Peca {

    private int quantidadeP, quantidadeM, quantidadeG;

    public RoupaPMG(String descricao, int p, int m, int g, int estoqueMin, int estoqueMax) {
        super(descricao, 0, estoqueMin, estoqueMax);
        this.quantidadeP = p;
        this.quantidadeM = m;
        this.quantidadeG = g;
    }

    @Override
    public void venda() {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("Tamanho vendido (P / M / G): ");
            String tam = scan.next().toUpperCase();

            switch (tam) {
                case "P":
                    if (quantidadeP > 0) quantidadeP--;
                    else System.out.println("Sem estoque de tamanho P.");
                    break;
                case "M":
                    if (quantidadeM > 0) quantidadeM--;
                    else System.out.println("Sem estoque de tamanho M.");
                    break;
                case "G":
                    if (quantidadeG > 0) quantidadeG--;
                    else System.out.println("Sem estoque de tamanho G.");
                    break;
                default:
                    System.out.println("Tamanho inválido.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida.");
        }
    }

    @Override
    public void reposicaoEstoque() {
        if (quantidadeP < estoqueMin) quantidadeP = estoqueMax;
        if (quantidadeM < estoqueMin) quantidadeM = estoqueMax;
        if (quantidadeG < estoqueMin) quantidadeG = estoqueMax;
    }

    public void mostrarEstoque() {
        System.out.println(descricao + " → P:" + quantidadeP + " M:" + quantidadeM + " G:" + quantidadeG);
    }
}
