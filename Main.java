import java.util.Scanner;

public class SistemaEstoque {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Peca[] itens = new Peca[5];

        itens[0] = new RoupaTamanhoUnico("Saída de Praia", 5, 2, 10);
        itens[1] = new Acessorio("Pulseira", 20, 5, 50);
        itens[2] = new RoupaPMG("Camiseta Feminina", 2, 2, 2, 1, 5);
        itens[3] = new Acessorio("Cinto", 10, 3, 20);
        itens[4] = new RoupaTamanhoUnico("Saia", 3, 1, 8);

        int opcao = -1;

        while (opcao != 5) {
            System.out.println("\n===== MENU DO ESTOQUE =====");
            for (int i = 0; i < itens.length; i++) {
                System.out.println(i + " – " + itens[i].getDescricao());
            }
            System.out.println("5 – Sair");

            try {
                System.out.print("Escolha uma opção: ");
                opcao = scan.nextInt();

                if (opcao >= 0 && opcao < 5) {
                    itens[opcao].venda();
                    itens[opcao].reposicaoEstoque();
                } else if (opcao != 5) {
                    System.out.println("Opção inválida!");
                }

            } catch (Exception e) {
                System.out.println("Entrada inválida.");
                scan.nextLine(); 
            }
        }

        System.out.println("\n=== ESTOQUE FINAL ===");
        for (Peca p : itens) {
            if (p instanceof RoupaPMG) {
                ((RoupaPMG) p).mostrarEstoque();
            } else {
                System.out.println(p.getDescricao() + ": " + p.getQuantidade());
            }
        }

        System.out.println("Sistema encerrado.");
    }
}
