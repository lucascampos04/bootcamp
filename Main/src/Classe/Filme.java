package Classe;

public class Filme {
    public String nome;
    public int anoLancamento;
    public double somaDasAvaliacoes;
    public boolean incluirNoPlano;
    public int totalAvaliacoes;


    public void exibirInformacoes() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lancamento: " + anoLancamento);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalAvaliacoes++;
    }

    public double mediaDasAvaliacoes(){
        return somaDasAvaliacoes / totalAvaliacoes;
    }
}
