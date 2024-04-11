package Desafios.Aluno;

public class Aluno {
    public String nome;
    public int idade;
    public double nota;
    public int numeroDeNotas;

    public void fichaTecnica() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Nota: " + nota);
    }

    public void avaliar(double notaP) {
        nota += notaP;
        numeroDeNotas++;
    }
    public double media() {
        double media = nota / numeroDeNotas;
        System.out.println("Média: " + media);
        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
        return media;
    }
}
