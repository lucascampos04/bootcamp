package Desafios.ConversorDeGrausCelsiusParaFahrenheit;

public class Main {
    public static void main(String[] args) {
        double temperatura = 37.5;
        double fanhrenheit = (temperatura * 1.8) + 32;

        System.out.println("Temperatura em Fahrenheit: " + fanhrenheit);
        System.out.println("Temperatura em Celsius: " + temperatura);
    }
}
