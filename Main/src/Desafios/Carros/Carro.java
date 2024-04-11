package Desafios.Carros;

public class Carro {
    public String modelo;
    public int ano;
    public String cor;
    public String placa;
    public double valor;

    public void fichaTecnica(String modelo, int ano, String cor, String placa, double valor) {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Placa: " + placa);
        System.out.println("Valor: " + valor);
    }
}
