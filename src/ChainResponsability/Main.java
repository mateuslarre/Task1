package ChainResponsability;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static int produtoId;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecione 0 para sair.");

        do {
            List<Produto> produtos = new ArrayList<>();
            produtos.add(new Produto("Coca-Cola", 1, 3.75));
            produtos.add(new Produto("Dortitos", 2, 7.50));
            produtos.add(new Produto("Stikadinho", 3, 2.50));
            produtos.add(new Produto("Corona", 4, 7.50));
            produtos.add(new Produto("Café", 5, 12));
            produtos.add(new Produto("Picanha", 6, 57.75));

            ATMDispenseChain atmDispenser = new ATMDispenseChain();

            System.out.println("============ PRODUTOS ===============");

            for (Produto produto : produtos) {
                System.out.println(produto);
            }

            System.out.println("========================================");
            System.out.println("Selecione o produto desejado: ");
            produtoId = scanner.nextInt();

            Produto produto = produtos.stream().filter(p -> p.getId() == produtoId).findFirst().orElse(null);

            if (produto != null) {
                System.out.println("Produto selecionado: " + produto.getNome());
                System.out.println("Preço: " + produto.getPreco());
                System.out.println("========================================");
                System.out.println("Insira o valor: ");
                double amount = scanner.nextDouble();
                if (amount < produto.getPreco()) {
                    System.out.println("Valor insuficiente");
                } else {
                    atmDispenser.dispense(amount - produto.getPreco());
                }
            } else {
                System.out.println("Produto não encontrado");
            }
        } while (produtoId != 0);
    }
}
