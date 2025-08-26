public class DevProCodeGolfMain {
    public static void main(String[] args) {
        IChallenge[] testers = {
            new ChallengeOne()
        };

        int totalFailures = 0;
        System.out.printf("\n=== Java - DevPro Code Golf Summary ===\n");

        for (int i = 0; i < testers.length; i++) {
            IChallenge tester = testers[i];
            try {
                int failedCount = (int) tester.runTests();

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

        System.out.printf("\n------------------------------------------\n");
        if (totalFailures == 0) {
            System.out.printf("🏆🏆🏆 !!All challenges passed!! 🏆🏆🏆\n");
            System.out.printf("TODO: Go back and reduce the number of characters (including whitespaces) in each function!\n");
        } else {
            System.out.printf(String.format("Total failed test cases across all challenges: %d\n", totalFailures));
        }
        System.out.printf("------------------------------------------\n");
    }
}
