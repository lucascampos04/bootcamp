package Desafios.Produto;

public class Produto {
    private String nome;
    private double preco;

    public double desconto(double desconto){
        double precoDesconto = preco * (1 - desconto);
        System.out.println("Valor com desconto: " + precoDesconto);
        return preco * (preco - desconto);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
