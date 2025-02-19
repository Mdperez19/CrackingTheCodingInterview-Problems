package ArrayAndString;

/*
 * 1.1 IsUnique
 * Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?
 */
public class IsUnique {

    public static boolean isUniqueChars(String str) {
        int hashMapByte = 0;
        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i) - 'a';

            if((hashMapByte & (1<<index)) != 0)
                return false;
            
            hashMapByte = hashMapByte | (1<<index);
        }
        return true;
	}
	
	public static void main(String[] args) {
		String[] words = {"abcde", "hello", "apple", "kite", "padle"};
		for (String word : words) {
			System.out.println(word + ": " + isUniqueChars(word));
		}
	}
}