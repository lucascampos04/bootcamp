package Desafios.SistemaBancario;


import java.util.Scanner;

/**
 * Exibir nome, tipo da conta e saldo
 * ----------------------------------
 * | 1 - Consultar saldo            |
 * | 2 - Receber valor              |
 * | 3 - Transferir valor           |
 * | 4 - Sair                       |
 * ----------------------------------
 * */

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double saldo = 1000;

        menuCliente(saldo);
        menuBanco();

        System.out.println("Escolha uma opção: ");
        int opcao = scan.nextInt();

            while (opcao != 4) {
                switch (opcao) {
                    case 1:
                        saldo(saldo);
                        break;
                    case 2:
                        receber(saldo);
                        break;
                    case 3:
                        transferir(saldo);
                        break;
                }
                System.out.println("Deseja continuar? [S/N]");
                String opcaoContinuar = scan.next();

                if (opcaoContinuar.equalsIgnoreCase("n")) {
                    break;
                }

                System.out.println("Escolha uma opção: ");
                opcao = scan.nextInt();
            }
    }

    private static void transferir(double saldo) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o valor que deseja transferir");
        double valor = scan.nextDouble();

        if (valor > saldo){
            System.out.println("Saldo insuficiente");
        } else {
            saldo -= valor;
            System.out.println("Valor transferido com sucesso");
            System.out.println("Saldo atual: R$ " + saldo);
        }
    }
    private static void receber(double saldo) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o valor que deseja receber");
        double valor = scan.nextDouble();
        saldo += valor;
        System.out.println("Valor recebido com sucesso");
        System.out.println("Saldo atual: R$ " + saldo);
    }
    private static double saldo(double saldo){
        System.out.println("Seu saldo é de R$ " + saldo);
        return saldo;
    }
    private static void menuCliente(double saldo) {
        String message = """
                ----------------------------------
                | Nome : Lucas                   |
                | Tipo : Conta Corrente          |
                | Saldo : R$ %.2f             |
                ----------------------------------
                """.formatted(saldo);
        System.out.println(message);
    }

    private static void menuBanco() {
        String message = """
                ----------------------------------
                | 1 - Consultar saldo            |
                | 2 - Receber valor              |
                | 3 - Transferir valor           |
                | 4 - Sair                       |
                ----------------------------------
                """;
        System.out.println(message);
    }
}

