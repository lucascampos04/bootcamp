package Desafios.ScreenMatch;

public class Filme {
    public String nome;
    public int anoLancamento;
    public int duracaoEmMinutos;
    public boolean incluirNoPlano;
    public double somaDasAvaliacoes;
    public int totalAvaliacoes;

    public void fichaTecnica(String nome, int anoLancamento, boolean incluirNoPlano, int duracaoEmMinutos) {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lancamento: " + anoLancamento);
        System.out.println("Duracao em minutos: " + duracaoEmMinutos);
        System.out.println("Incluir no plano: " + incluirNoPlano);
    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalAvaliacoes++;
    }

    public double mediaDaAvaliacao() {
        return somaDasAvaliacoes / totalAvaliacoes;
    }
}
