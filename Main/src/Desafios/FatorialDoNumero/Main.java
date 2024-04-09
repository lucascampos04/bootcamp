package Desafios.FatorialDoNumero;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Numero: ");
        int num = scan.nextInt();

        long fatorial = 1;
        for (int i = 2; i <= num; i++) {
            fatorial *= i;
        }
        System.out.println("O fatorial de " + num + " e: " + fatorial);

    }
}
