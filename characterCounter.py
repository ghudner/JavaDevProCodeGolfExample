import os

def count_between_markers(filepath):
    lines = open(filepath, "r", encoding="utf-8").readlines()

    marker_indices = [i for i, line in enumerate(lines) if "@@@" in line]
    if len(marker_indices) < 2:
        return 0

    total = 0
    for i in range(0, len(marker_indices), 2):
        if i+1 < len(marker_indices):
            start, end = marker_indices[i], marker_indices[i+1]
            between = "".join(lines[start+1:end])
            total += len(between)
    return total

def main_as_function(directory):
    grand_total = 0
    for fname in sorted(os.listdir(directory)):
        path = os.path.join(directory, fname)
        if not os.path.isfile(path):
            continue
        if not (fname.endswith(".java") or fname.endswith(".js")):
            continue
        count = count_between_markers(path)
        print(f"{fname}: {count} characters")
        grand_total += count

    return grand_total