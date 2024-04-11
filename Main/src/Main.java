import Classe.Filme;

public class Main {
    public static void main(String[] args) {
        int numeros = 0;

        // Tipo referencia
        Filme filme = new Filme(); // Cria um objeto da classe Filme

        // instanciando o objeto
        filme.nome = "Vingadores";
        filme.anoLancamento = 2021;
        filme.avaliacao = 9.5;
        filme.incluirNoPlano = true;
        filme.totalAvaliacoes = 0;


        System.out.println("Nome do filme: " + filme.nome);
        System.out.println("Ano de lancamento: " + filme.anoLancamento);
        System.out.println("Avaliação: " + filme.avaliacao);

        while (numeros < 10) {
            numeros++;
        }
        filme.totalAvaliacoes = numeros;

        System.out.println("Incluir no plano: " + filme.incluirNoPlano);
        System.out.println("Total de avaliacoes: " + filme.totalAvaliacoes);


    }
}
