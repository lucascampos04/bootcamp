package Desafios.JogoAdvinhacao;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        int number = random.nextInt(100);
        int tentativas = 0;
        int tentativasMaximas = 3;
        int guess;

        System.out.println("Bem vindo ao jogo de advinhação!");

        while (true) {
            System.out.print("Tente adivinhar o número (entre 0 e 100): ");
            guess = scan.nextInt();
            tentativas++;

            if (guess < number) {
                System.out.println("O número é maior do que " + guess);
            } else if (guess > number) {
                System.out.println("O número é menor do que " + guess);
            } else {
                break;
            }

            System.out.println("Tentativas restantes: " + (tentativasMaximas - tentativas));

            if (tentativas == 3) {
                System.out.println("Número de tentativas esgotadas. Tente novamente mais tarde.");
                break;
            }
        }

        if (guess == number) {
            System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");
        } else {
            System.out.println("Infelizmente, o número correto era " + number + ".");
        }
    }
}
