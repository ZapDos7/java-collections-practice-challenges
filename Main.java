class Main {
    public static void main(String[] args) {
        System.out.println("Running program #1");
        var result1 = patternMatching.Answer.myMethod("Here is an example. Right here.", "here");
        System.out.println(result1);

        System.out.println("Running program #1 - Suggested solution");
        result1 = patternMatching.Answer.suggested("Here is an example. Right here.", "here");
        System.out.println(result1);

        System.out.println("Running program #2");
        reverseOrder.Answer.reverse();
        
        System.out.println("Running program #3");
        calculateAverage.Answer.calculate();

        System.out.println("Running program #4");
        wordsWithChars.Answer.method();

        System.out.println("Running program #5");
        indicesOfSum.Answer.returnIndices();
    }
}