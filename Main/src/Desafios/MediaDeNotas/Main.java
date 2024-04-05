package Desafios.MediaDeNotas;

public class Main {
    public static void main(String[] args) {
        double nota1 = 7.5;
        double nota2 = 8.0;
        double media = (nota1 + nota2) / 2;
        String message = """
                    Nota 1: %.2f
                    Nota 2: %.2f
                    
                    Sua média foi : %.2f
                """.formatted(nota1, nota2, media);
        System.out.println(message);
    }
}
