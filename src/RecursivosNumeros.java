//Resolva o problemas abaixo usando métodos recursivos.

public class RecursivosNumeros {

//1 Faça um programa que leia um valor inteiro e não negativo (garanta isso), calcula e escreve o fatorial desse valor. Para calcular o fatorial use um método recursivo.

    public static double fatorial(int n) {
        if (n == 0) return 1;
        return fatorial(n - 1) * n;
    }

    //2 Faça um programa que leia um valor inteiro e não negativo (garanta isso), calcula e escreve o somatório desse valor.

    public static int somatorio(int n) {
        if (n == 0) return 0;
        return somatorio(n - 1) + n;
    }

    //6 Faça um programa escreva o n-ésimo termo da série de Fibonacci.
    public static int fibonacci(int n) {
        if (n == 1) return 1;
        if (n == 2) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    //7 Faça um programa que leia um valor n qualquer. O programa deve escrever a soma dos n  termos 1 + 1/2 + 1/3 + ... 1/n.
    public static double somaFrac(int n) {
        if (n == 1) return 1;
        return somaFrac(n - 1) + 1.0 / n;
    }

    // 8 Faça um programa que leia dois valores x e y quaisquer e escreva o valor de x*y.
    public static double multiplica(int n1, int n2) {
        if (n1 == 0) return 0;
        return multiplica(n1 - 1, n2) + n2;
    }

    //9 Faça um programa que leia dois valores x e y quaisquer e escreva x ^ y.
    public static int potencia(int n1, int n2) {
        if (n1 == 0 && n2 == 0) return -1;
        if (n1 == 0) return 0;
        if (n2 == 0) return 1;
        return potencia(n1, n2 - 1) * n1;
    }

    //10 Faça um programa que leia um valor n qualquer e escreva a soma dos n  termos 2 + 6/2 + 10/3 + 14/4 (numerador é 2 + 4*(n-1)
    public static double somaFracEsq(int n) {
        if (n == 1) return 2;
        return somaFracEsq(n - 1) + (2 + 4.0 * (n - 1)) / n;
    }

    //11 Escreva um programa que lê um valor n inteiro e positivo, calcula e exibe a seguinte soma: S = 1 + 2/3 + 3/5 ...
    public static double somaFracImpar(int n) {
        if (n == 1) return 1;
        return somaFracImpar(n - 1) + ((n * 1.0) / (2 * n - 1));
    }

    //igual o de cima mas da forma antiga
    public static double somaFracImpar2(int termos) {
        if (termos <= 0) return -1;
        if (termos == 1) return 1;
        return somaFracImpar2(termos - 1) + termos * 1.0 / (termos + (termos - 1));
    }


/*






        12 Faça um programa que leia uma string e verifique se ela é palíndrome. Palíndrome são aquelas palavras podem ser lidas tanto da esquerda para direita ou da direita para esquerda. Exemplo: arara. Crie um método recursivo para verificar se a string é palíndrome..
*/


}
