public class RecursivosStrings {

    //3 Faça um programa que leia uma string qualquer e a escreva invertida.
    public static String inverteString (String word){
        int comp = word.length();
        return inverte (word, comp-1);
    }

    private static String inverte (String word, int comp){
        if (comp<0) return "";
        return word.charAt(comp) + inverte(word, comp-1);
    }

     //4 Faça um programa que leia uma string qualquer e a escreva sem as suas vogais.

    public static String semVogal (String word){
        int comp = word.length();
        return semVog (word, comp-1);
    }

    private static String semVog (String word, int comp){
        if (comp<0) return "";
        char letra = word.charAt(comp);
        if(letra!='a' && letra!='e' && letra!= 'i' && letra!='o' && letra!='u') return semVog(word, comp-1) + letra;
        return semVog (word, comp-1);
    }

    //5 Faça um programa que leia uma string qualquer e escreve a quantidade de letras A que a mesma possui.
    public static int quantA (String word){
        int comp = word.length();
        return quantasA (word, comp);
    }

    private static int quantasA (String word, int comp){
        if (comp == 0) return 0;
        if (word.charAt(comp-1) == 'a') return quantasA(word, comp-1) + 1;
        return quantasA(word, comp-1);
    }

    //12 Faça um programa que leia uma string e verifique se ela é palíndrome.
    public static boolean isPalindrome(String word){
        return isPalindromeP(word, word.length(), 0);
    }

    private static boolean isPalindromeP(String word, int comp, int inicio){
        if (comp <= inicio) return true;
        if (word.charAt(comp-1)==word.charAt(inicio)) return isPalindromeP(word, comp-1, inicio+1) && true;
        return false;
    }

    //antigo do vini
    public static boolean palindromo (String palavra){
        String palavral = palavra.toLowerCase();
        return palindromoR (palavral, (palavral.length()-1));
    }

    private static boolean palindromoR (String palavra, int comp){
        int compInvertido = (palavra.length()-1)-comp;
        if ((compInvertido==comp || compInvertido == comp-1) && (palavra.charAt(comp)==palavra.charAt(compInvertido))) return true;
        return palindromoR (palavra, comp-1) && (palavra.charAt(comp) == palavra.charAt(compInvertido));
    }

    //vini otimizado
    public static boolean palindromo2 (String palavra){
        String palavral = palavra.toLowerCase();
        return palindromoR2 (palavral, palavral.length()-1);
    }

    private static boolean palindromoR2 (String palavra, int comp){
        int compInvertido = (palavra.length()-1)-comp;
        if ((compInvertido==comp || compInvertido == comp-1)) return true;
        return palindromoR2 (palavra, comp-1) && (palavra.charAt(comp) == palavra.charAt(compInvertido));
    }


}
