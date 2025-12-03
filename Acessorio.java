import java.util.InputMismatchException;
import java.util.Scanner;

public class Acessorio extends Peca {

    public Acessorio(String descricao, int quantidade, int estoqueMin, int estoqueMax) {
        super(descricao, quantidade, estoqueMin, estoqueMax);
    }

    @Override
    public void venda() {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("Quantidade vendida de " + descricao + ": ");
            int qtd = scan.nextInt();
            if (qtd <= 0) {
                System.out.println("Quantidade inválida.");
                return;
            }
            if (qtd > quantidade) {
                System.out.println("Estoque insuficiente.");
                return;
            }
            quantidade -= qtd;
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida.");
        }
    }
}
