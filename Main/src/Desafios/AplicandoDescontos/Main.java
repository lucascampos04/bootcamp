package Desafios.AplicandoDescontos;

public class Main {
    public static void main(String[] args) {
        double precoOriginal = 1000.0;
        double desconto = 0.1;
        double resultadoComDesconto = precoOriginal - (precoOriginal * desconto);
        System.out.println(resultadoComDesconto);
    }
}
