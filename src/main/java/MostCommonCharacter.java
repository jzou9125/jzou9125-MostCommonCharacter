import java.util.HashMap;
import java.util.Map;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        int max = 0;
        char result = ' ';
        Map<Character, Integer> seen = new HashMap<Character, Integer>();
        for (char ch: str.toCharArray()){
            seen.put(ch, seen.getOrDefault(ch, 0) + 1);
            if (seen.get(ch) > max){
                max = seen.get(ch);
                result = ch;
            }
        }
        return result;
    }
}
