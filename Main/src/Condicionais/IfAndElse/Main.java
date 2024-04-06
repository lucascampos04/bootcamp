package Condicionais.IfAndElse;

public class Main {
    public static void main(String[] args) {
        int ano = 19;
        boolean isIncluidoNoPlano = true;
        double notaDoFilme = 9.5;
        String tipoPlano = "Plus";

        if (ano >= 2022) { // Se o ano de lancamento for maior ou igual a 2022
            System.out.println("Lancamento que os fãs gostaram"); // Imprime a mensagem
        } else { // Se o ano de lancamento for menor que 2022
            System.out.println("Filmes retros que os fãs gostaram"); // Imprime a mensagem
        }

        if (isIncluidoNoPlano && tipoPlano.equals("Plus")) { // Se o plano for Plus. Ao comparar uma String tem que usar o equals e não "=="
            System.out.println("Você tem acesso de graça a esse filme"); // Imprime a mensagem
        } else { // Se o plano for Free
            System.out.println("Nao tem acesso de graça a esse filme"); // Imprime a mensagem
        }
    }
}
