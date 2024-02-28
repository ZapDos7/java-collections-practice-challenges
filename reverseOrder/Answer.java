package reverseOrder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Answer {

    public static List<Integer> myMethod(List<Integer> input) {
        Collections.reverse(input);
        return input;
    }

    public static List<Integer> suggested(List<Integer> input) {
        List<Integer> result = new ArrayList<>(input);
        Collections.reverse(result);
        return result;
    }
}