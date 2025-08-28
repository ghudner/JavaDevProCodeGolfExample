package Java.Tests;

public class TestRunner {
    public static <I, O> int runTests(Challenge<I, O> challenge, I[] inputs, O[] expected) {
        int failed = 0;
        for (int i = 0; i < inputs.length; i++) {
            try {
                O result = challenge.f(inputs[i]);
                if (!result.equals(expected[i])) {
                    System.out.printf("Test #%2d FAILED — Input: %s, Got: %s, Expected: %s%n",
                                      i + 1, inputs[i], result, expected[i]);
                    failed++;
                }
            } catch (Exception e) {
                System.out.printf("Test #%2d ERROR — Input: %s threw %s%n", i + 1, inputs[i], e);
                failed++;
            }
        }
        if (failed != 0) {
            System.out.printf("%d test(s) FAILED.%n", failed);
        }
        return failed;
    }


}