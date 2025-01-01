# Bulls and Cows

You are playing the **Bulls and Cows** game with your friend.

You write down a secret number and ask your friend to guess what the number is. When your friend makes a guess, you provide a hint with the following info:

1. The number of **"bulls"**, which are digits in the guess that are in the correct position.
2. The number of **"cows"**, which are digits in the guess that are in your secret number but are located in the wrong position. Specifically, the non-bull digits in the guess that could be rearranged such that they become bulls.

Given the secret number `secret` and your friend's guess `guess`, return the hint for your friend's guess.

The hint should be formatted as **"xAyB"**, where `x` is the number of bulls and `y` is the number of cows.

**Note:** Both `secret` and `guess` may contain duplicate digits.

---

## Example 1:

**Input:**

```plaintext
secret = "1807", guess = "7810"
```

**Output:**

```plaintext
"1A3B"
```

**Explanation:**

- Bulls are connected with a '|', and cows are underlined:
  ```plaintext
  "1807"
    |
  "7810"
  ```

---

## Example 2:

**Input:**

```plaintext
secret = "1123", guess = "0111"
```

**Output:**

```plaintext
"1A1B"
```

**Explanation:**

- Bulls are connected with a '|', and cows are underlined:
  ```plaintext
  "1123"        "1123"
    |      or     |
  "0111"        "0111"
  ```
- Only one of the two unmatched `1`s is counted as a cow since the non-bull digits can only be rearranged to allow one `1` to be a bull.

---

## Constraints:

- `1 <= secret.length, guess.length <= 1000`
- `secret.length == guess.length`
- `secret` and `guess` consist of digits only.

---

## Approach:

### Steps to Solve:

1. **Count Bulls:**

   - Traverse both `secret` and `guess` simultaneously.
   - Count how many characters match in the exact positions.

2. **Count Cows:**

   - Use a hashmap or array to track the frequency of unmatched digits in `secret` and `guess`.
   - Compare these counts to calculate cows.

3. **Format Result:**
   - Return the result as a string in the format `"xAyB"`.

---

## Complexity Analysis:

1. **Time Complexity:**

   - \(O(n^2)\), where \(n\) is the length of `secret` and `guess`.
   - The algorithm involves a single pass to count bulls and prepare the arrays, but the nested loop for counting cows increases the complexity.

2. **Space Complexity:**
   - \(O(n)\), as two additional arrays `Secret` and `Guess` of size `n` are used.

---
