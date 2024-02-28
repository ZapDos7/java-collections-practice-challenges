package wordsWithChars;

import java.util.Arrays;
import java.util.List;

public class Answer {
    /* Find words with 5 or fewer characters in a String */
    public static List<String> myMethod(String source) {
        return Arrays.stream(source.split(" ")).filter(w -> w.length() < 6).toList();
    }

    public static List<String> suggested(String source) {
        return Arrays.stream(source.split(" ")).filter(w -> w.length() <= 5).toList();
    }

}