package Java.Tests;

public class TestRunner {
    public static <I, O> int runTests(Challenge<I, O> challenge, I[] inputs, O[] expected) {
        int failed = 0;
        for (int i = 0; i < inputs.length; i++) {
            try {
                O result = challenge.f(inputs[i]);
                if (!result.equals(expected[i])) {
                    System.out.printf("❌ Test #%2d FAILED — Input: %s Expected: %s Got: %s%n",
                                      i + 1, inputs[i], expected[i], result);
                    failed++;
                }
            } catch (Exception e) {
                System.out.printf("Test #%2d ERROR — Input: %s threw %s%n", i + 1, inputs[i], e);
                failed++;
            }
        }
        return failed;
    }


}