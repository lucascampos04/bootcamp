package Desafios.Musicas;

public class Main {
    public static void main(String[] args) {
        Musica musica = new Musica();

        String titulo = "Billie Jean";
        String artista = "Michael Jackson";
        int anoDeLancamento = 1982;

        musica.fichaTecnica(titulo, artista, anoDeLancamento);
        musica.avaliarMusica(10);
        musica.avaliarMusica(8);
        musica.avaliarMusica(6);
        System.out.println("Quanntiade de avaliações: " + musica.numAvaliacoes);
        System.out.println("Avaliação: " + musica.avaliacao);
        System.out.println("Média de avaliações: " + musica.mediaAvaliacoes());
    }
}
