package FormatacaoDeTextos;

public class Main {
    public static void main(String[] args) {
        String nome = "Lucas";
        String sobrenome = "Oliveira";
        String nomeCompleto = nome + " " + sobrenome;
        System.out.println(String.format("Seu nome é %s", nomeCompleto)); // Imprime o valor da variável. "%s" substitui o texto por uma variável

        int idade = 19;

        String message = """
                    Nome: %s
                    Idade: %d
                """.formatted(nomeCompleto, idade); // Imprime o valor da variável. "%d" substitui o texto por um número inteiro e "%s" substitui o texto por uma variável
        System.out.println(message);
    }

}
