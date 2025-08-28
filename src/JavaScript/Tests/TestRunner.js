class TestRunner {
  static runTests(challenge, inputs, expectedResults) {
    let failed = 0;

    for (let i = 0; i < inputs.length; i++) {
      try {
        const actual = challenge.f(inputs[i]);
        if (actual !== expectedResults[i]) {
          console.log(
            `❌ Test ${i + 1} failed: input=${inputs[i]} expected="${expectedResults[i]}" got="${actual}"`
          );
          failed++;
        }
      } catch (e) {
        console.log(`💥 Test ${i + 1} errored: ${e.message}`);
        failed++;
      }
    }

    return failed;
  }
}

module.exports = TestRunner;