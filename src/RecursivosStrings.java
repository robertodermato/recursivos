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

}
