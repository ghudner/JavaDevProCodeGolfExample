#!/usr/bin/env python3
import os
import sys

def count_between_markers(filepath):
    try:
        with open(filepath, "r", encoding="utf-8") as f:
            lines = f.readlines()
    except Exception as e:
        print(f"⚠️ Could not read {filepath}: {e}")
        return 0

    # find all marker line indices (matches even if spaces or CRLF exist)
    marker_indices = [i for i, line in enumerate(lines) if "@@@" in line]
    if len(marker_indices) < 2:
        return 0

    total = 0
    # support multiple pairs of markers in one file
    for i in range(0, len(marker_indices), 2):
        if i+1 < len(marker_indices):
            start, end = marker_indices[i], marker_indices[i+1]
            between = "".join(lines[start+1:end])
            total += len(between)
    return total

def main_as_function(directory):
    if not os.path.isdir(directory):
        print(f"❌ Not a directory: {directory}")
        sys.exit(1)

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