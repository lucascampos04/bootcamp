package Desafios.ComparandoDoisNumeros;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = scan.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = scan.nextInt();

        if (num1 > num2) {
            System.out.println("O primeiro número é maior.");
        } else if (num1 < num2) {
            System.out.println("O segundo número é maior.");
        } else {
            System.out.println("Os dois números são iguais.");
        }
    }
}
