package Desafios.Carros;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();

        String modelo = "Palio";
        int ano = 2010;
        String cor = "Vermelho";
        String placa = "ABC1234";
        double valor = 10000.00;

        carro.fichaTecnica(modelo, ano, cor, placa, valor);

    }
}
