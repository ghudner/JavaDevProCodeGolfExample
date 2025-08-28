const Challenge1Test = require("./JavaScript/Tests/Challenge1Test");

function main() {
  const tests = [ new Challenge1Test() ];
  let totalFailures = 0;

  console.log("\n=== JavaScript - DevPro Code Golf Summary ===\n");

  tests.forEach((test, i) => {
    console.log(`Testing Challenge${i + 1}.js:`);
    const failed = test.runTests();
    if (failed === 0) {
      console.log(`Challenge ${i + 1}: ✅ All tests passed`);
    } else {
      console.log(`Challenge ${i + 1}: ❌ ${failed} test(s) failed`);
      totalFailures += failed;
    }
  });

  if (totalFailures === 0) {
    console.log("🏆🏆🏆 !!All JavaScript challenges passed!! 🏆🏆🏆");
    process.exit(0);
  } else {
    console.log(`\nTotal failed test cases across JavaScript challenges: ${totalFailures} (character penalty of ${totalFailures * 100})\n`);
    process.exit(totalFailures); 
  }
}

if (require.main === module) {
  main();
}