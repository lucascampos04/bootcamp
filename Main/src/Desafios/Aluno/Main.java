package Desafios.Aluno;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "Lucas";
        aluno.idade = 16;
        aluno.avaliar(5);
        aluno.avaliar(7);
        aluno.avaliar(8);
        aluno.fichaTecnica();
        aluno.media();
    }
}
