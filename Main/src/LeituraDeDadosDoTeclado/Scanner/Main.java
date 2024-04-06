package LeituraDeDadosDoTeclado.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Cria um objeto Scanner para ler dados do teclado.

        System.out.println("Digite time favorito: ");
        String time = scan.nextLine(); // Le um valor do teclado e armazena na variável time.

        System.out.println("Quantos titulos ? : ");
        int titulos = scan.nextInt(); // Le um valor do teclado e armazena na variável titulos.

        System.out.println("Folha salarial ? : ");
        double folha = scan.nextDouble(); // Le um valor do teclado e armazena na variável folha.

        System.out.println("Nome do time : " + time); // Imprime o valor armazenado na variável time.
        System.out.println("Quantidade de titulos : " + titulos); // Imprime o valor armazenado na variável titulos.
        System.out.println("Folha salarial : " + folha); // Imprime o valor armazenado na variável folha.

    }
}
