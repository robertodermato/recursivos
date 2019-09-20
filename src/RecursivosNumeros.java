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



/*




            5 Faça um programa que leia uma string qualquer e escreve a quantidade de letras A que a mesma possui. Para isso, crie um método recursivo que receba uma string qualquer e devolve a quantidade de letras A que ela possui.

            6 Faça um programa que leia um valor n qualquer (inteiro e positivo). O programa deve escrever o n-ésimo termo da série de Fibonacci. Os termos desse série são 1,1,2,3,5,8,13,21,... O n-ésimo termo deve ser calculado por um método recursivo.

        7 Faça um programa que leia um valor n qualquer (inteiro e positivo). O programa deve escrever a soma dos n  termos 1 + 1/2 + 1/3 + ... 1/n. A soma deve ser calculada por um método recursivo.

        8 Faça um programa que leia dois valores x e y quaisquer (inteiros e positivos). O programa deve escrever o valor de xy. O valor de xy deve ser encontrado a partir de um método recursivo. Não use Math.pow.

        9 Faça um programa que leia dois valores x e y quaisquer (inteiros e positivos). O programa deve escrever o produto de x por y. O produto deve ser encontrado a partir de um método recursivo. Não pode usar o operador de multiplicação.

        10 Faça um programa que leia um valor n qualquer (inteiro e positivo). O programa deve escrever a soma dos n  termos 2 + 6/2 + 10/3 + 14/4... . A soma deve ser calculada por um método recursivo.

        11 Escreva um programa que lê um valor n inteiro e positivo, calcula e exibe a seguinte soma: S = 1 + 2/3 + 3/5 ... O cálculo de S deve ser feito por meio de um método recursivo.

        12 Faça um programa que leia uma string e verifique se ela é palíndrome. Palíndrome são aquelas palavras podem ser lidas tanto da esquerda para direita ou da direita para esquerda. Exemplo: arara. Crie um método recursivo para verificar se a string é palíndrome..
*/


}
