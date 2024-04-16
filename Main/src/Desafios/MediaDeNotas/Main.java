package Desafios.MediaDeNotas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantidade de notas: ");
        int quantidade = scanner.nextInt();

        Nota[] notas = new Nota[quantidade];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": ");
            double valorNota = scanner.nextDouble();

            Nota nota = new Nota();
            nota.setNota(valorNota);

            notas[i] = nota;
        }

        double somaNotas = 0;
        for (Nota nota : notas) {
            somaNotas += nota.getNota();
        }

        double media = somaNotas / notas.length;

        System.out.println("Média das notas: " + media);

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota: " + (i + 1) + ": " + notas[i].getNota());
        }

        if (media < 8){
            System.out.println("Reprovado");
            return;
        }

        System.out.println("Aprovado");

    }
}
