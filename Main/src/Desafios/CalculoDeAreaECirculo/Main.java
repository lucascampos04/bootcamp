package Desafios.CalculoDeAreaECirculo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("[1] - Calcular area do quadrado");
        System.out.println("[2] - Calcular area do circulo");

        int opcao = scan.nextInt();

        switch (opcao) {
            case 1: // Area do quadrado
                System.out.println("Valor da area do quadrado: ");
                double area = scan.nextDouble();
                area*=area;
                System.out.println("Valor da area do quadrado: " + area);
                break;
            case 2: // Area do circulo
                System.out.println("Valor do raio do circulo: ");
                double raio = scan.nextDouble();
                double pi = 3.14;
                double areaCirculo = pi*raio*raio;
                System.out.println("Valor da area do circulo: " + areaCirculo);
                break;
        }
    }

}
