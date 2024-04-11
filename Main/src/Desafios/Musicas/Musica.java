package Desafios.Musicas;

public class Musica {
    public String titulo;
    public String artista;
    public int anoDeLancamento;
    public double avaliacao;
    public int numAvaliacoes;

    public void fichaTecnica(String titulo, String artista, int anoDeLancamento) {
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
    }

    public void avaliarMusica(double nota) {
        avaliacao+=nota; // soma das avaliações
        numAvaliacoes++; // aumenta o número de avaliações
    }

    public double mediaAvaliacoes() {
        return avaliacao / numAvaliacoes; // retorna a média das avaliações em double
    }
}
