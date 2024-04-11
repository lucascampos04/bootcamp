package Desafios.ScreenMatch;

public class Main {

    public static void main(String[] args) {
        // Instanciando o objeto
        Filme filmes = new Filme();

        // Atribuindo valores
        String nome = filmes.nome = "Harry Potter e a pedra filosofal";
        int anoLancamento =filmes.anoLancamento = 2001;
        int duracaoEmMinutos = filmes.duracaoEmMinutos = 152;
        boolean incluirNoPlano = filmes.incluirNoPlano = true;

        // Imprimindo os valores
        filmes.fichaTecnica(nome, anoLancamento, incluirNoPlano, duracaoEmMinutos);
        filmes.avalia(9);
        filmes.avalia(10);
        filmes.avalia(8);
        filmes.avalia(9);
        filmes.avalia(3);
        System.out.println("Média de avaliações: "+filmes.mediaDaAvaliacao());
    }
}
