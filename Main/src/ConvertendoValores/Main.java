package ConvertendoValores;

public class Main {
    public static void main(String[] args) {
        int idade = 19;
        System.out.println("Idade em inteiro " + idade);

        double novaIdade = idade; // convertendo inteiro para double
        System.out.println("Idade em double " + novaIdade);

        double altura = 1.80;
        System.out.println("Altura em double " + altura);

        int novaAltura = (int) altura; // usando cast para converter double para inteiro
        System.out.println("Altura em inteiro " + novaAltura);
    }
}
