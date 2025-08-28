import Java.Tests.Challenge1Test;
import Java.Tests.ChallengeTest;

public class JavaCodeGolfMain {
    public static void main(String[] args) {
        ChallengeTest[] testers = {
            new Challenge1Test()
        };

        int totalFailures = 0;
        System.out.printf("\n=== Java - DevPro Code Golf Summary ===\n\n");

        for (int i = 0; i < testers.length; i++) {
            ChallengeTest tester = testers[i];
            try {
                System.out.printf("Testing Challenge%d.Java:\n", i + 1);
                int failedCount = tester.runTests();

                if (failedCount == 0) {
                    System.out.printf("Challenge %d: ✅ All tests passed\n", i + 1);
                } else {
                    System.out.printf("Challenge %d: ❌ %d test(s) failed\n", i + 1, failedCount);
                    totalFailures += failedCount;
                }
            } catch (Exception e) {
                System.out.printf("Challenge %d: ERROR running tests: %s\n", i + 1, e.getMessage());
                totalFailures++;
            }
        }

        if (totalFailures == 0) {
            System.out.printf("🏆🏆🏆 !!All challenges passed!! 🏆🏆🏆\n");
            System.out.printf("TODO: Go back and reduce the number of characters (including whitespaces) in each function!\n");
            System.exit(0); // <-- return code to the OS / shell
        } else {
            System.out.printf(String.format("\nTotal failed tests across Java challenges: %d (character penalty of %d)\n\n",totalFailures,totalFailures*100));

            System.exit(totalFailures); // <-- return code to the OS / shell
        }
    }
}
