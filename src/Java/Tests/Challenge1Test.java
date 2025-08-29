package Java.Tests;

import Java.Challenges.Challenge1;

public class Challenge1Test implements ChallengeTest{

        @Override
        public int runTests() {
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

            return TestRunner.runTests(new Challenge1(), inputs, expectedResults);
        }
    }

