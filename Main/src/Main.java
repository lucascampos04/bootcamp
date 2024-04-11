import Classe.Filme;

public class Main {
    public static void main(String[] args) {
        int numeros = 0;

        // Tipo referencia
        // instanciando o objeto
        Filme filme = new Filme(); // Cria um objeto da classe Filme

        filme.nome = "Vingadores";
        filme.anoLancamento = 2021;
        filme.incluirNoPlano = true;


        System.out.println("Nome do filme: " + filme.nome);
        System.out.println("Ano de lancamento: " + filme.anoLancamento);
        System.out.println("Avaliação: " + filme.somaDasAvaliacoes);
        System.out.println("Incluir no plano: " + filme.incluirNoPlano);

        System.out.println("\n");
        System.out.println("Ficha tecnica do filme: ");
        usandoMetodo();
    }

    public static void usandoMetodo(){
        Filme filme = new Filme();
        filme.exibirInformacoes();
        filme.avalia(10);
        filme.avalia(7);
        filme.avalia(4);
        System.out.println("Avaliação: "+filme.somaDasAvaliacoes);
        System.out.println("Total de avaliacoes: "+filme.totalAvaliacoes);
        System.out.println("Media das avaliacoes: "+filme.mediaDasAvaliacoes());
    }
}

