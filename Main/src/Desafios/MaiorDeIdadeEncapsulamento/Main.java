package Desafios.MaiorDeIdadeEncapsulamento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IdadePessoa pessoaIdade = new IdadePessoa();
        int stop = 0;

        while (stop != 10) {
            System.out.println("Digite o seu nome: ");
            String nome = scanner.nextLine();

            System.out.println("Digite a idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine();

            pessoaIdade.setNome(nome);
            pessoaIdade.setIdade(idade);

            boolean isMaiorDeIdade = pessoaIdade.getIdade() >= 18;

            System.out.println(isMaiorDeIdade ? "Maior de idade" : "Menor de idade");

            System.out.println("Digite 10 para parar ou qualquer outro número para continuar:");
            stop = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha pendente após a leitura do inteiro
        }
    }
}
