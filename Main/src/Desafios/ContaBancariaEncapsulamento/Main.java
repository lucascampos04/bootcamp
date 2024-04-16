package Desafios.ContaBancariaEncapsulamento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantidade de contas: ");
        int quantidade = scanner.nextInt();

        Conta[] contas = new Conta[quantidade];

        for (int i = 0; i < contas.length; i++) {
            System.out.println("Número da conta : ");
            int numeroConta = scanner.nextInt();

            boolean isContaExiste = false;
            for (Conta conta : contas) {
                if (conta != null && conta.getNumeroConta() == numeroConta){
                    isContaExiste = true;
                    break;
                }
            }

            if (isContaExiste){
                System.out.println("Esta conta já foi adicionada. Tente novamente.");
                i--;
                continue;
            }

            System.out.println("Saldo inicial: ");
            double saldo = scanner.nextDouble();

            System.out.println("Proprietario : ");
            String proprietario = scanner.next();

            Conta conta = new Conta();
            conta.setTitular(proprietario);
            conta.setNumeroConta(numeroConta);
            conta.setSaldo(saldo);
            contas[i] = conta;
        }

        for (Conta conta : contas) {
            System.out.println("Numero da conta: " + conta.getNumeroConta());
            System.out.println("Saldo: " + conta.getSaldo());
            System.out.println("Proprietario: " + conta.getTitular());
        }

    }
}
