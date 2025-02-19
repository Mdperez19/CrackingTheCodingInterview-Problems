package ArrayAndString;
import java.util.*;
/*
 * 1.2 Check permutation
 * Given two strings, write a methdo to decide if one is a permutation of the other
 */
public class CheckPermutation {
    private static boolean permutation(String word1, String word2) {
        Set<Character> letterSet1 = new HashSet<>();
        for (char letter : word1.toCharArray()) {
            letterSet1.add(letter);
        }
        Set<Character> letterSet2 = new HashSet<>();
        for (char letter : word2.toCharArray()) {
            letterSet2.add(letter);
        }

        return letterSet1.equals(letterSet2);

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
