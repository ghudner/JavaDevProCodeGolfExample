package Java.Challenges;

import Java.Tests.Challenge;

public class Challenge1 implements Challenge<Integer, String> {
    //CHALLENGE 1: Number Sequence
    //Write a function that recieves an Integer and returns a String that contains 
    //a sequence of all the numbers from 1 to that integer concatenated together.
    //If the input Integer is zero, return an empty string. 
    //If the input Integer is negative, ignore the negative sign and return the sequence as normal. e.g.:
    //
    //       4   -> "1234"
    //       -11 -> "1234567891011"
    //       0   -> ""
    //
    
    @Override
    //All characters (including spaces/newlines) in the function f() below count towards your total***
    // *** START HERE @@@
    public String f(Integer n) {
        n = Math.abs(n);
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) sb.append(i);
        return "";
    }

    //@@@ *** END HERE ***

    //---SAMPLE SOLUTION---
    String fExampleSolution(int n){
        n=Math.abs(n);
        StringBuilder s=new StringBuilder();
        for(int i=1;i<=n;i++)s.append(i);
        return s.toString();
    }
     //---END SAMPLE SOLUTION---

 
    //---DO NOT MODIFY ANY CODE BELOW---
    public int runTests() {
        Challenge1 tester = new Challenge1();

        Integer[] inputs = {
            8,
            0,
            -1,
            7,
            32,
            -5,
            6,
            20,
            -12,
            -0
        };
   
        String[] expectedResults = {
            "12345678",
            "",
            "1",
            "1234567",
            "1234567891011121314151617181920212223242526272829303132",
            "12345",
            "123456",
            "1234567891011121314151617181920",
            "123456789101112",
            ""
        };


        System.out.println("\n======================================");
        System.out.println("ChallengeOne.java - Palindrome:\n");

        int testsFailed = 0;
         for (int i = 0; i < inputs.length; i++) {
             String r;
            try {
                r = tester.f(inputs[i]);
            } catch (Exception e) {
                testsFailed++;
                continue;
            }if (!r.equals(expectedResults[i])) {
                testsFailed++;
            }
        }
        if(testsFailed == 0)
        {
            System.out.printf("\nChallengeOne.java - Palindrome: All tests passed!");
            System.out.printf("\n======================================\n");
            return 0;
        }

        for (int i = 0; i < inputs.length; i++) 
        {
            String r;
            try {
                r = tester.f(inputs[i]);
            } 
            catch (Exception e) {
                System.out.printf("Test #%2d ERROR — Input: %-35s threw exception: %s%n", i + 1, inputs[i], e);
                continue;
            }
            if (r.equals(expectedResults[i])) {
                System.out.printf("Test #%2d passed — Input: %-35s Output: %b%n", i + 1, inputs[i], r);
            } else {
                System.out.printf("Test #%2d FAILED — Input: %-35s Output: %b (Expected: %b)%n", i + 1, inputs[i], r, expectedResults[i]);
            }
        }

        System.out.printf("\nChallengeOne.java - Palindrome: %d test(s) FAILED.", testsFailed);
        System.out.printf("\n======================================\n");

        return testsFailed;
    }
}
