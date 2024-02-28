import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        System.out.println("Running program #1");
        var result1 = patternMatching.Answer.myMethod("Here is an example. Right here.", "here");
        System.out.println(result1);

        System.out.println("Running program #1 - Suggested solution");
        result1 = patternMatching.Answer.suggested("Here is an example. Right here.", "here");
        System.out.println(result1);

        /////////////

        System.out.println("Running program #2");
        var result2 = reverseOrder.Answer.myMethod(Arrays.asList(2, 5, 20, 30, 56));
        System.out.println(result2);
        
        System.out.println("Running program #2 - Suggested solution");
        result2 = reverseOrder.Answer.suggested(Arrays.asList(-20, 30, -56));
        System.out.println(result2);

        /////////////

        System.out.println("Running program #3");
        var result3 = calculateAverage.Answer.myMethod(Arrays.asList(2, 5, 20, 30, 56));
        System.out.println(result3);
        
        System.out.println("Running program #3 - Suggested solution");
        result3 = calculateAverage.Answer.suggested(Arrays.asList(-20, 30, -56));
        System.out.println(result3);

        /////////////

        System.out.println("Running program #4");
        wordsWithChars.Answer.myMethod();
        
        System.out.println("Running program #4 - Suggested solution");
        wordsWithChars.Answer.suggested();

        /////////////

        System.out.println("Running program #5");
        indicesOfSum.Answer.myMethod();
        
        System.out.println("Running program #5 - Suggested solution");
        indicesOfSum.Answer.suggested();

    }
}