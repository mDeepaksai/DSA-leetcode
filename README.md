# DSA-leetcode

Data Structures & Algorithms practice — solving problems pattern-by-pattern
to build intuition for recognizing which technique applies where, rather
than memorizing individual solutions.

Most problems include both a **brute-force** approach and an **optimized**
approach, so the reasoning behind the optimization is visible, not just
the final answer.

## Structure

Organized by pattern, not by problem number — the goal is to group
problems that share an underlying technique.

```
DSA-leetcode/
│
├── arrays/
│   ├── hashmap/
│   ├── hashset/
│   ├── Kadane's Algorithm/
│   ├── prefix_sum/
│   ├── sliding window/
│   └── two pointers/
│
├── basic questions/
│   ├── 1421-find-numbers-with-even-number-of-.../
│   ├── min and max in array
│   └── second largest
│
├── binary_searching/
│   ├── classic_binary/
│   └── upperlower_bound/
│
└── string/
    ├── sliding_window/
    └── two-pointer/
```

## Patterns covered so far

- **Hashing** — hashmap / hashset based lookups
- **Kadane's Algorithm** — maximum subarray-style problems
- **Prefix Sum** — range-sum and cumulative-total problems
- **Sliding Window** — both fixed and variable window, on arrays and strings
- **Two Pointers** — on arrays and strings
- **Binary Search** — classic search plus upper/lower bound variants
- **Fundamentals** — array basics (min/max, second largest, parity checks)

More patterns get added as they're worked through — this list grows with
the repo.

## Notes

- Language: Java
- Each problem folder generally contains a brute-force solution alongside
  the optimized one, so the tradeoff between them is explicit
- This is an active practice log, not a finished reference — expect it to
  keep growing