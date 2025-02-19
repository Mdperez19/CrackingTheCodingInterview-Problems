package ArrayAndString;
import java.util.*;
/*
 * 1.2 Check permutation
 * Given two strings, write a methdo to decide if one is a permutation of the other
 */
public class CheckPermutation {
    private static boolean permutation(String word1, String word2) {
        
        char[] letterIn1 = word1.toCharArray();
        char[] letterIn2 = word2.toCharArray();

        Arrays.sort(letterIn1);
        Arrays.sort(letterIn2);

        for (int i = 0; i < letterIn2.length; i++) {
            if(letterIn1[i] != letterIn2[i]){
                return false;
            }
        }

        return true;

    }
    
    
public static void main(String[] args) {
    String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};
    for (String[] pair : pairs) {
        String word1 = pair[0];
        String word2 = pair[1];
        boolean anagram = permutation(word1, word2);
        System.out.println(word1 + ", " + word2 + ": " + anagram);
    }
}
            
                
}
