package Loops.For;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double media = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) { // Executa 3 vezes
            System.out.println("Sua avaliação do filme: ");
            nota = scan.nextDouble();
            media += nota; // media = media + nota
        }

        double mediaFinal = media / 3;

        String message = mediaFinal < 5 ? "Média de avaliações ruim : " : "Média de avaliações boa : "; // Operador ternário

        System.out.println(message + mediaFinal);

    }
}
