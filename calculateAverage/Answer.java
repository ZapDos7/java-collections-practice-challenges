package calculateAverage;

import java.util.List;

public class Answer {
    public static double myMethod(List<Integer> input) {
        return input.stream().mapToInt(Integer::intValue).average().getAsDouble();
    }

    public static double suggested(List<Integer> input) {
        if (input == null || input.isEmpty()) {
            return 0.0;
        }
        return input.stream().reduce(0, Integer::sum) / (double) input.size();
    }

}