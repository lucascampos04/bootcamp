package Desafios.ConversorDolarParaReal;

public class Main {
    public static void main(String[] args) {
        double valorEmDolares = 5.0;
        double real = 4.94;
        double conversao = valorEmDolares * real;

        String message = """
                Valor em dolares: %.2f
                Valor em reais: %.2f
                Conversão: %.2fR$
            """.formatted(valorEmDolares, real, conversao);
        System.out.println(message);
    }
}
