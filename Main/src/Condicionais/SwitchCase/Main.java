package Condicionais.SwitchCase;

public class Main {
    public static void main(String[] args) {
        int dia = 5;
        String nomeDia;

        switch (dia) {
            default: // Se o dia for invalido
                nomeDia = "Invalido";
                break; // Interrompe o switch
            case 1: // Se o dia for igual a 1
                nomeDia = "Domingo";
                break; // Interrompe o switch
            case 2:
                nomeDia = "Segunda";
                break;
            case 3:
                nomeDia = "Terça";
                break;
            case 4:
                nomeDia = "Quarta";
                break;
            case 5:
                nomeDia = "Quinta";
                break;
            case 6:
                nomeDia = "Sexta";
                break;
            case 7:
                nomeDia = "Sabado";
                break;
        }
        System.out.println("O dia é " + dia + " e é " + nomeDia);
    }
}
