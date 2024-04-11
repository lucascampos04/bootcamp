package Desafios.RetornandoDobro;

public class Calculadora {
    public double valor;
    public Double retornarDobro() {
        double novoValor = valor * 2;
        System.out.println("O dobro de " + valor + " é " + novoValor);
        return novoValor;
    }
}
