package patternMatching;

import java.util.Arrays;
import java.util.regex.*;

public class Answer {

    public static int myMethod(String source, String word) {
        return (int) Pattern.compile(word)
        .matcher(source.toLowerCase())
        .results()
        .count();
    }
    /*
     * Suggested solution:
     * 1. Remove periods
     * 2. Turn string to a list of strings
     * 3. Match & count
     */

     public static int suggested(String source, String word) {
        String cleanedUpString = source.replaceAll("\\.", "");
        return (int) Arrays.stream(cleanedUpString.split(" ")).filter(w -> w.equalsIgnoreCase(word)).count();
     }
}
