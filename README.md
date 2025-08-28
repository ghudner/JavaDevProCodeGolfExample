# Welcome to DevPro Code Golf! 


- This repo contains **5 challenges in both Java and JavaScript**: `src/Java/Challenges/ChallengeX.java`
`src/JavaScript/Challenges/ChallengeX.js`
- Inside each file, you’ll find a **single function** stub `f()` that you must implement.
- **You may only modify the function itself** (no touching the test harness, mains, and no new imports — yes, we’ll know 😎)

Open this repo in IntelliJ or VS Code. 

Running the main functions in **JavaCodeGolfMain.java** and **JavaScriptCodeGolfMain.js** will run **10 test cases per challenge** and tell you whether each test passed or failed. 

You can run them directly in the command line with these commands: 

`node src/JavaScriptCodeGolfMain.js`

`javac -d ./bin ./src/**/*.java && java -cp ./bin JavaCodeGolfMain`

If you pass all challenges in and all test case for each language, you’ll see this message:  

`🏆🏆🏆 !!All challenges passed!! 🏆🏆🏆`

---

## 🎯 Scoring Rules

- Your score is the **character count of your whole function** (Lower is better)
- **BUT**... for each test failure you get, you’ll be slapped with a **+100 character penalty** so make sure all test cases pass first!
