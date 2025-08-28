# Welcome to DevPro Code Golf! 


### There are 5 challenges in Java and JavaScript here: 
`src/Java/Challenges/ChallengeX.java`

`src/JavaScript/Challenges/ChallengeX.js`
- Inside each file, you’ll find a single function stub. **Implement `f()` with the least number of characters possible (including whitespaces)**
- **You may only modify the function itself**  - no touching the test harness and **no imports/libraries**

Running the main functions in src/JavaCodeGolfMain.java and src/JavaScriptCodeGolfMain.js will execute **10 test cases per challenge**. 

### Use these commands to test your code: 

`node src/JavaScriptCodeGolfMain.js`

`javac -d ./bin ./src/**/*.java && java -cp ./bin JavaCodeGolfMain`

Once you pass all 50 tests, you’ll see this message:  

`🏆🏆🏆 !!All challenges passed!! 🏆🏆🏆`

---

## 🎯 Scoring Rules and getting your total

- Your score is the **character count of your whole function** (Lower is better)
- You get a **+100 character penalty** for every failed test - make sure they all pass!

### To get your total score, run:

`python3 playerScore.py`  

(or `python playerScore.py` if you're an OG Python-er and that doesn't work)
