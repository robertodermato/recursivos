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

        System.out.println("\n\nRecursivos de Strings");
        System.out.println("Inverte String");
        System.out.println("Roberto: " + RecursivosStrings.inverteString("Roberto"));
        System.out.println("Tira vogal");
        System.out.println("Roberto: " + RecursivosStrings.semVogal("Roberto"));
        System.out.println("Conta A");
        System.out.println("Bacana tem x a: " + RecursivosStrings.quantA("Bacana"));

    }

}
