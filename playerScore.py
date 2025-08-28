#!/usr/bin/env python3
import subprocess
import sys
import re
import characterCounter

# --- Config ---
JAVA_CMD = [
    "/usr/bin/env",
    "/Library/Java/JavaVirtualMachines/temurin-21.jdk/Contents/Home/bin/java",
    "-XX:+ShowCodeDetailsInExceptionMessages",
    "-cp", "./bin",
    "DevProCodeGolfMain"
]

CHAR_COUNTER = "./characterCounter.py"

def run_java_program():
    """Runs the Java program and returns its exit code (penalty)."""
    result = subprocess.run(JAVA_CMD, capture_output=True, text=True)
    print(result.stdout)  
    print(result.stderr, file=sys.stderr)
    return result.returncode

def run_character_counter(directory):
    return characterCounter.main_as_function(directory)  # expose a function instead of printing



def main():
    penalty = run_java_program()*100

    print(f"---Java--- challenges character count: ")
    char_count_java = run_character_counter("./src/Java/Challenges")
    print(f"\n---JavaScript--- challenges character count:")
    char_count_javascript = run_character_counter("./src/JavaScript")



    final_score = penalty + char_count_java + char_count_javascript

    print("\n======================================")
    print(f"Failed tests penalty: {penalty}")
    print(f"Character count (Java): {char_count_java}")
    print(f"Character count (JavaScript): {char_count_javascript}\n")
    print(f"🎯 FINAL SCORE: {final_score}")
    print("======================================")

if __name__ == "__main__":
    main()