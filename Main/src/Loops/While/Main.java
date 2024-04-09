package Loops.While;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double media = 0;
        double nota = 0;
        int totalNotas = 0;

        while (nota != -1) { // Enquanto a nota for diferente de -1
            System.out.println("Sua avaliação do filme ou [-1] para sair: ");
            nota = scan.nextDouble();

            if (nota != -1) { // Verifica se a nota não é -1 antes de incluí-la no cálculo
                media += nota; // media = media + nota
                totalNotas++; // totalNotas = totalNotas + 1
            }
        }

        // Verifica se pelo menos uma nota foi inserida antes de calcular a média
        if (totalNotas > 0) {
            System.out.println("Media de avaliações: " + media / totalNotas);
        } else {
            System.out.println("Nenhuma avaliação foi inserida.");
        }
    }
}
