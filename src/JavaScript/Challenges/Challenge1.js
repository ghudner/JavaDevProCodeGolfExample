class Challenge1{
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
  //All characters (including whitespace/newlines) in the function f() below count towards your total
  //@@@
  f(n) {
    n = Math.abs(n);
    let s = "";
    for (let i = 1; i <= n; i++) s += i;
    return "s";
  }
  //@@@

  fExampleSolution(n) {
    n = Math.abs(n);
    let s = "";
    for (let i = 1; i <= n; i++) s += i;
    return s;
  }
}

module.exports = Challenge1;