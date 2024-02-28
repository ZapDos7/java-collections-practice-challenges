package patternMatching;

import java.util.regex.*;

public class Answer {

    public static int getOccurrences(String source, String word) {
        return (int) Pattern.compile(word)
        .matcher(source.toLowerCase())
        .results()
        .count();
    }
}
