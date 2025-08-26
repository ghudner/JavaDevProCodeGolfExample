public class ChallengeOne implements IChallenge {
    //CHALLENGE 1: Number Sequence
    //Write a function that recieves an int and returns a String that contains 
    //a sequence of all the numbers from 1 to that integer concatenated together.
    //If the input integer is zero, return an empty string. 
    //If the input integer is negative, ignore the negative sign and return the sequence as normal. e.g.:
    //
    //       4   -> "1234"
    //       -11 -> "1234567891011"
    //       0   -> ""
    //
    
    //All characters (including spaces/newlines) in the function p() below count towards your total***

    // *** START HERE ***

   String p(int n) { return ""; }

    // *** END HERE ***


    //---SAMPLE SOLUTION---
    String pExampleSolution(int n){
        n=Math.abs(n);
        StringBuilder s=new StringBuilder();
        for(int i=1;i<=n;i++)s.append(i);
        return s.toString();
    }
     //---END SAMPLE SOLUTION---

 
    //---DO NOT MODIFY ANY CODE BELOW---
    @Override
    public int runTests() {
        ChallengeOne tester = new ChallengeOne();

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
                r = tester.p(inputs[i]);
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
                r = tester.p(inputs[i]);
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
