public class AppRecursivos {

    public static void main (String args[]){

        System.out.println("Testando métodos recursivos");

        System.out.println("Fatorial");
        System.out.println("Fatorial de 0: " + RecursivosNumeros.fatorial(0));
        System.out.println("Fatorial de 1: " + RecursivosNumeros.fatorial(1));
        System.out.println("Fatorial de 2: " + RecursivosNumeros.fatorial(2));
        System.out.println("Fatorial de 3: " + RecursivosNumeros.fatorial(3));
        System.out.println("Fatorial de 4: " + RecursivosNumeros.fatorial(4));

        System.out.println("\nSomatório");
        System.out.println("somatorio de 0: " + RecursivosNumeros.somatorio(0));
        System.out.println("somatorio de 1: " + RecursivosNumeros.somatorio(1));
        System.out.println("somatorio de 2: " + RecursivosNumeros.somatorio(2));
        System.out.println("somatorio de 3: " + RecursivosNumeros.somatorio(3));
        System.out.println("somatorio de 4: " + RecursivosNumeros.somatorio(4));

        System.out.println("\nFibonacci");
        System.out.println("Fibonacci 1: " + RecursivosNumeros.fibonacci(1));
        System.out.println("Fibonacci 2: " + RecursivosNumeros.fibonacci(2));
        System.out.println("Fibonacci 3: " + RecursivosNumeros.fibonacci(3));
        System.out.println("Fibonacci 4: " + RecursivosNumeros.fibonacci(4));
        System.out.println("Fibonacci 5: " + RecursivosNumeros.fibonacci(5));

        System.out.println("\nSoma n frações de 1/n");
        System.out.println("Soma de 1: " + RecursivosNumeros.somaFrac(1));
        System.out.println("Soma de 2: " + RecursivosNumeros.somaFrac(2));
        System.out.println("Soma de 3: " + RecursivosNumeros.somaFrac(3));
        System.out.println("Soma de 4: " + RecursivosNumeros.somaFrac(4));

        System.out.println("\nMultiplica");
        System.out.println("Multiplica 5 x 6: " + RecursivosNumeros.multiplica(5,6));

        System.out.println("\nPotência");
        System.out.println("Potência de 3 na 3: " + RecursivosNumeros.potencia(3,3));

        System.out.println("\nSoma de n frações esquisitas");
        System.out.println("Soma de 1: " + RecursivosNumeros.somaFracEsq(1));
        System.out.println("Soma de 2: " + RecursivosNumeros.somaFracEsq(2));
        System.out.println("Soma de 3: " + RecursivosNumeros.somaFracEsq(3));

        System.out.println("\nSoma frações de impar");
        System.out.println("Soma de 1: " + RecursivosNumeros.somaFracImpar(1));
        System.out.println("Soma de 2: " + RecursivosNumeros.somaFracImpar(2));
        System.out.println("Soma de 3: " + RecursivosNumeros.somaFracImpar(3));
        System.out.println("Soma de 4: " + RecursivosNumeros.somaFracImpar(4));

        System.out.println("\nSoma frações de impar pelo método antigo");
        System.out.println("Soma de 1: " + RecursivosNumeros.somaFracImpar2(1));
        System.out.println("Soma de 2: " + RecursivosNumeros.somaFracImpar2(2));
        System.out.println("Soma de 3: " + RecursivosNumeros.somaFracImpar2(3));
        System.out.println("Soma de 4: " + RecursivosNumeros.somaFracImpar2(4));


        System.out.println("\n\nRecursivos de Strings");
        System.out.println("Inverte String");
        System.out.println("Roberto: " + RecursivosStrings.inverteString("Roberto"));
        System.out.println("Tira vogal");
        System.out.println("Roberto: " + RecursivosStrings.semVogal("Roberto"));
        System.out.println("Conta A");
        System.out.println("Bacana tem x a: " + RecursivosStrings.quantA("Bacana"));

        System.out.println("\nTesta se é palíndromo");
        System.out.println("Bacana é palíndromo? " + RecursivosStrings.isPalindrome("Bacana"));
        System.out.println("amma é palíndromo? " + RecursivosStrings.isPalindrome("amma"));
        System.out.println("arara é palíndromo? " + RecursivosStrings.isPalindrome("arara"));
        System.out.println("a é palíndromo? " + RecursivosStrings.isPalindrome("a"));
        System.out.println("ananana é palíndromo? " + RecursivosStrings.isPalindrome("ananana"));

        System.out.println("\nTesta se é palíndromo pelo método do Vini");
        System.out.println("acana é palíndromo? " + RecursivosStrings.palindromo("acana"));
        System.out.println("amma é palíndromo? " + RecursivosStrings.palindromo("amma"));
        System.out.println("arara é palíndromo? " + RecursivosStrings.palindromo("arara"));
        System.out.println("a é palíndromo? " + RecursivosStrings.palindromo("a"));
        System.out.println("ananana é palíndromo? " + RecursivosStrings.palindromo("ananana"));

        System.out.println("\nTesta se é palíndromo pelo método do Vini otimizado");
        System.out.println("Bacana é palíndromo? " + RecursivosStrings.palindromo2("Bacana"));
        System.out.println("amma é palíndromo? " + RecursivosStrings.palindromo2("amma"));
        System.out.println("arara é palíndromo? " + RecursivosStrings.palindromo2("arara"));
        System.out.println("a é palíndromo? " + RecursivosStrings.palindromo2("a"));
        System.out.println("ananana é palíndromo? " + RecursivosStrings.palindromo2("ananana"));

    }

}
