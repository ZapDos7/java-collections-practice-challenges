package indicesOfSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Answer {
    /* Given a List of Integers and a target sum,
    return the indices of the two numbers in the array that,
    when summed, return the target number. */

    public static List<Integer> myMethod(List<Integer> source, int target) {
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < source.size(); i++) {
            var element = source.get(i);
            var diff = target - element;
            if (source.contains(diff)) {
                indices.add(source.indexOf(element));
                indices.add(source.indexOf(diff));
                break;
            }
        }
        return indices;
    }

    public static List<Integer> suggested(List<Integer> source, int target) {
        Map<Integer, Integer> sourceMap = new HashMap<>();
        for (int i = 0; i < source.size(); i++) {
            sourceMap.put(source.get(i), i);
        }
        for (int i = 0; i < source.size(); i++) {
            int solutionNumber = target - source.get(i);
            if (sourceMap.containsKey(solutionNumber) && sourceMap.get(solutionNumber)!=i) {
                // if it exists in the map and it's not the currently checked number
                return Arrays.asList(i,sourceMap.get(solutionNumber));
            }
        }
        return Arrays.asList(-1,-1); //default
    }

}