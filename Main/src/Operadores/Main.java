package Operadores;

public class Main {
    public static void main(String[] args) {
        int a = 5; // o operador "=" atribui um valor a uma variável
        int b = 3;
        int valor = 10;

        // Operadores Aritméticos
        int soma = a + b; // o operador "+" realiza uma soma
        int subtracao = a - b; // o operador "-" realiza uma subtração
        int multiplicacao = a * b; // o operador "*" realiza uma multiplicação
        int divisao = a / b; // o operador "/" realiza uma divisão
        int restoDivisao = a % b; // o operador "%" calcula o resto da divisão

        System.out.println("Resultado soma = " + soma);
        System.out.println("Resultado subtracao = " + subtracao);
        System.out.println("Resultado multiplicacao = " + multiplicacao);
        System.out.println("Resultado divisao = " + divisao);
        System.out.println("Resultado porcentagem = " + restoDivisao);

        int somaIgual = valor += 10; // o operador "+=" adiciona 10 ao valor da variável
        int subtracaoIgual = valor -= 5; // o operador "-=" subtrai 5 ao valor da variável
        int multiplicacaoIgual = valor *= 2; // o operador "*=" multiplica o valor da variável por 2
        int divisaoIgual = valor /= 2; // o operador "/=" divide o valor da variável por 2
        int restoDivisaoIgual = valor %= 2; // o operador "%=" calcula o resto da divisão do valor da variável por 2

        System.out.println("Soma igual = " + somaIgual);
        System.out.println("Subtracao igual = " + subtracaoIgual);
        System.out.println("Multiplicacao igual = " + multiplicacaoIgual);
        System.out.println("Divisao igual = " + divisaoIgual);
        System.out.println("Resto divisao igual = " + restoDivisaoIgual);

        // Operadores relacionais

        // "==" verifica se dois valores sao iguais
        // "!=" verifica se dois valores sao diferentes
        // ">" verifica se o primeiro valor e maior que o segundo
        // "<" verifica se o primeiro valor e menor que o segundo
        // ">=" verifica se o primeiro valor e maior ou igual ao segundo
        // "<=" verifica se o primeiro valor e menor ou igual ao segundo

        boolean igual = a == b; // o operador "==" verifica se dois valores sao iguais
        boolean diferente = a != b; // o operador "!=" verifica se dois valores sao diferentes
        boolean maior = a > b; // o operador ">" verifica se o primeiro valor e maior que o segundo
        boolean menor = a < b; // o operador "<" verifica se o primeiro valor e menor que o segundo
        boolean maiorOuIgual = a >= b; // o operador ">=" verifica se o primeiro valor e maior ou igual ao segundo
        boolean menorOuIgual = a <= b; // o operador "<=" verifica se o primeiro valor e menor ou igual ao segundo

        // Operadores lógicos

        // "&&" verifica se todos os valores sao verdadeiros
        // "||" verifica se pelo menos um dos valores e verdadeiro
        // "!" inverte o valor de uma variável

        boolean and = a > 0 && b > 0; // o operador "&&" verifica se todos os valores sao verdadeiros
        boolean or = a > 0 || b > 0; // o operador "||" verifica se pelo menos um dos valores e verdadeiro
        boolean not = !(a > 0); // o operador "!" inverte o valor de uma variável

        // Operadores de incrementos, decrementos e post-incremento, post-decremento

        // "++" incrementa o valor da variável em 1
        // "--" decrementa o valor da variável em 1
        int c = 10;
        int incremento = ++c; // o operador "++" incrementa o valor da variável em 1
        int decremento = --c; // o operador "--" decrementa o valor da variável em 1

        int postIncremento = c++; // o operador "++" incrementa o valor da variável em 1
        int postDecremento = c--; // o operador "--" decrementa o valor da variável em 1

        System.out.println("pre incremento = " + incremento);
        System.out.println("pre decremento = " + decremento);

        System.out.println("posmeticos incremento = " + postIncremento);
        System.out.println("pos decremento = " + postDecremento);
    }
}
