import subprocess
import sys
import glob
import os
import characterCounter

JAVA_SRC_DIR = "./src"
JAVA_BIN_DIR = "./bin"
JAVA_RUN_CMD = ["java", "-cp", "./bin", "JavaCodeGolfMain"]
JS_CMD = ["node","src/JavaScriptCodeGolfMain.js"]

CHAR_COUNTER = "./characterCounter.py"

def run_java():
    java_files = glob.glob(os.path.join(JAVA_SRC_DIR, "**", "*.java"), recursive=True)
    compile_cmd = ["javac", "-d", JAVA_BIN_DIR] + java_files
    subprocess.run(compile_cmd, capture_output=True, text=True)

    result = subprocess.run(JAVA_RUN_CMD, capture_output=True, text=True)
    print(result.stdout)
    print(result.stderr, file=sys.stderr)
    return result.returncode

def run_javascript():
    result = subprocess.run(JS_CMD,capture_output=True,text=True)
    print(result.stdout)  
    print(result.stderr, file=sys.stderr)
    return result.returncode

def run_character_counter(directory):
    return characterCounter.main_as_function(directory)

def main():
    penalty_java = run_java()*100
    penalty_javascript = run_javascript()*100

    print(f"---Java--- challenges character count: ")
    char_count_java = run_character_counter("./src/Java/Challenges")
    print(f"\n---JavaScript--- challenges character count:")
    char_count_javascript = run_character_counter("./src/JavaScript/Challenges")

    final_score = penalty_java + penalty_javascript + char_count_java + char_count_javascript

    print("\n======================================")
    print(f"Failed tests penalty: {penalty_java + penalty_javascript}")
    print(f"Character count (Java): {char_count_java}")
    print(f"Character count (JavaScript): {char_count_javascript}\n")
    print(f"🎯 FINAL SCORE: {final_score}")
    print("======================================")

main()