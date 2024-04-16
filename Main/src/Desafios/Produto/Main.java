package Desafios.Produto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto produto = new Produto();

        System.out.println("Nome do produto: ");
        String nomeProduto = scanner.nextLine();

        System.out.println("Preço do produto: ");
        double precoProduto = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Gostaria de aplicar desconto ? [s/n]");
        String desconto = scanner.nextLine();

        produto.setNome(nomeProduto);
        produto.setPreco(precoProduto);

        if (desconto.equalsIgnoreCase("s")) {
            System.out.println("Valor do desconto : ");
            double descontoProduto = scanner.nextDouble();

            double descontoFinal = descontoProduto / 100;

            double precoComDesconto = produto.desconto(descontoFinal);
            produto.setPreco(precoComDesconto);
        }
    }
}
